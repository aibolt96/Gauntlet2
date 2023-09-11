public class BasicCalculator {
    private double operandOne;
    private char operation;
    private double operandTwo;
    private double result;

    public void setOperandOne(double operand) {
        this.operandOne = operand;
    }

    public void setOperation(char operator) {
        this.operation = operator;
    }

    public void setOperandTwo(double operand) {
        this.operandTwo = operand;
    }

    public void performOperation() {
        if (operation == '+') {
            result = operandOne + operandTwo;
        } else if (operation == '-') {
            result = operandOne - operandTwo;
        } else {
            System.out.println("Invalid operation: " + operation);
        }
    }

    public double getResults() {
        return result;
    }

    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();

        calculator.setOperandOne(10.5);
        calculator.setOperation('+');
        calculator.setOperandTwo(5.2);
        calculator.performOperation();

        double finalResult = calculator.getResults();
        System.out.println(finalResult);
    }
}