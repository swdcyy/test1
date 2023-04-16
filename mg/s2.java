package mg.s2;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.bridge.JsPostBubbleParam;
import f55.g;
import java.lang.Object;
import og.l;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Activity;
import p36.a;
import android.view.View;
import r36.b;
import com.kwai.feature.post.api.feature.bridge.JsPostBubbleParam$BubbleConfig;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.yxcorp.gifshow.widget.popup.a;
import lnc.a1;
import com.kwai.library.widget.popup.bubble.a$c;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.kwai.library.widget.popup.common.c$b;
import mg.g0;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import mg.h0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.bubble.a;
import com.kwai.library.widget.popup.common.c;

public final class s2 implements Runnable	// class@00265d
{
    public final JsPostBubbleParam b;
    public final g c;

    public void s2(JsPostBubbleParam p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       int i;
       BubbleInterface$Position lEFT;
       s2 tb = this.b;
       JsPostBubbleParam mText = (tb != null)? tb.mText: null;
       if (mText != null && tb.mBubbleConfig != null) {
          Object[] objArray = new Object[0];
          l.D().w("JsGrowthBridgeFuns", "showBubble: "+tb, objArray);
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          Activity uActivity = uActivityCon.e();
          if (uActivity != null) {
             JsPostBubbleParam mAnchorViewI = tb.mAnchorViewId;
             a.o(mAnchorViewI, "params.mAnchorViewId");
             View view = a.b.b(uActivity, mAnchorViewI);
             if (view != null) {
                if (view instanceof b) {
                   view = view.getShowBubbleView();
                   a.o(view, "anchorView.showBubbleView");
                }
                JsPostBubbleParam$BubbleConfig mDirection = tb.mBubbleConfig.mDirection;
                if (mDirection != null) {
                   if (mDirection != true) {
                      i = (mDirection != 2)? 0x7f0d0144: 0x7f0d0145;
                   }else {
                      i = 0x7f0d0146;
                   }
                }else {
                   i = 0x7f0d0143;
                }
                if (mDirection != null) {
                   if (mDirection != true) {
                      if (mDirection != 2) {
                         lEFT = (mDirection != 3)? BubbleInterface$Position.LEFT: BubbleInterface$Position.LEFT;
                      }else {
                         lEFT = BubbleInterface$Position.RIGHT;
                      }
                   }else {
                      lEFT = BubbleInterface$Position.TOP;
                   }
                }else {
                   lEFT = BubbleInterface$Position.BOTTOM;
                }
                a uoa = new a(uActivity);
                uoa.B0(a1.e(tb.mBubbleConfig.mOffsetX));
                uoa.C0(a1.e(tb.mBubbleConfig.mOffsetY));
                uoa.D0(lEFT);
                uoa.K0(KwaiBubbleOption.e);
                uoa.o0(view);
                uoa.T(tb.mShowDuration);
                uoa.z(true);
                a.o(uoa, "KwaiBubbleBuilder\(activi¡­<KwaiBubbleBuilder>\(true\)");
                JsPostBubbleParam$BubbleConfig mBlankAreaTa = tb.mBubbleConfig.mBlankAreaTappedType;
                if (mBlankAreaTa != null) {
                   if (mBlankAreaTa != true) {
                      if (mBlankAreaTa != 2) {
                         if (mBlankAreaTa != 3) {
                            uoa.A(true);
                            uoa.P(0);
                         }else {
                            uoa.A(true);
                            uoa.P(true);
                         }
                      }else {
                         uoa.A(0);
                         uoa.P(true);
                      }
                   }else {
                      uoa.A(true);
                      uoa.P(0);
                   }
                }else {
                   uoa.A(0);
                   uoa.P(0);
                }
                uoa.L(new g0(i));
                uoa.M(new h0(tb));
                uoa.e0().Z();
             }
          }
       }
       return;
    }
}
