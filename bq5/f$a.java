package bq5.f$a;
import java.lang.Object;
import bq5.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bq5.d;

public class f$a	// class@000568
{
    public Object a;
    public int b;
    public long c;
    public boolean d;
    public d e;

    public void f$a(){
       super();
       this.b = 5;
    }
    public f a(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(this);
    }
    public f$a b(boolean p0){
       this.d = p0;
       return this;
    }
    public f$a c(long p0){
       this.c = p0;
       return this;
    }
    public f$a d(d p0){
       this.e = p0;
       return this;
    }
    public f$a e(Object p0){
       this.a = p0;
       return this;
    }
    public f$a f(int p0){
       this.b = p0;
       return this;
    }
}
