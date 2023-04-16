package com.yxcorp.gifshow.v3.previewer.ktv.k;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.v3.previewer.ktv.l;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mwc.z;
import java.lang.Runnable;

public class k extends AnimatorListenerAdapter	// class@0015c6
{
    public final View a;
    public final l b;

    public void k(l p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setVisibility(4);
       this.a.post(new z(this));
       return;
    }
}
