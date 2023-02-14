package algorithm;

public class LinearLine
{

    protected LinearLine(Variables variables)
    {

        double totalX = 0;
        double totalY = 0;
        double[] xSet = variables.getXSet();
        double[] ySet = variables.getYSet();

        for (int i = 0; i < variables.getLENGTH(); i++)
        {
            totalX += xSet[i];
            totalY += ySet[i];
        }

        variables.setMEAN_X(totalX / variables.getLENGTH());
        variables.setMEAN_Y(totalY / variables.getLENGTH());
        double MEAN_X = variables.getMEAN_X();
        double MEAN_Y = variables.getMEAN_Y();

        for (int i = 0; i < variables.getLENGTH(); i++)
        {
            variables.setDIFF_X_EXACT_TO_MEAN(xSet[i] - MEAN_X, i);
            variables.setDIFF_Y_EXACT_TO_MEAN(ySet[i] - MEAN_Y, i);
        }

        double totalNumerator = 0;
        double totalDenominator = 0;

        for (int i = 0; i < variables.getLENGTH(); i++)
        {
            totalNumerator += variables.getDIFF_X_EXACT_TO_MEAN()[i] * variables.getDIFF_Y_EXACT_TO_MEAN()[i];
            totalDenominator += Math.pow(variables.getDIFF_X_EXACT_TO_MEAN()[i], 2);
        }

        variables.setSLOP(totalNumerator / totalDenominator);
        variables.setCONSTANT(MEAN_Y - (variables.getSLOP() * MEAN_X));
    }

}