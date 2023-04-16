package elb.e;
import java.lang.String;
import c0d.d;
import java.util.Set;
import java.lang.Object;

public class e	// class@002746
{
    public final String a;
    public final String b;
    public final d c;
    public final boolean d;
    public final Set e;
    public final Map f;
    public String g;
    public String h;
    public String i;

    public void e(String p0,String p1,d p2,boolean p3,Set p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = null;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof e) {
          return false;
       }
       e tb = this.b;
       p0 = p0.b;
       if (tb != null) {
          b = tb.equals(p0);
       }else if(p0 == null){
          b = false;
       }
       return b;
    }
}
