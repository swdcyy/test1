package com.facebook.react.views.scroll.ReactScrollView$a;
import java.lang.Runnable;
import com.facebook.react.views.scroll.ReactScrollView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import a2.i0;
import android.view.ViewGroup;
import uf.b;
import java.util.Objects;
import od.a;
import com.facebook.react.views.scroll.FpsListener;

public class ReactScrollView$a implements Runnable	// class@0013e7
{
    public boolean b;
    public final ReactScrollView c;

    public void ReactScrollView$a(ReactScrollView p0){
       this.c = p0;
       super();
       this.b = false;
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ReactScrollView$a.class, "1")) {
          return;
       }
       ReactScrollView$a tc = this.c;
       long l = 20;
       if (tc.f != null) {
          tc.f = false;
          i0.l0(tc, this, l);
       }else if(tc.j != null && this.b == null){
          this.b = true;
          tc.c(false);
          i0.l0(this.c, this, l);
       }else if(tc.n != null){
          b.g(tc);
       }
       tc = this.c;
       tc.k = objArray;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(objArray, tc, ReactScrollView.class, "21") && tc.e()) {
          a.c(tc.o);
          a.c(tc.p);
          tc.o.disable(tc.p);
       }
       return;
    }
}
