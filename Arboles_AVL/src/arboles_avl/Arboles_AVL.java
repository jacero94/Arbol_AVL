/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles_avl;

/**
 *
 * @author JAVIER
 */
public class Arboles_AVL {

    /**
     * @param args the command line arguments
     */
    
   
    
        
     nodo cab;
    
       public void insertar(int a){
        if (this.cab==null)
            this.cab=new nodo(a);
        else
            this.cab.insertar(a);
        this.setFb(cab);
        this.balancear();
    
    }
       
    public void insertar(nodo p, nodo q) {
        if (q.dato <= p.dato) {
            if (q.izq == null) {
                q.izq = p;
            } else {
                insertar(p, q.izq);
            }
        }
    }
           
        public int altura(nodo p){
        if (p==null)
            return 0;
        int i,d;
        
        i=1+altura(p.izq);
        d=1+altura(p.der);
        return Math.max(i, d);
    }
    public void recorridos(nodo p, int a){
        if (a==1)
            System.out.print(p.dato + " ");
        if (p.izq!=null)
            recorridos(p.izq,a);
        if (a==2)
            System.out.print(p.dato + " ");
        if (p.der!=null)
            recorridos(p.der,a);
        if (a==3)
            System.out.print(p.dato + " ");        
    }
    public void setFb(nodo p){
        p.fb=this.altura(p.izq)-this.altura(p.der);
        if (p.izq!=null)
            this.setFb(p.izq);
        if (p.der!=null)
            this.setFb(p.der);        
    }
    public nodo rsd(nodo p, nodo q ){
        p.izq=q.der;
        q.der=p;
        return q;
    }
    public nodo rsi(nodo p, nodo q){
        p.der=q.izq;
        q.izq=p;
        return q;
    }
    public nodo rdd(nodo p,nodo q, nodo r){
        p.izq=this.rsi(q, r);
        return this.rsd(p,p.izq);
    }
    public nodo rdi(nodo p,nodo q, nodo r){
        p.der=this.rsd(q, r);
        return this.rsi(p, p.der);
    }
    public void balancear(){
        if (this.cab.fb==2){
            if (this.cab.izq.fb==1){
                this.cab=this.rsd(this.cab,this.cab.izq);
                this.setFb(cab);
                return;
            }
            if (this.cab.izq.fb==-1){
                this.cab=this.rdd(this.cab,this.cab.izq, this.cab.izq.der);
                this.setFb(cab);
                return;
            }            
        }
        if (this.cab.fb==-2){
            if (this.cab.der.fb==-1){
                this.cab=this.rsi(cab, cab.der);
                this.setFb(cab);
                return;
            }
            if (this.cab.der.fb==1){
                this.cab=this.rdi(cab, cab.der, cab.der.izq);
                this.setFb(cab);
                return;
            }
        }
        this.balancear(cab);
    }
    public void balancear(nodo p){
        if (p.izq!=null){
            if (p.izq.fb==2){
                if (p.izq.izq.fb==1){
                    p.izq=this.rsd(p.izq,p.izq.izq);
                    this.setFb(cab);
                    return;
                }
                if (p.izq.izq.fb==-1){
                    p.izq=this.rdd(p.izq,p.izq.izq, p.izq.izq.der);
                    this.setFb(cab);
                    return;
                }            
            }
            if (p.izq.fb==-2){
                if (p.izq.der.fb==-1){
                    p.izq=this.rsi(p.izq, p.izq.der);
                    this.setFb(cab);
                    return;
                }
                if (p.izq.der.fb==1){
                    p.izq=this.rdi(p.izq, p.izq.der, p.izq.der.izq);
                    this.setFb(cab);
                    return;
                }
            }
        }
        if (p.der!=null){
            if (p.der.fb==2){
               if (p.der.izq.fb==1){
                   p.der=this.rsd(p.der,p.der.izq);
                   this.setFb(cab);
                   return;
               }
               if (p.der.izq.fb==-1){
                   p.der=this.rdd(p.der,p.der.izq, p.der.izq.der);
                   this.setFb(cab);
                   return;
               }            
           }
           if (p.der.fb==-2){
               if (p.der.der.fb==-1){
                   p.der=this.rsi(p.der, p.der.der);
                   this.setFb(cab);
                   return;
               }
               if (p.der.der.fb==1){
                   p.der=this.rdi(p.der, p.der.der, p.der.der.izq);
                   this.setFb(cab);
                   return;
               }
           }
        }
        if (p.izq!=null)
            balancear(p.izq);
        if (p.der!=null)
            balancear(p.der);        
    }
        public void show() {
        if (this.cab != null) {
            this.show(this.cab);
        }
    }

    public void show(nodo p) {
        System.out.print(p.dato + " ");
        if (p.izq != this.cab) {
            this.show(p.izq);
        } else {
           this.show(p.der);
    
}
    }
}

        
        
    

