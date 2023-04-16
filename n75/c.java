package n75.c;
import java.lang.String;

public class c	// class@001f16
{

    public static String a(int p0){
       if (!p0) {
          return "Invalid";
       }
       if (p0 == 1) {
          return "Foreground";
       }
       if (p0 == 2) {
          return "Background";
       }
       if (p0 != 3) {
          return "Unknown";
       }
       return "Orphan";
    }
}
