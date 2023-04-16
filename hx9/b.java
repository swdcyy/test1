package hx9.b;
import yg5.a;
import com.kwai.component.tabs.panel.h;
import hx9.b$c;
import nsd.u;
import java.lang.Class;
import android.os.Bundle;
import java.lang.String;
import hx9.b$a;
import com.kwai.component.tabs.panel.h$d;
import hx9.b$b;
import com.kwai.component.tabs.panel.h$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.os.Parcelable;
import org.parceler.b;
import qrd.l1;
import androidx.fragment.app.Fragment;

public final class b extends h implements a	// class@002723
{
    public BaseFragment k;
    public boolean l;
    public User m;
    public QPhoto n;
    public String o;
    public String p;
    public static final b$c q;

    static {
       b.q = new b$c(null);
    }
    public void b(Class p0,Bundle p1,String p2){
       super(p0, p1, p2, 4001);
       this.k(new b$a(this));
       this.j(new b$b(this));
       this.h(this);
    }
    public void a(BaseFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "fragment");
       this.k = p0;
       Bundle uBundle = new Bundle();
       b tn = this.n;
       if (tn != null) {
          uBundle.putParcelable("qphoto", b.c(tn));
       }
       if (this.l == null) {
          tn = this.m;
          if (tn != null) {
             uBundle.putParcelable("user", b.c(tn));
          }
          tn = this.o;
          if (tn != null) {
             uBundle.putParcelable("aggregate_user", b.c(tn));
          }
       }
       tn = this.p;
       if (tn != null) {
          uBundle.putString("fromPage", tn);
       }
       this.l = true;
       p0.setArguments(uBundle);
       return;
    }
    public final void l(String p0){
       this.p = p0;
    }
}
