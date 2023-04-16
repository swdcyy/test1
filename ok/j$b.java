package ok.j$b;
import java.lang.String;
import java.lang.Object;
import ok.j$b$a;
import ok.j$a;
import ok.n;
import java.lang.StringBuilder;
import java.lang.Class;
import java.util.Arrays;
import java.lang.CharSequence;

public final class j$b	// class@0027ef
{
    public final String a;
    public final j$b$a b;
    public j$b$a c;
    public boolean d;

    public void j$b(String p0){
       super();
       j$b$a uob$a = new j$b$a(null);
       this.b = uob$a;
       this.c = uob$a;
       this.d = false;
       n.j(p0);
       this.a = p0;
    }
    public void j$b(String p0,j$a p1){
       super(p0);
    }
    public j$b a(String p0,int p1){
       this.g(p0, String.valueOf(p1));
       return this;
    }
    public j$b b(String p0,long p1){
       this.g(p0, String.valueOf(p1));
       return this;
    }
    public j$b c(String p0,Object p1){
       this.g(p0, p1);
       return this;
    }
    public j$b d(String p0,boolean p1){
       this.g(p0, String.valueOf(p1));
       return this;
    }
    public final j$b$a e(){
       j$b$a uob$a = new j$b$a(null);
       this.c.c = uob$a;
       this.c = uob$a;
       return uob$a;
    }
    public final j$b f(Object p0){
       this.e().b = p0;
       return this;
    }
    public final j$b g(String p0,Object p1){
       j$b$a uob$a = this.e();
       uob$a.b = p1;
       n.j(p0);
       uob$a.a = p0;
       return this;
    }
    public j$b h(int p0){
       this.f(String.valueOf(p0));
       return this;
    }
    public j$b i(Object p0){
       this.f(p0);
       return this;
    }
    public j$b j(boolean p0){
       this.f(String.valueOf(p0));
       return this;
    }
    public String toString(){
       j$b td = this.d;
       StringBuilder str = new StringBuilder(32)+this.a+'{';
       j$b$a c = this.b.c;
       String str1 = "";
       while (c != null) {
          j$b$a b = c.b;
          if (td == null || b != null) {
             str = str+str1;
             j$b$a a = c.a;
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
