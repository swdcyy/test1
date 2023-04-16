package c42.m$a;
import cq5.d;
import c42.m;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import cq5.a$a;
import wq5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kp3.e;
import java.lang.Integer;
import g9c.a;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import t02.a0;
import hb2.g$b;
import java.lang.Boolean;

public class m$a implements d	// class@0004bd
{
    public final m a;

    public void m$a(m p0){
       this.a = p0;
       super();
    }
    public RecyclerView a(){
       return this.a.G;
    }
    public void b(a$a p0){
       this.a.K = p0;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "6")) {
          return;
       }
       this.a.w.y(p0);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, m$a.class, "1")) {
          return;
       }
       this.a.X8();
       return;
    }
    public void e(int p0){
       m$a uoa = m$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "7")) {
          return;
       }
       m m = this.a.M;
       if (m != null) {
          QPhoto qPhoto = m.N0(p0);
          if (qPhoto != null) {
             this.a.R8(qPhoto);
          }
       }
       return;
    }
    public void f(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "5")) {
          return;
       }
       this.a.w.k(p0);
       return;
    }
    public View g(){
       a0 obj = PatchProxy.apply(null, this, m$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.t.l1;
       if (obj != null) {
          return obj.i();
       }
       return null;
    }
    public boolean h(){
       Object obj = PatchProxy.apply(null, this, m$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.W8();
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, m$a.class, "2")) {
          return;
       }
       this.a.P8();
       return;
    }
    public void j(){
       this.a.K = null;
    }
}
