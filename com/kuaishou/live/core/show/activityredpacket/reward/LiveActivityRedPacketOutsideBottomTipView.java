package com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketOutsideBottomTipView;
import android.widget.FrameLayout;
import vsd.n;
import kotlin.jvm.internal.PropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import nsd.m0;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketOutsideBottomTipView$a;
import nsd.u;
import d61.k;
import android.content.Context;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketOutsideBottomTipView$defaultViewBgDrawable$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.View;
import rsd.e;
import com.yxcorp.gifshow.music.utils.kottor.KotterKnifeKt;
import android.view.ViewGroup;
import i2b.a;
import com.kuaishou.live.core.show.activityredpacket.view.LiveNineImageView;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class LiveActivityRedPacketOutsideBottomTipView extends FrameLayout	// class@00098c
{
    public final p b;
    public final e c;
    public final e d;
    public final e e;
    public HashMap f;
    public static final n[] g;
    public static int h;
    public static int i;
    public static float j;
    public static final LiveActivityRedPacketOutsideBottomTipView$a k;

    static {
       n[] onArray = new n[]{m0.r(new PropertyReference1Impl(LiveActivityRedPacketOutsideBottomTipView.class, "contentTextView", "getContentTextView\(\)Landroid/widget/TextView;", 0)),m0.r(new PropertyReference1Impl(LiveActivityRedPacketOutsideBottomTipView.class, "leftIconView", "getLeftIconView\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0)),m0.r(new PropertyReference1Impl(LiveActivityRedPacketOutsideBottomTipView.class, "backGroundView", "getBackGroundView\(\)Lcom/kuaishou/live/core/show/activityredpacket/view/LiveNineImageView;", 0))};
       LiveActivityRedPacketOutsideBottomTipView.g = onArray;
       LiveActivityRedPacketOutsideBottomTipView.k = new LiveActivityRedPacketOutsideBottomTipView$a(null);
       LiveActivityRedPacketOutsideBottomTipView.h = -1;
       LiveActivityRedPacketOutsideBottomTipView.i = k.b("#8C000000");
       LiveActivityRedPacketOutsideBottomTipView.j = 20.00f;
    }
    public void LiveActivityRedPacketOutsideBottomTipView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void LiveActivityRedPacketOutsideBottomTipView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void LiveActivityRedPacketOutsideBottomTipView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = s.c(new LiveActivityRedPacketOutsideBottomTipView$defaultViewBgDrawable$2(this));
       this.c = KotterKnifeKt.a(this, 0x7f0a1859);
       this.d = KotterKnifeKt.a(this, 0x7f0a185a);
       this.e = KotterKnifeKt.a(this, 0x7f0a1858);
       a.d(this.getContext(), R.layout.arg_RES_7f0d09a5, this, true);
    }
    public final LiveNineImageView getBackGroundView(){
       Object obj = PatchProxy.apply(null, this, LiveActivityRedPacketOutsideBottomTipView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.a(this, LiveActivityRedPacketOutsideBottomTipView.g[2]);
    }
    public final TextView getContentTextView(){
       Object obj = PatchProxy.apply(null, this, LiveActivityRedPacketOutsideBottomTipView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.a(this, LiveActivityRedPacketOutsideBottomTipView.g[0]);
    }
    public final Drawable getDefaultBackgroundDrawable(){
       Object obj = PatchProxy.apply(null, this, LiveActivityRedPacketOutsideBottomTipView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getDefaultViewBgDrawable();
    }
    public final Drawable getDefaultViewBgDrawable(){
       Object obj = PatchProxy.apply(null, this, LiveActivityRedPacketOutsideBottomTipView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final KwaiImageView getLeftIconView(){
       Object obj = PatchProxy.apply(null, this, LiveActivityRedPacketOutsideBottomTipView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.a(this, LiveActivityRedPacketOutsideBottomTipView.g[1]);
    }
}
