public class MonitoraPartida {

   private ArrayList<String> spots;

   public MonitoraPartida(ArrayList<String> spots) {
      this.spots = spots;
   }

   public Boolean verificaGanhador(){

    	if((this.spots.get(0) == this.spots.get(1)) && (this.spots.get(0) == this.spots.get(2))){
    		return true;
    	}else if ((this.spots.get(3) == this.spots.get(4)) && (this.spots.get(3) == this.spots.get(5))) {
			return true;
    	}else{
    		return false;
    	}
	}

	public void display() {
		String tabuleiroFormatado = this.spots.get(0) + " | " + this.spots.get(1) + " | " + this.spots.get(2) + "\n" + this.spots.get(3) + " | " + this.spots.get(4) + " | " + this.spots.get(5) + "\n" + this.spots.get(6) + " | " + this.spots.get(7) + " | " + this.spots.get(8);
		System.out.print(tabuleiroFormatado);
  	}

}