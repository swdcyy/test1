package a29.h;
import erd.g;
import a29.k;
import java.lang.Object;
import lm5.e;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mm5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import e17.i;

public final class h implements g	// class@000034
{
    public final k b;

    public void h(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       String str = "manual: "+p0.a+", mIsNeedShowDanmakuSwitchToast: "+tb.D;
       if (PatchProxy.applyVoidTwoRefs("DanmakuSwitchSuccessfulEvent", str, tb, k.class, "14")) {
       }else {
          Object[] objArray = new Object[false];
          a.a.h("AdMusicLabelElement", str, tb.t, null, "DanmakuSwitchSuccessfulEvent", objArray);
       }
       if (tb.D != null) {
          if (DanmakuSwitchUtils.h.f()) {
             i.a(R.style.arg_RES_7f11066a, 0x7f103cb8);
          }else {
             i.a(R.style.arg_RES_7f11066a, 0x7f1005c9);
          }
          tb.D = false;
       }
       return;
    }
}
