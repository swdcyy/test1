package i91.d;
import erd.g;
import java.lang.String;
import java.lang.Object;
import crd.b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Boolean;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class d implements g	// class@00285e
{
    public final boolean b;
    public final String c;

    public void d(boolean p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       b.d0(LiveLogTag.LIVE_ARYA_SO_LOAD, "loadAryaEnvAsync", "showLoading", Boolean.valueOf(this.b), "pluginName", this.c);
    }
}
