package e1b.d$b;
import com.kwai.library.widget.refresh.RefreshLayout$g;
import e1b.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import oh5.a;
import com.kwai.library.widget.refresh.RefreshLayout;
import hka.k;
import e9c.h$d;

public class d$b implements RefreshLayout$g	// class@0025eb
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void onRefresh(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "1")) {
          return;
       }
       if (!p0.C(a.a().a())) {
          new a("RefreshLayoutViewP").a(R.string.arg_RES_7f1038e7, "NoNetwork");
          this.b.v.setRefreshing(false);
          return;
       }else {
          d$b tb = this.b;
          d y = tb.y;
          boolean b = (y != null)? y.a(tb.w): tb.w.v(true);
          if (!b) {
             this.b.v.setRefreshing(false);
          }
          return;
       }
    }
}
