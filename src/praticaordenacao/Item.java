/**
 * Alunos:
 * Erik Sampaio Betoni - 11912724
 * Luan Alves Godoy - 119125766
 */


package praticaordenacao;

public class Item {
  private String Jogo;
  private String Categoria;
  private double Nota;
    
    
    public Item(String jogo, String categoria, double Nota){
      this.Jogo = jogo;
      this.Categoria = categoria;
      this.Nota = Nota;
    }
    
    
    public void setJogo(String jogo){
      this.Jogo = jogo;
    }
    
    
    public void setCategoria(String categoria){
      this.Categoria = categoria;
    }
    
    
    public void setNota(double nota){
      this.Nota = nota;
    }
    
    
    public String getCategoria(){
      return this.Categoria.trim();
    }
    
    
    public String getJogo(){
      return this.Jogo;
    }
    
    
    public double getNota(){
      return this.Nota;
    }
}
