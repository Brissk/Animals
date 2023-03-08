import java.util.ArrayList;
import java.util.Scanner;

class Menu {
    ArrayList<Animal> animalsList = new ArrayList<>();

    public Menu() {

    }

    public void viewMenu() {
        System.out.println("Choose any variant: \n1:Создать животное\n2:Показать всех животных\n3:Выучить команду" +
                "\n4:Получить список команд животного\n5:Выйти из программы");
    }

    public void startMenu() {
        Menu menu = new Menu();
        Scanner in = new Scanner(System.in);
        boolean b = true;
        while (b) {
            menu.viewMenu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println("Какой тип животного добавить: \n1:Собака\n2:Кошка\n3:Хомяк\n4:Верблюд\n5:Лошадь\n6:Осёл");
                    switch (in.nextInt()) {
                        case 1:

                            String type = "Собака";
                            System.out.println("Введите имя животного:");
                            String name = in.next();
                            System.out.println("Введите возраст:");
                            Integer age = in.nextInt();
                            menu.animalsList.add(new Dogs(name, age));
                            System.out.println("Запись добавлена");
                            break;
                        case 2:
                            type = "Кошка";
                            System.out.println("Введите имя животного:");
                            name = in.next();
                            System.out.println("Введите возраст:");
                            age = in.nextInt();
                            menu.animalsList.add(new Cats(name, age));
                            System.out.println("Запись добавлена");
                            break;
                        case 3:
                            type = "Хомяк";
                            System.out.println("Введите имя животного:");
                            name = in.next();
                            System.out.println("Введите возраст:");
                            age = in.nextInt();
                            menu.animalsList.add(new Hamsters(name, age));
                            System.out.println("Запись добавлена");
                            break;
                        case 4:
                            type = "Верблюд";
                            System.out.println("Введите имя животного:");
                            name = in.next();
                            System.out.println("Введите возраст:");
                            age = in.nextInt();
                            menu.animalsList.add(new Camels(name, age));
                            System.out.println("Запись добавлена");
                            break;
                        case 5:
                            type = "Лошадь";
                            System.out.println("Введите имя животного:");
                            name = in.next();
                            System.out.println("Введите возраст:");
                            age = in.nextInt();
                            menu.animalsList.add(new Horses(name, age));
                            System.out.println("Запись добавлена");
                            break;
                        case 6:
                            type = "Осёл";
                            System.out.println("Введите имя животного:");
                            name = in.next();
                            System.out.println("Введите возраст:");
                            age = in.nextInt();
                            menu.animalsList.add(new Donkeys(name, age));
                            System.out.println("Запись добавлена");
                            break;

                        default:
                            throw new IllegalStateException("Unexpected value: " + in.nextInt());
                    }
                case 2:
                    System.out.println(menu.animalsList);
                    break;
                case 3:
                    System.out.println("Введите имя животного:");
                    String name = in.next();
                    System.out.println("Введите команду");
                    String command = in.next();

                    for (int i = 0; i < menu.animalsList.size(); i++) {
                        if (menu.animalsList.get(i).getName().equals(name)) {
                            Animal animal = menu.animalsList.get(i);
                            animal.addCommand(command);
                        }
                    }
                    System.out.println("Команда добавлена");
                    break;

                case 4:

                    System.out.println("Введите имя животного для вывода его команд");
                    name = in.next();
                    for (int i = 0; i < menu.animalsList.size(); i++) {
                        if (menu.animalsList.get(i).getName().equals(name)) {
                            Animal animal = menu.animalsList.get(i);
                            System.out.println("Список команд:" + animal.getCommandList());
                        }
                    }
                    break;

                default:
                    b = false;
            }
        }
    }


  }