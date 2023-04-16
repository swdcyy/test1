package jh9.a$a;
import com.google.android.material.appbar.AppBarLayout$c;
import jh9.a;
import java.lang.Object;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.LinearLayout;
import h26.a;

public final class a$a implements AppBarLayout$c	// class@002acb
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public final void Y0(AppBarLayout p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       uoa.w = p1;
       a v = uoa.v;
       if (v != null) {
          a.o(p0, "appBarLayout");
          v.ld(p0.getHeight(), p1);
       }
       return;
    }
}
