/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.lwjgl.opengl.GL11.*;
/**
 *
 * @author Dell
 */
public class Cubo {
    //Cubo
    public void drawCube(float size){
      glBegin(GL_QUADS);{
        //cara frontal
        // para especificar vértices de punto, línea y polígono.
        //La normal actual se establece en las coordenadas dadas cada 
        //vez que se emite glNormal. Los argumentos de bytes, cortos o 
        //enteros se convierten a formato de punto flotante con una asignación
        ///lineal que asigna el valor entero representable más positivo a 1.0 y 
        //el valor entero representable más negativo a -1.0.
        glNormal3f(0,0,1);
        glTexCoord2d(0,0); glVertex3f(-size/2, -size/2, size/2);
        glTexCoord2d(0,1); glVertex3f(size/2, -size/2, size/2);
        glTexCoord2d(1,1); glVertex3f(size/2, size/2, size/2);
        glTexCoord2d(1,0); glVertex3f(-size/2, size/2, size/2);
        
        //cara posterior
        glNormal3f(0,0,-1);
        glTexCoord2d(0,0); glVertex3f(size/2, -size/2, -size/2);
        glTexCoord2d(0,1); glVertex3f(-size/2, -size/2, -size/2);
        glTexCoord2d(1,1); glVertex3f(-size/2, size/2, -size/2);
        glTexCoord2d(1,0); glVertex3f(size/2, size/2, -size/2);
        
        //cara lateral iz
        glNormal3f(-1,0,0);
        glTexCoord2d(0,0); glVertex3f(-size/2, -size/2, -size/2);
        glTexCoord2d(0,1); glVertex3f(-size/2, -size/2, size/2);
        glTexCoord2d(1,1); glVertex3f(-size/2, size/2, size/2);
        glTexCoord2d(1,0); glVertex3f(-size/2, size/2, -size/2);
        
        //cara lateral dere
        glNormal3f(1,0,0);
        glTexCoord2d(0,0); glVertex3f(size/2, -size/2, size/2);
        glTexCoord2d(0,1); glVertex3f(size/2, -size/2, -size/2);
        glTexCoord2d(1,1); glVertex3f(size/2, size/2, -size/2);
        glTexCoord2d(1,0); glVertex3f(size/2, size/2, size/2);
        
        //cara arriba
        glNormal3f(0,1,0);
        glTexCoord2d(0,0); glVertex3f(-size/2, size/2, size/2);
        glTexCoord2d(0,1); glVertex3f(size/2, size/2, size/2);
        glTexCoord2d(1,1); glVertex3f(size/2, size/2, -size/2);
        glTexCoord2d(1,0); glVertex3f(-size/2, size/2, -size/2);
    }
        glEnd();
    }
    
    public void drawMonedad(float size, int tamaño){
      glBegin(GL_QUADS);{
        //cara frontal
        glNormal3f(0,0,1);
        glTexCoord2d(0,0); glVertex3f(-size/tamaño, -size/tamaño, size/tamaño);
        glTexCoord2d(0,1); glVertex3f(size/tamaño, -size/tamaño, size/tamaño);
        glTexCoord2d(1,1); glVertex3f(size/tamaño, size/tamaño, size/tamaño);
        glTexCoord2d(1,0); glVertex3f(-size/tamaño, size/tamaño, size/tamaño);
        
        //cara posterior
        glNormal3f(0,0,-1);
        glTexCoord2d(0,0); glVertex3f(size/tamaño, -size/tamaño, -size/tamaño);
        glTexCoord2d(0,1); glVertex3f(-size/tamaño, -size/tamaño, -size/tamaño);
        glTexCoord2d(1,1); glVertex3f(-size/tamaño, size/tamaño, -size/tamaño);
        glTexCoord2d(1,0); glVertex3f(size/tamaño, size/tamaño, -size/tamaño);
        
        //cara lateral iz
        glNormal3f(-1,0,0);
        glTexCoord2d(0,0); glVertex3f(-size/tamaño, -size/tamaño, -size/tamaño);
        glTexCoord2d(0,1); glVertex3f(-size/tamaño, -size/tamaño, size/tamaño);
        glTexCoord2d(1,1); glVertex3f(-size/tamaño, size/tamaño, size/tamaño);
        glTexCoord2d(1,0); glVertex3f(-size/tamaño, size/tamaño, -size/tamaño);
        
        //cara lateral dere
        glNormal3f(1,0,0);
        glTexCoord2d(0,0); glVertex3f(size/tamaño, -size/tamaño, size/tamaño);
        glTexCoord2d(0,1); glVertex3f(size/tamaño, -size/tamaño, -size/tamaño);
        glTexCoord2d(1,1); glVertex3f(size/tamaño, size/tamaño, -size/tamaño);
        glTexCoord2d(1,0); glVertex3f(size/tamaño, size/tamaño, size/tamaño);
        
        //cara arriba
        glNormal3f(0,1,0);
        glTexCoord2d(0,0); glVertex3f(-size/tamaño, size/tamaño, size/tamaño);
        glTexCoord2d(0,1); glVertex3f(size/tamaño, size/tamaño, size/tamaño);
        glTexCoord2d(1,1); glVertex3f(size/tamaño, size/tamaño, -size/tamaño);
        glTexCoord2d(1,0); glVertex3f(-size/tamaño, size/tamaño, -size/tamaño);
    }
        glEnd();
    }
    //Moneda dos caras
     public void drawRec(float size, int tamaño){
      glBegin(GL_QUADS);{
        //cara frontal
        glNormal3f(0,0,1);
        glTexCoord2d(0,0); glVertex3f(-size/tamaño, -size/tamaño, size/tamaño);
        glTexCoord2d(0,1); glVertex3f(size/tamaño, -size/tamaño, size/tamaño);
        glTexCoord2d(1,1); glVertex3f(size/tamaño, size/tamaño, size/tamaño);
        glTexCoord2d(1,0); glVertex3f(-size/tamaño, size/tamaño, size/tamaño);
         //cara posterior
        glNormal3f(0,0,-1);
        glTexCoord2d(0,0); glVertex3f(size/tamaño, -size/tamaño, -size/tamaño);
        glTexCoord2d(0,1); glVertex3f(-size/tamaño, -size/tamaño, -size/tamaño);
        glTexCoord2d(1,1); glVertex3f(-size/tamaño, size/tamaño, -size/tamaño);
        glTexCoord2d(1,0); glVertex3f(size/tamaño, size/tamaño, -size/tamaño);
     }
      glEnd();
     }
}
