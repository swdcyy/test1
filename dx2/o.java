package dx2.o;
import gka.c;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.String;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import java.lang.Boolean;
import com.yxcorp.gifshow.fragment.f;
import com.kwai.library.widget.refresh.RefreshLayout;
import mkc.b;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import java.lang.Throwable;
import dx2.o$a;
import android.view.View$OnClickListener;

public class o extends c	// class@0025db
{
    public int m;
    public String n;
    public boolean o;
    public View p;

    public void o(RecyclerFragment p0,int p1,String p2,boolean p3){
       super(p0, 1);
       this.m = p1;
       this.n = p2;
       this.o = p3;
    }
    public KwaiEmptyStateView$a a(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, o.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a();
       obj.i(this.n);
       obj.k(this.m);
       return obj;
    }
    public void d(boolean p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oo, "2")) {
          return;
       }
       this.a.s();
       if (p0) {
          if (!this.s()) {
             return;
          }else if(this.o != null || this.b == null){
             f ta = this.a;
             ta.K(a.i(ta, b.e.a));
          }
       }else {
          this.f.g(true, null);
       }
       return;
    }
    public void k(boolean p0,Throwable p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, oo, "4")) {
          return;
       }
       super.k(p0, p1);
       this.n().findViewById(R.id.retry_btn).setOnClickListener(new o$a(this));
       return;
    }
    public View n(){
       Object obj = PatchProxy.apply(null, this, o.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.p == null) {
          this.p = a.i(this.a, 0x7f0d0d07);
       }
       return this.p;
    }
}
