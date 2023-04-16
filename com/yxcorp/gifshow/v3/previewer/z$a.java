package com.yxcorp.gifshow.v3.previewer.z$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.v3.previewer.z;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import android.util.Pair;
import java.lang.Integer;
import mrd.a;
import uxb.i;
import uxb.l;

public class z$a extends AnimatorListenerAdapter	// class@001619
{
    public final boolean a;
    public final z b;

    public void z$a(z p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z$a.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       if (this.a == null) {
          z b = this.b.b;
          if (b.E1 != null) {
             b.c1.onNext(new Pair(this.b.b.E1, Integer.valueOf(2)));
             b.E1 = null;
          }
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z$a.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       l.e().fC();
       if (this.a == null) {
          z b = this.b.b;
          if (b.E1 != null) {
             b.c1.onNext(new Pair(this.b.b.E1, Integer.valueOf(1)));
          }
       }
       return;
    }
}
