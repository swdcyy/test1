package f3a.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f3a.j$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.q;
import qvb.j;
import qvb.i;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import f3a.j$b;
import android.view.ViewTreeObserver$OnPreDrawListener;
import y8c.t;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;

public class j extends PresenterV2	// class@002287
{
    public i p;
    public t q;
    public RecyclerView r;
    public q s;

    public void j(){
       super();
       this.s = new j$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       this.p.h(this.s);
       this.p.a();
       this.r.getViewTreeObserver().addOnPreDrawListener(new j$b(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j.class, "4")) {
          return;
       }
       this.p.f(this.s);
       this.q.x();
       this.q.f();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a2e97);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.p = this.r8("PAGE_LIST");
       this.q = this.q8(t.class);
       return;
    }
}
