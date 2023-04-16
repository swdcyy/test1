package awa.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import awa.e;
import com.yxcorp.gifshow.hotspot.HotspotNativeCardFragment;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;

public class a extends Accessor	// class@000327
{
    public final HotspotNativeCardFragment c;
    public final e d;

    public void a(e p0,HotspotNativeCardFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.h0();
    }
}
