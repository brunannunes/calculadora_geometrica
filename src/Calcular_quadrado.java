public class Calcular_quadrado {
    double lado;

    public Calcular_quadrado(double lado) {
        this.lado = lado;
    }

    double calcularArea(){
        return Math.pow(this.lado, 2);
    }

    double calcularPerimetro(){
        return Math.pow(this.lado,4);
    }

    String retornaResumoDaForma(int valor){
        String resumo = String.format("O quadrado de lado %.2f tem a area de %.2f e o perimetro de %.2f", this.lado, this.calcularArea(), this.calcularPerimetro());
        if (valor %2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}



