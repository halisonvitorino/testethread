package control;

public class Carro extends Thread  
{  
      
    private Podium campeao;  
    private String corredor;     
      
      
public Carro(String nome, Podium c)  
{  
    corredor = nome;  
    campeao = c;  
}  
     
    @Override  
public void run()  
{  
          
          
      try  
      {  
            int i;  
            for(i=1;i<15;i++)  
            {  
          
                System.out.println(i+"º.Curva - Piloto "+ corredor);  
                int tempo = (int)(Math.random()*300);  
                sleep(tempo);  
            }     
              
           this.campeao.setVencedor(corredor);        
      }    
      catch(Exception e)  
      {  
             e.printStackTrace();             
      }  
  }  
}  
