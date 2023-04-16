package j9a.h$d;
import qvb.q;
import j9a.h;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import j9a.h$d$a;
import bf5.v;
import java.lang.Runnable;
import ekd.k1;
import uw9.o;
import q87.c;
import j9a.a;
import j9a.d;
import qvb.p;

public class h$d implements q	// class@002995
{
    public final h b;

    public void h$d(h p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       h$d uod = h$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uod, "3")) {
          return;
       }
       if (this.b.getActivity() == null) {
          return;
       }
       h$d tb = this.b;
       boolean b = false;
       tb.t = b;
       int i = tb.s + 1;
       tb.s = i;
       if (i == 2) {
          tb.s = b;
          h$d$a uod$a = new h$d$a(this);
          String str = (this.b.u != null)? "featured api fail": "detail api fail";
          tb.P8(null, uod$a, str);
       }
       k1.m(this.b.w);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       h$d uod = h$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uod, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w(this.b.p, "onStartLoading", objArray);
       h$d tb = this.b;
       tb.t = true;
       k1.r(tb.w, (long)(d.b().timeOutSec * 1000));
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(h$d.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, h$d.class, "2")) {
          return;
       }
       if (this.b.getActivity() == null) {
          return;
       }
       h$d tb = this.b;
       tb.t = false;
       tb.s = 0;
       k1.m(tb.w);
       return;
    }
}
