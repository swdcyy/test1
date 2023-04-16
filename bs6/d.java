package bs6.d;
import javax.inject.Provider;
import java.lang.Object;
import com.kwai.kds.baidumap.mapview.KdsBaiduMapMarkerManager;

public final class d implements Provider	// class@0005f8
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final Object get(){
       return new KdsBaiduMapMarkerManager();
    }
}
