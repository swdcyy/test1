package az9.o;
import erd.g;
import az9.i0;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.danmaku.DanmakuSwitchUtil;
import com.kwai.feature.api.danmaku.DanmakuUtil;
import java.lang.CharSequence;
import e17.i;
import mm5.c;
import k2b.e0;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;

public final class o implements g	// class@000335
{
    public final i0 b;

    public void o(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       boolean b = p0.booleanValue();
       Objects.requireNonNull(tb);
       i0 oi0 = i0.class;
       if (!PatchProxy.isSupport(oi0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, oi0, "4")) {
          tb.o0();
          if (!DanmakuSwitchUtil.b(tb.u)) {
             i.e(R.style.arg_RES_7f11066a, DanmakuUtil.b(tb.u), 1);
             c.a.a(tb.x, tb.u, false, b, false, "ON_LONG_PRESS_POPUP");
          }else {
             c.a.a(tb.x, tb.u, true, b, false, "ON_LONG_PRESS_POPUP");
             DanmakuSwitchUtils.h.a(b);
          }
       }
       return;
    }
}
