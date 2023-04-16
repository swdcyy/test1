package hq9.a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import brd.t;

public class a	// class@002702
{
    public final PublishSubject a;
    public int b;

    public void a(){
       super();
       this.a = PublishSubject.g();
       this.b = 0;
    }
    public void a(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.b = p0 | this.b;
       this.a.onNext(this);
       return;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       if (this.c(i) || (this.c(4) || (this.c(8) || (this.c(16) || (this.c(32) || (this.c(64) || (this.c(128) || (this.c(256) || (this.c(512) || (this.c(0x40000) || (this.c(0x100000) || (!this.c(0x200000) && !this.c(0x400000))))))))))))) {
          i = false;
       }
    label_007c :
       return i;
    }
    public boolean c(int p0){
       boolean b = ((this.b & p0) == p0)? true: false;
       return b;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c(0x1000000);
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.b = 0;
       this.a.onNext(this);
       return;
    }
    public t f(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.hide();
    }
    public void g(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       uoa = this.b;
       if (uoa & p0) {
          this.b = p0 ^ uoa;
          this.a.onNext(this);
       }
       return;
    }
}
