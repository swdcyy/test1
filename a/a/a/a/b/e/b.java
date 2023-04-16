package a.a.a.a.b.e.b;
import a.a.a.a.b.e.b$b;
import java.lang.String;
import a.a.a.a.b.a.b;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams;
import java.util.Locale;
import java.lang.Object;
import android.content.Context;
import k.b;
import java.lang.Integer;
import a.a.a.a.b.e.b$a;
import java.lang.Enum;
import a.a.a.a.b.e.d$b;
import a.a.a.a.b.e.d;
import com.kuaishou.security.kste.export.IKSTECallback;
import a.a.a.a.b.a.c;
import com.kuaishou.security.kste.logic.event.KSTEException;

public class b	// class@000013
{

    public static void a(b$b p0,String p1,int p2){
       IKSTECallback iKSTECallbac;
       KSTEException kSTEExceptio;
       if (b.b().l() == null) {
          return;
       }
       int i = 3;
       Object[] objArray = new Object[i];
       objArray[0] = b.c(b.b().l().context()).a();
       objArray[1] = p1;
       objArray[2] = Integer.valueOf(p2);
       String str = String.format(Locale.getDefault(), "apkmd5[%s] ed[%s] me[%d]", objArray);
       int i1 = b$a.a[p0.ordinal()];
       if (i1 != 1) {
          if (i1 != 2) {
             if (i1 != i) {
                if (i1 != 4) {
                   if (i1 != 5) {
                      if (m$c.a) {
                         Object[] objArray1 = new Object[0];
                         m$c.a("[*] Info : Can\'t recognize report type!", objArray1);
                      }
                   }else {
                      d.b(d$b.f, b.b().l(), p1, p2);
                      b.b().l().initCallback().report(c.u0, str);
                      iKSTECallbac = b.b().l().initCallback();
                      kSTEExceptio = new KSTEException(str, p2);
                   }
                }else {
                   d.b(d$b.f, b.b().l(), p1, p2);
                }
             }else {
                b.b().l().initCallback().report(c.u0, str);
                iKSTECallbac = b.b().l().initCallback();
                kSTEExceptio = new KSTEException(str, p2);
             }
          }else {
             iKSTECallbac = b.b().l().initCallback();
             kSTEExceptio = new KSTEException(str, p2);
          }
          iKSTECallbac.onError(kSTEExceptio);
       }else {
          b.b().l().initCallback().report(c.u0, str);
       }
       return;
    }
}
