package hx9.a;
import yg5.a;
import com.kwai.component.tabs.panel.h;
import hx9.a$c;
import nsd.u;
import java.lang.Class;
import android.os.Bundle;
import java.lang.String;
import hx9.a$a;
import com.kwai.component.tabs.panel.h$d;
import hx9.a$b;
import com.kwai.component.tabs.panel.h$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.os.Parcelable;
import org.parceler.b;
import qrd.l1;
import androidx.fragment.app.Fragment;

public final class a extends h implements a	// class@00271f
{
    public BaseFragment k;
    public User l;
    public String m;
    public String n;
    public QPhoto o;
    public String p;
    public static final a$c q;

    static {
       a.q = new a$c(null);
    }
    public void a(Class p0,Bundle p1,String p2,int p3){
       super(p0, p1, p2, p3);
       this.k(new a$a(this));
       this.j(new a$b(this));
       this.h(this);
       this.p = "COLLECTION";
    }
    public void a(BaseFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "fragment");
       this.k = p0;
       Bundle uBundle = new Bundle();
       a to = this.o;
       if (to != null) {
          uBundle.putParcelable("qphoto", b.c(to));
       }
       to = this.l;
       if (to != null) {
          uBundle.putParcelable("user", b.c(to));
       }
       uBundle.putString("tabName", this.p);
       to = this.m;
       if (to != null) {
          uBundle.putParcelable("aggregate_user", b.c(to));
       }
       to = this.n;
       if (to != null) {
          uBundle.putString("fromPage", to);
       }
       p0.setArguments(uBundle);
       this.l = null;
       this.m = null;
       return;
    }
    public final void l(String p0){
       this.n = p0;
    }
}
