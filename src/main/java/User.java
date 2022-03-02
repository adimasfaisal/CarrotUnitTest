import java.util.List;

public class User {
    private String name;
    private int ID;
    private int point;

    /**
     * make new user
     */
    public User(String name, int ID, int point){
        this.name = name;
        this.ID = ID;
        this.point = point;
    }

    /** get name value
     *
     * @return name
     */
    public Object getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    /** subtract own point, make history log and store to history list
     *
     * @param recipient
     * @param sumPoints
     */
    public void sendPoint(User recipient, int sumPoints){
        setPoint(this.point - sumPoints);
        recipient.getPoint(sumPoints);
    }

    /** add own point, make history log and store to history list
     *
     * @param sumPoints
     */
    public void getPoint(int sumPoints){
        setPoint(this.point + sumPoints);
    }

    /**
     * @return print users data to output
     */
    public String toString(){
        return "ID = " + this.ID + " | Name = " + this.name + " | Points = " + this.point;
    }
}
