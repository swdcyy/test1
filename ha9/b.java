package ha9.b;
import ha9.a;
import java.util.List;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.util.ArrayList;

public class b extends a	// class@002579
{
    public int f;
    public List g;

    public void b(){
       super(null, 1, null);
    }
    public void b(List p0){
       a.q(p0, "list");
       super(p0);
       this.g = p0;
       this.f = -2;
    }
    public void b(List p0,int p1,u p2){
       ArrayList uArrayList = (p1 & 0x01)? new ArrayList(): null;
       super(uArrayList);
       return;
    }
    public final List g(){
       return this.g;
    }
}
