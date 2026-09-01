import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger res1 = new BigInteger(a, 2);
        BigInteger res2 = new BigInteger(b, 2);
        BigInteger res3 = res1.add(res2);
        return res3.toString(2);
    }
}
