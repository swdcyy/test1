package a10.b;
import z1.a;
import java.lang.String;
import java.lang.Object;
import a10.f;

public final class b implements a	// class@00000c
{
    public final int a;
    public final String b;

    public void b(int p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       p0.onQosEventUpdated(this.a, this.b);
    }
}
