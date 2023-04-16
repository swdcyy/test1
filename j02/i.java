package j02.i;
import androidx.lifecycle.Observer;
import j02.k;
import j02.o;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.SCLiveEncourageTreasureBoxRewardCartoon;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.treasurebox.widget.LiveAudienceTreasureBoxWidgetView;
import k02.h;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.widget.ImageView;
import android.animation.Animator$AnimatorListener;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import w4.r;
import k02.g;
import w4.b;
import j02.a$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import k2b.e0;
import j02.a;

public final class i implements Observer	// class@002a1e
{
    public final k b;
    public final o c;

    public void i(k p0,o p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       LiveAudienceTreasureBoxWidgetView d;
       int i;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, str)) {
       }else {
          k b = this.b.b;
          if (b != null) {
             a.o(p0, "it");
             if (!PatchProxy.applyVoidOneRefs(p0, b, LiveAudienceTreasureBoxWidgetView.class, str)) {
                a.p(p0, "rewardTip");
                b.P(h.a, "showRewardTipAnimation 展示自动领取金币动画, rewardTip:"+p0);
                if (!TextUtils.x(p0.text)) {
                   d = b.d;
                   if (d == null) {
                      a.S("treasureBoxBottomDescription");
                   }
                   d.setText(p0.text);
                }
                b.b();
                d = b.f;
                if (d == null) {
                   a.S("treasureBoxBottomAnimationView");
                }
                i = 0;
                d.setVisibility(i);
                d = b.f;
                if (d == null) {
                   a.S("treasureBoxBottomAnimationView");
                }
                d.a(b.k);
                d = b.f;
                if (d == null) {
                   a.S("treasureBoxBottomAnimationView");
                }
                d.D(R.string.arg_RES_7f10260a);
                LiveAudienceTreasureBoxWidgetView f = b.f;
                if (f == null) {
                   a.S("treasureBoxBottomAnimationView");
                }
                r or = new r(f);
                or.a("+200", "+"+p0.rewardAmount);
                f = b.f;
                if (f == null) {
                   a.S("treasureBoxBottomAnimationView");
                }
                f.setTextDelegate(or);
                g og = new g();
                f = b.f;
                if (f == null) {
                   a.S("treasureBoxBottomAnimationView");
                }
                f.setFontAssetDelegate(og);
                d = b.f;
                if (d == null) {
                   a.S("treasureBoxBottomAnimationView");
                }
                d.setRepeatCount(i);
                LiveAudienceTreasureBoxWidgetView f1 = b.f;
                if (f1 == null) {
                   a.S("treasureBoxBottomAnimationView");
                }
                f1.s();
             }
          }
          ClientContent$LiveStreamPackage liveStreamPa = this.b.g.a();
          a.o(liveStreamPa, "liveLogPackageProvider.liveStreamPackage");
          e0 page = this.b.g.getPage();
          a.o(page, "liveLogPackageProvider.page");
          a$a uoa = new a$a(liveStreamPa, page, p0.rewardAmount, p0.taskId);
          this.c.A0(b);
       }
       return;
    }
}
