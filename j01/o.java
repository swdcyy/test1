package j01.o;
import erd.o;
import j01.m;
import lm1.i;
import java.lang.Object;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import mm1.c;
import t02.a0;
import i12.a;
import java.util.Objects;
import j01.i0;
import brd.t;
import cd2.a;
import o02.e;
import cjd.e;

public class o implements o	// class@002a05
{
    public final i b;
    public final m c;

    public void o(m p0,i p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "1");
       if (obj != PatchProxyResult.class) {
       }else if(!TextUtils.isEmpty(this.b.d())){
          p0.put("sendExtraInfo", this.b.d());
       }
       o tc = this.c;
       String str = this.b.e().f();
       String str1 = a.a(this.c.t);
       Objects.requireNonNull(tc);
       obj = PatchProxy.applyThreeRefs(str, p0, str1, tc, i0.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = e.s().a(str, p0, str1).map(new e());
       }
       return obj;
    }
}
