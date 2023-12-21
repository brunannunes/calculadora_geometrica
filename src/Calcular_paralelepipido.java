public class Calcular_paralelepipido {
    double comprimento;
    double altura;
    double largura;

    public Calcular_paralelepipido(double comprimento, double altura, double largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    double calcularVolume(){
        return this.comprimento * this.altura * this.largura;
    }

    double calcularAreaSuperficial(){
        return 2 * ((this.comprimento * this.altura) + (this.altura * this.largura) + (this.comprimento * this.largura));
    }
    String retornaResumoDaForma(int valor){
        String resumo = String.format("O paralelepipido de comprimento %.2f, altura de %.2f e largura de %.2f tem o volume de %.2f e a area superficial de %.2f", this.comprimento,this.largura,this.altura, this.calcularVolume(), this.calcularAreaSuperficial());
        if (valor %2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();

    }
}
