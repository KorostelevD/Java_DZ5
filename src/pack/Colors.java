package pack;

public enum Colors {
    RED("\033[91m"),
    PINK("\033[95m"),
    YELLOW("\033[93m"),
    GREEN("\033[92m"),
    SEA("\033[96m"),
    BLUE("\033[94m"),
    WHITE("\033[97m"),
    GRAY("\033[90m"),
    BLACK("\033[30m"),
    RESET("\033[0m"); // для скидання кольору до стандартного

    private final String string;

    Colors(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }

    public void out(Object message) {
        System.out.println(this + message.toString() + RESET);
    }

    public Colors out1(Object object) {
        System.out.println(string + object);
        return this;
    }

}