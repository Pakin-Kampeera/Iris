public class Iris {
    private ReadURL data;

    public Iris(ReadURL data) {
        this.data = data;
    }

    public void displayNumIrisByType() {
        int setosa = 0;
        int versicolor = 0;
        int virginica = 0;
        for (int i = 0; i < data.getIrisType().size(); i++) {
            if (data.getIrisType().get(i).equals("Iris-setosa")) {
                setosa++;
            } else if (data.getIrisType().get(i).equals("Iris-versicolor")) {
                versicolor++;
            } else if (data.getIrisType().get(i).equals("Iris-virginica")) {
                virginica++;
            }
        }
        System.out.println("[Iris-setosa] - " + setosa);
        System.out.println("[Iris-versicolor] - " + versicolor);
        System.out.println("[Iris-virginica] - " + virginica);
    }

    public void displayNumRow() {
        System.out.println(data.getRow() + " rows");
    }
}
