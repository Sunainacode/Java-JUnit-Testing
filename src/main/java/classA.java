public class classA {
    public static int binToDecimal(String bin) {
        int d = Integer.parseInt(bin, 2);
        return d;
    }

    public static int hexToDecimal(String hex) {
        int d = Integer.parseInt(hex, 16);
        return d;
    }

    public static int octToDecimal(String oct) {
        int d = Integer.parseInt(oct, 8);
        return d;
    }

    public static String decToBinary(int dec) {
        String bin = Integer.toBinaryString(dec);
        return bin;
    }

    public static String decToOctal(int dec) {
        String oct = Integer.toOctalString(dec);
        return oct;
    }

    public static String decToHexadecimal(int dec) {
        String hex = Integer.toHexString(dec);
        return hex;
    }
}
