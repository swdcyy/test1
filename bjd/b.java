package bjd.b;
import bjd.b$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class b	// class@00026a
{
    public String a;
    public int b;
    public static final b$a c;

    static {
       b.c = new b$a(null);
    }
    public void b(String p0,int p1){
       a.q(p0, "host");
       super();
       this.a = "";
       this.a = p0;
       this.b = p1;
    }
    public final int a(){
       return this.b;
    }
    public String toString(){
       return "CdnHost\(host=\'"+this.a+"\', weight=\'"+this.b+"\'\)";
    }
}
