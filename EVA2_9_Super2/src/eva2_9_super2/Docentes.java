/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_9_super2;


public class Docentes extends Persona {
  public String Plaza;

  public Docentes(){
    super();
    this.Plaza = "----";
  }
  public Docentes(String Plaza , String nombre, String apellido , int edad){
    super();
    this.Plaza = Plaza;
  }
  public Docentes(String Plaza) {
    this.Plaza = Plaza;
  }

  public String getPlaza() {
    return Plaza;
  }

  public void setPlaza(String Plaza) {
    this.Plaza = Plaza;
  }
  
  
}
