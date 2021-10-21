public abstract class CondicaoClimatica{
   protected String condicao;

   public String getCondicao(){
       return this.condicao;
   }

   public abstract String gerarAlerta();
}