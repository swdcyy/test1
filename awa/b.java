package awa.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import awa.e;
import com.yxcorp.gifshow.hotspot.HotspotNativeCardFragment;
import java.lang.Object;
import java.util.Map;

public class b extends Accessor	// class@000328
{
    public final HotspotNativeCardFragment c;
    public final e d;

    public void b(e p0,HotspotNativeCardFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.J;
    }
    public void set(Object p0){
       this.c.J = p0;
    }
}
