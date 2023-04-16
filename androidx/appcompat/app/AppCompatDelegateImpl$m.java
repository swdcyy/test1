package androidx.appcompat.app.AppCompatDelegateImpl$m;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.lang.Object;

public class AppCompatDelegateImpl$m	// class@00057e
{

    public static void a(Configuration p0,Configuration p1,Configuration p2){
       LocaleList locales = p1.getLocales();
       if (!p0.getLocales().equals(locales)) {
          p2.setLocales(locales);
          p2.locale = p1.locale;
       }
       return;
    }
}
