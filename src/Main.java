import java.applet.AudioClip;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import static org.newdawn.slick.util.ResourceLoader.getResource;

public class Main {
    //Se crea el objeto de la calse Camara
    public static Camara cam;
    public static void main(String[] args) {
        iniaDisplay();
        inicioCamara();
        juego();
        cerrrar();
    }
    //Inico de la Camara
    public static void inicioCamara() {
        // se le mandan al construcor los valores 
       cam = new Camara(70,(float)Display.getWidth()/(float)Display.getHeight(), 0.3f, 500);
       //especifica los valores rojo, verde, azul y alfa utilizados por glClear 
       //para borrar los b�feres de color. Los valores especificados por 
       //glClearColor est�n sujetos al rango [0,1].
       glClearColor(0, 0, 0, 1);
        glEnable(GL_DEPTH_TEST);//Si está habilitado, haga comparaciones de profundidad y actualice el búfer de profundidad.
        glEnable(GL_CULL_FACE);//Si está activado, elimine los polígonos en función de su devanado en las coordenadas de la ventana. Ver glCullFace.
        glEnable(GL_LIGHTING);//Si está habilitado, incluya la luz i en la evaluación de la ecuación de iluminación. Ver glLightModel y glLight.
        glEnable(GL_LIGHT0);
        glEnable(GL_COLOR_MATERIAL);//Para los colores de la esena 
        glEnable(GL_TEXTURE_2D);//Para las texturas que se colocarn
    }

    public static void juego() {
        //Objetos
        Cubo cubo = new Cubo();// objeto de la calse Cubo
        Escenarios esc = new Escenarios(); // objeto de la calse Escenario
        Random azar = new Random();// objeto random
        AudioClip sonido;//Objeto del audio
        URL url;//Url
        //Valiables
        int m=0;//Conto de monedas
       
        String [][] matriz = esc.escenarioUno(); // Matriz para le ecenario de las monedas
        String [][] matriz2 = esc.escenarioCero();// matriz para le escenario de las paredes
        //Textruas
        Texture pared = cargarTexturas("cesped");//paredes
        Texture cesped = cargarTexturas("tierra");//cesped
        
        //Textruas de las monedas
        Texture mondeda = cargarTexturas("moneda");
        Texture billetes = cargarTexturas("billetes");
        Texture billetes_monedas = cargarTexturas("billetes_monedas");
        Texture bolsa_monedas = cargarTexturas("bolsa_monedas");
        Texture tarjeta = cargarTexturas("tarjeta");
        Texture dinero = cargarTexturas("dinero");
        
        //Porceso
        while (!Display.isCloseRequested()) {	 //Se ciera cuando el display se cierra   
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);//Para actualizar el bufer
            glShadeModel(GL_SMOOTH);
            glLoadIdentity();
            //Camara
            cam.useView();//Se manda a llamar a la cmara 
            //Se coloca la textura
            cesped.bind();
            
            glBegin(GL_QUADS);//glBegin y glEnd delimitan los vértices que definen una primitiva o un grupo de primitivas similares.
            {
                glTexCoord2f(0,0); glVertex3f(-0.5f, -0.5f, -0.5f);
                glTexCoord2f(10,0); glVertex3f(-0.5f, -0.5f, 16.5f);
                glTexCoord2f(10,10); glVertex3f(18.5f, -0.5f, 16.5f);
                glTexCoord2f(0,10); glVertex3f(18.5f, -0.5f, -0.5f);
            }
            glEnd();
            //Texturas de la parde
            pared.bind();
            //Se recorre la matriz para colocar en cada pocision le cubo
            for(int x=0; x<matriz.length;x++){
                for(int z=0; z<matriz[x].length;z++){
                    //Matriz tranccion 
                    glTranslatef(x, 0, z);
                    //Si en la matriz se encuantra un letra a se coloca el cubo
                    if(matriz[x][z].equals("a") || matriz[x][z].equals("-") || matriz[x][z].equals("|")){
                       cubo.drawCube(1);//Metodo para del cubo(Paredes del esenario)
                     }
                    glTranslatef(-x, 0, -z);
                }
            }
            //Textura de la moneda
            mondeda.bind();
            //Ubicasion del audio           
            url = getResource("C:/Users/Dell/OneDrive/Escritorio/RecolectorDeMonedas/src/Media/Audio/moneda.wav");
            sonido = java.applet.Applet.newAudioClip(url);
            int X = 0,Z = 0;
            ///Se recorre la matriz(esenario) para colocar las monedas
            for(int x=0; x<matriz2.length;x++){
                for(int z=0; z<matriz2[x].length;z++){
                    X = azar.nextInt(16);//Aleatorio en x
                    Z = azar.nextInt(17);// Aleatorio en Z para la ubicasion de la moneda
                    glTranslatef(x, 0, z);//Matriz de trancicion
                    
                        if(matriz2[x][z].equals("a")){///Si la matriz tiene un letra a                     
                           cubo.drawRec(1,12);//Se coloca  el cubo
                            if(!matriz[x][z].equals("a") || !matriz[x][z].equals("-") || !matriz[x][z].equals("|")){       
                               //Si la posocion x, z de la camara es igual a la de la moneda 
                               if(Math.abs(Math.rint(cam.getX())) == x && Math.abs(Math.rint(cam.getZ())) == z) {
                                   matriz2[x][z] = " ";// Si es igual se borra 
                                   matriz2[X][Z] = "a";//Si es igial se cambia segun Z,X
                                   cubo.drawRec(1,12);//Se Coloca nuevamente el cubo
                                   sonido.play();//Se reproduce el audio
                                   m++;//Se aumenta la varaibel de la moneda
                                   Display.setTitle("Puntos: "+m);// Se colocan los puntos en el titulo
                                   cam.camaraReset();
                               }
                            }else{
                                X = azar.nextInt(16);//Aleatorio en x
                                Z = azar.nextInt(17);// Aleatorio en Z para la ubicasion de la moneda
                                matriz2[x][z] = " ";// Si es igual se borra 
                                matriz2[X][Z] = "a";//Si es igial se cambia segun Z,X
                                cubo.drawRec(1,12);//Se Coloca nuevamente el cubo
                            } 
                    }
                    ///Si es diferente de una letra a
                    if(!matriz[x][z].equals("a") ){
                        if(matriz2[x][z].equals("e")){ //Si es igual a una letra e
                            //Se cambia la textura del cubo de las monedas
                           if(m == 1){//Si e suna moneda
                               mondeda.bind();
                           }else if(m == 2){// Si son dos monedas
                               dinero.bind();
                           }else if(m == 3){//Si sno tres monedas
                               billetes.bind();
                           }else if(m == 4){//Si son cuatro monedas
                               billetes_monedas.bind();
                           }else if(m == 5){//Si son 5 monedas
                               bolsa_monedas.bind();
                           }else if(m==7){//Si son 7 monedas
                               tarjeta.bind();
                           }                     
                           cubo.drawMonedad(1,20);//Se reubica la monedad 
                       
                    }
                    
                    }
                    mondeda.bind();//Textura de la moneda 
                    glTranslatef(-x, 0, -z);
                } 
            }
            //Se llama el metodo de los controles
            controles();
            Display.update();
        }
       
           
    }
    public static void controles(){
        //Letras del teclado         
        boolean enfrente = Keyboard.isKeyDown(Keyboard.KEY_W);
        boolean atras = Keyboard.isKeyDown(Keyboard.KEY_S);
        boolean izquierda = Keyboard.isKeyDown(Keyboard.KEY_A);
        boolean derecha = Keyboard.isKeyDown(Keyboard.KEY_D);
        boolean subir = Keyboard.isKeyDown(Keyboard.KEY_E);
        boolean bajar = Keyboard.isKeyDown(Keyboard.KEY_C);
        boolean correr =  Keyboard.isKeyDown(Keyboard.KEY_LSHIFT);
        float mx = Mouse.getDX();
        float my = Mouse.getDY();
        
        mx *= 0.10f;
        my *= 0.10f;
        //Movimiento de la camara
        if(Mouse.isButtonDown(0) ){
           cam.rotateY(mx);
           cam.rotateX(-my);
        }
        //Mover en el eje Y
        if(subir){
            cam.moveY(-0.002f);
        }
         if(bajar){
            cam.moveY(0.002f);
        }
        //Mover en el eje Z 
         if(enfrente){
            cam.moveZ(0.002f);
        }
         if(atras){
            cam.moveZ(-0.002f);
        }
        //Mover en el eje X 
         if(izquierda){
            cam.moveX(0.002f);
        }
         if(derecha){
            cam.moveX(-0.002f);
        }
        //Mover en el eje Correr 
        if( (correr && enfrente)){
               cam.moveZ(0.005f);
        }else if(correr && atras){
            cam.moveZ(-0.002f);
        }else if(correr && izquierda){
            cam.moveX(0.002f);
        }else if(correr && derecha){
            cam.moveX(-0.002f);
        } 
        //Saltar
         if(Keyboard.isKeyDown(Keyboard.KEY_SPACE)){
           float v =-0.010f;//Altura del salto
           cam.moveY(v);//Mover en Y
           Runnable runnable;//Hilo
            runnable = new Runnable() {
                @Override
                //Inicia el hilo
                public void run() {
                   boolean bandera = true;//Bandera para terminar el ciclo
                    while (bandera) {
                        
                        try {
                            //Si la camara es menor a 0
                            if(cam.getY() < 0){
                                Thread.sleep(20);//El hilo se detiene 20 segundos y sigue
                                cam.moveY(0.001f);//Y vaja cada 0.000f
                            }else{//Si no 
                                bandera = false;//Sale del ciclo
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };
            Thread hilo = new Thread(runnable);//Se crea el hilo
            hilo.start();//Y se inicia 
           
        
         }
        
    }
    //Cierra la ventana
    public static void cerrrar() {
        Display.destroy();//Se destruye el display
        System.exit(0);
    }

    public static void iniaDisplay() {
        
        try {
            //Crea el display de un tama;ano 1000x650
            Display.setDisplayMode(new DisplayMode(1000, 650));
            Display.setTitle("Recolector de monedas ");///Titulo
            Display.create();//Se crea el metodo
        } catch (LWJGLException ex) {
            ex.printStackTrace();
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
    }
    //MEtodo para cargar las texturas
    public static Texture cargarTexturas(String key) {
        try {
            //Regresa la ubicasion de las texturas
            return TextureLoader.getTexture("png", new FileInputStream(
                    new File("res/" + key + ".png")));

        } catch (IOException ex) {
            Logger.getLogger(Main.class
                    .getName()).log(
                            Level.SEVERE, null, ex);
        }
        return null;
    }

    public static FloatBuffer asFloatBuffer(float[] arreglo) {
        FloatBuffer fb = BufferUtils.createFloatBuffer(arreglo.length);
        fb.put(arreglo);
        fb.flip();
        return fb;
    }

    public static IntBuffer asIntBuffer(int[] arreglo) {
        IntBuffer ib = BufferUtils.createIntBuffer(arreglo.length);
        ib.put(arreglo);
        ib.flip();
        return ib;
    }
}
