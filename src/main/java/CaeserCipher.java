
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
    public String isEncrypted() {
        mStatement = "b";
        return mStatement;
    }

    public String isActuallyEncrypted(String statement, int key) {

        String result = "";
        StringBuffer encrypted = new StringBuffer();


        for (int i = 0; i < statement.length(); i++) {
            int encrypt = statement.charAt(i);




            if(encrypt + key > 122) {
                char encrypts = (char) (encrypt - 26 +key);
                encrypted.append(encrypts);
            }


            else {
                char encrypts = (char) (encrypt + (key % 26));
                encrypted.append(encrypts);



            }
        }
        result += encrypted;
        return result;
    }


}
