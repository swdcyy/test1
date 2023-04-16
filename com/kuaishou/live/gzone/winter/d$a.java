package com.kuaishou.live.gzone.winter.d$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.live.gzone.winter.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.View;

public class d$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@001d08
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       d$a tb = this.b;
       tb.A = true;
       tb.z.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       return;
    }
}
