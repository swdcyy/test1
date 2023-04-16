package dxa.f$a;
import java.lang.String;
import java.lang.Object;
import dxa.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class f$a	// class@0025a5
{
    public final int a;
    public final String b;
    public final int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public List h;
    public String i;
    public byte[] j;

    public void f$a(int p0,String p1,int p2){
       super();
       this.d = 1;
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public f a(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(this);
    }
    public f$a b(boolean p0){
       this.g = p0;
       return this;
    }
    public f$a c(int p0){
       this.d = p0;
       return this;
    }
    public f$a d(boolean p0){
       this.e = p0;
       return this;
    }
    public f$a e(boolean p0){
       this.f = p0;
       return this;
    }
}
