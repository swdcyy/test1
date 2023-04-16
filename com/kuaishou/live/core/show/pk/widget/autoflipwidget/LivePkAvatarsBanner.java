package com.kuaishou.live.core.show.pk.widget.autoflipwidget.LivePkAvatarsBanner;
import androidx.viewpager.widget.ViewPager$i;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kuaishou.live.core.show.pk.widget.autoflipwidget.LivePkAvatarsViewPager;
import ge2.a;
import android.view.View$OnTouchListener;
import ge2.b;
import h3.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.pk.widget.autoflipwidget.LivePkAvatarsBanner$a;
import androidx.viewpager.widget.ViewPager;
import ge2.d;
import androidx.viewpager.widget.ViewPager$j;
import lnc.a1;
import com.kwai.framework.model.user.UserInfo;
import ekd.j;
import java.lang.Boolean;
import android.os.Handler;
import java.lang.Integer;
import com.kuaishou.live.core.show.pk.widget.autoflipwidget.LivePkAvatarsBanner$b;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public class LivePkAvatarsBanner extends RelativeLayout implements ViewPager$i	// class@000db4
{
    public int b;
    public LivePkAvatarsViewPager c;
    public Handler d;
    public UserInfo[] e;
    public String[] f;
    public LivePkAvatarsBanner$b g;
    public int h;
    public boolean i;
    public boolean j;

    public void LivePkAvatarsBanner(Context p0){
       super(p0, null);
    }
    public void LivePkAvatarsBanner(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void LivePkAvatarsBanner(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 1500;
       boolean b = false;
       this.i = b;
       if (PatchProxy.applyVoid(null, this, LivePkAvatarsBanner.class, "1")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d0cf3, this);
          LivePkAvatarsViewPager livePkAvatar = this.findViewById(R.id.live_pk_avatars_view_pager);
          this.c = livePkAvatar;
          this.b(livePkAvatar);
          this.setClipChildren(b);
          this.setOnTouchListener(new a(this));
          if (!PatchProxy.applyVoid(null, this, LivePkAvatarsBanner.class, "8")) {
             this.d = new b(this);
          }
       }
       return;
    }
    public a a(Object[] p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LivePkAvatarsBanner.class, "17");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new LivePkAvatarsBanner$a(this);
    }
    public void b(LivePkAvatarsViewPager p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePkAvatarsBanner.class, "2")) {
          return;
       }
       p0.setOffscreenPageLimit(3);
       p0.setAvatarScrollerDuration(500);
       p0.setPageTransformer(true, new d());
       p0.addOnPageChangeListener(this);
       p0.setPageMargin(0);
       p0.setClipChildren(0);
       this.setAvatarsViewPaterHorizontalMargin(a1.e(14.00f));
       p0.setPadding(0, 0, 0, 0);
       return;
    }
    public void c(UserInfo[] p0,String[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePkAvatarsBanner.class, "5")) {
          return;
       }
       this.e = p0;
       this.f = p1;
       if (!j.h(p0)) {
          this.setAvatarsViewPagerAdapter(this.e);
       }else if(!j.h(this.f)){
          this.setAvatarsViewPagerAdapter(this.f);
       }
       return;
    }
    public void e(boolean p0,ViewPager$j p1){
       if (PatchProxy.isSupport(LivePkAvatarsBanner.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, LivePkAvatarsBanner.class, "4")) {
          return;
       }
       this.c.setPageTransformer(p0, p1);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LivePkAvatarsBanner.class, "6")) {
          return;
       }
       LivePkAvatarsBanner td = this.d;
       if (td != null) {
          td.removeMessages(0);
          this.d.sendEmptyMessageDelayed(0, (long)this.getBannerIntervalMs());
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, LivePkAvatarsBanner.class, "11")) {
          return;
       }
       LivePkAvatarsBanner td = this.d;
       if (td != null) {
          td.removeMessages(0);
       }
       this.i = false;
       return;
    }
    public int getBannerIntervalMs(){
       return this.b;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LivePkAvatarsBanner.class, "13")) {
          return;
       }
       super.onAttachedToWindow();
       this.f();
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LivePkAvatarsBanner.class, "14")) {
          return;
       }
       super.onDetachedFromWindow();
       this.g();
       this.i = false;
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LivePkAvatarsBanner.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LivePkAvatarsBanner.class, "7")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (!PatchProxy.applyVoid(null, this, LivePkAvatarsBanner.class, "12") && (this.getChildCount() > 0 && this.i == null)) {
          this.i = true;
          this.c.beginFakeDrag();
          LivePkAvatarsBanner tc = this.c;
          float f = (this.j != null)? 0xbf800000: (float)((- this.getWidth()) / 3);
          tc.fakeDragBy(f);
          this.c.endFakeDrag();
       }
    label_0071 :
       return;
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       if (PatchProxy.isSupport(LivePkAvatarsBanner.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LivePkAvatarsBanner.class, "15")) {
          return;
       }
       LivePkAvatarsBanner tg = this.g;
       if (tg != null) {
          LivePkAvatarsBanner th = this.h;
          if (th > null) {
             tg.b((p0 % th));
          }
       }
       return;
    }
    public final void setAvatarsViewPagerAdapter(Object[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePkAvatarsBanner.class, "16")) {
          return;
       }
       this.h = p0.length;
       this.c.setAdapter(this.a(p0));
       this.c.setCurrentItem(((p0.length + 500) - (500 % p0.length)), true);
       this.f();
       return;
    }
    public void setAvatarsViewPaterHorizontalMargin(int p0){
       if (PatchProxy.isSupport(LivePkAvatarsBanner.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LivePkAvatarsBanner.class, "3")) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-1, -1);
       layoutParams.setMargins(p0, 0, p0, 0);
       this.c.setLayoutParams(layoutParams);
       return;
    }
    public void setBannerCallback(LivePkAvatarsBanner$b p0){
       this.g = p0;
    }
    public void setBannerIntervalMs(int p0){
       if (p0 > 0) {
          this.b = p0;
       }
       return;
    }
    public void setEnableFirstFrameFreeze(boolean p0){
       this.j = p0;
    }
}
