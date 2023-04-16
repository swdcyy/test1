package com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$d;
import ekd.f$k;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$f;
import android.view.View;

public class ExpandFoldHelperView$d extends f$k	// class@001646
{
    public final float a;
    public final ExpandFoldHelperView b;

    public void ExpandFoldHelperView$d(ExpandFoldHelperView p0,float p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void e(){
       this.b.s = false;
    }
    public void f(float p0){
       ExpandFoldHelperView$d uod = ExpandFoldHelperView$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uod, "1")) {
          return;
       }
       this.b.a(p0);
       uod = this.a;
       if (!uod && p0 - uod >= 0) {
          ExpandFoldHelperView f = this.b.f;
          if (f != null) {
             f.q();
          }
       }
       this.b.c.invalidate();
       return;
    }
}
