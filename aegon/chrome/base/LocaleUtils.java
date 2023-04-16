package aegon.chrome.base.LocaleUtils;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Locale;
import java.lang.StringBuilder;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale$Builder;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import a0.d;
import android.os.Build$VERSION;

public class LocaleUtils	// class@000149
{

    public void LocaleUtils(){
       super();
    }
    public static String a(String p0){
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 3365:
             if (p0.equals("in")) {
                i = 0;
             }
             break;
           case 3374:
             if (p0.equals("iw")) {
                i = 1;
             }
             break;
           case 3391:
             if (p0.equals("ji")) {
                i = 2;
             }
             break;
           case 3405:
             if (p0.equals("jw")) {
                i = 3;
             }
             break;
           case 3704:
             if (p0.equals("tl")) {
                i = 4;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return "id";
           case 1:
             return "he";
           case 2:
             return "yi";
           case 3:
             return "jv";
           case 4:
             return "fil";
           default:
             return p0;
       }
    }
    public static String b(Locale p0){
       String str = LocaleUtils.a(p0.getLanguage());
       String country = p0.getCountry();
       if (str.equals("no") && (country.equals("NO") && (p0.getVariant()).equals("NY"))) {
          return "nn-NO";
       }
       if (!country.isEmpty()) {
          str = str+"-"+country;
       }
       return str;
    }
    public static String c(LocaleList p0){
       ArrayList uArrayList = new ArrayList();
       for (int i = 0; i < p0.size(); i = i + 1) {
          Locale locale = p0.get(i);
          String language = locale.getLanguage();
          String str = LocaleUtils.a(language);
          if (!str.equals(language)) {
             locale = new Locale$Builder().setLocale(locale).setLanguage(str).build();
          }
          uArrayList.add(LocaleUtils.b(locale));
       }
       return TextUtils.join(",", uArrayList);
    }
    public static String getDefaultCountryCode(){
       d uod = d.e();
       String str = (uod.h("default-country-code"))? uod.f("default-country-code"): Locale.getDefault().getCountry();
       return str;
    }
    public static String getDefaultLocaleListString(){
       if (Build$VERSION.SDK_INT >= 24) {
          return LocaleUtils.c(LocaleList.getDefault());
       }
       return LocaleUtils.getDefaultLocaleString();
    }
    public static String getDefaultLocaleString(){
       return LocaleUtils.b(Locale.getDefault());
    }
}
