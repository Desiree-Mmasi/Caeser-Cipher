
public class CaeserCipher {

    private String mStatement;
    private int mKey;

   public CaeserCipher(String statement, int key) {
        mStatement = statement;
        mKey = key;
    }

     public String getStatement() {
        return mStatement;
    }

    public int getKey() {
        return mKey;
    }

    /*public String isEncrypted() {
        mStatement = "b";
        return mStatement;
    }*/


}
