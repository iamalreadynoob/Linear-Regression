package mainPackage;

import algorithm.LinearRegressionCrafter;
import algorithm.Variables;
import test.TestDataset;

public class Main
{

    public static void main(String[] args)
    {

        Variables variables = new Variables(new TestDataset().getXSet(), new TestDataset().getYSet());
        LinearRegressionCrafter crafter = new LinearRegressionCrafter(variables);

        System.out.println("prediction: " + crafter.response(41));
        System.out.println("r^2: " + crafter.getRSquared());

    }

}
