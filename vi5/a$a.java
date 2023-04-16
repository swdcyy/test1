package vi5.a$a;
import java.lang.Object;
import vi5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class a$a	// class@0026af
{
    public boolean a;
    public String b;
    public boolean c;
    public String d;
    public boolean e;
    public boolean f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;

    public void a$a(){
       super();
       this.a = true;
       this.b = "";
       this.c = true;
       this.d = "";
       this.e = true;
       this.f = true;
       this.g = "";
       this.h = true;
       this.j = true;
    }
    public final a a(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this);
    }
    public final a$a b(boolean p0){
       this.c = p0;
       return this;
    }
    public final a$a c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "failDialogTitle");
       this.d = p0;
       return this;
    }
    public final a$a d(boolean p0){
       this.a = p0;
       return this;
    }
    public final a$a e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "loadingDialogTitle");
       this.b = p0;
       return this;
    }
    public final a$a f(boolean p0){
       this.h = p0;
       return this;
    }
    public final a$a g(boolean p0){
       this.f = p0;
       return this;
    }
    public final a$a h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "toastTitleAtBackgroundSuccess");
       this.g = p0;
       return this;
    }
}
