package algorithm;

public class RSquared
{

    private Variables variables;

    protected RSquared(Variables variables)
    {
        this.variables = variables;

        int LENGTH = variables.getLENGTH();

        double totalNumerator = 0;
        double totalDenominator = 0;

        for (int i = 0; i < LENGTH; i++)
        {
            variables.setYPredictedSet((variables.getSLOP() * variables.getXSet()[i]) + variables.getCONSTANT(), i);
            variables.setDIFF_Y_PREDICTED_TO_MEAN(variables.getYPredictedSet()[i] - variables.getMEAN_Y(), i);
            totalNumerator += Math.pow(variables.getDIFF_Y_PREDICTED_TO_MEAN()[i], 2);
            totalDenominator += Math.pow(variables.getDIFF_Y_EXACT_TO_MEAN()[i], 2);
        }

        variables.setR_SQUARED(totalNumerator / totalDenominator);

    }

}
