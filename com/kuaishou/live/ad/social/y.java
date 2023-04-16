package com.kuaishou.live.ad.social.y;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.ImageView;
import tkd.b;
import tkd.d;
import os5.d;
import com.airbnb.lottie.LottieAnimationViewCopy;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.kuaishou.live.ad.social.LiveAdConversionTaskDetail$ControlInfo;
import crd.b;
import lnc.b9;
import com.kuaishou.live.ad.social.y$a;
import android.animation.Animator$AnimatorListener;
import com.airbnb.lottie.LottieAnimationView;
import os5.l;

public class y	// class@000a2a
{
    public View a;
    public LottieAnimationViewCopy b;
    public ImageView c;
    public b d;
    public boolean e;
    public int f;
    public boolean g;

    public void y(){
       super();
       this.e = false;
       this.f = 4000;
    }
    public void a(View p0){
       y oy = y.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oy, "1")) {
          return;
       }
       this.a = m1.f(p0, 0x7f0a1bc2);
       this.c = m1.f(p0, 0x7f0a1bc3);
       if (!PatchProxy.applyVoid(null, this, oy, "2")) {
          this.c.setImageResource(d.a(-2004767397).Rg(0));
       }
       this.b = m1.f(p0, 0x7f0a1bc0);
       this.a.setBackground(a1.f(R.drawable.arg_RES_7f0810dd));
       return;
    }
    public boolean b(){
       return this.g;
    }
    public void c(LiveAdConversionTaskDetail$ControlInfo p0){
       int i;
       this.e = p0.mNeedEntranceAnimation;
       p0 = p0.mAnimationReplayIntervalMs;
       if (p0 == null) {
          i = 4000;
       }
       this.f = i;
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, y.class, "4")) {
          return;
       }
       if (this.c != null && this.b != null) {
          if (this.e != null && !this.b()) {
             b9.a(this.d);
             this.c.setVisibility(8);
             this.b.setVisibility(0);
             this.b.a(new y$a(this));
             this.b.setAnimationFromUrl(d.a(-1492894991).uP("/udata/pkg/kwai-client-image/live_bottom_bar/live_conversion_task_bell_anim.json"));
             this.b.s();
          }else {
             this.e();
          }
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, y.class, "6")) {
          return;
       }
       y tc = this.c;
       if (tc != null && this.b != null) {
          tc.setVisibility(0);
          this.b.setVisibility(8);
          this.b.t();
          this.b.f();
          b9.a(this.d);
       }
       return;
    }
}
