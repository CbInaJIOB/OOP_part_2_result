public class Bicycle extends Transport implements Mainenance {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + Bicycle.this.getModelName());
        for (int i = 0; i < Bicycle.this.getWheelsCount(); i++) {
            Bicycle.updateTyre();
        }
    }

}
