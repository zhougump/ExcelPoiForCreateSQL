public class Test {
    public static void main(String[] args) {
        String str = "天生我材必有用";
        int length = str.length();
        String substring = str.substring(str.length() - 2);
        if (substring.equals("有用")){
            System.out.println("555");
        }
        System.out.println(substring);
        String substring1 = str.substring(0, str.length() - 2);
        System.out.println(substring1);
    }
}
