package ee.a;
import java.lang.Object;
import com.facebook.react.bridge.WritableMap;
import ee.f;
import java.lang.String;

public class a	// class@001f3d
{
    public final String a;
    public final WritableMap b;
    public final long c;
    public final boolean d;
    public final f e;

    public void a(a p0){
       super();
       this.a = p0.a;
       this.b = p0.b.copy();
       this.c = p0.c;
       this.d = p0.d;
       p0 = p0.e;
       this.e = (p0 != null)? p0.copy(): null;
       return;
    }
    public void a(String p0,WritableMap p1,long p2,boolean p3,f p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public WritableMap a(){
       return this.b;
    }
    public String b(){
       return this.a;
    }
    public long c(){
       return this.c;
    }
    public boolean d(){
       return this.d;
    }
}
