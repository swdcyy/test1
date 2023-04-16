package com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabBottomTipView;
import android.widget.FrameLayout;
import vsd.n;
import kotlin.jvm.internal.PropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import nsd.m0;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabBottomTipView$a;
import nsd.u;
import d61.k;
import android.content.Context;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabBottomTipView$defaultViewBgDrawable$2;
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

public final class LiveActivityRedPacketGrabBottomTipView extends FrameLayout	// class@00097d
{
    public final p b;
    public final e c;
    public final e d;
    public HashMap e;
    public static final n[] f;
    public static int g;
    public static int h;
    public static float i;
    public static final LiveActivityRedPacketGrabBottomTipView$a j;

    static {
       n[] onArray = new n[]{m0.r(new PropertyReference1Impl(LiveActivityRedPacketGrabBottomTipView.class, "contentTextView", "getContentTextView\(\)Landroid/widget/TextView;", 0)),m0.r(new PropertyReference1Impl(LiveActivityRedPacketGrabBottomTipView.class, "backGroundView", "getBackGroundView\(\)Lcom/kuaishou/live/core/show/activityredpacket/view/LiveNineImageView;", 0))};
       LiveActivityRedPacketGrabBottomTipView.f = onArray;
       LiveActivityRedPacketGrabBottomTipView.j = new LiveActivityRedPacketGrabBottomTipView$a(null);
       LiveActivityRedPacketGrabBottomTipView.g = k.b("#FFFFE6AC");
       LiveActivityRedPacketGrabBottomTipView.h = k.b("#1A000000");
       LiveActivityRedPacketGrabBottomTipView.i = 20.00f;
    }
    public void LiveActivityRedPacketGrabBottomTipView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void LiveActivityRedPacketGrabBottomTipView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void LiveActivityRedPacketGrabBottomTipView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = s.c(new LiveActivityRedPacketGrabBottomTipView$defaultViewBgDrawable$2(this));
       this.c = KotterKnifeKt.a(this, 0x7f0a1847);
       this.d = KotterKnifeKt.a(this, 0x7f0a1846);
       a.d(this.getContext(), R.layout.arg_RES_7f0d09a3, this, true);
    }
    public final LiveNineImageView getBackGroundView(){
       Object obj = PatchProxy.apply(null, this, LiveActivityRedPacketGrabBottomTipView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.a(this, LiveActivityRedPacketGrabBottomTipView.f[1]);
    }
    public final TextView getContentTextView(){
       Object obj = PatchProxy.apply(null, this, LiveActivityRedPacketGrabBottomTipView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.a(this, LiveActivityRedPacketGrabBottomTipView.f[0]);
    }
    public final Drawable getDefaultBackgroundDrawable(){
       Object obj = PatchProxy.apply(null, this, LiveActivityRedPacketGrabBottomTipView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getDefaultViewBgDrawable();
    }
    public final Drawable getDefaultViewBgDrawable(){
       Object obj = PatchProxy.apply(null, this, LiveActivityRedPacketGrabBottomTipView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
}
