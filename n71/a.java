package n71.a;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import n71.a$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import p71.g;
import java.lang.Integer;
import p71.g$a;
import va1.l0;
import o63.m;
import java.lang.StringBuilder;
import o63.m$a;
import ps1.a;
import lp3.c;
import gt1.a;
import com.yxcorp.utility.TextUtils;
import kotlin.jvm.internal.a;

public final class a extends AbstractLiveJsCommand	// class@0032b8
{

    public void a(){
       super();
    }
    public Class a(){
       return a$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       g$a a;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       StringBuilder str = null;
       a$a uoa = (!p0 instanceof a$a)? str: p0;
       if (uoa) {
          a = g.a;
          if (!a.a(uoa.a())) {
             l0.n("邀请重开失败,bizType有错");
             return m.g.c("invalid bizType, bizType="+uoa.a());
          }else if(!a.b(uoa.b())){
             l0.n("邀请重开失败,source有错");
             return m.g.c("invalid source, source="+uoa.b());
          }else {
             a uoa1 = this.g(a.class).ml();
             if (uoa1 != null) {
                Integer integer = p0.b();
                a.m(integer);
                p0 = p0.a();
                a.m(p0);
                uoa1.a(TextUtils.k(p0.pkId), integer.intValue(), p0.intValue());
             }
             return m$a.g(m.g, str, false, 3, str);
          }
       }else {
          return m.g.c("invalid params");
       }
    }
}
