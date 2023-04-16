package ikd.a;
import ikd.a$a;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.lang.Integer;
import com.smile.gifshow.annotation.plugin.Factory;
import com.smile.gifshow.annotation.plugin.a;

public class a	// class@001800
{
    public final Map a;
    public final Map b;
    public final Set c;
    public final a$a d;

    public void a(a$a p0){
       super();
       this.a = new ConcurrentHashMap(512);
       this.b = new ConcurrentHashMap(128);
       this.c = Collections.newSetFromMap(new ConcurrentHashMap());
       this.d = p0;
    }
    public Object a(Integer p0){
       Factory uFactory = this.b(p0);
       if (uFactory != null) {
          return uFactory.getInstance();
       }
       return null;
    }
    public final Factory b(Integer p0){
       Factory uFactory = this.a.get(p0);
       if (uFactory != null) {
          return uFactory;
       }
       a ta = this.a;
       _monitor_enter(ta);
       Factory uFactory1 = this.a.get(p0);
       if (uFactory1 != null) {
          _monitor_exit(ta);
          return uFactory1;
       }else {
          uFactory1 = this.d.a(p0);
          if (uFactory1 != null) {
             if (uFactory1 instanceof a) {
                if (this.b.containsKey(p0)) {
                   uFactory1 = this.b.get(p0);
                }else {
                   this.b.put(p0, uFactory1);
                }
             }else {
                this.a.put(p0, uFactory1);
             }
             _monitor_exit(ta);
             return uFactory1;
          }else {
             _monitor_exit(ta);
             return this.b.get(p0);
          }
       }
    }
}
