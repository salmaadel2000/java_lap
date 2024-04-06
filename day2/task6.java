import java.util.regex.Matcher;
import java.util.regex.Pattern;
class task6{
  public static void main(String args[])
  {
    String newip="";
    String str = "127.0.0";
    String rejex_pattern = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    Pattern pattern = Pattern.compile(rejex_pattern + "\\." + rejex_pattern + "\\." + rejex_pattern + "\\." + rejex_pattern);
    Matcher matcher = pattern.matcher(str.trim());
    if (matcher.matches()){
      String ip_splited[] = str.trim().split("\\.");
      for (String x : ip_splited)
        newip+=x+".";
    }else{
      System.out.println("Enter a Valid IP");
    }
    System.out.println(newip);

}
}