package f.a$b;
import f.g$a;
import f.g;
import java.lang.String;
import java.lang.Integer;
import java.lang.Long;
import com.kuaishou.security.kste.export.InvokeCallback;
import java.lang.Object;
import java.util.Objects;
import java.lang.StringBuilder;
import f.a;
import f.a$a;
import java.lang.IllegalStateException;

public final class a$b extends g$a	// class@001f82
{
    public String a;
    public String b;
    public String c;
    public byte[] d;
    public Integer e;
    public Long f;
    public InvokeCallback g;
    public String h;

    public void a$b(){
       super();
    }
    public void a$b(g p0){
       super();
       this.a = p0.a();
       this.b = p0.e();
       this.c = p0.j();
       this.d = p0.d();
       this.e = Integer.valueOf(p0.f());
       this.f = Long.valueOf(p0.h());
       this.g = p0.c();
       this.h = p0.g();
    }
    public g$a a(int p0){
       this.e = Integer.valueOf(p0);
       return this;
    }
    public g$a b(long p0){
       this.f = Long.valueOf(p0);
       return this;
    }
    public g$a c(InvokeCallback p0){
       this.g = p0;
       return this;
    }
    public g$a d(String p0){
       Objects.requireNonNull(p0, "Null appkey");
       this.a = p0;
       return this;
    }
    public g$a e(byte[] p0){
       Objects.requireNonNull(p0, "Null input");
       this.d = p0;
       return this;
    }
    public g f(){
       String str = (this.a == null)? " appkey": "";
       if (this.b == null) {
          str = str+" kpn";
       }
       if (this.c == null) {
          str = str+" vmBizId";
       }
       if (this.d == null) {
          str = str+" input";
       }
       if (this.e == null) {
          str = str+" maxOutLen";
       }
       if (this.f == null) {
          str = str+" timeout";
       }
       if (this.h == null) {
          str = str+" taskTag";
       }
       if (str.isEmpty()) {
          a uoa = new a(this.a, this.b, this.c, this.d, this.e.intValue(), this.f.longValue(), this.g, this.h, null);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:"+str);
       }
    }
    public g$a g(String p0){
       Objects.requireNonNull(p0, "Null kpn");
       this.b = p0;
       return this;
    }
    public g$a h(String p0){
       Objects.requireNonNull(p0, "Null taskTag");
       this.h = p0;
       return this;
    }
    public g$a i(String p0){
       Objects.requireNonNull(p0, "Null vmBizId");
       this.c = p0;
       return this;
    }
}
