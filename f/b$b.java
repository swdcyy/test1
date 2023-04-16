package f.b$b;
import f.h$a;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.util.Set;
import f.h;
import java.lang.StringBuilder;
import f.b;
import f.b$a;
import java.lang.IllegalStateException;

public final class b$b extends h$a	// class@001f85
{
    public Integer a;
    public String b;
    public String c;
    public Set d;
    public String e;

    public void b$b(){
       super();
    }
    public h$a a(int p0){
       this.a = Integer.valueOf(p0);
       return this;
    }
    public h$a b(String p0){
       Objects.requireNonNull(p0, "Null bcCdn");
       this.b = p0;
       return this;
    }
    public h$a c(Set p0){
       Objects.requireNonNull(p0, "Null bcCdnList");
       this.d = p0;
       return this;
    }
    public h d(){
       String str = (this.a == null)? " bcVer": "";
       if (this.b == null) {
          str = str+" bcCdn";
       }
       if (this.c == null) {
          str = str+" bcMd5";
       }
       if (this.d == null) {
          str = str+" bcCdnList";
       }
       if (this.e == null) {
          str = str+" vmBizId";
       }
       if (str.isEmpty()) {
          b uob = new b(this.a.intValue(), this.b, this.c, this.d, this.e, null);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:"+str);
       }
    }
    public h$a e(String p0){
       Objects.requireNonNull(p0, "Null bcMd5");
       this.c = p0;
       return this;
    }
    public h$a f(String p0){
       Objects.requireNonNull(p0, "Null vmBizId");
       this.e = p0;
       return this;
    }
}
