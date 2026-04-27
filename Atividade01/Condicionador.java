public class Condicionador {
    //atributos
    private String nome;
    private double temperatura;
    private double[] potencias = {0,1.8,3.6,5.4,7.2,9.0,10.8, 12.6, 14.4, 16.2,18.0};
    //construtor
    public Condicionador(String nome) {
        this.nome = nome;
        this.temperatura = 0;

    }
    
    public Condicionador() {
        this.nome = "generico";
        this.temperatura = 0;
    }

    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTemperatura() {
        return temperatura;
    }

    //métodos especiaisd
    public void alterarTemp(double temp) {
        for (int i =0; i < potencias.length; i++) {
            if (potencias[i] == temp  ) {
                this.temperatura = temp;
                break;
            }
        }
    }

    public void  aumTemp() {
        for (int i =0; i < potencias.length; i++) {
            if (potencias[i] == getTemperatura() && potencias[i] != 18.0 ) {
                this.temperatura = potencias[i+1];
                break;
            }
        }
    }

    public void dimTemp() {
        for (int i =0; i < potencias.length; i++) {
            if (potencias[i] == getTemperatura() && potencias[i] != 0) {
                this.temperatura = potencias[i-1];
                break;
            }
        }
    }

    public void desligar_ar() {
        temperatura = 0;
    }
    //print
    @Override
    public String toString() {
        
        if (temperatura > 0) {
            return "Nome do ar condicionado: " + getNome() + ". Temperatura atual: " + getTemperatura() + "•C.";
        } else {
            return "Nome do ar condicionado: " + getNome() + ". Temperatura atual: " + getTemperatura() + "•C." + " O ar condicionado está desligado!";
        }
    }
}
