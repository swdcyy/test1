package bs6.c;
import javax.inject.Provider;
import java.lang.Object;
import com.kwai.kds.baidumap.mapview.KdsBaiduMapInfoWindowManager;

public final class c implements Provider	// class@0005f7
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final Object get(){
       return new KdsBaiduMapInfoWindowManager();
    }
}
