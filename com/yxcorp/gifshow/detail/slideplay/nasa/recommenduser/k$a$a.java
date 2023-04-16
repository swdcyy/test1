package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.k$a$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.k$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.Layout;
import android.widget.TextView;
import android.view.ViewTreeObserver;

public class k$a$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@001773
{
    public final k$a b;

    public void k$a$a(k$a p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoidWithListener(null, this, k$a$a.class, "1")) {
          return;
       }
       if (this.b.w.getLayout().getEllipsisCount(0) > 0) {
          this.b.P8(true);
       }
       this.b.w.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       PatchProxy.onMethodExit(k$a$a.class, "1");
       return;
    }
}
