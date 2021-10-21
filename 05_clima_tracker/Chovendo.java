public class Chovendo{
   public CondicaoClimaticaChovendo(){
       this.condicao = "Chovendo";
   }

   public String gerarAlerta(){
       NotificadorAlerta notificarAlerta = new Phone();
       return notificarAlerta.notificarAlerta(condicao);
   }
}