package bp6.c2;
import com.kwai.imsdk.internal.util.f$d;
import com.kwai.imsdk.internal.v;
import java.lang.Object;
import java.lang.String;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import bp6.j2;
import com.kwai.imsdk.internal.config.ResourceConfig;
import java.lang.Class;
import com.google.gson.Gson;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import nq6.s;
import java.lang.ClassCastException;
import java.lang.RuntimeException;
import java.util.Map;

public class c2 implements f$d	// class@000508
{
    public final long a;
    public final v b;

    public void c2(v p0,long p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(String p0){
       boolean b = true;
       this.b.g.set(b);
       v f = this.b.f;
       c2 ta = this.a;
       Objects.requireNonNull(f);
       if (TextUtils.isEmpty(p0)) {
       }else {
          try{
             ResourceConfig resourceConf = f.f.h(p0, ResourceConfig.class);
             if (resourceConf != null) {
                if (resourceConf.version > f.b) {
                   f.v(resourceConf);
                   g.a(f.h.edit().putString(f.m(), p0));
                   s.t(f.l).h0(resourceConf.version, b, ta);
                }else {
                   s.t(f.l).h0(resourceConf.version, 0, ta);
                }
             }
          }catch(com.google.gson.JsonSyntaxException e8){
             e8.printStackTrace();
          }catch(java.lang.ClassCastException e8){
             e8.printStackTrace();
          }
          _monitor_enter(f);
          f.i.clear();
          f.i.putAll(f.c());
          _monitor_exit(f);
       }
       return;
    }
}
