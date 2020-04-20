
package microproyecto;

/**
 *
 * @author Grupo # 1 POO
 */
public class calculosgolosinas  extends CALCULOS{
    double cantidad, precio;
    
     public calculosgolosinas(String ID,double cantidad, double precio) {
        super(ID);
        this.cantidad = cantidad ;
        this.precio = precio ;
      
    }
     public double subtotal(){
         double sub = cantidad * precio;
  
        return sub ;
    }
     
    public double isv(){
         double sub = cantidad * precio;
         double ISV= sub*0.15;
        return ISV;
    }
    
    public double TOTAL(){
         double sub = cantidad * precio;
         double ISV= sub*0.15;
         double TOTAL =  sub+ISV;
        return TOTAL;
    }
    
}
