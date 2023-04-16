package dha.b;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import dha.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.String;
import xl8.b;
import io.reactivex.subjects.PublishSubject;
import o17.i;

public class b implements RefreshLayout$h	// class@0024a1
{
    public boolean a;
    public final c b;

    public void b(c p0){
       this.b = p0;
       super();
       this.a = true;
    }
    public void a(float p0,float p1,boolean p2){
       boolean b;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Boolean.valueOf(p2), this, b.class, "4")) {
          return;
       }
       b = false;
       if (this.a != null && !this.b.b.a().booleanValue()) {
          this.a = b;
          this.b.b.d(Boolean.TRUE);
       }
       if (p2) {
          b tb = this.b;
          if (tb.f != null) {
             tb.f = b;
             tb.c.onNext(Boolean.TRUE);
          }
       }
       return;
    }
    public void b(){
       i.d(this);
    }
    public void pullToRefresh(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.a = false;
       if (!this.b.b.a().booleanValue()) {
          this.b.b.d(Boolean.TRUE);
       }
       return;
    }
    public void refreshComplete(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.a = false;
       if (this.b.b.a().booleanValue()) {
          this.b.b.d(Boolean.FALSE);
       }
       this.b.f = true;
       return;
    }
    public void releaseToRefresh(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.a = false;
       if (!this.b.b.a().booleanValue()) {
          this.b.b.d(Boolean.TRUE);
       }
       return;
    }
}
