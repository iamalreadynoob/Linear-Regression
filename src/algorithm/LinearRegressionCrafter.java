package algorithm;

public class LinearRegressionCrafter
{

    private Variables variables;

    public LinearRegressionCrafter(Variables variables)
    {
        this.variables = variables;

        new LinearLine(variables);
        new RSquared(variables);

    }

    public double response(int xIndex) {return (variables.getSLOP() * xIndex) + variables.getCONSTANT();}
    public double getRSquared() {return variables.getR_SQUARED();}

}
