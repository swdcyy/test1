package c79.c$a;
import java.lang.Object;
import c79.c;
import android.graphics.drawable.Drawable;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class c$a	// class@0004f5
{
    public Drawable a;
    public Drawable b;
    public Drawable c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public float h;
    public int i;
    public int j;
    public boolean k;
    public String l;
    public long m;
    public int n;
    public int o;

    public void c$a(){
       super();
       this.f = -1;
       this.i = -1;
       this.j = -1;
       this.l = "";
    }
    public void c$a(c p0){
       super();
       this.f = -1;
       this.i = -1;
       this.j = -1;
       this.l = "";
       if (p0 != null) {
          this.a = p0.j();
          this.b = p0.c();
          this.c = p0.e();
          this.d = p0.n();
          this.e = p0.f();
          this.f = p0.l();
          this.g = p0.d();
          this.h = p0.b();
          this.i = p0.a();
          this.j = p0.k();
          this.m = p0.h();
          this.k = p0.o();
          this.l = p0.m();
          this.n = p0.i();
          this.o = p0.g();
       }
       return;
    }
    public final c a(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this);
    }
    public final c$a b(int p0){
       this.i = p0;
       return this;
    }
    public final c$a c(float p0){
       this.h = p0;
       return this;
    }
    public final c$a d(boolean p0){
       this.g = p0;
       return this;
    }
    public final c$a e(int p0){
       this.e = p0;
       return this;
    }
    public final c$a f(boolean p0){
       this.k = p0;
       return this;
    }
    public final c$a g(Drawable p0){
       this.a = p0;
       return this;
    }
    public final c$a h(int p0){
       this.f = p0;
       return this;
    }
    public final c$a i(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "srcMediaFilePath");
       this.l = p0;
       return this;
    }
    public final c$a j(int p0){
       this.d = p0;
       return this;
    }
}
