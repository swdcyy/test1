package kotlin.collections.SlidingWindowKt$a;
import wsd.m;
import java.lang.Object;
import java.util.Iterator;
import kotlin.collections.SlidingWindowKt;

public final class SlidingWindowKt$a implements m	// class@001854
{
    public final m a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public void SlidingWindowKt$a(m p0,int p1,int p2,boolean p3,boolean p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public Iterator iterator(){
       return SlidingWindowKt.b(this.a.iterator(), this.b, this.c, this.d, this.e);
    }
}
