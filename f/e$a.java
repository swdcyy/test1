package f.e$a;
import f.n$a$a;
import java.lang.Integer;
import f.n$a;
import java.lang.String;
import f.e;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public final class e$a extends n$a$a	// class@001f8d
{
    public Integer a;

    public void e$a(){
       super();
    }
    public n$a$a a(int p0){
       this.a = Integer.valueOf(p0);
       return this;
    }
    public n$a b(){
       String str = (this.a == null)? " needUpdate": "";
       if (str.isEmpty()) {
          return new e(this.a.intValue());
       }else {
          throw new IllegalStateException("Missing required properties:"+str);
       }
    }
}
