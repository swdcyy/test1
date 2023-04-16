package wu8.p;
import java.lang.Object;
import wu8.p$a;
import wu8.p$b;
import java.lang.String;
import com.yxcorp.experiment.ABConfig;
import com.yxcorp.experiment.c;
import wu8.f;
import zu8.a;
import zu8.b;
import java.lang.reflect.Type;
import java.lang.Throwable;
import java.lang.RuntimeException;
import java.util.Map;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import av8.b;
import av8.a;
import c97.d;
import q97.c;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.experiment.logger.a;
import com.kwai.middleware.leia.degrade.ApiRequestTiming;
import android.content.SharedPreferences;
import wu8.v;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import com.yxcorp.experiment.ABConfigUpdateReceiver;

public class p	// class@002791
{
    public a a;

    public void p(){
       super();
    }
    public void p(p$a p0){
       super();
    }
    public static p d(){
       return p$b.a;
    }
    public ABConfig a(String p0){
       try{
          return c.h().d(p0);
       }catch(java.lang.Exception e0){
          if (f.a() || !c.h().k()) {
             throw new RuntimeException(e0);
          }
          c.h().i().h(p0, ABConfig.class, e0);
          return null;
       }
    }
    public Map b(){
       return c.h().e();
    }
    public boolean c(String p0,boolean p1){
       return this.h(p0, Boolean.class, Boolean.valueOf(p1)).booleanValue();
    }
    public int e(String p0,int p1){
       return this.h(p0, Integer.class, Integer.valueOf(p1)).intValue();
    }
    public long f(String p0,long p1){
       return this.h(p0, Long.class, Long.valueOf(p1)).longValue();
    }
    public String g(String p0,String p1){
       return this.h(p0, String.class, p1);
    }
    public Object h(String p0,Type p1,Object p2){
       p ta = this.a;
       if (ta != null) {
          b uob = ta.a(p0, p1, p2);
          if (uob != null) {
             d.a().f().i("ABTest", "mock abtest value successful: "+p0+"="+uob.a);
             return uob.a;
          }
       }
       ABConfig uABConfig = this.a(p0);
       if (uABConfig == null) {
          return p2;
       }else {
          try{
             p0 = uABConfig.getValueWithException(p1);
             if (p0 != null) {
                p2 = p0;
             }
             return p2;
          }catch(java.lang.Exception e0){
             if (!f.a() && c.h().k()) {
                c.h().i().h(p0, p1, e0);
                return p2;
             }else {
                throw new RuntimeException(e0);
             }
          }
       }
    }
    public void i(String p0){
       c uoc = c.h();
       if (!uoc.a()) {
       }else {
          uoc.c();
          if (!TextUtils.equals(uoc.e, p0)) {
             c n = uoc.n;
             if (n.b()) {
                d.a().f().d("ABTest-LogEventHelper", "onLoginChanged");
                n.e(2);
             }
             uoc.j(p0);
             boolean b = false;
             ApiRequestTiming lOGOUT = (TextUtils.isEmpty(p0))? ApiRequestTiming.LOGOUT: ApiRequestTiming.LOGIN;
             uoc.p(b, lOGOUT);
             uoc.b.e();
             if (TextUtils.isEmpty(uoc.e)) {
                g.b(uoc.h.b().edit().putString("key_user_id", ""));
             }else {
                g.b(uoc.h.b().edit().putString("key_user_id", uoc.e));
             }
             if (f.b()) {
                ABConfigUpdateReceiver.b(Azeroth2.B.d(), true);
             }
          }
       }
       return;
    }
}
