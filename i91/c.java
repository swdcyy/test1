package i91.c;
import erd.g;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class c implements g	// class@00285d
{
    public final String b;

    public void c(String p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b.c0(LiveLogTag.LIVE_ARYA_SO_LOAD, "loadAryaEnvAsync fatal:"+p0.toString(), "pluginName", this.b);
    }
}
