package ab.d$b;
import java.lang.String;
import java.lang.Object;
import ab.d$b$a;
import ab.d$a;
import ab.e;
import java.lang.StringBuilder;
import java.lang.Class;
import java.util.Arrays;
import java.lang.CharSequence;

public final class d$b	// class@000110
{
    public final String a;
    public final d$b$a b;
    public d$b$a c;
    public boolean d;

    public void d$b(String p0){
       super();
       d$b$a uob$a = new d$b$a(null);
       this.b = uob$a;
       this.c = uob$a;
       this.d = false;
       e.d(p0);
       this.a = p0;
    }
    public void d$b(String p0,d$a p1){
       super(p0);
    }
    public d$b a(String p0,int p1){
       this.d(p0, String.valueOf(p1));
       return this;
    }
    public d$b b(String p0,Object p1){
       this.d(p0, p1);
       return this;
    }
    public d$b c(String p0,boolean p1){
       this.d(p0, String.valueOf(p1));
       return this;
    }
    public final d$b d(String p0,Object p1){
       d$b$a uob$a = new d$b$a(null);
       this.c.c = uob$a;
       this.c = uob$a;
       uob$a.b = p1;
       e.d(p0);
       uob$a.a = p0;
       return this;
    }
    public String toString(){
       d$b td = this.d;
       StringBuilder str = new StringBuilder(32)+this.a+'{';
       d$b$a c = this.b.c;
       String str1 = "";
       while (c != null) {
          d$b$a b = c.b;
          if (td == null || b != null) {
             str = str+str1;
             d$b$a a = c.a;
             if (a != null) {
                str = str+a+'=';
             }
             if (b != null && b.getClass().isArray()) {
                int i = 1;
                Object[] objArray = new Object[i];
                objArray[0] = b;
                String str2 = Arrays.deepToString(objArray);
                int i1 = str2.length() - i;
                str = str+str2;
             }else {
                str = str+b;
             }
             str1 = ", ";
          }
          c = c.c;
       }
       return str+'}';
    }
}
