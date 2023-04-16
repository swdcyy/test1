package com.kuaishou.merchant.interpretation.presenter.b$e;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.interpretation.presenter.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.animation.Animation;

public class b$e extends m	// class@001857
{
    public final b c;

    public void b$e(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$e.class, "1")) {
          return;
       }
       b$e tc = this.c;
       if (tc.W != null) {
          if (tc.S != null) {
             tc.w.setVisibility(0);
             tc = this.c;
             tc.w.startAnimation(tc.K);
          }
          this.c.z.setVisibility(0);
          tc = this.c;
          tc.z.startAnimation(tc.K);
          tc.W = false;
       }else if(tc.S != null){
          tc.w.setVisibility(8);
          tc = this.c;
          tc.w.startAnimation(tc.L);
       }
       this.c.z.setVisibility(8);
       tc = this.c;
       tc.z.startAnimation(tc.L);
       tc.W = true;
       return;
    }
}
