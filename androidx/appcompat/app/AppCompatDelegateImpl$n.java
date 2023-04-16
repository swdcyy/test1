package androidx.appcompat.app.AppCompatDelegateImpl$n;
import android.content.res.Configuration;

public class AppCompatDelegateImpl$n	// class@00057f
{

    public static void a(Configuration p0,Configuration p1,Configuration p2){
       int i = p1.colorMode & 0x03;
       if ((p0.colorMode & 0x03) != i) {
          p2.colorMode = p2.colorMode | i;
       }
       int i1 = p1.colorMode & 0x0c;
       if ((p0.colorMode & 0x0c) != i1) {
          p2.colorMode = p2.colorMode | i1;
       }
       return;
    }
}
