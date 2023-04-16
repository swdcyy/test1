package dx1.b;
import dx1.b$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;

public class b	// class@00205d
{
    public final String a;
    public final int b;
    public final int c;
    public static final b$a d;

    static {
       b.d = new b$a(null);
    }
    public void b(String p0,int p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void b(String p0,int p1,int p2,int p3,u p4){
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final String a(){
       return this.a;
    }
    public final int b(){
       return this.b;
    }
    public final int c(){
       return this.c;
    }
}
