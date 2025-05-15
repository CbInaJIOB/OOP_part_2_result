public class Truck extends Transport implements Mainenance {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
            System.out.println("Обслуживаем " + Truck.this.getModelName());
            for (int i = 0; i < Truck.this.getWheelsCount(); i++) {
                Truck.updateTyre();
            }
            Truck.checkEngine();
            Truck.checkTrailer();
        }
    }
