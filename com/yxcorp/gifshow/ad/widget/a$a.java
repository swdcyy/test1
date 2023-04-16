package com.yxcorp.gifshow.ad.widget.a$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.ad.widget.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.animation.ObjectAnimator;
import android.view.View;

public class a$a extends AnimatorListenerAdapter	// class@001926
{
    public final long a;
    public final a b;

    public void a$a(a p0,long p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       a$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, a.class, "3")) {
          a = tb.a;
          if (tb.c == a) {
             tb.c = tb.b;
             tb.d = a;
          }else {
             tb.d = tb.b;
             tb.c = a;
          }
          tb.f.setTarget(tb.d);
          tb.e.setTarget(tb.d);
          tb.g.setTarget(tb.c);
       }
       this.b.a(this.a);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.b.d.setVisibility(0);
       this.b.d.setAlpha(0x3f800000);
       return;
    }
}
