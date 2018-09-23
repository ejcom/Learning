package lections.patternGeekBrains;

/* Может быть только один экземпляр класса.
* final запрещает наследование от класса.
* get_instance() проверяет существует ли уже экземпляры класса, если нет, то создает его.
* Стандартный конструктор заблокирован.
*/

public final class Singleton {
    private static Singleton _instance = null;

    private Singleton(){}

    public static synchronized Singleton get_instance() {
        if (_instance == null) {
            _instance = new Singleton();
        }
        return _instance;
    }
}
