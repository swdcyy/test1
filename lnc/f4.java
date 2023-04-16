package lnc.f4;
import android.os.Build$VERSION;
import android.os.LocaleList;
import java.util.Locale;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.content.res.Configuration;
import pd6.b;

public class f4	// class@001dc1
{
    public static Locale a;

    static {
       f4.a = (Build$VERSION.SDK_INT >= 24)? LocaleList.getDefault().get(0): Locale.getDefault();
       if (f4.a == null) {
          f4.a = Locale.CHINESE;
       }
    }
    public static Locale a(){
       return f4.a;
    }
    public static void b(Locale p0){
       f4.a = p0;
    }
    public static void c(Context p0,Locale p1){
       Resources resources = p0.getResources();
       if (resources == null) {
          return;
       }
       DisplayMetrics uDisplayMetr = c.c(resources);
       Configuration configuratio = resources.getConfiguration();
       configuratio.locale = p1;
       if (Build$VERSION.SDK_INT >= 24) {
          Locale[] localeArray = new Locale[]{p1};
          LocaleList localeList = new LocaleList(localeArray);
          LocaleList.setDefault(localeList);
          configuratio.setLocales(localeList);
          b.a(p0, configuratio);
       }
       Locale.setDefault(p1);
       resources.updateConfiguration(configuratio, uDisplayMetr);
       return;
    }
    public static Context d(Context p0,Locale p1){
       Locale.setDefault(p1);
       Resources resources = p0.getResources();
       if (resources == null) {
          return p0;
       }
       Configuration uConfigurati = new Configuration(resources.getConfiguration());
       try{
          uConfigurati.setLocale(p1);
          p0 = b.a(p0, uConfigurati);
          return p0;
       }catch(java.lang.ArrayIndexOutOfBoundsException e0){
       }catch(java.util.ConcurrentModificationException e0){
       }
    }
}
