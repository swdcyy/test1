package c.t.m.g.dt;
import java.lang.Object;
import android.os.Bundle;
import org.json.JSONObject;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;

public class dt	// class@000c54
{
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public final Bundle n;
    public static final dt a;

    static {
       dt.a = new dt();
    }
    public void dt(){
       super();
       this.n = new Bundle();
    }
    public void dt(dt p0){
       super();
       Bundle uBundle = new Bundle();
       this.n = uBundle;
       if (p0.n.size() > 0) {
          uBundle.putAll(p0.n);
       }else {
          this.b = p0.b;
          this.c = p0.c;
          this.d = p0.d;
          this.e = p0.e;
          this.f = p0.f;
          this.g = p0.g;
          this.h = p0.h;
          this.i = p0.i;
          this.j = p0.j;
          this.k = p0.k;
          this.l = p0.l;
          this.m = p0.m;
       }
       return;
    }
    public void dt(JSONObject p0){
       super();
       Bundle uBundle = new Bundle();
       this.n = uBundle;
       String str = "admin_level_1";
       if (p0.has(str)) {
          uBundle.putString("nation", p0.optString("nation"));
          uBundle.putString(str, p0.optString(str));
          uBundle.putString("admin_level_2", p0.optString("admin_level_2"));
          uBundle.putString("admin_level_3", p0.optString("admin_level_3"));
          uBundle.putString("locality", p0.optString("locality"));
          uBundle.putString("sublocality", p0.optString("sublocality"));
          uBundle.putString("route", p0.optString("route"));
       }else {
          this.c = p0.optString("name", null);
          this.d = p0.optString("code", null);
          this.e = p0.optString("pncode", null);
          this.b = p0.optString("nation", null);
          this.f = p0.optString("province", null);
          this.g = p0.optString("city", null);
          this.h = p0.optString("district", null);
          this.i = p0.optString("town", null);
          this.j = p0.optString("village", null);
          this.k = p0.optString("street", null);
          this.l = p0.optString("street_no", null);
          String str1 = p0.optString("mergedname", null);
          String str2 = p0.optString("mergedaddr", null);
          if (!TextUtils.isEmpty(str1)) {
             this.c = str1;
          }
          if (!TextUtils.isEmpty(str2)) {
             this.m = str2;
          }
       }
       return;
    }
    public static dt a(dt p0){
       if (p0 == null) {
          return null;
       }
       return new dt(p0);
    }
    public String toString(){
       return "SubnationData{"+"name="+this.c+","+"address="+this.m+","+"code="+this.d+","+"phCode="+this.e+","+"nation="+this.b+","+"province="+this.f+","+"city="+this.g+","+"district="+this.h+","+"town="+this.i+","+"village="+this.j+","+"street="+this.k+","+"street_no="+this.l+","+"bundle"+this.n+","+"}";
    }
}
