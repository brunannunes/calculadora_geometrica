public class Calcular_cilindro {
    double raio;
    double altura;

    final double PI = Math.PI;

    public Calcular_cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    double calcularVolume(){
        return this.PI * this.altura * Math.pow(raio,2);
    }

    double calcularAreaSuperficial(){
        return  (2 * this.PI * this.raio * this.altura) + ( 2 * this.PI * Math.pow(raio,2));
    }

    String retornaResumoDaForma(int valor){
        String resumo = String.format("O cilindro de raio %.2f e altura de %.2f tem o volume de %.2f e a area superficial de %.2f", this.raio,this.altura, this.calcularVolume(), this.calcularAreaSuperficial());
        if (valor %2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
