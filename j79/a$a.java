package j79.a$a;
import java.lang.Object;
import j79.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import kotlin.jvm.internal.a;

public final class a$a	// class@002766
{
    public ArrayList a;
    public int b;
    public ArrayList c;
    public ArrayList d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public float l;
    public int m;
    public int n;
    public boolean o;

    public void a$a(){
       super();
       this.f = true;
       this.g = true;
       this.n = -1;
       this.o = true;
    }
    public final a a(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this);
    }
    public final a$a b(int p0){
       this.b = p0;
       return this;
    }
    public final a$a c(ArrayList p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "_s");
       this.a = p0;
       return this;
    }
    public final a$a d(boolean p0){
       this.i = p0;
       return this;
    }
    public final a$a e(boolean p0){
       this.f = p0;
       return this;
    }
}
