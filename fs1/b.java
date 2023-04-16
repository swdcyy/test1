package fs1.b;
import kr1.b;
import android.view.ViewGroup;
import j83.b;
import msd.a;
import es1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import com.kuaishou.live.common.core.basic.widget.CustomPeerInfoContainer;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.live.core.basic.widget.LiveKidLottieAnimationView;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.content.Context;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import android.content.res.ColorStateList;
import e2.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fs1.d;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;
import java.lang.Integer;
import pq1.c;
import as1.b;
import pq1.e;
import com.kuaishou.live.common.core.component.multiline.model.a;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import b61.b;
import java.lang.Number;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.text.TextPaint;
import android.widget.LinearLayout$LayoutParams;
import java.util.Objects;
import fs1.a;
import java.lang.Runnable;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.CharSequence;
import pp.c;
import com.kuaishou.android.live.log.b;
import d61.f0;
import com.airbnb.lottie.LottieAnimationView;
import kr1.a;

public final class b implements b	// class@002391
{
    public final CustomPeerInfoContainer a;
    public final View b;
    public final KwaiImageView c;
    public final TextView d;
    public final LiveKidLottieAnimationView e;
    public final ViewGroup f;
    public final b g;
    public final a h;
    public final a i;

    public void b(ViewGroup p0,b p1,a p2,a p3){
       a.p(p0, "rootView");
       a.p(p1, "widgetModel");
       a.p(p2, "minWidgetWidthSupplier");
       a.p(p3, "puzzleWidgetModel");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.i = p3;
       View view = p0.findViewById(R.id.multi_line_widget_bottom_container);
       a.o(view, "rootView.findViewById\(R.бн_widget_bottom_container\)");
       this.a = view;
       view = p0.findViewById(R.id.multi_line_peer_info_layout);
       a.o(view, "rootView.findViewById\(R.бнti_line_peer_info_layout\)");
       this.b = view;
       view = p0.findViewById(R.id.multi_line_mute_icon);
       a.o(view, "rootView.findViewById\(R.id.multi_line_mute_icon\)");
       this.c = view;
       View view1 = p0.findViewById(R.id.multi_line_peer_name);
       a.o(view1, "rootView.findViewById\(R.id.multi_line_peer_name\)");
       this.d = view1;
       View view2 = p0.findViewById(R.id.multi_line_peer_follow_button);
       a.o(view2, "rootView.findViewById\(R.бн_line_peer_follow_button\)");
       this.e = view2;
       view.setImageDrawable(a1.f(R.drawable.arg_RES_7f0805ab));
       d.c(view, ColorStateList.valueOf(ContextCompat.getColor(view.getContext(), R.color.arg_RES_7f060634)));
       view2.setPadding(0, a1.d(R.dimen.arg_RES_7f0702e3), a1.d(R.dimen.arg_RES_7f0702e3), a1.d(R.dimen.arg_RES_7f0702e3));
    }
    public Object a(){
       boolean b;
       c uoc;
       Object[] objArray;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       d uod = PatchProxy.apply(null, obj, uob, "1");
       if (uod != patchProxyRe) {
       }else {
          Boolean tRUE = Boolean.TRUE;
          b = a.g(obj.g.h().getValue(), tRUE);
          boolean b1 = a.g(obj.g.a().getValue(), tRUE);
          Integer value = obj.g.b().getValue();
          b uob1 = 1;
          if (value != null && value.intValue() == uob1) {
             uoc = obj.d(b);
          }else {
             uob1 = 2;
             if (value != null && value.intValue() == uob1) {
                if (PatchProxy.isSupport(uob)) {
                   uoc = PatchProxy.applyOneRefs(Boolean.valueOf(b), obj, uob, "3");
                   if (uoc != patchProxyRe) {
                   }
                }
                int i = 0x7f07031b;
                int i1 = a1.d(i);
                int i2 = a1.d(i);
                int i3 = 0x7f0702e3;
                int i4 = a1.d(i3);
                int i5 = - a1.d(i3);
                int i6 = 0x7f070295;
                int i7 = (b)? 0: a1.d(i6) - a1.d(i3);
                c uoc1 = new c(false, true, i1, i2, a1.d(0x7f070356), a1.d(i6), a1.d(i6), (- a1.d(i3)), a1.d(0x7f070271), a1.d(i), i5, i4, 0, i7, a1.d(0x7f070334), a1.d(0x7f070334));
                uoc = v9;
             }else {
                uoc = obj.d(b);
             }
          }
          uob1 = obj.i.a().getValue();
          a value1 = obj.g.d().getValue();
          value1 = (value1 != null)? value1.h: null;
          String str = b.a(value1);
          a.o(str, "LiveUsernameUtils.getUse\x20\x02antInfo.value?.mUserInfo\)\x00");
          e uoe = new e(str, b, false, b1, false);
          Object obj1 = PatchProxy.apply(null, obj, uob, "5");
          float f = (obj1 != patchProxyRe)? obj1.floatValue(): (float)n.k(n.d(obj.f)) * obj.h.invoke().floatValue();
          uod = new d(f, uob1, uoc, v12);
       }
       return uod;
    }
    public void b(Object p0){
       int i3;
       int i9;
       String str;
       Object obj = this;
       Object obj1 = p0;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, uob, "2")) {
       }else {
          a.p(obj1, "bottomWidgetParams");
          c uoc = obj1.b();
          boolean i = 0;
          if (!PatchProxy.applyVoidOneRefs(uoc, obj, uob, "6")) {
             ViewGroup$LayoutParams layoutParams = obj.b.getLayoutParams();
             if (layoutParams != null) {
                layoutParams.height = uoc.c();
             }
             obj.a.setLayoutPadding(uoc.a());
             TextPaint paint = obj.d.getPaint();
             a.o(paint, "peerNameTextView.paint");
             paint.setFakeBoldText(uoc.i());
             obj.d.setTextSize(i, (float)uoc.l());
             String str1 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams";
             if (obj.d.getLayoutParams() instanceof LinearLayout$LayoutParams) {
                layoutParams = obj.d.getLayoutParams();
                Objects.requireNonNull(layoutParams, str1);
                layoutParams.setMargins(uoc.k(), i, uoc.j(), i);
             }
             layoutParams = obj.c.getLayoutParams();
             Objects.requireNonNull(layoutParams, str1);
             layoutParams.gravity = 16;
             layoutParams.width = uoc.h();
             layoutParams.height = uoc.h();
             layoutParams.rightMargin = uoc.f();
             obj.c.setLayoutParams(layoutParams);
             if (obj.e.getLayoutParams() instanceof LinearLayout$LayoutParams) {
                layoutParams = obj.e.getLayoutParams();
                Objects.requireNonNull(layoutParams, str1);
                layoutParams.width = uoc.e();
                layoutParams.height = uoc.e();
                layoutParams.setMargins(uoc.d(), i, i, i);
                obj.e.setLayoutParams(layoutParams);
             }
             obj.b.post(new a(obj));
          }
          if (!PatchProxy.applyVoidOneRefs(obj1, obj, uob, "7")) {
             LiveLogTag lIVE_LINE_PU = LiveLogTag.LIVE_LINE_PUZZLE;
             b.c0(lIVE_LINE_PU, "tryResizeViews step 0.0 - start", "anchorName", obj.d.getText());
             c uoc1 = obj1.b();
             Integer integer = 2;
             int i1 = ((int)obj1.a() - (a1.e(6.00f) * 2)) - a1.e(6.00f);
             b uob1 = obj1.c();
             Integer integer1 = (uob1 != null)? Integer.valueOf(uob1.a()): null;
             boolean i2 = 1;
             if (integer1 != null && integer1.intValue() == integer) {
                i9 = a1.e(45.00f);
             }else if(integer1 != null && integer1.intValue() == i2){
                i9 = a1.e(48.00f);
             }else {
                i3 = 0;
             label_013f :
                int i4 = ((int)obj.d.getPaint().measureText(f0.b(obj.d.getText().toString(), 3)) + uoc1.j()) + uoc1.k();
                boolean i5 = ((int)obj.d.getPaint().measureText(obj.d.getText().toString()) + uoc1.j()) + uoc1.k();
                int i6 = (obj1.d().a())? (uoc1.h() + uoc1.f()) + uoc1.g(): 0;
                int i7 = uoc1.b();
                LiveLogTag liveLogTag = lIVE_LINE_PU;
                i2 = i5;
                int i8 = i4;
                b.e0(liveLogTag, "tryResizeViews step 1.1", "puzzleCardWidth", Integer.valueOf(i3), "anchorNameTextMinWidth", Integer.valueOf(i4), "anchorNameTextNormalWidth", Integer.valueOf(i5));
                i4 = ((i3 + i2) + i6) + i7;
                i = i4;
                b.e0(liveLogTag, "tryResizeViews step 2", "muteIconWidth", Integer.valueOf(i6), "followWidth", Integer.valueOf(i7), "displayElementsWidth", Integer.valueOf(i4));
                if (i1 >= i) {
                   i = false;
                   obj1.d().d(i);
                   obj1.d().e(i);
                   b.Z(lIVE_LINE_PU, "tryResizeViews step 2, can normally display all elements");
                   i5 = 1;
                }else {
                   i4 = i - i1;
                   b.c0(lIVE_LINE_PU, "tryResizeViews step 3, need shrink", "diff", Integer.valueOf(i4));
                   i9 = i8;
                   if (i2 > i9) {
                      i5 = i2 - i9;
                      if (i5 >= i4) {
                         obj.d.setMaxWidth((((i2 - uoc1.k()) - uoc1.j()) - i4));
                         b.e0(lIVE_LINE_PU, "tryResizeViews step 3.1_1 , just need shrink anchor_name", "anchorNameTextMaxWidth", Integer.valueOf(obj.d.getMaxWidth()), "anchorNameTextMinWidth", Integer.valueOf(i9), "anchorNameTextNormalWidth", Integer.valueOf(i2));
                         i4 = i - i4;
                         str = null;
                      label_0254 :
                         if (str) {
                            obj1.d().e(true);
                            str = ((i4 - i6) > i1)? 1: null;
                            b.Z(lIVE_LINE_PU, "tryResizeViews step 3.2 , shrink mute icon");
                         }else {
                            i5 = true;
                         }
                         if (str) {
                            obj1.d().d(true);
                            b.Z(lIVE_LINE_PU, "tryResizeViews step 3.3 , shrink follow button");
                         }
                      }else {
                         i4 = i - i5;
                         obj.d.setMaxWidth(i9);
                         b.Z(lIVE_LINE_PU, "tryResizeViews step 3.1_2 , anchor_name need min, shrink should continue....");
                      }
                   }else {
                      i4 = i;
                   }
                   str = 1;
                   goto label_0254 ;
                }
                b.d0(lIVE_LINE_PU, "tryResizeViews step 4.0 - end", "anchorName", obj.d.getText(), "resizeExtraInfo", obj1.d());
                i2 = (obj1.d().a() && !obj1.d().c())? true: false;
                if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i2), obj, uob, "8")) {
                   if (i2) {
                      obj.c.setVisibility(0);
                   }else {
                      obj.c.setVisibility(8);
                   }
                }
                if (obj1.d().b()) {
                   obj.e.setVisibility(8);
                   obj.e.f();
                }
             }
             i3 = i9;
             goto label_013f ;
          }
       }
       return;
    }
    public void c(){
       a.a(this);
    }
    public final c d(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uob, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i6 = this;
       }
       int i = a1.d(R.dimen.arg_RES_7f07031b);
       int i1 = a1.d(R.dimen.arg_RES_7f07031b);
       int i2 = 0x7f0702e3;
       int i3 = a1.d(i2);
       int i4 = - a1.d(i2);
       int i5 = (p0)? 0: a1.d(0x7f0702b8) - a1.d(i2);
       c uoc = new c(false, false, i, i1, a1.d(0x7f070267), a1.d(0x7f0702b8), a1.d(0x7f0702b8), (- a1.d(i2)), a1.d(0x7f070295), a1.d(0x7f070334), i4, i3, 0, i5, a1.d(0x7f070334), a1.d(0x7f070334));
       return v2;
    }
}
