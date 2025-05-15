public class Car extends Transport implements Mainenance {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + Car.this.getModelName());
        for (int i = 0; i < Car.this.getWheelsCount(); i++) {
            Car.updateTyre();
        }
        Car.checkEngine();
    }
}