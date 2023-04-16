package com.kuaishou.live.core.basic.widget.LiveHourlyRankAvatarRotateView;
import android.widget.FrameLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.util.LinkedList;
import com.kuaishou.live.core.basic.widget.c;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Integer;
import android.widget.ImageView;
import java.lang.Float;
import android.animation.ValueAnimator;
import java.lang.Runnable;
import ekd.k1;

public class LiveHourlyRankAvatarRotateView extends FrameLayout	// class@000904
{
    public final LinkedList b;
    public final Runnable c;
    public KwaiImageView d;
    public KwaiImageView e;
    public KwaiImageView f;
    public int g;
    public int h;
    public boolean i;
    public ValueAnimator j;
    public static final int k;

    static {
       LiveHourlyRankAvatarRotateView.k = a1.d(0x7f07025d);
    }
    public void LiveHourlyRankAvatarRotateView(Context p0){
       super(p0, null);
    }
    public void LiveHourlyRankAvatarRotateView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveHourlyRankAvatarRotateView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new LinkedList();
       this.c = new c(this);
       a.k(this, R.layout.arg_RES_7f0d0c2c, true);
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankAvatarRotateView.class, "4")) {
       }else {
          this.d = m1.f(this, 0x7f0a202d);
          this.e = m1.f(this, 0x7f0a202c);
          this.f = m1.f(this, 0x7f0a202e);
          this.setChildrenDrawingOrderEnabled(true);
       }
       return;
    }
    public void a(View p0,int p1){
       if (PatchProxy.isSupport(LiveHourlyRankAvatarRotateView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveHourlyRankAvatarRotateView.class, "9")) {
          return;
       }
       p0.setZ((float)p1);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankAvatarRotateView.class, "7")) {
          return;
       }
       this.a(this.d, 1);
       this.a(this.e, 2);
       this.a(this.f, 0);
       this.c(this.d, this.e, this.f);
       return;
    }
    public void c(KwaiImageView p0,KwaiImageView p1,KwaiImageView p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveHourlyRankAvatarRotateView.class, "6")) {
          return;
       }
       p0.setScaleX(0x3f800000);
       p0.setScaleY(0x3f800000);
       p0.setAlpha(0.40f);
       p0.setTranslationX(0);
       p1.setScaleX(0x3fa66666);
       p1.setScaleY(0x3fa66666);
       p1.setAlpha(0x3f800000);
       int k = LiveHourlyRankAvatarRotateView.k;
       p1.setTranslationX((float)k);
       p2.setScaleX(0x3f800000);
       p2.setScaleY(0x3f800000);
       p2.setAlpha(0.40f);
       p2.setTranslationX((float)(k * 2));
       return;
    }
    public final void d(View p0,float p1){
       if (PatchProxy.isSupport(LiveHourlyRankAvatarRotateView.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, LiveHourlyRankAvatarRotateView.class, "8")) {
          return;
       }
       p0.setScaleX(p1);
       p0.setScaleY(p1);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankAvatarRotateView.class, "3")) {
          return;
       }
       LiveHourlyRankAvatarRotateView tj = this.j;
       if (tj != null && tj.isRunning()) {
          this.j.cancel();
          this.i = true;
       }
       k1.m(this.c);
       return;
    }
}
