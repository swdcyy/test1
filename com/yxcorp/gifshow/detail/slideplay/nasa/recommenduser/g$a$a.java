package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.g$a$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.g$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.Layout;
import android.widget.TextView;
import android.view.ViewTreeObserver;

public class g$a$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@001767
{
    public final g$a b;

    public void g$a$a(g$a p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoidWithListener(null, this, g$a$a.class, "1")) {
          return;
       }
       if (this.b.w.getLayout().getEllipsisCount(0) > 0) {
          this.b.P8(true);
       }
       this.b.w.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       PatchProxy.onMethodExit(g$a$a.class, "1");
       return;
    }
}
