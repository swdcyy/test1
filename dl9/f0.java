package dl9.f0;
import android.view.View$OnLongClickListener;
import dl9.m0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.popup.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import dl9.g0;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import dl9.n0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import java.lang.Boolean;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.graphics.Rect;
import android.view.ViewParent;
import android.view.ViewGroup;
import java.lang.Number;
import lnc.a1;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kwai.library.widget.popup.bubble.a$c;
import java.lang.Enum;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.bubble.a;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import yk9.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.lang.Integer;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.u1;

public final class f0 implements View$OnLongClickListener	// class@001f5d
{
    public final m0 b;

    public void f0(m0 p0){
       this.b = p0;
    }
    public final boolean onLongClick(View p0){
       int b2;
       boolean b3;
       BubbleInterface$Position bOTTOM;
       int i;
       int[] obj = p0;
       f0 b = this.b;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m0 om0 = m0.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, om0, "8")) {
       }else {
          a uoa = new a(b.getActivity());
          uoa.K0(KwaiBubbleOption.e);
          uoa.L(new g0(b));
          uoa.M(new n0(b));
          int[] obj1 = PatchProxy.apply(null, b, om0, "20");
          boolean b1 = false;
          if (obj1 != patchProxyRe) {
             b2 = obj1.booleanValue();
          }else {
             m0 r = b.r;
             while (true) {
                if (r != null) {
                   if (r instanceof DialogFragment) {
                      b2 = true;
                   }else {
                      r = r.getParentFragment();
                   }
                }else {
                   b2 = false;
                }
             }
          }
          uoa.v(b2);
          uoa.P(b1);
          b2 = 2;
          int[] ointArray = new int[b2];
          obj.getLocationInWindow(ointArray);
          Bundle uBundle = new Bundle();
          Rect obj2 = PatchProxy.applyOneRefs(obj, b, om0, "18");
          if (obj2 != patchProxyRe) {
             b3 = obj2.booleanValue();
          }else {
             obj2 = new Rect();
             obj.getGlobalVisibleRect(obj2);
             obj1 = new int[b2];
             obj.getLocationOnScreen(obj1);
             obj2.top = obj1[1];
             ViewGroup viewGroup = obj;
             while (true) {
                if (viewGroup.getParent() instanceof ViewGroup) {
                   ViewGroup parent = viewGroup.getParent();
                   if (!parent.getVisibility()) {
                      Object obj3 = PatchProxy.applyTwoRefs(viewGroup, parent, b, om0, "19");
                      if (obj3 != patchProxyRe) {
                         b2 = obj3.intValue();
                      }else {
                         i = 0;
                         while (i < parent.getChildCount() && parent.getChildAt(i) != viewGroup) {
                            i = i + 1;
                         }
                         b2 = i;
                      }
                      i = 0;
                      while (true) {
                         if (i < parent.getChildCount()) {
                            View childAt = parent.getChildAt(i);
                            if (childAt.isShown() && i != b2) {
                               Rect rect1 = new Rect();
                               childAt.getGlobalVisibleRect(rect1);
                               if (!rect1.contains(obj2)) {
                                  Rect rect = rect1.bottom;
                                  if (obj2.bottom <= rect || (obj2.top >= rect || (obj2.left >= rect1.right || rect1.left >= obj2.right))) {
                                  }
                               }
                            }
                         }else {
                            viewGroup = parent;
                         }
                      }
                   }
                   b3 = true;
                }else {
                   b3 = false;
                }
             }
          }
          String str = "BUBBLE_POSITION";
          if (b3 || ointArray[1] < a1.e(100.00f)) {
             bOTTOM = BubbleInterface$Position.BOTTOM;
             obj = a$c.f0(obj, bOTTOM);
             uoa.n0(obj[0], obj[1]);
             uoa.D0(bOTTOM);
             uBundle.putInt(str, bOTTOM.ordinal());
          }else {
             bOTTOM = BubbleInterface$Position.TOP;
             obj = a$c.f0(obj, bOTTOM);
             uoa.n0(obj[0], obj[1]);
             uoa.D0(bOTTOM);
             uBundle.putInt(str, bOTTOM.ordinal());
          }
          uoa.y(uBundle);
          b.y = uoa.X();
          m0 q = b.q;
          QComment mEmotionInfo = b.p.mEmotionInfo;
          e0 uoe0 = f0.a(b.r, b.getActivity());
          Objects.requireNonNull(q);
          if (!PatchProxy.applyVoidTwoRefs(mEmotionInfo, uoe0, q, d.class, "59")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "COMMENT_EMOTION";
             i3 oi3 = i3.f();
             oi3.d("emo_id", mEmotionInfo.mId);
             oi3.c("emotion_biz_type", Integer.valueOf(mEmotionInfo.mBizType));
             oi3.d("emo_button_text", "NEW");
             uElementPack.params = oi3.e();
             u1.B(new ClickMetaData().setLogPage(uoe0).setType(true).setElementPackage(uElementPack).setFeedLogCtx(q.a.getFeedLogCtx()));
          }
       }
       return true;
    }
}
