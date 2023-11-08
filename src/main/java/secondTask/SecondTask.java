package secondTask;

public class SecondTask {
    private final String name = "Иван";
    private String apples;

    public void ivansApples(String name, int amount) {
        if(amount % 10 == 1 && amount % 100 != 11) {
            apples = "яблоко";
        }
        else if(amount % 10 >= 2 && amount % 10 <= 4 && (amount % 100 < 10 || amount % 100 >= 20)) {
            apples = "яблока";
        }
        else {
            apples = "яблок";
        }
        System.out.println(name + " хранит у себя " + amount + " " + apples);
    }
}
