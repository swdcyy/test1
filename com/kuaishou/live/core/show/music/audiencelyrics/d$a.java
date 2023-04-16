package com.kuaishou.live.core.show.music.audiencelyrics.d$a;
import qc2.a;
import com.kuaishou.live.core.show.music.audiencelyrics.d;
import java.lang.Object;
import android.graphics.PointF;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import java.lang.Integer;
import android.widget.RelativeLayout;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.View;
import android.animation.TimeInterpolator;
import android.animation.AnimatorSet;
import ekd.f;
import android.animation.Animator;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LyricsMode;
import com.kuaishou.live.core.show.music.audiencelyrics.view.ConstraintType;
import java.lang.Boolean;
import qc2.s;

public class d$a implements a	// class@000d2f
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(PointF p0){
       this.a.y = p0;
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, d$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f07087b);
    }
    public void c(int p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       d t = this.a.t;
       if (t != null && !t.getVisibility()) {
          float translationY = this.a.t.getTranslationY();
          f.e(this.a.t, translationY, (translationY + (float)p0), 30, new AccelerateDecelerateInterpolator()).start();
       }
       return;
    }
    public void d(int p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       d t = this.a.t;
       if (t != null && !t.getVisibility()) {
          float translationY = this.a.t.getTranslationY();
          f.e(this.a.t, translationY, (translationY - (float)p0), 30, new AccelerateDecelerateInterpolator()).start();
       }
       return;
    }
    public void e(LyricsMode p0,ConstraintType p1,PointF p2,boolean p3){
       if (PatchProxy.isSupport(d$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, d$a.class, "3")) {
          return;
       }
       if (!p3) {
          d t = this.a.t;
          if (t != null && !t.getVisibility()) {
             return;
          }
       }
       d$a ta = this.a;
       ta.z = p2;
       ta.B = p1;
       ta.A = p0;
       ta.P8();
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "6")) {
          return;
       }
       d$a ta = this.a;
       ta.N.b = false;
       ta.W8();
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "5")) {
          return;
       }
       d$a ta = this.a;
       ta.N.b = true;
       ta.W8();
       return;
    }
}
