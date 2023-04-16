package com.kwai.feature.post.api.util.g$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.app.Activity;
import android.view.View;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.n;
import android.view.ViewTreeObserver;

public class g$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@001463
{
    public final Activity b;
    public final View c;
    public final Runnable d;

    public void g$a(Activity p0,View p1,Runnable p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "1")) {
          return;
       }
       if (n.j(this.b)) {
          this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          this.d.run();
       }
       return;
    }
}
