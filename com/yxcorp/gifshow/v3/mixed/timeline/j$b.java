package com.yxcorp.gifshow.v3.mixed.timeline.j$b;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment$c;
import com.yxcorp.gifshow.v3.mixed.timeline.j;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.v3.mixed.model.b;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;
import java.lang.Double;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTranslationIndicators;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect$a;
import android.widget.RelativeLayout;
import android.view.View;
import android.widget.ImageView;
import hwc.c;
import java.lang.Integer;
import android.widget.Button;

public class j$b implements TransitionEffectFragment$c	// class@00156f
{
    public final j a;

    public void j$b(j p0){
       this.a = p0;
       super();
    }
    public void a(TransitionEffect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$b.class, "2")) {
          return;
       }
       j x = this.a.x;
       Objects.requireNonNull(x);
       if (!PatchProxy.applyVoidOneRefs(p0, x, b.class, "19") && x.c != p0) {
          x.c = p0;
          x.o0(p0);
          x.i.setValue(Boolean.TRUE);
          x.o.setValue(Double.valueOf(x.p0()));
       }
       this.f();
       Object[] objArray = new Object[0];
       a.D().w("MixImport", "回滚选择转场 "+p0, objArray);
       return;
    }
    public void b(TransitionEffect p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(j$b.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, j$b.class, "3")) {
          return;
       }
       this.f();
       j$b ta = this.a;
       j w = ta.w;
       b c = ta.x.c;
       Objects.requireNonNull(w);
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(c, w, MixTranslationIndicators.class, "3")) {
          if (c == TransitionEffect.Companion.b()) {
             w.setVisibility(4);
          }else {
             for (int i1 = 0; i1 < w.d; i1++) {
                w.getChildAt(i1).setImageResource(c.getMIndicatorRes());
             }
             w.setVisibility(i);
             w.a();
          }
       }
       Object[] objArray = new Object[i];
       a.D().w("MixImport", "确认选择转场 ", objArray);
       return;
    }
    public void c(TransitionEffect p0,boolean p1){
       j$b uob = j$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "4")) {
          return;
       }
       this.d(p0, p1);
       return;
    }
    public void d(TransitionEffect p0,boolean p1){
       j$b uob = j$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       j x = this.a.x;
       Objects.requireNonNull(x);
       if (!PatchProxy.applyVoidOneRefs(p0, x, b.class, "18")) {
          if (x.c == p0) {
             x.r0();
          }else {
             x.c = p0;
             x.o0(p0);
             x.i.setValue(Boolean.TRUE);
             x.o.setValue(Double.valueOf(x.p0()));
             x.r0();
          }
       }
       int mSdkId = p0.getMSdkId();
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mSdkId), null, uoc, "2")) {
          c.b("select_transition", mSdkId);
       }
       Object[] objArray = new Object[0];
       a.D().w("MixImport", "选择转场 "+p0, objArray);
       return;
    }
    public void e(boolean p0,boolean p1,int p2){
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, j$b.class, "5")) {
          return;
       }
       this.a.q.setVisibility(0);
       this.a.r.setEnabled(true);
       this.a.s.setEnabled(true);
       this.a.t.setEnabled(true);
       this.a.x.q0();
       this.a.x.p.setValue(Boolean.FALSE);
       return;
    }
}
