package com.yxcorp.gifshow.activity.share.presenter.w2$g;
import a2.n0;
import com.yxcorp.gifshow.activity.share.presenter.w2;
import android.widget.RelativeLayout$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class w2$g implements n0	// class@001448
{
    public final int a;
    public final int b;
    public final int c;
    public final RelativeLayout$LayoutParams d;
    public final ConstraintLayout$LayoutParams e;
    public final w2 f;

    public void w2$g(w2 p0,int p1,int p2,int p3,RelativeLayout$LayoutParams p4,ConstraintLayout$LayoutParams p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w2$g.class, "1")) {
          return;
       }
       this.f.R8(this.a, 0, this.b, this.c, this.d, this.e);
       this.f.v.setTranslationY(0);
       return;
    }
    public void b(View p0){
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w2$g.class, "2")) {
          return;
       }
       this.f.R8(this.a, 0, this.b, this.c, this.d, this.e);
       this.f.v.setTranslationY(0);
       return;
    }
}
