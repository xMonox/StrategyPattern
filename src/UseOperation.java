public class UseOperation {
    private Operation operation;

    public UseOperation(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double num1, double num2) {
        return operation.calculate(num1, num2);
    }

}
