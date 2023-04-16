package crb.b;
import zq6.u;
import crb.d;
import java.lang.Object;
import java.lang.Boolean;
import wq6.f;

public final class b implements u	// class@00239c
{
    public final d a;

    public void b(d p0){
       this.a = p0;
    }
    public final void onChange(Object p0){
       this.a.q.E0((p0.booleanValue() ^ 0x01));
    }
}
