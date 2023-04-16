package y0.a;
import y0.b;
import java.util.HashMap;
import java.lang.Object;
import y0.b$c;
import java.util.Map$Entry;

public class a extends b	// class@00282b
{
    public HashMap f;

    public void a(){
       super();
       this.f = new HashMap();
    }
    public boolean contains(Object p0){
       return this.f.containsKey(p0);
    }
    public b$c d(Object p0){
       return this.f.get(p0);
    }
    public Object p(Object p0,Object p1){
       b$c uoc = this.d(p0);
       if (uoc != null) {
          return uoc.c;
       }
       this.f.put(p0, this.n(p0, p1));
       return null;
    }
    public Object q(Object p0){
       this.f.remove(p0);
       return super.q(p0);
    }
    public Map$Entry r(Object p0){
       if (this.contains(p0)) {
          return this.f.get(p0).e;
       }
       return null;
    }
}
