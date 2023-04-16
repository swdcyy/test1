package mo7.i;
import android.content.Context;
import lo7.e;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.sdk.switchconfig.v1.internal.c;
import com.kwai.sdk.switchconfig.v1.ConfigPriority;
import java.lang.String;
import android.content.SharedPreferences;
import com.kwai.sdk.switchconfig.v1.SwitchConfig;
import java.util.Map;
import mo7.h;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class i	// class@001ebb
{
    public final Map a;
    public e b;
    public final SharedPreferences c;
    public final Context d;
    public String e;
    public final ConfigPriority[] f;

    public void i(Context p0,e p1){
       super();
       this.a = new ConcurrentHashMap();
       this.b = c.a;
       ConfigPriority[] uConfigPrior = new ConfigPriority[]{ConfigPriority.HIGH,ConfigPriority.MIDDLE,ConfigPriority.LOW};
       this.f = uConfigPrior;
       this.d = p0;
       if (p1 != null) {
          this.b = p1;
       }
       Object[] objArray = new Object[]{p0.getPackageName()};
       this.c = this.b.a(p0, String.format("%s_switches", objArray), 0);
       return;
    }
    public SwitchConfig a(String p0,String p1){
       SwitchConfig switchConfig;
       Map map = this.a.get(p0);
       if (map != null && !map.isEmpty()) {
          i tf = this.f;
          int len = tf.length;
          int i = 0;
          while (i < len) {
             h oh = map.get(tf[i]);
             if (oh != null) {
                h b = oh.b;
                if (b != null && !b.isEmpty()) {
                   switchConfig = oh.e(oh.c.getString(oh.f(p1), null));
                   if (switchConfig != null) {
                   label_004b :
                      if (switchConfig != null) {
                         return switchConfig;
                      }
                   }
                }
                switchConfig = oh.e(oh.c.getString(oh.a(p1), null));
                goto label_004b ;
             }
             i = i + 1;
          }
       }
       return null;
    }
    public String b(){
       return this.c.getString("key_user_id", "");
    }
    public void c(String p0){
       if (TextUtils.equals(this.e, p0)) {
          return;
       }
       this.e = p0;
       Iterator iterator = this.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry.getValue() != null) {
             Iterator iterator1 = uEntry.getValue().entrySet().iterator();
             while (iterator1.hasNext()) {
                Map$Entry uEntry1 = iterator1.next();
                if (uEntry1.getValue() != null) {
                   h value = uEntry1.getValue();
                   if (!TextUtils.equals(value.b, p0)) {
                      value.b = p0;
                      value.a = "user_"+value.b+"_";
                   }else {
                      continue ;
                   }
                }else {
                   continue ;
                }
             }
          }
       }
       return;
    }
    public void d(String p0){
       if (p0 == null || p0.isEmpty()) {
          g.a(this.c.edit().putString("key_user_id", ""));
       }else {
          g.a(this.c.edit().putString("key_user_id", p0));
       }
       return;
    }
}
