package algorithm;

public class Variables
{

    private final int LENGTH;
    private double MEAN_X, MEAN_Y, SLOP, CONSTANT, R_SQUARED;
    private final double[] xSet, ySet;
    private double[] DIFF_X_EXACT_TO_MEAN, DIFF_Y_EXACT_TO_MEAN, yPredictedSet, DIFF_Y_PREDICTED_TO_MEAN;

    public Variables(double[] xSet, double[] ySet)
    {
        this.xSet = xSet;
        this.ySet = ySet;

        LENGTH = xSet.length;

        DIFF_X_EXACT_TO_MEAN = new double[LENGTH];
        DIFF_Y_EXACT_TO_MEAN = new double[LENGTH];
        DIFF_Y_PREDICTED_TO_MEAN = new double[LENGTH];
        yPredictedSet = new double[LENGTH];

    }

    public int getLENGTH() {return LENGTH;}
    public double getMEAN_X() {return MEAN_X;}
    public double getMEAN_Y() {return MEAN_Y;}
    public double getSLOP() {return SLOP;}
    public double getCONSTANT() {return CONSTANT;}
    public double getR_SQUARED() {return R_SQUARED;}
    public double[] getXSet() {return xSet;}
    public double[] getYSet() {return ySet;}
    public double[] getDIFF_X_EXACT_TO_MEAN() {return DIFF_X_EXACT_TO_MEAN;}
    public double[] getDIFF_Y_EXACT_TO_MEAN() {return DIFF_Y_EXACT_TO_MEAN;}
    public double[] getYPredictedSet() {return yPredictedSet;}
    public double[] getDIFF_Y_PREDICTED_TO_MEAN() {return DIFF_Y_PREDICTED_TO_MEAN;}

    protected void setMEAN_X(double MEAN_X) {this.MEAN_X = MEAN_X;}
    protected void setMEAN_Y(double MEAN_Y) {this.MEAN_Y = MEAN_Y;}
    protected void setDIFF_X_EXACT_TO_MEAN(double value, int index) {DIFF_X_EXACT_TO_MEAN[index] = value;}
    protected void setDIFF_Y_EXACT_TO_MEAN(double value, int index) {DIFF_Y_EXACT_TO_MEAN[index] = value;}
    protected void setDIFF_Y_PREDICTED_TO_MEAN(double value, int index) {DIFF_Y_PREDICTED_TO_MEAN[index] = value;}
    protected void setSLOP(double SLOP) {this.SLOP = SLOP;}
    protected void setCONSTANT(double CONSTANT) {this.CONSTANT = CONSTANT;}
    protected void setYPredictedSet(double value, int index) {yPredictedSet[index] = value;}
    protected void setR_SQUARED(double R_SQUARED) {this.R_SQUARED = R_SQUARED;}
}