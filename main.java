package toy_shop;

public class main {
    public static void main(String[] args) {
        // Создание объектов "Игрушки"
        toy bear = new toy(1, "Bear");
        toy car = new toy(2, "Car");
        toy cubes = new toy(3, "Cubes");
        toy lego = new toy(4, "Lego");
        toy balloons = new toy(5, "Balloons");
        toy ball = new toy(6, "Ball");
        toy sword = new toy(7, "Sword");

        // Создание объекта "Розыгрыш игрушек" с добавлением игрушек в розыгрыш
        lot_toy toy_lottery = new lot_toy();
        toy_lottery.add_toy_in_listToy(bear);
        toy_lottery.add_toy_in_listToy(car);
        toy_lottery.add_toy_in_listToy(cubes);
        toy_lottery.add_toy_in_listToy(lego);
        toy_lottery.add_toy_in_listToy(balloons);
        toy_lottery.add_toy_in_listToy(ball);
        toy_lottery.add_toy_in_listToy(sword);

        // Запускаем розыгрыш с управлением выпадения выигрыша, затем читаем файл
        toy_lottery.lottteryToy();
        toy_lottery.readFile();
        toy_lottery.lottteryToy();
       
        toy_lottery.readFile();
        // Проверяем оставшиеся игрушки в списке
        toy_lottery.getToys();
        // просматриваем число игрушек в списке
        toy_lottery.getToy_count();
    }
}
