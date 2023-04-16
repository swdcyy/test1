package com.kwai.slide.play.detail.rightactionbar.follow.element.k$a;
import com.yxcorp.gifshow.detail.view.SelfAdaptiveImageView$b;
import com.kwai.slide.play.detail.rightactionbar.follow.element.k;
import os7.a$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class k$a implements SelfAdaptiveImageView$b	// class@00185d
{
    public final boolean a;
    public final a$e b;
    public final k c;

    public void k$a(k p0,boolean p1,a$e p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onFail(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "2")) {
          return;
       }
       if (this.a == null) {
          this.c.P.setVisibility(8);
          this.c.E(this.b.b);
       }
       this.c.G();
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "1")) {
          return;
       }
       if (this.a == null) {
          this.c.H(true);
       }
       this.c.G();
       return;
    }
}
