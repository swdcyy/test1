package az9.s;
import erd.g;
import az9.i0;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import mm5.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.danmaku.DanmakuSwitchUtil;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import k2b.e0;

public final class s implements g	// class@000339
{
    public final i0 b;

    public void s(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, i0.class, "6")) {
       }else {
          tb.o0();
          i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f10097b));
          i0 u = tb.u;
          c.a.a(tb.x, u, DanmakuSwitchUtil.b(u), DanmakuSwitchUtils.h.g(tb.u), true, "ON_LONG_PRESS_POPUP");
       }
       return;
    }
}
