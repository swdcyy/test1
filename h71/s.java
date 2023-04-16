package h71.s;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import h71.s$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import lp3.e;
import android.app.Activity;
import o63.b;
import java.lang.Integer;
import java.lang.CharSequence;
import e17.i;

public final class s extends AbstractLiveJsCommand	// class@002647
{

    public void s(){
       super();
    }
    public Class a(){
       return s$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       int i;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, s.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof s$a) {
          return m.g.c("invalid request params");
       }
       s$a text = p0.text;
       if (text == null) {
          return m.g.c("text is required");
       }
       if (b.a(this.h()) == null) {
          return m.g.c("currentActivity is null");
       }
       if (p0.a() != null) {
          p0 = p0.a();
          if (p0 == null || p0.intValue()) {
             i = 1;
          label_0046 :
             i.e(R.style.arg_RES_7f11066a, text, i);
             return m$a.g(m.g, null, false, 3, null);
          }
       }
       i = 0;
       goto label_0046 ;
    }
}
