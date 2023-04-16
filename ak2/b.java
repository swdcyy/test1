package ak2.b;
import ks5.b;
import lnc.a1;
import java.lang.Object;
import ks5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import ak2.b$a;
import android.view.ViewGroup;
import android.view.View;
import ks5.e;
import ks5.d;

public class b implements b	// class@0000e5
{
    public View a;
    public b$a b;
    public static final int c;

    static {
       b.c = a1.e(200.00f);
    }
    public void b(){
       super();
    }
    public void D(){
       a.d(this);
    }
    public void a(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       uob = this.b;
       if (uob != null) {
          uob.a(p0);
       }
       return;
    }
    public View b(ViewGroup p0){
       return this.a;
    }
    public boolean c(){
       return d.a(this);
    }
    public void d(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       b tb = this.b;
       if (tb != null) {
          tb.onShow();
       }
       return;
    }
    public void e(ViewGroup p0){
       d.c(this, p0);
    }
    public int getBizId(){
       return 6;
    }
    public boolean i(){
       return true;
    }
    public String k(){
       return a.a(this);
    }
    public void onShow(){
       a.e(this);
    }
    public int[] p(){
       return a.b(this);
    }
    public void t(b$a p0){
       this.b = p0;
    }
}
