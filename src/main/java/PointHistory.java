import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class PointHistory {
    private Timestamp timestamp;
    private User senderUser;
    private User recipientUser;
    private int point;
    public static ArrayList<PointHistory> pointHistoryList = new ArrayList<>();

    /** create new history log
     *
     * @param recipientUser
     * @param senderUser
     * @param point
     */
    public PointHistory(User senderUser, User recipientUser, int point){
        this.timestamp = new Timestamp(new Date().getTime());
        this.senderUser = senderUser;
        this.recipientUser = recipientUser;
        this.point = point;
    }


    /** create transaction between two user and store it to history log
     *
     * @param sender user sending points
     * @param recipient user gets points
     * @param points points sent
     */
    public static void transaction(User sender, User recipient, int points){
        sender.sendPoint(recipient, points);
        PointHistory pointHistory = new PointHistory(sender, recipient, points);
        pointHistoryList.add(pointHistory);
    }

    public String toString(){

        return this.timestamp + " | " + senderUser.getName() + " send " + this.point + " carrots to " + recipientUser.getName();
    }
}
