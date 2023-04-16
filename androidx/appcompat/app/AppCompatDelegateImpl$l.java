package androidx.appcompat.app.AppCompatDelegateImpl$l;
import android.content.res.Configuration;

public class AppCompatDelegateImpl$l	// class@00057d
{

    public static void a(Configuration p0,Configuration p1,Configuration p2){
       p1 = p1.densityDpi;
       if (p0.densityDpi != p1) {
          p2.densityDpi = p1;
       }
       return;
    }
}
