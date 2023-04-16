package r97.f$b;
import r97.r$a;
import r97.r;
import java.lang.String;
import r97.o;
import java.lang.StringBuilder;
import r97.f;
import r97.f$a;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.util.Objects;

public final class f$b extends r$a	// class@002340
{
    public String a;
    public o b;
    public String c;
    public String d;
    public String e;

    public void f$b(){
       super();
    }
    public void f$b(r p0){
       super();
       this.a = p0.d();
       this.b = p0.c();
       this.c = p0.e();
       this.d = p0.g();
       this.e = p0.a();
    }
    public r a(){
       String str = (this.b == null)? " commonParams": "";
       if (this.c == null) {
          str = str+" key";
       }
       if (this.d == null) {
          str = str+" value";
       }
       if (str.isEmpty()) {
          f uof = new f(this.a, this.b, this.c, this.d, this.e, null);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:"+str);
       }
    }
    public r$a b(String p0){
       this.e = p0;
       return this;
    }
    public r$a d(o p0){
       Objects.requireNonNull(p0, "Null commonParams");
       this.b = p0;
       return this;
    }
    public r$a e(String p0){
       this.a = p0;
       return this;
    }
    public r$a f(String p0){
       Objects.requireNonNull(p0, "Null key");
       this.c = p0;
       return this;
    }
    public r$a h(String p0){
       Objects.requireNonNull(p0, "Null value");
       this.d = p0;
       return this;
    }
}
