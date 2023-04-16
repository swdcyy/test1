package com.yxcorp.gifshow.homepage.kcube.actionbar.bottom.widget.BottomTabView$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.homepage.kcube.actionbar.bottom.widget.BottomTabView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.CheckedTextView;

public class BottomTabView$a implements Runnable	// class@0016f0
{
    public final BottomTabView b;

    public void BottomTabView$a(BottomTabView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, BottomTabView$a.class, "1")) {
          return;
       }
       BottomTabView d = this.b.d;
       if (d != null) {
          d.requestLayout();
       }
       d = this.b.b;
       if (d != null) {
          d.requestLayout();
       }
       return;
    }
}
