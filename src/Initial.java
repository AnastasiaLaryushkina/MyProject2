import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;

public class Initial {

    public void initStart(DataStorage dataStorage) {

        ArrayList<User> usersArr = new ArrayList<>();
        usersArr.add(new User(11, "Anna Ivanova", "aivanova@gmail.com", "female", "01.01.1990"));
        usersArr.add(new User(22, "Maria Petrova", "mpetrova@gmail.com", "female", "02.02.1991"));
        usersArr.add(new User(33, "Ivan Sidorov", "isidorov@gmail.com", "male", "03.03.1992"));
        usersArr.add(new User(44, "Igor Vasechkin", "ivasechkin@gmail.com", "male", "04.04.1993"));
        usersArr.add(new User(55, "Oleg Morozov", "omorozov@gmail.com", "male", "05.05.1994"));
        usersArr.add(new User(66, "Natalia Lebedeva", "nlebedeva@gmail.com", "female", "06.06.1995"));
        usersArr.add(new User(77, "Olga Kulikova", "okulikova@gmail.com", "female", "07.07.1996"));
        usersArr.add(new User(88, "Elena Kotova", "ekotova@gmail.com", "female", "08.08.1997"));
        usersArr.add(new User(99, "Andrey Semenov", "asemenov@gmail.com", "male", "09.09.1998"));
        usersArr.add(new User(10, "Irina Kovaleva", "ikovaleva@gmail.com", "female", "10.10.1999"));

        ArrayList<Items> winterSports = new ArrayList<>();
        winterSports.add(new Items(1, "Лыжи беговые взрослые", 1000.00, 15));
        winterSports.add(new Items(2, "Лыжи беговые детские", 800.00, 3));
        winterSports.add(new Items(3, "Лыжи горные", 2500.00, 8));
        winterSports.add(new Items(4, "Коньки ледовые", 700.00, 22));
        winterSports.add(new Items(5, "Санки красные", 300.00, 1));
        winterSports.add(new Items(6, "Санки синие", 300.00, 15));
        winterSports.add(new Items(7, "Снегокат", 1200.00, 10));
        winterSports.add(new Items(8, "Лыжные палки", 100.00, 5));
        winterSports.add(new Items(9, "Сноуборд взрослый", 3000.00, 2));
        winterSports.add(new Items(10, "Сноуборд детский", 1500.00, 7));
        winterSports.add(new Items(11, "Клюшка для хоккея", 1100.00, 13));
        winterSports.add(new Items(12, "Коньки для хоккея", 700.00, 21));
        winterSports.add(new Items(13, "Тюбинг", 1300.00, 6));
        winterSports.add(new Items(14, "Ботинки горнолыжные", 2100.00, 18));
        winterSports.add(new Items(15, "Ботинки для сноуборда", 2100.00, 11));

        ArrayList<Items> summerSports = new ArrayList<>();
        summerSports.add(new Items(16, "Велосипед взрослый", 2000.00, 4));
        summerSports.add(new Items(17, "Велосипед детский", 1200.00, 13));
        summerSports.add(new Items(18, "Велосипед горный", 2500.00, 9));
        summerSports.add(new Items(19, "Коньки роликовые", 500.00, 2));
        summerSports.add(new Items(20, "Самокат черный", 430.00, 15));
        summerSports.add(new Items(21, "Самокат белый", 430.00, 15));
        summerSports.add(new Items(22, "Футбольный мяч", 300.00, 28));
        summerSports.add(new Items(23, "Ворота для минифутбола", 1000.00, 7));
        summerSports.add(new Items(24, "Набор для бадминтона", 600.00, 20));
        summerSports.add(new Items(25, "Теннисная ракетка", 900.00, 3));
        summerSports.add(new Items(26, "Набор теннисных мячей", 380.00, 11));
        summerSports.add(new Items(27, "Набор для настольного тенниса", 550.00, 8));
        summerSports.add(new Items(28, "Квадроцикл детский", 6000.00, 1));
        summerSports.add(new Items(29, "Волейбольный мяч", 300.00, 16));
        summerSports.add(new Items(30, "Набор для стрельбы из лука", 700.00, 10));

        ArrayList<Items> swimmingSport = new ArrayList<>();
        swimmingSport.add(new Items(31, "Бассейн надувной", 5500.00, 2));
        swimmingSport.add(new Items(32, "Байдарка", 4500.00, 5));
        swimmingSport.add(new Items(33, "Плавки мужские", 250.00, 19));
        swimmingSport.add(new Items(34, "Плавки детские", 200.00, 17));
        swimmingSport.add(new Items(35, "Купальник женский", 680.00, 24));
        swimmingSport.add(new Items(36, "Весло для гребли", 1730.00, 8));
        swimmingSport.add(new Items(37, "Ласты черные", 600.00, 11));
        swimmingSport.add(new Items(38, "Ласты синие", 600.00, 14));
        swimmingSport.add(new Items(39, "Маска для снорклинга", 380.00, 20));
        swimmingSport.add(new Items(40, "Трубка для снорклинга", 270.00, 33));
        swimmingSport.add(new Items(41, "Шапочка для бассейна", 550.00, 28));
        swimmingSport.add(new Items(42, "Очки для подводного плавания", 440.00, 18));
        swimmingSport.add(new Items(43, "Костюм для дайвинга", 2500.00, 7));
        swimmingSport.add(new Items(44, "Надувной мяч", 300.00, 16));
        swimmingSport.add(new Items(45, "Спасательный круг", 700.00, 12));

        ArrayList<Items> clothes = new ArrayList<>();
        clothes.add(new Items(46, "Футболка женская", 700.00, 26));
        clothes.add(new Items(47, "Футболка мужская", 600.00, 14));
        clothes.add(new Items(48, "Костюм горнолыжный", 3800.00, 9));
        clothes.add(new Items(49, "Термобелье", 570.00, 4));
        clothes.add(new Items(50, "Спортивный костюм детский", 900.00, 20));
        clothes.add(new Items(51, "Бейсболка взрослая", 730.00, 7));
        clothes.add(new Items(52, "Бейсболка детская", 510.00, 10));
        clothes.add(new Items(53, "Шорты серые", 620.00, 3));
        clothes.add(new Items(54, "Шорты белые", 620.00, 12));
        clothes.add(new Items(55, "Куртка зимняя", 2700.00, 8));
        clothes.add(new Items(56, "Дождевик", 780.00, 5));
        clothes.add(new Items(57, "Ветровка", 1440.00, 16));
        clothes.add(new Items(58, "Юбка теннисная", 1100.00, 17));
        clothes.add(new Items(59, "Жилет", 1900.00, 1));
        clothes.add(new Items(60, "Толстовка женская", 1700.00, 16));

        ArrayList<Items> tourism = new ArrayList<>();
        tourism.add(new Items(61, "Палатка", 4700.00, 6));
        tourism.add(new Items(62, "Тент", 1600.00, 13));
        tourism.add(new Items(63, "Спальный мешок", 1800.00, 19));
        tourism.add(new Items(64, "Раскладной стул", 1100.00, 10));
        tourism.add(new Items(65, "Раскладной стол", 1300.00, 11));
        tourism.add(new Items(66, "Рюкзак походный", 990.00, 8));
        tourism.add(new Items(67, "Термокружка", 740.00, 30));
        tourism.add(new Items(68, "Палки для треккинга", 1600.00, 1));
        tourism.add(new Items(69, "Палки для скандинавской ходьбы", 1150.00, 12));
        tourism.add(new Items(70, "Фонарь ручной", 600.00, 4));
        tourism.add(new Items(71, "Фонарь налобный", 680.00, 2));
        tourism.add(new Items(72, "Набор инструментов походный", 3500.00, 9));
        tourism.add(new Items(73, "Набор для спортивной рыбалки", 3800.00, 3));
        tourism.add(new Items(74, "Матрас надувной", 1440.00, 21));
        tourism.add(new Items(75, "Набор для пикника", 2700.00, 5));

        HashMap<Integer, User> usersMap= new HashMap<>();
        User user1 = new User("Anna Ivanova", "aivanova@gmail.com", "female", "01.01.1990", 374561);
        User user2 = new User("Maria Petrova", "mpetrova@gmail.com", "female", "02.02.1991", 529641);
        User user3 = new User("Ivan Sidorov", "isidorov@gmail.com", "male", "03.03.1992", 634512);
        User user4 = new User( "Igor Vasechkin", "ivasechkin@gmail.com", "male", "04.04.1993", 924435);
        User user5 = new User( "Oleg Morozov", "omorozov@gmail.com", "male", "05.05.1994", 783421);
        User user6 = new User("Natalia Lebedeva", "nlebedeva@gmail.com", "female", "06.06.1995", 878965);
        User user7 = new User("Olga Kulikova", "okulikova@gmail.com", "female", "07.07.1996", 172381);
        User user8 = new User( "Elena Kotova", "ekotova@gmail.com", "female", "08.08.1997", 634572);
        User user9 = new User("Andrey Semenov", "asemenov@gmail.com", "male", "09.09.1998", 315255);
        User user10 = new User( "Irina Kovaleva", "ikovaleva@gmail.com", "female", "10.10.1999", 786754);

        usersMap.put(user1.getPassport(), user1);
        usersMap.put(user2.getPassport(), user2);
        usersMap.put(user3.getPassport(), user3);
        usersMap.put(user4.getPassport(), user4);
        usersMap.put(user5.getPassport(), user5);
        usersMap.put(user6.getPassport(), user6);
        usersMap.put(user7.getPassport(), user7);
        usersMap.put(user8.getPassport(), user8);
        usersMap.put(user9.getPassport(), user9);
        usersMap.put(user10.getPassport(), user10);

        dataStorage.saveUsersToFile(usersArr);
        dataStorage.saveItemsToFile(winterSports, "winterItems");
        dataStorage.saveItemsToFile(summerSports, "summerItems");
        dataStorage.saveItemsToFile(swimmingSport, "swimmingItems");
        dataStorage.saveItemsToFile(clothes, "clothesItems");
        dataStorage.saveItemsToFile(tourism, "tourismItems");
        dataStorage.saveUsersToFile8(usersMap);

    }
}

