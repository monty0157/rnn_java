
public class RNN {

    private static double weightInit() {
        double weight = Math.random();
        return weight;
    }

    private static double relu(double data) {
        double relu = Math.max(0, data);

        return relu;
    }

    private static double cross_entropy(double[] prediction, double[] target) {
        double totalLoss = 0;
        for(int i=0; i < prediction.length; i++) {
            totalLoss += target[i] * (-Math.log(prediction[i]));
        }

        double averageLoss = totalLoss / prediction.length;
        return averageLoss;
    }

    private static double activation(double[] data, double[] weights) {
        double weightMultiplication = 0;

        for(int i = 0; i < data.length; i++) {
            weightMultiplication += data[i] * weights[i];
        }
        double activation = relu(weightMultiplication);

        return activation;
    }

    public static void main(String[] args) {
        double[] predictions = {0.38, 0.5, 0.9};
        double[] targets = {1, 1, 1};
        double[] data = {10, 1};
        double[] weights = {weightInit(), weightInit()};
        System.out.println(cross_entropy(predictions, targets));
        System.out.println(activation(data, weights));
    }
}
