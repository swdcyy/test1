package j01.w;
import erd.o;
import j01.x;
import lm1.i;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import java.lang.String;
import mm1.c;
import t02.a0;
import i12.a;
import j01.i0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import cd2.a;
import o02.e;
import cjd.e;

public final class w implements o	// class@002a0d
{
    public final x b;
    public final i c;

    public void w(x p0,i p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       w tb = this.b;
       Objects.requireNonNull(tb);
       String str = this.c.e().f();
       String str1 = a.a(tb.u);
       t ot = PatchProxy.applyThreeRefs(str, p0, str1, tb, i0.class, "3");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = e.s().b(str, p0, str1).map(new e());
       }
       return ot;
    }
}
