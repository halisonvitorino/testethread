package control;


public class Ex51  
    {  
         
        public static void main(String[] args)  
        {  
              
            Podium campeao = new Podium();  
            Carro carro1 = new Carro("Ayrton Senna", campeao);  
            Carro carro2 = new Carro("Nelson Piquet", campeao);  
            Carro carro3 = new Carro("Michael Shuemaker", campeao);  
            Carro carro4 = new Carro("Rubens Barrichello", campeao);  
                            
            carro1.start();  
            carro2.start();  
            carro3.start();  
            carro4.start();  
              
            
            try  
            {  
                carro1.join();  
                carro2.join();  
                carro3.join();  
                carro4.join();  
            }  
            catch(Exception e)  
            {  
                e.printStackTrace();  
            }  
            System.out.println("Fim do Rally.");  
            System.out.println("o vencedor é: "+ campeao.getVencedor());  
        }  
    }  