
public class Grid {

    private String[] fields = {" ", " ", " ", " ", " ", " ", " ", " ", " "};

    public String getField(int index) {
        return fields[(index - 1)];
    }

    public void setField(int index, String value) {
        fields[(index - 1)] = value;
    }
}
