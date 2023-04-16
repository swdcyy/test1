package com.yxcorp.gifshow.ad.util.h$b;
import ekd.f$j;
import com.yxcorp.gifshow.ad.util.h;
import android.view.View;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;

public class h$b extends f$j	// class@001881
{
    public final View a;
    public final int b;
    public final h c;

    public void h$b(h p0,View p1,int p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationEnd(Animator p0,boolean p1){
       if (PatchProxy.isSupport(h$b.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, h$b.class, "1")) {
          return;
       }
       this.a.setTranslationX((float)(- this.b));
       return;
    }
}
