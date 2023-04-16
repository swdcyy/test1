package j01.e;
import erd.o;
import j01.f;
import lm1.i;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import java.lang.String;
import mm1.c;
import t02.a0;
import i12.a;
import j01.i0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.t;
import cd2.a;
import o02.e;
import cjd.e;

public final class e implements o	// class@0029f1
{
    public final f b;
    public final boolean c;
    public final i d;

    public void e(f p0,boolean p1,i p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       String str;
       String str1;
       t ot;
       e tb = this.b;
       e td = this.d;
       Objects.requireNonNull(tb);
       if (this.c != null) {
          str = td.e().f();
          str1 = a.a(tb.u);
          ot = PatchProxy.applyThreeRefs(str, p0, str1, tb, i0.class, "4");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = e.s().h(str, p0, str1).map(new e());
          }
       }else {
          str = td.e().f();
          str1 = a.a(tb.u);
          ot = PatchProxy.applyThreeRefs(str, p0, str1, tb, i0.class, "5");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = e.s().g(str, p0, str1).map(new e());
          }
       }
       return ot;
    }
}
