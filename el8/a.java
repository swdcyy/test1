package el8.a;
import el8.d;
import java.lang.Object;
import java.util.ArrayList;
import el8.b;
import dl8.a;
import dl8.a$b;
import el8.c;
import java.util.List;
import java.lang.Integer;

public final class a implements d	// class@0021ff
{
    public final List a;
    public c b;
    public a c;

    public void a(){
       super();
       this.a = new ArrayList();
       this.b = new b();
    }
    public a a(){
       if (this.c == null) {
          this.c = new a$b().a();
       }
       return this.c;
    }
    public c b(){
       return this.b;
    }
    public List c(){
       return this.a;
    }
    public void d(int p0){
       this.a.add(Integer.valueOf(p0));
    }
    public void e(c p0){
       this.b = p0;
    }
    public void f(a p0){
       this.c = p0;
    }
}
