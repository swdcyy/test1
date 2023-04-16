package ab6.c$a;
import javax.inject.Provider;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ab6.c;
import java.lang.Long;
import ta6.a;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;

public final class c$a implements Provider	// class@000061
{
    public static final c$a a;

    static {
       c$a.a = new c$a();
    }
    public void c$a(){
       super();
    }
    public Object get(){
       String str = PatchProxy.apply(null, this, c$a.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          c l = c.l;
          String str1 = null;
          if (c.a(l) != null) {
             Long longx = c.a(l);
             if (longx != null && !longx.longValue() - str1) {
             label_0029 :
                c.b(l, Long.valueOf(a.h()));
                longx = c.a(l);
                if (longx != null && !longx.longValue() - str1) {
                   c uoc = a.a();
                   a.o(uoc, "AppEnv.get\(\)");
                   c.b(l, Long.valueOf((SystemUtil.C(uoc.a()) / 0x100000)));
                   longx = c.a(l);
                   a.m(longx);
                   a.p(longx.longValue());
                }
             }
          }else {
             goto label_0029 ;
          }
          str = String.valueOf(c.a(l));
       }
       return str;
    }
}
