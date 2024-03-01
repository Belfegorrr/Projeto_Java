public class SemContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Brasilia(100, "gas", "black");
        } else {
            return null;
        }
    }
}