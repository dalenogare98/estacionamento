package serializador;

import aplicacao.entidade.Carro;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;


public class Mapeador {
    private HashMap<String,Integer> cache = new HashMap<>();
    private final String filename;
    private final String EXTENSAO = ".car";
    
    
    public Mapeador(String filename){
        this.filename = filename + EXTENSAO;
        this.load();
    }
   
    
    public void setCache (HashMap cache){
        this.cache = cache;
    }
    
    public HashMap getCache(){
        return this.cache;
    }
    
    
    
  
    
   
    
     public void persist(){
        try{
            FileOutputStream fout = new FileOutputStream(filename);
            
            ObjectOutputStream oo = new ObjectOutputStream(fout);
            oo.writeObject(cache);
            
            oo.flush();
            fout.flush();
            
            oo.close();
            fout.close();
            
            oo = null;
            fout = null;
            
        }   catch (FileNotFoundException ex){
            System.out.println(ex);
        }   catch(IOException ex){
            System.out.println(ex);
        }
        }
     
     public void load(){
         try {
             FileInputStream fin = new FileInputStream(filename);
             ObjectInputStream oi = new ObjectInputStream(fin);
             
             this.cache = (HashMap<String,Integer>) oi.readObject();
             
             oi.close();
             fin.close();
             oi = null;
             fin = null;
             
         } catch(ClassNotFoundException ex){
             System.out.println(ex);
         } catch(FileNotFoundException ex){
             System.out.println(ex);
         } catch(IOException ex){
             System.out.println(ex);
          
         }
     }
    }
