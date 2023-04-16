package c97.d;
import java.lang.Object;
import h97.a;
import java.util.concurrent.ConcurrentHashMap;
import c97.d$a;
import h97.g;
import h97.i;
import java.lang.IllegalStateException;
import java.lang.String;
import h97.d;
import android.content.Context;
import com.kwai.middleware.azeroth.Azeroth2;
import q97.c;
import r97.a0;
import android.content.SharedPreferences;
import xb7.a;
import com.kwai.middleware.azeroth.network.a$b;
import com.kwai.middleware.azeroth.network.a;

public final class d	// class@000397
{
    public i a;
    public g b;
    public a c;
    public d d;
    public a e;
    public final Map f;

    public void d(){
       super();
       this.e = new a();
       this.f = new ConcurrentHashMap();
    }
    public static d a(){
       return d$a.a;
    }
    public g b(){
       if (this.b == null) {
          this.b = this.e().getCommonParams();
       }
       d tb = this.b;
       if (tb != null) {
          return tb;
       }else {
          throw new IllegalStateException("InitCommonParams cannot be null! Please return non null for method InitParams.getCommonParams\(\)");
       }
    }
    public d c(){
       return this.d;
    }
    public Context d(){
       return Azeroth2.B.d();
    }
    public i e(){
       d ta = this.a;
       if (ta != null) {
          return ta;
       }
       throw new IllegalStateException("InitParams cannot be null! Please invoke Azeroth.get\(\).init\(\) first!");
    }
    public c f(){
       return Azeroth2.B.h();
    }
    public a0 g(){
       a0 uoa0 = Azeroth2.B.l();
       if (uoa0 != null) {
          return uoa0;
       }
       throw new IllegalStateException("Invoker setLogger\(\) first!!\n如果引用了Kanas, 请先初始化Kanas模块，并确保kanas是2.6.7+版本。");
    }
    public SharedPreferences h(String p0,int p1){
       return Azeroth2.B.b(p0).a();
    }
    public boolean i(){
       return Azeroth2.B.u();
    }
    public boolean j(){
       return ((Azeroth2.B.j()).equals("online") ^ 0x01);
    }
    public a$b k(String p0){
       return a.h(p0);
    }
}
