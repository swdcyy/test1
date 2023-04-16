package bl4.j$a;
import wk4.c;
import bl4.j;
import java.lang.Object;
import wk4.b;
import java.lang.String;
import com.kuaishou.merchant.transaction.base.model.PayResultQueryResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import cl4.a;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import al4.e;
import java.lang.Throwable;
import java.lang.Integer;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import bl4.i;
import java.lang.Runnable;
import android.os.Handler;

public class j$a implements c	// class@000395
{
    public final j a;

    public void j$a(j p0){
       this.a = p0;
       super();
    }
    public void a(){
       b.m(this);
    }
    public void b(){
       b.a(this);
    }
    public void c(String p0,String p1,PayResultQueryResponse p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j$a.class, "4")) {
          return;
       }
       j$a ta = this.a;
       ta.g(2, ta.a);
       int i = 1;
       if (p2 != null && p2.mBuyResultType != i) {
          i = 3;
       }
       e.d(i, TextUtils.k(p0), this.a.d);
       return;
    }
    public boolean d(Throwable p0){
       return b.e(this, p0);
    }
    public void e(){
       b.l(this);
    }
    public void f(String p0,int p1){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       if (p1 == 3) {
          i.d(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f1033a9));
       }
       this.a.g.postDelayed(new i(this, p1, p0), 500);
       return;
    }
    public void g(String p0){
       b.n(this, p0);
    }
    public boolean h(){
       return this.a.h;
    }
    public void i(){
       b.f(this);
    }
    public void j(String p0,String p1){
       b.k(this, p0, p1);
    }
    public void k(String p0,String p1,int p2,String p3){
       if (PatchProxy.isSupport(j$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, j$a.class, "3")) {
          return;
       }
       j$a ta = this.a;
       ta.g(3, ta.a);
       e.d(2, TextUtils.k(p0), this.a.d);
       return;
    }
    public boolean l(PayResultQueryResponse p0){
       return b.d(this, p0);
    }
    public void m(int p0,String p1){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       j$a ta = this.a;
       ta.g(3, ta.a);
       return;
    }
    public void n(){
       b.b(this);
    }
}
