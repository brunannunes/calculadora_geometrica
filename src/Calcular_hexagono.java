public class Calcular_hexagono {
    double lado;

    public Calcular_hexagono(double lado) {
        this.lado = lado;
    }

    double calcularArea(){
        return (6 * this.lado) * Math.sqrt(3/4);
    }

    double calcularPerimetro(){
        return Math.pow(this.lado,6);
    }
    String retornaResumoDaForma(int valor){
        String resumo = String.format("O hexagono de lado %.2f, tem a area de %.2f e o perimetro de %.2f",this.lado,this.calcularArea(), this.calcularPerimetro());
        if (valor %2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
