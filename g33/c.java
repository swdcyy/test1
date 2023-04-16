package g33.c;
import erd.g;
import com.kuaishou.live.external.l;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import com.kuaishou.live.basic.userlayer.LiveUserLayerManager$UserLayer;

public final class c implements g	// class@002a4d
{
    public final l b;
    public final RequestTiming c;

    public void c(l p0,RequestTiming p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       this.b.n(this.c, p0);
    }
}
