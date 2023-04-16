package awa.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import awa.e;
import com.yxcorp.gifshow.hotspot.HotspotNativeCardFragment;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;

public class c extends Accessor	// class@000329
{
    public final HotspotNativeCardFragment c;
    public final e d;

    public void c(e p0,HotspotNativeCardFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.I;
    }
    public void set(Object p0){
       this.c.I = p0;
    }
}
