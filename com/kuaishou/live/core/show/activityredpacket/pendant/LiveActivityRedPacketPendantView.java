package com.kuaishou.live.core.show.activityredpacket.pendant.LiveActivityRedPacketPendantView;
import vw1.b;
import ml8.d;
import android.widget.FrameLayout;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import java.util.List;
import po3.a;
import android.content.Context;
import java.util.ArrayList;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.show.activityredpacket.pendant.LiveActivityRedPacketPendantView$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.CDNUrl;
import android.graphics.drawable.Drawable;
import com.kuaishou.android.live.log.b;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.StringBuilder;
import tw1.g;
import com.kuaishou.live.core.show.activityredpacket.pendant.LiveActivityRedPacketPendantView$a;
import ub.b;
import z12.x;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import yb7.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.TextView;
import android.graphics.drawable.GradientDrawable$Orientation;
import d61.h;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import vw1.a;
import java.lang.Integer;
import java.util.Iterator;
import java.lang.Boolean;

public class LiveActivityRedPacketPendantView extends FrameLayout implements b, d	// class@00096c
{
    public KwaiImageView b;
    public LiveUserView c;
    public TextView d;
    public TextView e;
    public boolean f;
    public boolean g;
    public boolean h;
    public List i;
    public static final List j;

    static {
       LiveActivityRedPacketPendantView.j = a.a(LiveLogTag.ACTIVITY_LEEE, "PendantView");
    }
    public void LiveActivityRedPacketPendantView(Context p0,int p1){
       super(p0);
       this.i = new ArrayList();
       a.k(this, p1, true);
       this.doBindView(this);
       this.setClipChildren(false);
       this.setClipChildren(false);
    }
    public void a(LiveActivityRedPacketPendantView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketPendantView.class, "3")) {
          return;
       }
       this.i.add(p0);
       return;
    }
    public void b(CDNUrl[] p0,CDNUrl[] p1,Drawable p2,String[] p3,String p4,String p5){
       int i = 1;
       if (PatchProxy.isSupport(LiveActivityRedPacketPendantView.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, LiveActivityRedPacketPendantView.class, "1")) {
             return;
          }
       }
       b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "bindViewTheme");
       Drawable uDrawable = (this.g != null)? a1.f(R.drawable.arg_RES_7f08143c): a1.f(R.drawable.arg_RES_7f08130d);
       this.b.setPlaceHolderImage(uDrawable);
       b.P(LiveActivityRedPacketPendantView.j, "pendant bind background start, url = "+g.a(p0));
       this.b.a0(p0, new LiveActivityRedPacketPendantView$a(this, p0));
       this.c.setPlaceHolderImage(p2);
       this.c.U(p1);
       this.c.setBorderColor(x.z(p5));
       if (this.g != null) {
          if (a.c(p3) || TextUtils.isEmpty(p4)) {
             i = false;
          }
          this.f = i;
          if (i) {
             this.d.setVisibility(0);
             this.d.setBackground(h.b(a1.e(7.00f), GradientDrawable$Orientation.LEFT_RIGHT, x.y(p3)));
             this.d.setTextColor(x.z(p4));
          }else {
             this.d.setVisibility(8);
          }
       }else {
          this.f = i;
          this.d.setVisibility(0);
       }
       return;
    }
    public void c(LiveActivityRedPacketPendantView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketPendantView.class, "4")) {
          return;
       }
       this.i.remove(p0);
       return;
    }
    public void d(){
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketPendantView.class, "11")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a1837);
       this.c = m1.f(p0, 0x7f0a183e);
       this.d = m1.f(p0, 0x7f0a183f);
       this.e = m1.f(p0, 0x7f0a1839);
       return;
    }
    public void e(){
       a.b(this);
    }
    public void f(){
       a.a(this);
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketPendantView.class, "8")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketPendantView.class, "5") && this.e != null) {
          if (TextUtils.isEmpty(p0)) {
             this.e.setVisibility(8);
          }else {
             this.e.setVisibility(0);
             this.e.setText(p0);
          }
       }
       return;
    }
    public void h(String p0,int p1){
       if (PatchProxy.isSupport(LiveActivityRedPacketPendantView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveActivityRedPacketPendantView.class, "2")) {
          return;
       }
       if (!TextUtils.isEmpty(p0) && (this.f == null || this.h != null)) {
          this.d.setVisibility(8);
          return;
       }else {
          this.d.setVisibility(0);
          this.d.setText(p0);
          this.d.setTextSize(0, (float)p1);
          return;
       }
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveActivityRedPacketPendantView.class, "9")) {
          return;
       }
       super.onAttachedToWindow();
       Iterator iterator = this.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().b();
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveActivityRedPacketPendantView.class, "10")) {
          return;
       }
       super.onDetachedFromWindow();
       Iterator iterator = this.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void setCurrentIsShowingEntryAnimation(boolean p0){
       if (PatchProxy.isSupport(LiveActivityRedPacketPendantView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveActivityRedPacketPendantView.class, "6")) {
          return;
       }
       this.h = p0;
       if (!PatchProxy.applyVoid(null, this, LiveActivityRedPacketPendantView.class, "7")) {
          if (this.h == null && (this.f == null || TextUtils.isEmpty(this.d.getText()))) {
             this.d.setVisibility(8);
          }else {
             this.d.setVisibility(0);
          }
       }
       return;
    }
    public void setSupportDisplayTextColorFromServer(boolean p0){
       this.g = p0;
    }
}
