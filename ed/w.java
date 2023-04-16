package ed.w;
import android.util.SparseIntArray;
import java.lang.Object;
import ab.e;

public class w	// class@00153f
{
    public final int a;
    public final int b;
    public final SparseIntArray c;
    public final int d;
    public final int e;
    public String f;
    public boolean g;
    public final int h;

    public void w(int p0,int p1,SparseIntArray p2){
       super(p0, p1, p2, 0, Integer.MAX_VALUE, -1);
    }
    public void w(int p0,int p1,SparseIntArray p2,int p3,int p4,int p5){
       super();
       boolean b = (p0 >= 0 && p1 >= p0)? true: false;
       e.f(b);
       this.b = p0;
       this.a = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.h = p5;
       return;
    }
}
