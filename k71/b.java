package k71.b;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.Class;
import k71.b$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.log.b;
import o63.m;
import o63.m$a;
import java.lang.CharSequence;
import tkd.b;
import tkd.d;
import h02.b;
import lp3.e;

public final class b extends AbstractLiveJsCommand	// class@002ca3
{
    public final List e;

    public void b(){
       super();
       this.e = LiveLogTag.MAGIC_FACE.appendTag("JS");
    }
    public Class a(){
       return b$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       String str = "invalid params";
       if (!p0 instanceof b$a) {
          b.P(this.e, "[LiveJsCmdApplyMagicFace] [onExecute]: params is error");
          return m.g.c(str);
       }else {
          String str1 = p0.a();
          if (str1 != null) {
             str1 = (!str1.length())? 1: null;
             if (str1 == 1) {
                b.P(this.e, "[LiveJsCmdApplyMagicFace] [onExecute]: params is null");
                return m.g.c(str);
             }
          }
          d.a(-204054297).p50(this.h(), p0.a());
          return m$a.g(m.g, null, false, 3, null);
       }
    }
}
