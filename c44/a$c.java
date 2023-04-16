package c44.a$c;
import com.google.android.material.appbar.AppBarLayout$c;
import c44.a;
import java.lang.Object;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;

public final class a$c implements AppBarLayout$c	// class@0004a7
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public final void Y0(AppBarLayout p0,int p1){
       a$c uoc = a$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1")) {
          return;
       }
       a p = this.b.p;
       if (p != null && !p.getVisibility()) {
          p.setPadding(0, 0, 0, (this.b.C + p1));
       }
       return;
    }
}
