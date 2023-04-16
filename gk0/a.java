package gk0.a;
import java.lang.String;
import java.lang.Object;
import android.net.Uri;

public class a	// class@002507
{
    public String a;
    public String b;
    public int c;
    public String d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public void a(int p0,String p1,long p2,long p3,long p4,long p5,long p6){
       super();
       this.c = p0;
       this.d = Uri.parse(p1).getPath();
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.i = p6;
    }
    public void a(String p0,String p1,String p2,long p3,long p4){
       super();
       this.a = p0;
       this.b = p1;
       this.d = Uri.parse(p2).getPath();
       this.e = p3;
       this.f = p4;
    }
}
