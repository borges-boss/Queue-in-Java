package fila;

public class Fila {

    private Celula primeiro, ultimo;

    public Fila() {
        primeiro = new Celula();
        ultimo = primeiro;
    }

    public void add(int x) {
        ultimo.setProx(new Celula(x));
        ultimo = ultimo.getProx();
    }

    public Celula get(int index) {

        Celula tmp = primeiro.getProx();
        for (int i = 0; i <= index; i++) {
            tmp = tmp.getProx();
        }

        return tmp;
    }


        
    public int remove() {
        Celula tmp = primeiro;
        primeiro.setProx(primeiro.getProx().getProx());
        return tmp.getElement();
    }

    public void showElements() {

        Celula tmp = primeiro;

        while (tmp != null) {
            System.out.println(tmp.getElement());
            tmp = tmp.getProx();
        }
    }

    public void invertQueue() {
        Celula tmp = primeiro.getProx();
        Celula tmpAnt = null;
        Celula aux;

        while (tmp != null) {

            aux = tmp.getProx();
            tmp.setProx(tmpAnt);
            tmpAnt = tmp;
            tmp = aux;

            if (tmp != null) {
                primeiro.setProx(tmp);
            }
        }

    }

    public int countElePares5(Celula tmp) {

        int count = 0;

        if (tmp != null) {
            if (tmp.getElement() % 2 == 0 && tmp.getElement() % 5 == 0) {
                count++;
            }

            return countElePares5(tmp.getProx());
        }

        return count;
    }

    public int getBiggestElement() {

        Celula tmp = primeiro.getProx();
        int maior = 0;

        while (tmp != null) {
            if (maior < tmp.getElement()) {
                maior = tmp.getElement();
            }

            tmp = tmp.getProx();
        }

        return maior;
    }

    public int sumAllElements() {

        Celula tmp = primeiro.getProx();
        int sum = 0;

        while (tmp != null) {
            sum += tmp.getElement();
            tmp = tmp.getProx();
        }

        return sum;
    }

}
