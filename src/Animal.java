import java.util.ArrayList;

public class Animal {
    String name;
    Integer age;
    String type;
    ArrayList<String> commands;

    public Animal  (String name, Integer age) {
        this.name = name;
        this.age = age;
        commands = new ArrayList<>();
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public String getCommandList() {
        StringBuilder sb = new StringBuilder();
        for (String string : commands) {
            sb.append(string + ",");
        }
        return sb.toString();
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return String.format("Имя: %s; Возраст:%d; Список команд:%s", name, age, getCommandList());
    }

    @Override
    public String toString() {
        String info = String.format("\nИмя: %s; Возраст:%d", name, age);
        return info;
    }
}
