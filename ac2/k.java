package ac2.k;
import erd.g;
import com.kuaishou.live.core.show.luckystar.currentinfo.c;
import java.lang.Object;
import wca.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yb2.i;
import p91.m;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$LiveLuckyStarInfo;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$LiveLuckyStarParticipateInfo;

public final class k implements g	// class@0000b5
{
    public final c b;

    public void k(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, c.class, "14")) {
       }else {
          c l = tb.L;
          if (p0.d != null || (TextUtils.n(p0.b, tb.v.a.d()) && l != null)) {
             if (p0.c != null) {
                if (!tb.A.getVisibility()) {
                   tb.A.s();
                }
             }else {
                tb.W8();
             }
             if (p0.c != null && (l.mType == 6 && (!tb.v.a.e() && l.getUserParticipateInfo().mParticipated == null))) {
                p0.mParticipated = true;
                tb.X8(l);
             }
          }
       }
    label_0065 :
       return;
    }
}
