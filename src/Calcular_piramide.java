public class Calcular_piramide {
    double aresta_base;
    double apotema;
    double altura;

    double area_base;

    public Calcular_piramide(double aresta_base, double apotema, double altura, double area_base) {
        this.aresta_base = aresta_base;
        this.apotema = apotema;
        this.altura = altura;
        this.area_base = area_base;
    }

    double calcularVolume() {
        return (this.area_base * this.altura)/3;
    }

    double calcularAreaSuperficial() {
        return (2 * this.aresta_base * apotema) + Math.pow(area_base, 2);
    }

    String retornaResumoDaForma(int valor){
        String resumo = String.format("A piramide tem o volume de %.2f e a area superficial de %.2f", this.calcularVolume(), this.calcularAreaSuperficial());
        if (valor %2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
