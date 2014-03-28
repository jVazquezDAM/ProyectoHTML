/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Calculos  {
    //generar y comprobar el número
    private int num;
    
    public void generarNumero(){
        num=(int) (Math.random()*100)+1;
    }
    
    public int verificarNumero(int numIntroducido){
        if(num==numIntroducido)
            return 0;
        else
            if(num>numIntroducido)
                return 1;
            else
                return 2;
        }
            
    
}
