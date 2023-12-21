public class Calcular_retangulo {
    double base = 0;
    double altura = 0;


    public Calcular_retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return this.base * this.altura;
    }
    public double calcularPerimetro(){
        return (2*this.base) +(2*this.altura);
    }
    String retornaResumoDaForma(int valor){
        String resumo = String.format("O retangulo de base %.2f e de altura %.2f, tem a area de %.2f e o perimetro de %.2f",this.altura, this.base, this.calcularArea(), this.calcularPerimetro());
        if (valor %2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
