package jh9.e$a;
import com.google.android.material.appbar.AppBarLayout$c;
import jh9.e;
import java.lang.Object;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.toolbox.widget.ScrollToTopCoordinatorLayout;
import com.yxcorp.gifshow.widget.NestedListenerCoordinatorLayout;

public final class e$a implements AppBarLayout$c	// class@002ae0
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public final void Y0(AppBarLayout p0,int p1){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, e$a.class, "1")) {
          return;
       }
       e$a tb = this.b;
       tb.u = p1;
       if (!p1) {
          e.P8(tb).setScrollOrder(1);
       }else {
          e.P8(tb).setScrollOrder(2);
       }
       return;
    }
}
