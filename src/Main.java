import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Initial init = new Initial();
        init.initStart();

        DataStorage users = new DataStorage();
        users.readUsersFromFile();

        DataStorage users8 = new DataStorage();
        users8.readUsersFromFile8();

        DataStorage winterItems = new DataStorage();
        winterItems.readWinterItemsFromFile();
        Catalog catalog1 = new Catalog(001, "Зимние виды спорта", winterItems);

        DataStorage summerItems = new DataStorage();
        summerItems.readSummerItemsFromFile();
        Catalog catalog2 = new Catalog(002, "Летние виды спорта", summerItems);

        DataStorage swimmingItems = new DataStorage();
        swimmingItems.readSwimmingItemsFromFile();
        Catalog catalog3 = new Catalog(003, "Плавание", swimmingItems);

        DataStorage clothesItems = new DataStorage();
        clothesItems.readClothesItemsFromFile();
        Catalog catalog4 = new Catalog(004, "Спортивная одежда", clothesItems);

        DataStorage tourismItems = new DataStorage();
        tourismItems.readTourismItemsFromFile();
        Catalog catalog5 = new Catalog(005, "Туризм", tourismItems);

        System.out.println(" ");

        System.out.println(catalog1.toString());
        System.out.println(catalog2.toString());
        System.out.println(catalog3.toString());
        System.out.println(catalog4.toString());
        System.out.println(catalog5.toString());

        System.out.println("_____________________");

        users.getAllUsers();
        System.out.println("_____________________");

        users.getUserById(10);
        System.out.println("_____________________");

        users.getUserById(100);
        System.out.println("_____________________");

        users.addUser(new User(100, "Vova", "Pupkin", "v@mail.ru", "20.20.2020"));
        System.out.println("_____________________");
        users.getAllUsers();

        users.deleteUserById(100);
        System.out.println("_____________________");

        users.deleteUserById(100);
        System.out.println("_____________________");
        users.getAllUsers();

        System.out.println();
        System.out.println("_________users from task 8____________");
        users8.getAllUsersHashMap();

        System.out.println(users.getAndReturnUserById(11).getUserName() + " положил в корзину товар с id = "
                + swimmingItems.getAndReturnSwimmingItemById(38).getId() + ", \""
                + swimmingItems.getAndReturnSwimmingItemById(38).getItemsName()
                + "\"" + " из раздела каталога id =" + " " + catalog3.getId() + " \"" + catalog3.getSection() + "\"");
        System.out.println(users.getAndReturnUserById(22).getUserName() + " положил в корзину товар с id = "
                + winterItems.getAndReturnWinterItemById(2).getId() + ", \""
                + winterItems.getAndReturnWinterItemById(2).getItemsName()
                + "\"" + " из раздела каталога id =" + " " + catalog1.getId() + " \"" + catalog1.getSection() + "\"");
        System.out.println(users.getAndReturnUserById(33).getUserName() + " положил в корзину товар с id = "
                + summerItems.getAndReturnSummerItemById(23).getId() + ", \""
                + summerItems.getAndReturnSummerItemById(23).getItemsName()
                + "\"" + " из раздела каталога id =" + " " + catalog2.getId() + " \"" + catalog2.getSection() + "\"");
        System.out.println(users.getAndReturnUserById(44).getUserName() + " положил в корзину товар с id = "
                + clothesItems.getAndReturnClothesItemById(58).getId() + ", \""
                + clothesItems.getAndReturnClothesItemById(58).getItemsName()
                + "\"" + " из раздела каталога id =" + " " + catalog4.getId() + " \"" + catalog4.getSection() + "\"");
        System.out.println(users.getAndReturnUserById(55).getUserName() + " положил в корзину товар с id = "
                + tourismItems.getAndReturnTourismItemById(74).getId() + ", \""
                + tourismItems.getAndReturnTourismItemById(74).getItemsName()
                + "\"" + " из раздела каталога id =" + " " + catalog5.getId() + " \"" + catalog5.getSection() + "\"");;

    }
}