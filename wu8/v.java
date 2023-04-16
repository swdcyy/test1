package wu8.v;
import android.content.Context;
import java.lang.Object;
import java.util.HashMap;
import android.content.SharedPreferences;
import c97.d;
import h97.g;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;

public class v	// class@002799
{
    public Context a;
    public SharedPreferences b;
    public SharedPreferences c;
    public SharedPreferences d;
    public SharedPreferences e;
    public SharedPreferences f;
    public Map g;

    public void v(Context p0){
       super();
       this.g = new HashMap();
       this.a = p0;
    }
    public synchronized SharedPreferences a(){
       v tc = this.c;
       if (tc != null) {
          return tc;
       }
       Object[] objArray = new Object[]{this.a.getPackageName()};
       SharedPreferences sharedPrefer = d.a().b().getSharedPreferences(String.format("%s_device_abtest", objArray), 0);
       this.c = sharedPrefer;
       return sharedPrefer;
    }
    public synchronized SharedPreferences b(){
       v tb = this.b;
       if (tb != null) {
          return tb;
       }
       Object[] objArray = new Object[]{this.a.getPackageName()};
       SharedPreferences sharedPrefer = d.a().b().getSharedPreferences(String.format("%s_abtest", objArray), 0);
       this.b = sharedPrefer;
       return sharedPrefer;
    }
    public synchronized SharedPreferences c(String p0){
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       SharedPreferences sharedPrefer = this.g.get(p0);
       if (sharedPrefer != null) {
          return sharedPrefer;
       }
       Object[] objArray = new Object[]{this.a.getPackageName(),p0};
       sharedPrefer = d.a().b().getSharedPreferences(String.format("%s_user_%s_abtest", objArray), 0);
       this.g.put(p0, sharedPrefer);
       return sharedPrefer;
    }
}
