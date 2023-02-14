package test;

public class TestDataset
{

    private double[] xSet, ySet;

    public TestDataset()
    {
        xSet = new double[40];
        for (int i = 1; i <= 40; i++) xSet[i-1] = i;

        ySet = new double[] {22, 16, 25, 34, 19, 34, 21, 14, 19, 38, 25, 22, 30, 24, 28, 18, 27, 36, 21, 22, 26, 27, 24, 32, 32, 25, 32, 18, 19, 25, 26, 26, 24, 22, 26, 30, 21, 21, 21, 28};
    }

    public double[] getXSet() {return xSet;}
    public double[] getYSet() {return ySet;}
}
