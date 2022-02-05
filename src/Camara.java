

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.util.glu.GLU.*;
/**
 *
 * @author Dell
 */
//Calse camara 
public class Camara {
    //Se crean las variables de la camra 
    private float x, y,z, rx,ry,rz;
    private float fov,  aspect, near, far;
    //Cosntructor 
    public Camara(float fov, float aspect,float near, float far){
        //Pocicion de inicio de la camara
        x = 1;
        y = 0;
        z=  -2;
        rx = 0;
        ry = 90;
        rz = 0;
        
        this.fov = fov;
        this.aspect = aspect;
        this.near = near;
        this.far= far;
        initProjection();
    }
    //Se regresa a la pocicion de inicio
    public void camaraReset(){
        x = 1;
        y = 0;
        z=  -2;
        rx = 0;
        ry = 90;
        rz = 0;
    }
    //Se inica la proyeccion
    private void initProjection() {
        glMatrixMode(GL_PROJECTION);/// establece el modo de matriz actual. el modo puede asumir uno de cuatro valores:
        //Aplica operaciones de matriz posteriores a la pila de matriz de proyección.
        glLoadIdentity();//que carga la matriz identidad como matriz activa
        gluPerspective(fov, aspect, near, far);//que establecerá el modo de visualización en perspectiva:
        glMatrixMode(GL_MODELVIEW);//Aplica operaciones matriciales posteriores a la pila matricial modelview.
        glLoadIdentity();
    }
    //Se usa para los movimientos e la camara se rotan
    public void useView(){
        //calcula una matriz que realiza una rotación en sentido antihorario 
        //de grados de ángulo alrededor del vector desde el origen hasta el punto ( x , y , z ).
        glRotatef(rx, 1, 0, 0);
        glRotatef(ry, 0, 1, 0);
        glRotatef(rz, 0, 0, 1);
        glTranslatef(x, y, z);        
    }
 //Metodos get y set
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getRx() {
        return rx;
    }

    public void setRx(float rx) {
        this.rx = rx;
    }

    public float getRy() {
        return ry;
    }

    public void setRy(float ry) {
        this.ry = ry;
    }

    public float getRz() {
        return rz;
    }

    public void setRz(float rz) {
        this.rz = rz;
    }
    //Movimientos segun la cordenada de z,y,x
    public void moveX(float atm){
        z +=atm * Math.sin(Math.toRadians(ry));
        x +=atm * Math.cos(Math.toRadians(ry));
    }
     public void moveY(float atm){
       
              y += atm;
         
    }
    public void moveZ(float atm){
           z +=atm * Math.sin(Math.toRadians(ry + 90));
           x +=atm * Math.cos(Math.toRadians(ry+ 90));
    }
    public void rotateX(float atm){
        rx +=atm;
    }
     public void rotateY(float atm){
         ry += atm;
    }
      public void rotateZ(float atm){
          rz += atm;
    }

}   
