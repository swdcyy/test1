package ekd.a1;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.lang.IllegalArgumentException;
import java.lang.String;

public class a1	// class@000d24
{
    public final List a;
    public int b;

    public void a1(){
       super();
       this.a = new ArrayList();
    }
    public void a(List p0){
       if (p0.isEmpty()) {
          throw new IllegalArgumentException("elements can not be empty");
       }
       this.a.addAll(p0);
       return;
    }
    public Object b(){
       return this.a.get(this.b);
    }
    public int c(){
       return this.b;
    }
    public void d(){
       this.b = (this.b + 1) % this.a.size();
    }
    public int e(){
       return this.a.size();
    }
}
