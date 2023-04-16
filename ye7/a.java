package ye7.a;
import java.lang.Cloneable;
import ye7.a$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class a implements Cloneable	// class@003dbc
{
    public int b;
    public Map c;
    public List d;
    public int endReason;
    public long endTime;
    public String extra;
    public int startReason;
    public long startTime;
    public String uuid;
    public String version;
    public static final a$a e;

    static {
       a.e = new a$a(null);
    }
    public void a(int p0){
       super();
       this.b = p0;
       this.startReason = 16;
       this.endReason = 16;
       this.d = new ArrayList();
    }
    public final List a(){
       return this.d;
    }
    public final int b(){
       return this.b;
    }
    public void c(String p0){
       this.extra = p0;
    }
    public Object clone(){
       return super.clone();
    }
    public void d(){
    }
}
