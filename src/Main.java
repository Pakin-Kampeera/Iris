import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Iris iris = new Iris(new ReadURL("https://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data"));
        iris.displayNumIrisByType();
        iris.displayNumRow();
    }
}
