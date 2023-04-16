package h71.t;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import h71.t$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import oh3.j;
import o63.j$a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import java.lang.CharSequence;
import java.util.List;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import sz1.e;
import lp3.c;
import hh3.d;
import java.lang.Integer;
import brd.t;
import h71.u;
import h71.v;
import erd.g;
import csd.b;
import dsd.e;

public final class t extends AbstractLiveJsCommand	// class@002649
{
    public b e;

    public void t(){
       super();
    }
    public Class a(){
       return t$a.class;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, t.class, "3")) {
          return;
       }
       j.a(this.e);
       return;
    }
    public Object l(Object p0,j$a p1,c p2){
       t$a this;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, t.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof t$a) {
          return m.g.c("invalid params");
       }
       String str = p0.a();
       if (str != null) {
          int i = 0;
          List list = (!str.length())? 1: null;
          if (!list) {
             list = p0.b();
             if (list != null && !list.isEmpty()) {
                h oh = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p2));
                if (!PatchProxy.applyVoidTwoRefs(p0, oh, this, t.class, "2")) {
                   d uod = this.g(e.class).Sj();
                   String str1 = p0.a();
                   this = p0.bizType;
                   if (this != null) {
                      i = this.intValue();
                   }
                   this.e = uod.v(str1, i, p0.bizExtraInfo, p0.b()).subscribe(new u(oh), new v(oh));
                }
                p0 = oh.b();
                if (p0 == b.h()) {
                   e.c(p2);
                }
                return p0;
             }
          }
       }
    label_0093 :
       return m.g.c("param: liveSteamId & muteInfos  required");
    }
}
