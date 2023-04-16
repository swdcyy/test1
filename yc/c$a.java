package yc.c$a;
import java.lang.Object;
import com.facebook.imageformat.a;
import com.facebook.imageformat.a$a;
import yc.b;
import java.util.ArrayList;
import java.util.List;
import yc.c;
import java.util.HashMap;
import java.util.Map;

public class c$a	// class@002882
{
    public Map a;
    public List b;

    public void c$a(){
       super();
    }
    public c$a a(a p0,a$a p1,b p2){
       if (this.b == null) {
          this.b = new ArrayList();
       }
       this.b.add(p1);
       this.c(p0, p2);
       return this;
    }
    public c b(){
       return new c(this);
    }
    public c$a c(a p0,b p1){
       if (this.a == null) {
          this.a = new HashMap();
       }
       this.a.put(p0, p1);
       return this;
    }
}
