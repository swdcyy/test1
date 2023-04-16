package com.kwai.slide.play.detail.rightactionbar.follow.element.k$b;
import ekd.f$i;
import com.kwai.slide.play.detail.rightactionbar.follow.element.k;
import android.view.animation.Animation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.widget.TextView;

public class k$b extends f$i	// class@00185e
{
    public final boolean b;
    public final k c;

    public void k$b(k p0,boolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$b.class, "1")) {
          return;
       }
       if (this.b != null) {
          k p = this.c.P;
          if (p != null) {
             p.setTranslationY(0);
             this.c.P.setAlpha(0x3f800000);
          }
       }else {
          this.c.J.setTranslationY(0);
          this.c.J.setAlpha(0x3f800000);
       }
       return;
    }
}
