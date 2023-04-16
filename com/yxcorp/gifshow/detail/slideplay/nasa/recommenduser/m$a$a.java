package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.m$a$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.m$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.Layout;
import android.widget.TextView;
import android.view.ViewTreeObserver;

public class m$a$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@00177a
{
    public final m$a b;

    public void m$a$a(m$a p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoidWithListener(null, this, m$a$a.class, "1")) {
          return;
       }
       m$a w = this.b.w;
       if (w != null) {
          if (w.getLayout().getEllipsisCount(0) > 0) {
             this.b.P8(true);
          }
          this.b.w.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       }
       PatchProxy.onMethodExit(m$a$a.class, "1");
       return;
    }
}
