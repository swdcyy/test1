package mr1.e;
import kr1.b;
import android.view.ViewGroup;
import j83.b;
import msd.a;
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
import mr1.a;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;
import java.lang.Integer;
import pq1.c;
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
import mr1.d;
import java.lang.Runnable;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.CharSequence;
import com.kuaishou.android.live.log.b;
import java.lang.Float;
import d61.f0;
import com.airbnb.lottie.LottieAnimationView;
import kr1.a;

public final class e implements b	// class@0031f6
{
    public final CustomPeerInfoContainer a;
    public final View b;
    public final KwaiImageView c;
    public final TextView d;
    public final LiveKidLottieAnimationView e;
    public final ViewGroup f;
    public final b g;
    public final a h;

    public void e(ViewGroup p0,b p1,a p2){
       a.p(p0, "rootView");
       a.p(p1, "widgetModel");
       a.p(p2, "minWidgetWidthSupplier");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       View view = p0.findViewById(R.id.multi_line_widget_bottom_container);
       a.o(view, "rootView.findViewById\(R.¡­_widget_bottom_container\)");
       this.a = view;
       view = p0.findViewById(R.id.multi_line_peer_info_layout);
       a.o(view, "rootView.findViewById\(R.¡­ti_line_peer_info_layout\)");
       this.b = view;
       view = p0.findViewById(R.id.multi_line_mute_icon);
       a.o(view, "rootView.findViewById\(R.id.multi_line_mute_icon\)");
       this.c = view;
       View view1 = p0.findViewById(R.id.multi_line_peer_name);
       a.o(view1, "rootView.findViewById\(R.id.multi_line_peer_name\)");
       this.d = view1;
       View view2 = p0.findViewById(R.id.multi_line_peer_follow_button);
       a.o(view2, "rootView.findViewById\(R.¡­_line_peer_follow_button\)");
       this.e = view2;
       view.setImageDrawable(a1.f(R.drawable.arg_RES_7f0805ab));
       d.c(view, ColorStateList.valueOf(ContextCompat.getColor(view.getContext(), R.color.arg_RES_7f06060a)));
       view2.setPadding(0, a1.d(R.dimen.arg_RES_7f0702e3), a1.d(R.dimen.arg_RES_7f0702e3), a1.d(R.dimen.arg_RES_7f0702e3));
    }
    public Object a(){
       c uoc;
       float f;
       Object[] objArray;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       a uoa = PatchProxy.apply(null, obj, uoe, "3");
       if (uoa != patchProxyRe) {
       }else {
          Boolean tRUE = Boolean.TRUE;
          boolean b = a.g(obj.g.h().getValue(), tRUE);
          boolean b1 = a.g(obj.g.a().getValue(), tRUE);
          Integer value = obj.g.b().getValue();
          e uoe1 = 1;
          if (value != null && value.intValue() == uoe1) {
             uoc = obj.d(b);
          }else {
             uoe1 = 2;
             if (value != null && value.intValue() == uoe1) {
                if (PatchProxy.isSupport(uoe)) {
                   uoc = PatchProxy.applyOneRefs(Boolean.valueOf(b), obj, uoe, "2");
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
          a value1 = obj.g.d().getValue();
          value1 = (value1 != null)? value1.h: null;
          String str = b.a(value1);
          a.o(str, "LiveUsernameUtils.getUse\x20\x02antInfo.value?.mUserInfo\)\x00");
          e uoe2 = new e(str, b, false, b1, false);
          Object obj1 = PatchProxy.apply(null, obj, uoe, "4");
          if (obj1 != patchProxyRe) {
             f = obj1.floatValue();
          }else {
             Integer value2 = obj.g.c().getValue();
             if (value2 == null) {
                value2 = Integer.valueOf(n.k(n.d(obj.f)));
             }
             a.o(value2, "widgetModel.renderAreaWi¡­il.getActivity\(rootView\)\)");
             f = (float)value2.intValue() * obj.h.invoke().floatValue();
          }
          uoa = new a(f, uoc, uoe1);
       }
       return uoa;
    }
    public void b(Object p0){
       String str;
       e e;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, e.class, "6")) {
       }else {
          a.p(obj1, "bottomWidgetParams");
          c uoc = obj1.b();
          boolean b = false;
          if (!PatchProxy.applyVoidOneRefs(uoc, obj, e.class, "5")) {
             ViewGroup$LayoutParams layoutParams = obj.b.getLayoutParams();
             if (layoutParams != null) {
                layoutParams.height = uoc.c();
             }
             obj.a.setLayoutPadding(uoc.a());
             TextPaint paint = obj.d.getPaint();
             a.o(paint, "peerNameTextView.paint");
             paint.setFakeBoldText(uoc.i());
             obj.d.setTextSize(b, (float)uoc.l());
             str = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams";
             if (obj.d.getLayoutParams() instanceof LinearLayout$LayoutParams) {
                layoutParams = obj.d.getLayoutParams();
                Objects.requireNonNull(layoutParams, str);
                layoutParams.setMargins(uoc.k(), b, uoc.j(), b);
             }
             layoutParams = obj.c.getLayoutParams();
             Objects.requireNonNull(layoutParams, str);
             layoutParams.gravity = 16;
             layoutParams.width = uoc.h();
             layoutParams.height = uoc.h();
             layoutParams.rightMargin = uoc.f();
             obj.c.setLayoutParams(layoutParams);
             if (obj.e.getLayoutParams() instanceof LinearLayout$LayoutParams) {
                layoutParams = obj.e.getLayoutParams();
                Objects.requireNonNull(layoutParams, str);
                layoutParams.width = uoc.e();
                layoutParams.height = uoc.e();
                layoutParams.setMargins(uoc.d(), b, b, b);
                obj.e.setLayoutParams(layoutParams);
             }
             obj.b.post(new d(obj));
          }
          if (!PatchProxy.applyVoidOneRefs(obj1, obj, e.class, "7")) {
             LiveLogTag lIVE_MULTI_L = LiveLogTag.LIVE_MULTI_LINE;
             lIVE_MULTI_L.appendTag("AudienceBasicPeerAnchorWidgetResize");
             b.T(lIVE_MULTI_L, "tryResizeViews step 0.0 - start", "anchorName", obj.d.getText(), "bottomWidgetParams", obj1);
             uoc = obj1.b();
             int i = (int)obj1.a() - (uoc.a() * 2);
             lIVE_MULTI_L.appendTag("AudienceBasicPeerAnchorWidgetResize");
             b.U(lIVE_MULTI_L, "tryResizeViews step 1.0", "mBottomWidgetContainerWidth", Float.valueOf(obj1.a()), "celBottomContainerPadding", Integer.valueOf(uoc.a()), "maxDisplayWidth", Integer.valueOf(i));
             boolean i1 = ((int)obj.d.getPaint().measureText(f0.b(obj.d.getText().toString(), 3)) + uoc.j()) + uoc.k();
             int i2 = ((int)obj.d.getPaint().measureText(obj.d.getText().toString()) + uoc.j()) + uoc.k();
             int i3 = (obj1.c().a())? (uoc.h() + uoc.f()) + uoc.g(): 0;
             int i4 = uoc.b();
             lIVE_MULTI_L.appendTag("AudienceBasicPeerAnchorWidgetResize");
             b.T(lIVE_MULTI_L, "tryResizeViews step 1.1", "anchorNameTextMinWidth", Integer.valueOf(i1), "anchorNameTextNormalWidth", Integer.valueOf(i2));
             int i5 = (i2 + i3) + i4;
             lIVE_MULTI_L.appendTag("AudienceBasicPeerAnchorWidgetResize");
             b.U(lIVE_MULTI_L, "tryResizeViews step 1.2", "muteIconWidth", Integer.valueOf(i3), "followWidth", Integer.valueOf(i4), "displayElementsWidth", Integer.valueOf(i5));
             if (i >= i5) {
                obj1.c().d(b);
                obj1.c().e(b);
                lIVE_MULTI_L.appendTag("AudienceBasicPeerAnchorWidgetResize");
                b.P(lIVE_MULTI_L, "tryResizeViews step 2, can normally display all elements");
                str = 1;
             }else {
                int i6 = i5 - i;
                lIVE_MULTI_L.appendTag("AudienceBasicPeerAnchorWidgetResize");
                b.S(lIVE_MULTI_L, "tryResizeViews step 3, need shrink", "diff", Integer.valueOf(i6));
                if (i2 > i1) {
                   i4 = i2 - i1;
                   if (i4 >= i6) {
                      i5 = i5 - i6;
                      obj.d.setMaxWidth((((i2 - uoc.k()) - uoc.j()) - i6));
                      lIVE_MULTI_L.appendTag("AudienceBasicPeerAnchorWidgetResize");
                      b.U(lIVE_MULTI_L, "tryResizeViews step 3.1_1 , just need shrink anchor_name", "anchorNameTextMaxWidth", Integer.valueOf(obj.d.getMaxWidth()), "anchorNameTextMinWidth", Integer.valueOf(i1), "anchorNameTextNormalWidth", Integer.valueOf(i2));
                      e = null;
                   label_0239 :
                      if (e) {
                         i1 = true;
                         obj1.c().e(i1);
                         e = ((i5 - i3) > i)? 1: null;
                         lIVE_MULTI_L.appendTag("AudienceBasicPeerAnchorWidgetResize");
                         b.P(lIVE_MULTI_L, "tryResizeViews step 3.2 , shrink mute icon");
                      }else {
                         i1 = true;
                      }
                      if (e != null) {
                         obj1.c().d(i1);
                         lIVE_MULTI_L.appendTag("AudienceBasicPeerAnchorWidgetResize");
                         b.P(lIVE_MULTI_L, "tryResizeViews step 3.3 , shrink follow button");
                      }
                   }else {
                      i5 = i5 - i4;
                      obj.d.setMaxWidth(i1);
                      lIVE_MULTI_L.appendTag("AudienceBasicPeerAnchorWidgetResize");
                      b.P(lIVE_MULTI_L, "tryResizeViews step 3.1_2 , anchor_name need min, shrink should continue....");
                   }
                }
                e = 1;
                goto label_0239 ;
             }
             lIVE_MULTI_L.appendTag("AudienceBasicPeerAnchorWidgetResize");
             b.T(lIVE_MULTI_L, "tryResizeViews step 4.0 - end", "anchorName", obj.d.getText(), "resizeExtraInfo", obj1.c());
             i4 = (obj1.c().a() && !obj1.c().c())? true: false;
             if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i4), obj, e.class, "8")) {
                if (i4) {
                   obj.c.setVisibility(0);
                }else {
                   obj.c.setVisibility(8);
                }
             }
             if (obj1.c().b()) {
                e = obj.e;
                if (e != null) {
                   e.setVisibility(8);
                }
                e = obj.e;
                if (e != null) {
                   e.f();
                }
             }
          }
       }
    label_02cf :
       return;
    }
    public void c(){
       a.a(this);
    }
    public final c d(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoe, "1");
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
