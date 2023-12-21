public class Calcular_cubo {
    double lado;

    public Calcular_cubo(double lado) {
        this.lado = lado;
    }

    double calcularVolume(){
        return Math.pow(this.lado,3);
    }

    double calcularAreaSuperficial(){
        return Math.pow(this.lado,2) * 6;
    }

    String retornaResumoDaForma(int valor){
        String resumo = String.format("O cubo de lado %.2f tem o volume de %.2f e a area superficial de %.2f", this.lado, this.calcularVolume(), this.calcularAreaSuperficial());
        if (valor %2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
