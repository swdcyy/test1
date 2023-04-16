package com.yxcorp.gifshow.activity.share.presenter.w2$d;
import a2.n0;
import com.yxcorp.gifshow.activity.share.presenter.w2;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.RelativeLayout$LayoutParams;

public class w2$d implements n0	// class@001445
{
    public final int a;
    public final w2 b;

    public void w2$d(w2 p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w2$d.class, "1")) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = this.b.y.getLayoutParams();
       w2$d tb = this.b;
       layoutParams.height = this.a - tb.e1;
       tb.y.setLayoutParams(layoutParams);
       this.b.v.setTranslationY(0);
       return;
    }
    public void b(View p0){
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w2$d.class, "2")) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = this.b.y.getLayoutParams();
       w2$d tb = this.b;
       layoutParams.height = this.a - tb.e1;
       tb.y.setLayoutParams(layoutParams);
       this.b.v.setTranslationY(0);
       return;
    }
}
