package com.yxcorp.gifshow.detail.view.SlidePlayVideoLoadingProgressBarV2$a;
import joc.z;
import com.yxcorp.gifshow.detail.view.SlidePlayVideoLoadingProgressBarV2;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.detail.view.SlidePlayVideoLoadingProgressBarV2$b;

public class SlidePlayVideoLoadingProgressBarV2$a extends z	// class@001a6b
{
    public final SlidePlayVideoLoadingProgressBarV2 e;

    public void SlidePlayVideoLoadingProgressBarV2$a(SlidePlayVideoLoadingProgressBarV2 p0){
       this.e = p0;
       super();
    }
    public boolean d(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, SlidePlayVideoLoadingProgressBarV2$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       int actionMasked = p1.getActionMasked();
       if (!actionMasked) {
          SlidePlayVideoLoadingProgressBarV2$a te = this.e;
          Objects.requireNonNull(te);
          if (!PatchProxy.applyVoidOneRefs(p1, te, SlidePlayVideoLoadingProgressBarV2.class, "3")) {
             te.o = (int)p1.getX();
             te.p = (int)p1.getY();
             te.s = false;
             if (te.u != null && te.h(p1)) {
                te.u.c();
             }
          }
       }else if(actionMasked == 2){
          this.e.g(p1);
       }else if(actionMasked == 1 || actionMasked == 3){
          this.e.i();
       }
       return this.e.s;
    }
    public boolean f(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, SlidePlayVideoLoadingProgressBarV2$a.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       SlidePlayVideoLoadingProgressBarV2$a te = this.e;
       if (te.q == null) {
          te.g(p1);
       }
       int actionMasked = p1.getActionMasked();
       if (actionMasked == 1 || actionMasked == 3) {
          this.e.i();
       }
       return false;
    }
}
