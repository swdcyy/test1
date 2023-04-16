package dl9.e1;
import android.view.View$OnLongClickListener;
import dl9.c1;
import com.kuaishou.android.model.mix.AttachmentInfo;
import java.lang.Object;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import yk9.d;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.u1;
import com.yxcorp.gifshow.widget.popup.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import dl9.f1;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import dl9.g1;
import com.kwai.library.widget.popup.common.PopupInterface$h;
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

public final class e1 implements View$OnLongClickListener	// class@001f5a
{
    public final c1 b;
    public final AttachmentInfo c;

    public void e1(c1 p0,AttachmentInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final boolean onLongClick(View p0){
       String id;
       int b1;
       int b2;
       BubbleInterface$Position bOTTOM;
       int childCount;
       String str;
       Object obj = this;
       int[] obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e1 obj2 = PatchProxy.applyOneRefs(obj1, obj, e1.class, "1");
       if (obj2 != patchProxyRe) {
          return obj2.booleanValue();
       }
       obj2 = obj.b;
       c1 s = obj2.s;
       if (s != null) {
          d uod = c1.R8(obj2);
          e1 c = obj.c;
          if (c != null) {
             id = c.getId();
             if (id != null) {
             label_002e :
                e0 uoe0 = f0.a(s, obj.b.getActivity());
                Objects.requireNonNull(uod);
                if (!PatchProxy.applyVoidTwoRefs(id, uoe0, uod, d.class, "85")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "COMMENT_AREA_PICTURE_LONGPRESS";
                   i3 oi3 = i3.f();
                   oi3.d("picture_id", id);
                   uElementPack.params = oi3.e();
                   u1.B(new ClickMetaData().setLogPage(uoe0).setType(4).setElementPackage(uElementPack).setFeedLogCtx(uod.a.getFeedLogCtx()));
                }
             }
          }
          id = "";
          goto label_002e ;
       }
       obj2 = obj.b;
       Objects.requireNonNull(obj2);
       s = c1.class;
       c1 uoc1 = 1;
       if (!PatchProxy.applyVoidOneRefs(obj1, obj2, s, "9")) {
          Activity activity = obj2.getActivity();
          a.m(activity);
          a uoa = new a(activity);
          uoa.K0(KwaiBubbleOption.e);
          uoa.L(new f1(obj2));
          uoa.M(new g1(obj2));
          int[] obj3 = PatchProxy.apply(null, obj2, s, "15");
          boolean b = false;
          if (obj3 != patchProxyRe) {
             b1 = obj3.booleanValue();
          }else {
             c1 s1 = obj2.s;
             while (true) {
                if (s1 != null) {
                   if (s1 instanceof DialogFragment) {
                      b1 = true;
                   }else {
                      s1 = s1.getParentFragment();
                   }
                }else {
                   b1 = false;
                }
             }
          }
          uoa.v(b1);
          uoa.P(b);
          if (obj1 != null) {
             b1 = 2;
             int[] ointArray = new int[b1];
             obj1.getLocationInWindow(ointArray);
             Bundle uBundle = new Bundle();
             Rect obj4 = PatchProxy.applyOneRefs(obj1, obj2, s, "16");
             if (obj4 != patchProxyRe) {
                b2 = obj4.booleanValue();
             }else {
                obj4 = new Rect();
                obj1.getGlobalVisibleRect(obj4);
                obj3 = new int[b1];
                obj1.getLocationOnScreen(obj3);
                obj4.top = obj3[uoc1];
                ViewParent viewParent = obj1;
                while (true) {
                   if (viewParent.getParent() instanceof ViewGroup) {
                      ViewParent parent = viewParent.getParent();
                      Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                      if (!parent.getVisibility()) {
                         Object obj5 = PatchProxy.applyTwoRefs(viewParent, parent, obj2, s, "17");
                         if (obj5 != patchProxyRe) {
                            b1 = obj5.intValue();
                         }else {
                            childCount = 0;
                            while (childCount < parent.getChildCount() && parent.getChildAt(childCount) != viewParent) {
                               childCount = childCount + 1;
                            }
                            b1 = childCount;
                         }
                         childCount = parent.getChildCount();
                         int i = 0;
                         while (true) {
                            if (i < childCount) {
                               View childAt = parent.getChildAt(i);
                               a.o(childAt, "otherView");
                               if (childAt.isShown() && b1 != i) {
                                  Rect rect = new Rect();
                                  childAt.getGlobalVisibleRect(rect);
                                  if (!rect.contains(obj4)) {
                                     Rect bottom = rect.bottom;
                                     if (obj4.bottom <= bottom || (obj4.top >= bottom || (obj4.right <= rect.left || obj4.left >= rect.right))) {
                                     }
                                  }
                               }
                            }else {
                               viewParent = parent;
                            }
                         }
                      }
                      b2 = true;
                   }else {
                      b2 = false;
                   }
                }
             }
             if (!b2) {
                b2 = 1;
                if (ointArray[b2] >= a1.e((float)obj2.D)) {
                   bOTTOM = BubbleInterface$Position.TOP;
                   obj1 = a$c.f0(obj1, bOTTOM);
                   uoa.n0(obj1[0], obj1[b2]);
                   uoa.D0(bOTTOM);
                   uBundle.putInt(obj2.E, bOTTOM.ordinal());
                label_01d0 :
                   uoa.y(uBundle);
                   obj2.C = uoa.X();
                }
             }else {
                b2 = 1;
             }
             bOTTOM = BubbleInterface$Position.BOTTOM;
             obj1 = a$c.f0(obj1, bOTTOM);
             uoa.n0(obj1[0], obj1[b2]);
             uoa.D0(bOTTOM);
             uBundle.putInt(obj2.E, bOTTOM.ordinal());
             goto label_01d0 ;
          }
       }
       return true;
    }
}
