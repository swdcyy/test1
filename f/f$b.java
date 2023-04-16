package f.f$b;
import f.n$c$a;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.util.Set;
import f.n$c;
import java.lang.StringBuilder;
import f.f;
import f.f$a;
import java.lang.IllegalStateException;

public final class f$b extends n$c$a	// class@001f90
{
    public Integer a;
    public String b;
    public String c;
    public Set d;
    public String e;

    public void f$b(){
       super();
    }
    public n$c$a a(int p0){
       this.a = Integer.valueOf(p0);
       return this;
    }
    public n$c$a b(String p0){
       Objects.requireNonNull(p0, "Null interpreterCdn");
       this.c = p0;
       return this;
    }
    public n$c$a c(Set p0){
       Objects.requireNonNull(p0, "Null interpreterCdnList");
       this.d = p0;
       return this;
    }
    public n$c d(){
       String str = (this.a == null)? " needUpdate": "";
       if (this.b == null) {
          str = str+" interpreterVer";
       }
       if (this.c == null) {
          str = str+" interpreterCdn";
       }
       if (this.d == null) {
          str = str+" interpreterCdnList";
       }
       if (this.e == null) {
          str = str+" interpreterMd5";
       }
       if (str.isEmpty()) {
          f uof = new f(this.a.intValue(), this.b, this.c, this.d, this.e, null);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:"+str);
       }
    }
    public n$c$a e(String p0){
       Objects.requireNonNull(p0, "Null interpreterMd5");
       this.e = p0;
       return this;
    }
    public n$c$a f(String p0){
       Objects.requireNonNull(p0, "Null interpreterVer");
       this.b = p0;
       return this;
    }
}
