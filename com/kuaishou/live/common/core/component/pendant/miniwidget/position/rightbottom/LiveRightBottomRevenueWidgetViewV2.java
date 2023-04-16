package com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.LiveRightBottomRevenueWidgetViewV2;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.LiveRightBottomRevenueWidgetBaseView;
import android.content.Context;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import java.util.HashSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.FrameLayout;
import com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.LiveMiniWidgetContainerView;
import yv1.y;
import android.view.View$OnClickListener;
import android.widget.TextView;
import yv1.w;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import yv1.x;
import android.view.ViewOutlineProvider;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.b;
import java.lang.Runnable;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Integer;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import aw1.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import k2b.u1;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.LiveRightBottomRevenueWidgetViewV2$a;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.LiveRightBottomRevenueWidgetBaseView$a;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.LiveRightBottomRevenueWidgetBaseView$b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import java.lang.Number;
import lv1.e;
import com.kuaishou.live.common.gzone.pendant.LiveScaleFrameLayout;

public class LiveRightBottomRevenueWidgetViewV2 extends LiveRightBottomRevenueWidgetBaseView	// class@00170b
{
    public boolean h;
    public int i;
    public ViewGroup j;
    public ViewGroup k;
    public TextView l;
    public ViewGroup m;
    public ViewGroup n;
    public TextView o;
    public ViewGroup p;
    public KwaiImageView q;
    public TextView r;
    public ImageView s;
    public LiveMiniWidgetContainerView t;
    public ClientContent$LiveStreamPackage u;
    public e0 v;
    public HashSet w;
    public LiveRightBottomRevenueWidgetBaseView$a x;
    public LiveRightBottomRevenueWidgetBaseView$b y;
    public static boolean z = true;

    public void LiveRightBottomRevenueWidgetViewV2(Context p0,ClientContent$LiveStreamPackage p1,e0 p2,boolean p3,int p4){
       super(p0);
       this.h = true;
       this.w = new HashSet();
       this.u = p1;
       this.v = p2;
       this.i = p4;
       if (!PatchProxy.isSupport(LiveRightBottomRevenueWidgetViewV2.class) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p3), this, LiveRightBottomRevenueWidgetViewV2.class, "1")) {
          a.c(p0, R.layout.arg_RES_7f0d0a8d, this);
          if (!PatchProxy.applyVoid(null, this, LiveRightBottomRevenueWidgetViewV2.class, "8")) {
             this.j = this.findViewById(0x7f0a1881);
             this.t = this.findViewById(0x7f0a1876);
             ViewGroup viewGroup = this.findViewById(R.id.live_activity_widget_scale_button_container);
             this.k = viewGroup;
             viewGroup.setOnClickListener(new y(this));
             this.l = this.findViewById(0x7f0a1884);
             viewGroup = this.findViewById(R.id.live_activity_widget_shrink_container);
             this.m = viewGroup;
             viewGroup.setOnTouchListener(new w(this));
             this.n = this.findViewById(0x7f0a187f);
             this.o = this.findViewById(0x7f0a1880);
             this.p = this.findViewById(0x7f0a187d);
             this.r = this.findViewById(0x7f0a187e);
             this.q = this.findViewById(0x7f0a187b);
             this.s = this.findViewById(0x7f0a187c);
             this.findViewById(R.id.live_activity_widget_scale_button_view).setImageResource(R.drawable.arg_RES_7f0810a1);
             this.s.setImageResource(R.drawable.arg_RES_7f0810a3);
             this.d();
          }
          int i = 0;
          this.j.setPadding(i, i, a1.e(11.00f), i);
          if (p3) {
             p0.width = a1.e(112.00f);
             p0.height = a1.e(151.00f);
             p0.width = a1.e(112.00f);
             p0.height = a1.e(172.00f);
             this.s.setVisibility(i);
          }else {
             p0.width = a1.e(104.00f);
             p0.height = a1.e(76.00f);
             p0.width = a1.e(104.00f);
             p0.height = a1.e(97.00f);
             this.s.setVisibility(8);
          }
          if (this.i == 2) {
             this.q.setClipToOutline(true);
             this.q.setOutlineProvider(new x(this));
          }
          if (this.g(LiveRightBottomRevenueWidgetViewV2.z)) {
             this.post(new b(this));
          }
       }
       return;
    }
    public void b(boolean p0){
       if (PatchProxy.isSupport(LiveRightBottomRevenueWidgetViewV2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveRightBottomRevenueWidgetViewV2.class, "16")) {
          return;
       }
       this.e(p0, true);
       return;
    }
    public void c(String p0,int p1,UserInfos$PicUrl[] p2,String p3){
       i3 oi3;
       String str;
       ClientContent$ContentPackage uContentPack;
       ClientContent$MoreInfoPackageV2 moreInfoPack;
       if (PatchProxy.isSupport(LiveRightBottomRevenueWidgetViewV2.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, LiveRightBottomRevenueWidgetViewV2.class, "3")) {
          return;
       }
       ClientEvent$ElementPackage obj = null;
       CDNUrl[] uCDNUrlArray = (p2 != null && p2.length > 0)? e0.i(p2): obj;
       LiveRightBottomRevenueWidgetBaseView liveRightBot = 8;
       int i = 0;
       if (uCDNUrlArray != null && uCDNUrlArray.length > 0) {
          if (!PatchProxy.applyVoidTwoRefs(p3, uCDNUrlArray, this, LiveRightBottomRevenueWidgetViewV2.class, "5") && uCDNUrlArray.length) {
             this.p.setVisibility(i);
             this.n.setVisibility(liveRightBot);
             this.q.U(uCDNUrlArray);
             LiveRightBottomRevenueWidgetViewV2 tr = this.r;
             String str1 = PatchProxy.applyOneRefs(p3, this, LiveRightBottomRevenueWidgetViewV2.class, "7");
             if (str1 != PatchProxyResult.class) {
             }else if(TextUtils.isEmpty(p3)){
                str1 = "";
             }else {
                str1 = TextUtils.join("\n", p3.split(""));
             }
             tr.setText(str1);
          }
       }else if(PatchProxy.isSupport(LiveRightBottomRevenueWidgetViewV2.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveRightBottomRevenueWidgetViewV2.class, "4")){
          this.n.setVisibility(i);
          this.p.setVisibility(liveRightBot);
          this.o.setText(p0);
          this.f(this.n, p1);
       }
       if (!PatchProxy.isSupport(LiveRightBottomRevenueWidgetViewV2.class) || !PatchProxy.applyVoidThreeRefs(p3, p0, Integer.valueOf(p1), this, LiveRightBottomRevenueWidgetViewV2.class, "6")) {
          if (!TextUtils.isEmpty(p3)) {
             this.l.setText(p3);
          }else {
             this.l.setText(p0);
          }
          this.f(this.k, p1);
       }
       if (this.g != null && this.w.add(this.d)) {
          LiveRightBottomRevenueWidgetViewV2 tv = this.v;
          LiveRightBottomRevenueWidgetViewV2 tu = this.u;
          LiveRightBottomRevenueWidgetBaseView td = this.d;
          LiveRightBottomRevenueWidgetBaseView te = this.e;
          liveRightBot = this.f;
          LiveRightBottomRevenueWidgetViewV2 th = this.h;
          b uob = b.class;
          if (PatchProxy.isSupport(uob)) {
             Object[] objArray = new Object[]{tv,tu,td,te,Boolean.valueOf(liveRightBot),Boolean.valueOf(th)};
             if (!PatchProxy.applyVoid(objArray, obj, uob, "1")) {
             }
          }else {
          }
       }
    label_0148 :
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiveRightBottomRevenueWidgetViewV2.class, "10")) {
          return;
       }
       this.t.setOutlineProvider(new LiveRightBottomRevenueWidgetViewV2$a(this));
       this.t.setClipToOutline(true);
       return;
    }
    public void e(boolean p0,boolean p1){
       LiveRightBottomRevenueWidgetViewV2 tv;
       LiveRightBottomRevenueWidgetViewV2 tu;
       ClientEvent$ElementPackage uElementPack;
       i3 oi3;
       String str1;
       ClientContent$ContentPackage uContentPack;
       ClientContent$MoreInfoPackageV2 moreInfoPack;
       if (PatchProxy.isSupport(LiveRightBottomRevenueWidgetViewV2.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, LiveRightBottomRevenueWidgetViewV2.class, "14")) {
          return;
       }
       if (!this.g(p0)) {
          return;
       }
       if (this.g != null) {
          tv = this.v;
          tu = this.u;
          LiveRightBottomRevenueWidgetBaseView td = this.d;
          LiveRightBottomRevenueWidgetBaseView te = this.e;
          LiveRightBottomRevenueWidgetBaseView tf = this.f;
          int i = this.h ^ 1;
          String str = (p1)? "COMMON_DOUBLE": "EXPAND_AREA";
          b uob = b.class;
          if (PatchProxy.isSupport(uob)) {
             Object[] objArray = new Object[]{tv,tu,td,te,Boolean.valueOf(tf),Boolean.valueOf(i),str};
             if (!PatchProxy.applyVoid(objArray, null, uob, "2")) {
             }
          }else {
          }
       }
    label_00a1 :
       tv = this.h;
       tu = this.x;
       if (tu != null) {
          tu.a(tv);
       }
       tu = this.y;
       if (tu != null) {
          tu.a(tv, p1);
       }
       return;
    }
    public final void f(ViewGroup p0,int p1){
       Drawable background;
       if (PatchProxy.isSupport(LiveRightBottomRevenueWidgetViewV2.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveRightBottomRevenueWidgetViewV2.class, "9")) {
          return;
       }
       if (p0 == null) {
          b.Z(LiveLogTag.LIVE_RIFHT_BOTTOM_MINI_WIDGET, "set background error : ScaleContainer is null");
          return;
       }else {
          background = p0.getBackground();
          if (background instanceof GradientDrawable) {
             background.setColor(p1);
             if (this.i == 2) {
                background.setCornerRadius((float)a1.e(4.00f));
             }
          }else {
             b.Z(LiveLogTag.LIVE_RIFHT_BOTTOM_MINI_WIDGET, "set background error : getBackground error");
          }
          return;
       }
    }
    public boolean g(boolean p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(LiveRightBottomRevenueWidgetViewV2.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, LiveRightBottomRevenueWidgetViewV2.class, "13");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if (this.h == p0) {
          return false;
       }else {
          this.h = p0;
          Object[] objArray = null;
          if (p0) {
             if (!PatchProxy.applyVoid(objArray, this, LiveRightBottomRevenueWidgetViewV2.class, "11")) {
                this.j.setPadding(false, false, a1.e(11.00f), false);
                this.t.setVisibility(false);
                this.k.setVisibility(false);
                this.m.setVisibility(8);
             }
          }else if(PatchProxy.applyVoid(objArray, this, LiveRightBottomRevenueWidgetViewV2.class, "12")){
             LiveRightBottomRevenueWidgetViewV2 tj = this.j;
             Object obj1 = PatchProxy.apply(objArray, this, LiveRightBottomRevenueWidgetViewV2.class, "15");
             if (obj1 != patchProxyRe) {
                i = obj1.intValue();
             }else if(this.i == 2){
                i = a1.e(14.00f);
             }else {
                i = 0;
             }
             tj.setPadding(false, false, i, false);
             this.t.setVisibility(8);
             this.k.setVisibility(8);
             this.m.setVisibility(false);
          }
          LiveRightBottomRevenueWidgetViewV2.z = this.h;
          return true;
       }
    }
    public int getAppointedHeight(){
       LiveRightBottomRevenueWidgetViewV2 obj = PatchProxy.apply(null, this, LiveRightBottomRevenueWidgetViewV2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.j;
       if (obj != null) {
          if (obj.getHeight() > 0) {
             return this.j.getHeight();
          }else {
             int i = e.b(this.j, true);
             if (i > 0) {
                return (int)((float)i * this.getScale());
             }
          }
       }
       return 0;
    }
    public LiveMiniWidgetContainerView getContentContainer(){
       return this.t;
    }
    public int getCurrentScaleState(){
       return this.h;
    }
    public View getRootContainer(){
       return this.j;
    }
    public void setScaleAreaClickListener(LiveRightBottomRevenueWidgetBaseView$a p0){
       this.x = p0;
    }
    public void setScaleStateChangeListener(LiveRightBottomRevenueWidgetBaseView$b p0){
       this.y = p0;
    }
}
