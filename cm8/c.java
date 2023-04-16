package cm8.c;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import java.util.Map;
import am8.b;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import cm8.a;
import java.lang.RuntimeException;

public class c	// class@0003c8
{
    public Map a;

    public void c(){
       super();
       this.a = new ConcurrentHashMap();
    }
    public void a(String p0){
       if (this.a.containsKey(p0)) {
          if (!b.b) {
             return;
          }else {
             throw new IllegalArgumentException("executor name "+p0+" already inited");
          }
       }else if(!this.a.containsKey(p0)){
          this.a.put(p0, new a());
       }
       return;
    }
    public a b(String p0){
       if (this.a.containsKey(p0)) {
          return this.a.get(p0);
       }
       throw new RuntimeException("fixed executor "+p0+" is not inited");
    }
}
