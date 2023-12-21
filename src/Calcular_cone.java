public class Calcular_cone {
    double raio;
    double altura;
    final double PI = Math.PI;

    public Calcular_cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    double calcularVolume() {
        return 1/3 * this.PI * Math.pow(this.raio, 2) * altura;
    }

    double calcularAreaSuperficial() {
        return this.PI * this.raio * Math.sqrt(this.altura) + Math.sqrt(this.raio);
    }

    String retornaResumoDaForma(int valor){
        String resumo = String.format("O cone de raio %.2f e altura de %.2f tem o volume de %.2f e a area superficial de %.2f", this.raio,this.altura, this.calcularVolume(), this.calcularAreaSuperficial());
        if (valor %2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
