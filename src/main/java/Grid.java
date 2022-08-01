
public class Grid {

    private String[] fields = {" ", " ", " ", " ", " ", " ", " ", " ", " "};

    public String getField(int index) {
        return fields[(index - 1)];
    }

    public void setField(int index, String value) {
        if (!(fields[index - 1].equals(" "))) {
            System.out.println("Wrong field!");
        } else {
            fields[(index - 1)] = value;
        }
    }
}
