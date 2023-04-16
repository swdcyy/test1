package e0.a$a;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;

public class a$a	// class@001e71
{
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final List f;
    public static final boolean g;

    public void a$a(int p0,String p1,int p2,int p3,int p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = new ArrayList(1);
    }
    public synchronized boolean a(int p0,String p1,int p2,int p3,int p4,int p5){
       if (this.f.size() >= 256) {
          return false;
       }
       this.f.add(Integer.valueOf(p2));
       return true;
    }
}
