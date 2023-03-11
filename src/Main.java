import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        DataStorage dataStorage = new DataStorage();
        Initial init = new Initial();
        init.initStart(dataStorage);

        dataStorage.readUsersFromFile();
        dataStorage.readUsersFromFile8();
        dataStorage.readWinterItemsFromFile();
        dataStorage.readSummerItemsFromFile();
        dataStorage.readSwimmingItemsFromFile();
        dataStorage.readClothesItemsFromFile();
        dataStorage.readTourismItemsFromFile();

        Catalog catalog1 = new Catalog(001, "Зимние виды спорта", dataStorage.getWinterItems());
        Catalog catalog2 = new Catalog(002, "Летние виды спорта", dataStorage.getSummerItems());
        Catalog catalog3 = new Catalog(003, "Плавание", dataStorage.getSwimmingItems());
        Catalog catalog4 = new Catalog(004, "Спортивная одежда", dataStorage.getClothesItems());
        Catalog catalog5 = new Catalog(005, "Туризм", dataStorage.getTourismItems());

        System.out.println(" ");

        System.out.println(catalog1.toString());
        System.out.println(catalog2.toString());
        System.out.println(catalog3.toString());
        System.out.println(catalog4.toString());
        System.out.println(catalog5.toString());

        System.out.println("_____________________");

        dataStorage.getAllUsers();
        System.out.println("_____________________");

        dataStorage.printUserById(10);
        System.out.println("_____________________");

        dataStorage.printUserById(100);
        System.out.println("_____________________");

        dataStorage.addUser(new User(100, "Vova", "Pupkin", "v@mail.ru", "20.20.2020"));
        System.out.println("_____________________");
        dataStorage.getAllUsers();

        dataStorage.deleteUserById(100);
        System.out.println("_____________________");

        dataStorage.deleteUserById(100);
        System.out.println("_____________________");
        dataStorage.getAllUsers();

        System.out.println();
        System.out.println("_________users from task 8____________");
        dataStorage.getAllUsersHashMap();

        System.out.println(dataStorage.getUserById(11).getUserName() + " положил в корзину товар с id = "
                + dataStorage.getSwimmingItemById(38).getId() + ", \""
                + dataStorage.getSwimmingItemById(38).getItemsName()
                + "\"" + " из раздела каталога id =" + " " + catalog3.getId() + " \"" + catalog3.getSection() + "\"");
        System.out.println(dataStorage.getUserById(22).getUserName() + " положил в корзину товар с id = "
                + dataStorage.getWinterItemById(2).getId() + ", \""
                + dataStorage.getWinterItemById(2).getItemsName()
                + "\"" + " из раздела каталога id =" + " " + catalog1.getId() + " \"" + catalog1.getSection() + "\"");
        System.out.println(dataStorage.getUserById(33).getUserName() + " положил в корзину товар с id = "
                + dataStorage.getSummerItemById(23).getId() + ", \""
                + dataStorage.getSummerItemById(23).getItemsName()
                + "\"" + " из раздела каталога id =" + " " + catalog2.getId() + " \"" + catalog2.getSection() + "\"");
        System.out.println(dataStorage.getUserById(44).getUserName() + " положил в корзину товар с id = "
                + dataStorage.getClothesItemById(58).getId() + ", \""
                + dataStorage.getClothesItemById(58).getItemsName()
                + "\"" + " из раздела каталога id =" + " " + catalog4.getId() + " \"" + catalog4.getSection() + "\"");
        System.out.println(dataStorage.getUserById(55).getUserName() + " положил в корзину товар с id = "
                + dataStorage.getTourismItemById(74).getId() + ", \""
                + dataStorage.getTourismItemById(74).getItemsName()
                + "\"" + " из раздела каталога id =" + " " + catalog5.getId() + " \"" + catalog5.getSection() + "\"");;

    }
}