package bs6.g;
import javax.inject.Provider;
import java.lang.Object;
import com.kwai.kds.baidumap.mapview.KdsBaiduMapViewManager;

public final class g implements Provider	// class@0005fb
{
    public static final g a;

    static {
       g.a = new g();
    }
    public void g(){
       super();
    }
    public final Object get(){
       return new KdsBaiduMapViewManager();
    }
}
