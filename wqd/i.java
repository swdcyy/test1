package wqd.i;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import wqd.h;
import zqd.o;
import java.util.Map;
import java.lang.IllegalArgumentException;

public abstract class i	// class@002910
{
    public final Map a;
    public int b;

    public void i(){
       super();
       this.a = new HashMap();
       this.b = 1;
    }
    public abstract h a(int p0,String p1);
    public h b(String p0){
       h oh;
       i ta = this.a;
       _monitor_enter(ta);
       o.a(p0, "name");
       if (p0.isEmpty()) {
          throw new IllegalArgumentException("empty name");
       }
       i ta1 = this.a;
       _monitor_enter(ta1);
       _monitor_exit(ta1);
       if (this.a.containsKey(p0)) {
          oh = this.a.get(p0);
       }else {
          ta1 = this.a;
          _monitor_enter(ta1);
          h oh1 = this.a(this.b, p0);
          this.a.put(p0, oh1);
          this.b = this.b + 1;
          _monitor_exit(ta1);
          oh = oh1;
       }
       _monitor_exit(ta);
       return oh;
    }
}
