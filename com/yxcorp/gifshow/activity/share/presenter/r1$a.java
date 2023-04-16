package com.yxcorp.gifshow.activity.share.presenter.r1$a;
import com.kwai.library.widget.layout.DraggedFrameLayout$b;
import com.yxcorp.gifshow.activity.share.presenter.r1;
import java.lang.Object;
import com.yxcorp.gifshow.activity.share.presenter.p1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.activity.share.presenter.c0;
import com.yxcorp.gifshow.activity.share.widget.DragPreviewContainer;
import android.view.View;
import com.yxcorp.gifshow.activity.share.player.PreviewPlayer;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.util.Objects;
import com.kwai.video.editorsdk2.PreviewTextureView;
import android.graphics.Bitmap;
import android.view.TextureView;
import android.widget.ImageView;
import java.lang.Float;
import android.app.Activity;
import com.yxcorp.utility.n;
import java.lang.Math;
import f66.i;
import jq.a;
import q87.c;
import com.daimajia.easing.Skill;
import android.animation.ValueAnimator;
import com.daimajia.easing.BaseEasingMethod$EasingListener;
import com.daimajia.easing.Glider;
import zw8.b3;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import zw8.o3;
import android.animation.Animator$AnimatorListener;

public class r1$a implements DraggedFrameLayout$b	// class@001429
{
    public final r1 a;

    public void r1$a(r1 p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       c0 q;
       p1 op1 = p1.class;
       r1$a uoa = r1$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       int currentState = this.a.s.getCurrentState();
       int i = 1;
       if (p1 <= 0 || (!currentState || currentState == i)) {
          if (!currentState) {
             this.a.s.setCurrentState(i);
             q = this.a.q;
             if (q != null && q.b() instanceof VideoSDKPlayerView) {
                this.a.q.b().pause();
                q = this.a.R;
                Objects.requireNonNull(q);
                if (!PatchProxy.applyVoid(null, q, op1, "30")) {
                   p1 s = q.s;
                   if (s != null && s.b() instanceof VideoSDKPlayerView) {
                      Bitmap bitmap = q.s.b().getPreviewView().getBitmap();
                      if (bitmap != null) {
                         q.o.setImageBitmap(bitmap);
                         q.l = (float)bitmap.getWidth();
                         q.m = (float)bitmap.getHeight();
                      }
                   }
                }
             }
          }
          q = this.a.R;
          float f = (float)p0;
          float f1 = (float)p1;
          Objects.requireNonNull(q);
          if (!PatchProxy.isSupport(op1) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f), Float.valueOf(f1), q, op1, "19")) {
             q.n();
             q.o.setVisibility(0);
             op1 = q.s;
             if (op1 != null && op1.b() instanceof VideoSDKPlayerView) {
                q.s.b().pause();
             }
             float f2 = (float)n.j(q.q);
             q.a = f;
             q.o.setTranslationX(f);
             q.b = f1;
             q.o.setTranslationY(f1);
             if (q.b >= 0) {
                f1 = Math.min(f1, (f2 / 2.00f));
                float f3 = 0x3f800000 - (((Math.abs(f1) * 2.00f) / f2) * 0.30f);
                q.c = f3;
                f = q.l * f3;
                q.r(f, (f3 * q.m), 0);
                q.d(f1);
             }
          }
       }
    label_0113 :
       return;
    }
    public void b(int p0,int p1,float p2){
       if (PatchProxy.isSupport(r1$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Float.valueOf(p2), this, r1$a.class, "2")) {
          return;
       }
       p0 = n.j(this.a.x) / 5;
       if (p2 - 0x44960000 > 0 || p1 > p0) {
          this.a.R.o();
       }else {
          c0 r = this.a.R;
          Objects.requireNonNull(r);
          if (!PatchProxy.applyVoid(null, r, p1.class, "20")) {
             Object[] objArray = new Object[0];
             a.b().w("SharePreviewAnimation", "releaseDragToPreview", objArray);
             float f = (float)n.j(r.q);
             int i = 0;
             if (r.a - i || r.b - i) {
                BaseEasingMethod$EasingListener[] uEasingListe = new BaseEasingMethod$EasingListener[0];
                ValueAnimator valueAnimato = Glider.glide(Skill.CubicEaseIn, 250.00f, ValueAnimator.ofFloat(new float[2]{0x3f800000,0}), uEasingListe);
                valueAnimato.addUpdateListener(new b3(r, f));
                valueAnimato.setDuration(250);
                valueAnimato.addListener(new o3(r));
                valueAnimato.start();
             }
          }
       }
       this.a.s.setCurrentState(0);
       return;
    }
    public long c(){
       return 0;
    }
}
