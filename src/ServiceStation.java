public class ServiceStation {
    // перегрузка методов
    // метод с одним аргументом
    public void check(Mainenance mainenance) {
        mainenance.service();
    }
    // метод с двумя аргументами
    public void check(Mainenance mainenance, Mainenance mainenance1) {
        mainenance.service();
        mainenance1.service();
    }
    // метод с тремя аргументами
    public void check(Mainenance mainenance, Mainenance mainenance1, Mainenance mainenance2) {
        mainenance.service();
        mainenance1.service();
        mainenance2.service();
    }
}