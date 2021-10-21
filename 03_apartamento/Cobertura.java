public class Cobertura extends Apartamento {
    public Cobertura() {
        this.numeroQuartos = 4;
    }

    public void setAreaApartamento(int area) {
        this.areaApartamento = area;
    }

    public void upgrade() {
        setAreaApartamento(this.areaApartamento + 40);
    }
}
