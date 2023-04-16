package com.yxcorp.gifshow.ad.util.i$a;
import ekd.f$j;
import android.widget.TextView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class i$a extends f$j	// class@001887
{
    public final TextView a;
    public final TextView b;

    public void i$a(TextView p0,TextView p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "2")) {
          return;
       }
       this.b.setVisibility(8);
       this.b.setAlpha(0x3f800000);
       this.b.setTranslationY(0);
       this.a.setAlpha(0x3f800000);
       this.a.setTranslationY(0);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       this.a.setAlpha(0);
       this.a.setVisibility(0);
       return;
    }
}
