package com.kuaishou.live.common.core.component.notification.LiveOperationNotificationView;
import ml8.d;
import android.widget.FrameLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$SCTopBroadcastNotice;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.widget.FrameLayout$LayoutParams;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import uc.d;
import com.kuaishou.live.common.core.basic.tools.l;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import java.lang.Runnable;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ekd.k1;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.widget.ShootMarqueeView;
import com.kuaishou.live.common.core.component.notification.LiveOperationNotificationShimmerView;
import android.widget.TextView;
import d61.f0;
import java.lang.Boolean;
import ekd.j;
import hc.b;
import java.util.List;
import java.util.LinkedList;
import qk.m;
import iv1.n;
import ok.h;
import java.util.Collection;
import va1.l0;
import ekd.q;
import java.lang.Integer;
import android.text.SpannableStringBuilder;
import java.util.Iterator;
import com.kuaishou.live.core.show.common.LiveColorSpanModel;
import java.lang.CharSequence;
import android.text.style.ForegroundColorSpan;
import iv1.g;

public class LiveOperationNotificationView extends FrameLayout implements d	// class@0016e2
{
    public KwaiImageView b;
    public KwaiImageView c;
    public KwaiImageView d;
    public ShootMarqueeView e;
    public LiveOperationNotificationShimmerView f;
    public View g;
    public b h;
    public final Object i;
    public static final int[] j;

    static {
       int[] ointArray = new int[]{a1.a(0x7f060753),a1.a(0x7f0604c6)};
       LiveOperationNotificationView.j = ointArray;
    }
    public void LiveOperationNotificationView(Context p0){
       super(p0, null, 0);
    }
    public void LiveOperationNotificationView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveOperationNotificationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.i = new Object();
       a.c(p0, R.layout.arg_RES_7f0d0cee, this);
    }
    public final void a(LiveCommonNoticeMessages$SCTopBroadcastNotice p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveOperationNotificationView.class, "11")) {
          return;
       }
       FrameLayout$LayoutParams layoutParams = this.b.getLayoutParams();
       layoutParams.width = a1.e((float)p0.leftIconWidthDp);
       layoutParams.height = a1.e((float)p0.leftIconHeightDp);
       layoutParams.leftMargin = a1.e((float)p0.leftIconMarginLeftDp);
       return;
    }
    public final t b(UserInfos$PicUrl[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveOperationNotificationView.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l.e(e0.i(p0), null);
    }
    public final GradientDrawable c(int[] p0){
       GradientDrawable obj = PatchProxy.applyOneRefs(p0, this, LiveOperationNotificationView.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new GradientDrawable(GradientDrawable$Orientation.LEFT_RIGHT, p0);
       obj.setCornerRadius((float)(a1.d(R.dimen.arg_RES_7f070897) >> 1));
       return obj;
    }
    public final void d(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveOperationNotificationView.class, "7")) {
          return;
       }
       b.Z(LiveLogTag.ACTIVITY_TEMPLATE_TOP_NOTIFICATION, "onCommonNotificationViewHide");
       this.setVisibility(4);
       if (p0 != null) {
          k1.o(p0);
       }
       b9.a(this.h);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveOperationNotificationView.class, "3")) {
          return;
       }
       this.b = p0.findViewById(0x7f0a2236);
       this.c = p0.findViewById(0x7f0a2238);
       this.d = p0.findViewById(0x7f0a2235);
       this.e = p0.findViewById(0x7f0a2237);
       this.f = p0.findViewById(0x7f0a223a);
       this.g = p0.findViewById(0x7f0a2239);
       f0.f(this.e, "sans-serif-medium");
       return;
    }
    public final boolean e(int p0){
       boolean b = (p0 == 2)? true: false;
       return b;
    }
    public final boolean f(UserInfos$PicUrl[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveOperationNotificationView.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (j.h(p0) ^ 0x01);
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveOperationNotificationView.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       b9.a(this.h);
       k1.n(this.i);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveOperationNotificationView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
    public final void setRightButtonLayoutParams(LiveCommonNoticeMessages$SCTopBroadcastNotice p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveOperationNotificationView.class, "13")) {
          return;
       }
       FrameLayout$LayoutParams layoutParams = this.c.getLayoutParams();
       layoutParams.width = a1.e((float)p0.rightButtonPicWidthDp);
       layoutParams.height = a1.e((float)p0.rightButtonPicHeightDp);
       layoutParams.rightMargin = a1.e((float)p0.rightButtonPicMarginRightDp);
       this.c.invalidate();
       this.c.setVisibility(0);
       return;
    }
    public final void setupLeftIconViewAnimationIfNecessary(LiveCommonNoticeMessages$SCTopBroadcastNotice p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveOperationNotificationView.class, "21")) {
          return;
       }
       if (this.e(p0.leftIconType)) {
          this.a(p0);
          this.b.setVisibility(0);
          l.c(this.b, e0.i(p0.leftIcon), 0, null);
       }
       return;
    }
    public final void setupMarqueeView(LiveCommonNoticeMessages$SCTopBroadcastNotice p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "8";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveOperationNotificationView.class, str)) {
          return;
       }
       FrameLayout$LayoutParams layoutParams = this.e.getLayoutParams();
       layoutParams.leftMargin = a1.e((float)p0.textMarginLeftDp);
       layoutParams.rightMargin = a1.e((float)p0.textMarginRightDp);
       this.e.invalidate();
       if (!j.h(p0.textDesc)) {
          LiveOperationNotificationView te = this.e;
          p0 = p0.textDesc;
          String str1 = "9";
          LinkedList linkedList = PatchProxy.applyOneRefs(p0, this, LiveOperationNotificationView.class, str1);
          if (linkedList != patchProxyRe) {
          }else {
             linkedList = new LinkedList();
             m.t(p0).F(new n(this)).n(linkedList);
          }
          l0 ol0 = l0.class;
          Object obj = null;
          if (!PatchProxy.applyVoidTwoRefs(te, linkedList, obj, ol0, str) && !q.f(linkedList)) {
             int currentTextC = te.getCurrentTextColor();
             if (PatchProxy.isSupport(ol0)) {
                ol0 = PatchProxy.applyTwoRefs(linkedList, Integer.valueOf(currentTextC), obj, ol0, str1);
                if (ol0 != patchProxyRe) {
                   obj = ol0;
                }else if(q.f(linkedList)){
                   obj = new SpannableStringBuilder();
                   Iterator iterator = linkedList.iterator();
                   while (iterator.hasNext()) {
                      LiveColorSpanModel liveColorSpa = iterator.next();
                      int i = obj.length();
                      obj.append(liveColorSpa.mText);
                      int i1 = obj.length();
                      int i2 = l0.l(liveColorSpa.mColor);
                      if (!i2) {
                         i2 = currentTextC;
                      }
                      obj.setSpan(new ForegroundColorSpan(i2), i, i1, 33);
                   }
                }
             }else {
                goto label_0085 ;
             }
             if (obj != null) {
                te.setText(obj);
             }
          }
       }else {
          this.e.setTextColor(l0.i(p0.textColor));
          this.e.setText(p0.textContent);
       }
    label_00da :
       k1.r(new g(this), 1200);
       return;
    }
}
