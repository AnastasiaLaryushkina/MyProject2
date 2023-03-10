import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataStorage {
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Items> winterItems = new ArrayList<>();
    private ArrayList<Items> summerItems = new ArrayList<>();
    private ArrayList<Items> swimmingItems = new ArrayList<>();
    private ArrayList<Items> clothesItems = new ArrayList<>();
    private ArrayList<Items> tourismItems = new ArrayList<>();

    public void getAllUsers() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println((users.get(i)));
        }
    }
    public void getAllUsersHashMap() {
        HashMap<Integer, User> usersMap = readUsersFromFile8();
        usersMap.values().stream()
                .forEach(user -> System.out.println(user));
    }

    public void getUserById(int id) {
        boolean found = false;
        for (int i = 0; i < users.size(); i++) {
            if ((users.get(i).getId()) == id) {
                System.out.println("Пользователь " + users.get(i).getUserName() + " id=" + users.get(i).getId() + " был найден.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Пользователь с id=" + id + " не найден.");
        }
    }

    public User getAndReturnUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public Items getAndReturnSwimmingItemById(int id) {
        for (Items item : swimmingItems) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public Items getAndReturnWinterItemById(int id) {
        for (Items item : winterItems) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public Items getAndReturnSummerItemById(int id) {
        for (Items item : summerItems) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public Items getAndReturnClothesItemById(int id) {
        for (Items item : clothesItems) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public Items getAndReturnTourismItemById(int id) {
        for (Items item : tourismItems) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void addUser(User user) {
        users.add(user);
        saveUsersToFile(users);
        System.out.println("Пользователь " + user.getUserName() + " id=" + user.getId() + " создался в базе данных");
    }

    public void deleteUserById(int id) {
        boolean found = false;
        for (int i = 0; i < users.size(); i++) {
            if ((users.get(i).getId()) == id) {
                System.out.println("Пользователь " + users.get(i).getUserName() + " id=" + users.get(i).getId() + " был удален.");
                users.remove(users.get(i));
                saveUsersToFile(users);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Пользователь с id=" + id + " не найден.");
        }
    }

    public void saveUsersToFile8(HashMap<Integer, User> usersMap) {
        String filePath = "src/resources/usersfortask8.txt";
        // Удаление файла перед записью данных
        File file = new File(filePath);
        file.delete();

        // Запись данных в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Map.Entry<Integer, User> entry : usersMap.entrySet()) {
                User user = entry.getValue();
                String line = user.getUserName() + "_" + user.getEmail() + "_" + user.getGender() + "_" + user.getDateOfBirth() + "_" + user.getPassport();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("При записи пользователя в файл произошла ошибка");
        }
    }

    public HashMap<Integer, User> readUsersFromFile8() {
        HashMap<Integer, User> usersMap = new HashMap<>();
        String filePath = "src/resources/usersfortask8.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split("_");
                Integer passportNumber = Integer.parseInt(userData[4]);
                String userName = userData[0];
                String email = userData[1];
                String gender = userData[2];
                String dateOfBirth = userData[3];

                User user = new User(userName, email, gender, dateOfBirth, passportNumber);
                usersMap.put(passportNumber, user);
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении пользователей из файла");
        }
        return usersMap;
    }

    public void saveUsersToFile(ArrayList<User> usersList) {
        String filePath = "src/resources/users.txt";
        // Удаление файла перед записью данных
        File file = new File(filePath);
        file.delete();
        // Запись данных в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (User user : usersList) {
                String line = user.getId() + "_" + user.getUserName() + "_" + user.getEmail() + "_" + user.getGender() + "_" + user.getDateOfBirth();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("При записи пользователей в файл произошла ошибка");;
        }
    }

    public void readUsersFromFile() {
        String filePath = "src/resources/users.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("_");
                int id = Integer.parseInt(data[0]);
                String userName = data[1];
                String email = data[2];
                String gender = data[3];
                String dateOfBirth = data[4];

                User user = new User(id, userName, email, gender, dateOfBirth);
                users.add(user);
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении пользователей из файла");
        }
    }

    public void saveItemsToFile(ArrayList<Items> itemsList, String name) {
        String filePath = "src/resources/" + name + ".txt";
        // Удаление файла перед записью данных
        File file = new File(filePath);
        file.delete();

        // Запись данных в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Items item : itemsList) {
                String line = item.getId() + "_" + item.getItemsName() + "_" + item.getPrice() + "_" + item.getItemQuantity();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readSummerItemsFromFile() {
        String filePath = "src/resources/summerItems.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("_");
                int id = Integer.parseInt(data[0]);
                String itemName = data[1];
                double price = Double.parseDouble(data[2]);
                int itemQuantity = Integer.parseInt(data[3]);

                Items item = new Items(id, itemName, price, itemQuantity);
                summerItems.add(item);
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении товаров для летних видов спорта из файла");
        }
    }

    public void readSwimmingItemsFromFile() {
        String filePath = "src/resources/swimmingItems.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("_");
                int id = Integer.parseInt(data[0]);
                String itemName = data[1];
                double price = Double.parseDouble(data[2]);
                int itemQuantity = Integer.parseInt(data[3]);

                Items item = new Items(id, itemName, price, itemQuantity);
                swimmingItems.add(item);
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении товаров для плавания из файла");
        }
    }

    public void readClothesItemsFromFile() {
        String filePath = "src/resources/clothesItems.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("_");
                int id = Integer.parseInt(data[0]);
                String itemName = data[1];
                double price = Double.parseDouble(data[2]);
                int itemQuantity = Integer.parseInt(data[3]);

                Items item = new Items(id, itemName, price, itemQuantity);
                clothesItems.add(item);
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении товаров одежда из файла");
        }
    }

    public void readTourismItemsFromFile() {
        String filePath = "src/resources/tourismItems.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("_");
                int id = Integer.parseInt(data[0]);
                String itemName = data[1];
                double price = Double.parseDouble(data[2]);
                int itemQuantity = Integer.parseInt(data[3]);

                Items item = new Items(id, itemName, price, itemQuantity);
                tourismItems.add(item);
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении товаров для туризма из файла");
        }
    }

    public void readWinterItemsFromFile() {
        String filePath = "src/resources/winterItems.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("_");
                int id = Integer.parseInt(data[0]);
                String itemName = data[1];
                double price = Double.parseDouble(data[2]);
                int itemQuantity = Integer.parseInt(data[3]);

                Items item = new Items(id, itemName, price, itemQuantity);
                winterItems.add(item);
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении товаров для зимних видов спорта из файла");
        }
    }

    @Override
    public String toString() {
        return "DataStorage{" +
                "users=" + users +
                ", winterItems=" + winterItems +
                ", summerItems=" + summerItems +
                ", swimmingItems=" + swimmingItems +
                ", clothesItems=" + clothesItems +
                ", tourismItems=" + tourismItems +
                '}';
    }
}
