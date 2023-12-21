public class Calcular_esfera {
    double raio;
    final double PI = Math.PI;

    public Calcular_esfera(double raio) {
        this.raio = raio;
    }

    double calcularVolume() {
        return 4/3*this.PI * Math.pow(this.raio,3);
    }

    double calcularAreaSuperficial() {
        return 4*this.PI * Math.pow(raio,2);
    }
    String retornaResumoDaForma(int valor){
        String resumo = String.format("A esfera tem o volume de %.2f e a area superficial de %.2f", this.calcularVolume(), this.calcularAreaSuperficial());
        if (valor %2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}

