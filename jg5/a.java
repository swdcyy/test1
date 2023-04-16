package jg5.a;
import jg5.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.IllegalAccessException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import kotlin.jvm.internal.a;

public abstract class a extends c	// class@002c14
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public void a(){
       super();
       this.c = true;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.e() && !this.f())? true: false;
       return b;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       if (this.e != null) {
          throw new IllegalAccessException(this.getClass().getCanonicalName()+" has been inited");
       }
       this.e = true;
       return;
    }
    public boolean c(){
       return this.b;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.c() && (this.e() && !this.f()))? true: false;
       return b;
    }
    public boolean e(){
       return this.c;
    }
    public boolean f(){
       return this.a;
    }
    public void g(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "throwable");
       this.a = false;
       return;
    }
    public void h(boolean p0){
       this.b = false;
       this.c = p0;
    }
    public void i(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       a.p(p0, "t");
       this.h(false);
       return;
    }
    public void j(){
       this.b = true;
    }
    public void l(){
       this.a = true;
       this.d = false;
    }
    public void m(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "response");
       this.a = false;
       return;
    }
    public void n(long p0){
       this.d = true;
    }
    public void o(){
    }
    public void q(){
       this.e = false;
       this.a = false;
       this.b = false;
       this.c = true;
       this.d = false;
    }
    public final boolean r(){
       return this.d;
    }
    public final void s(boolean p0){
       this.a = p0;
    }
}
