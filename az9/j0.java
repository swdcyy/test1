package az9.j0;
import erd.g;
import az9.i0$b;
import java.lang.Object;
import lm5.e;
import java.util.Objects;
import az9.i0;
import qp7.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import im5.f;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class j0 implements g	// class@00032e
{
    public final i0$b b;

    public void j0(i0$b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b;
       j0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.a != null) {
          p0 = tb.a;
          if (p0.m != null) {
             Object obj = PatchProxy.apply(null, p0, i0.class, "10");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(DanmakuSwitchUtils.h.g(p0.u) && f.b()){
                b = true;
             }else {
                b = false;
             }
             if (!PatchProxy.isSupport(i0.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), p0, i0.class, "5")) {
                if (b) {
                   i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f103cb8), 1);
                }else {
                   i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f103cb5), 1);
                }
             }
          }
       }
       return;
    }
}
