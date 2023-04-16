package ifd.a$a;
import s99.i;
import ifd.a;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.List;
import android.view.ViewGroup;

public class a$a implements i	// class@000fff
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public boolean C(RecyclerView p0,int p1){
       Iterator obj;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.b.p.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          if (obj.next().C(p0, p1)) {
             break ;
          }
       }
       return true;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       Iterator iterator = this.b.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       Iterator iterator = this.b.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().b();
       }
       return;
    }
    public void c(int p0,int p1,int p2,int p3,int p4,int p5){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "4")) {
             return;
          }
       }
       Iterator iterator = this.b.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0, p1, p2, p3, p4, p5);
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "6")) {
          return;
       }
       Iterator iterator = this.b.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().f();
       }
       return;
    }
    public boolean i(ViewGroup p0,int p1){
       Iterator obj;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.b.p.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          if (obj.next().i(p0, p1)) {
             break ;
          }
       }
       return true;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "7")) {
          return;
       }
       Iterator iterator = this.b.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().n();
       }
       return;
    }
    public void onScrollStateChanged(int p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "5")) {
          return;
       }
       Iterator iterator = this.b.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().onScrollStateChanged(p0);
       }
       return;
    }
}
