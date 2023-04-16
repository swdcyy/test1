package f.d$b;
import f.n$b;
import f.n$a;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import f.n$c;
import f.n;
import java.lang.StringBuilder;
import f.d;
import f.d$a;
import java.lang.IllegalStateException;

public final class d$b extends n$b	// class@001f8b
{
    public String a;
    public n$a b;
    public n$c c;

    public void d$b(){
       super();
    }
    public n$b a(n$a p0){
       Objects.requireNonNull(p0, "Null bitcodeConfig");
       this.b = p0;
       return this;
    }
    public n$b b(n$c p0){
       Objects.requireNonNull(p0, "Null interpreterConfig");
       this.c = p0;
       return this;
    }
    public n$b c(String p0){
       Objects.requireNonNull(p0, "Null configPolicy");
       this.a = p0;
       return this;
    }
    public n d(){
       String str = (this.a == null)? " configPolicy": "";
       if (this.b == null) {
          str = str+" bitcodeConfig";
       }
       if (this.c == null) {
          str = str+" interpreterConfig";
       }
       if (str.isEmpty()) {
          return new d(this.a, this.b, this.c, null);
       }else {
          throw new IllegalStateException("Missing required properties:"+str);
       }
    }
}
