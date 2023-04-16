package cw9.f$a;
import java.lang.Object;
import cw9.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class f$a	// class@001e28
{
    public boolean a;
    public boolean b;
    public float c;

    public void f$a(){
       super();
    }
    public f a(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(this.a, this.b, this.c);
    }
    public f$a b(boolean p0){
       this.a = p0;
       return this;
    }
    public f$a c(boolean p0){
       this.b = p0;
       return this;
    }
    public f$a d(float p0){
       this.c = p0;
       return this;
    }
}
