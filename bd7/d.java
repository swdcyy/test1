package bd7.d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import bd7.e;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o07.o;
import com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView;
import com.yxcorp.gifshow.nearby.common.model.AnimationModel;
import com.airbnb.lottie.LottieAnimationView;
import com.kwai.social.startup.local.model.DarkLightModel;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.TextPaint;
import android.animation.ObjectAnimator;

public final class d implements PopupInterface$h	// class@000409
{
    public final e b;

    public void d(e p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       e d;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, str)) {
          return;
       }
       a.p(p0, "popup");
       o.e(this, p0);
       d tb = this.b;
       e c = tb.c;
       if (c != null) {
          d = tb.d;
          if (!PatchProxy.applyVoidOneRefs(d, c, NearbyMigrateGuideView.class, str) && d != null) {
             AnimationModel mRibbonAnima = d.mRibbonAnimation;
             if (!PatchProxy.applyVoidOneRefs(mRibbonAnima, c, NearbyMigrateGuideView.class, "2") && (mRibbonAnima != null && (a.g(c.j, mRibbonAnima) ^ true))) {
                c.j = mRibbonAnima;
                NearbyMigrateGuideView e = c.e;
                e.setAnimationFromUrl(mRibbonAnima);
                e.setRepeatCount(0);
             }
          label_004a :
             mRibbonAnima = d.mCoverUrl;
             if (mRibbonAnima != null) {
                str = mRibbonAnima.getMUrl();
                if (str != null) {
                   c.b.L(str);
                }
             }
             c.c.setText(d.mTitle);
             TextPaint paint = c.c.getPaint();
             a.o(paint, "mTvMigrateTitle.paint");
             paint.setFakeBoldText(true);
             c.d.setText(d.mSubtitle);
             ObjectAnimator showAnimator = c.getShowAnimator();
             if (showAnimator == null || showAnimator.isStarted() != true) {
                showAnimator = c.getShowAnimator();
                if (showAnimator != null) {
                   showAnimator.start();
                }
             }
          }
       }
    label_008b :
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
