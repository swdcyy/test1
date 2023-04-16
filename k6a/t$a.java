package k6a.t$a;
import qvb.q;
import k6a.t;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import e17.i;
import android.widget.ProgressBar;
import com.yxcorp.gifshow.detail.view.SlidePlayVideoLoadingProgressBar;
import qvb.p;
import java.util.Objects;
import java.util.List;
import qvb.a;
import k6a.u;
import java.util.ArrayList;
import g9c.a;
import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import io.reactivex.subjects.PublishSubject;

public class t$a implements q	// class@002c00
{
    public final t b;

    public void t$a(t p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport2(t$a.class, "3") && PatchProxy.applyVoidTwoRefsWithListener(Boolean.valueOf(p0), p1, this, t$a.class, "3")) {
          return;
       }
       i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
       this.b.s.setVisibility(8);
       this.b.s.f();
       PatchProxy.onMethodExit(t$a.class, "3");
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport2(t$a.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(Boolean.valueOf(p0), Boolean.valueOf(p1), this, t$a.class, "1")) {
          return;
       }
       this.b.s.setVisibility(0);
       this.b.s.e();
       PatchProxy.onMethodExit(t$a.class, "1");
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       int i;
       if (PatchProxy.isSupport2(t$a.class, "2") && PatchProxy.applyVoidTwoRefsWithListener(Boolean.valueOf(p0), Boolean.valueOf(p1), this, t$a.class, "2")) {
          return;
       }
       this.b.s.setVisibility(8);
       this.b.s.f();
       t$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidWithListener(null, tb, t.class, "4")) {
          List items = tb.t.getItems();
          if (items.isEmpty()) {
             i.a(R.style.arg_RES_7f110668, 0x7f100a19);
             u.f();
             PatchProxy.onMethodExit(t.class, "4");
          }else {
             tb.p.W0(items);
             i = new ArrayList(tb.p.Q0()).size() - items.size();
             tb.p.p0(0, items.size());
             if (i > 0) {
                tb.p.s0(items.size(), i);
             }
             tb.v.onNext(Boolean.TRUE);
             PatchProxy.onMethodExit(t.class, "4");
          }
       }
       PatchProxy.onMethodExit(t$a.class, "2");
       return;
    }
}
