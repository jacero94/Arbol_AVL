/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles_avl;

/**
 *
 * @author JAVIER
 */
public class nodo {
    int dato;
    int fb;
    
    nodo izq, der;
    
    public nodo(int n){
        this.dato=n;
        this.fb=0;
        izq=der=null;
    
    }
        public void insertar(int a){
        if (this.dato>a){
            if (this.izq==null)
                this.izq=new nodo(a);
            else
                this.izq.insertar(a);
        }else{
            if (this.der==null)
                this.der=new nodo(a);
            else
                this.der.insertar(a);
        }
    }

    
}
