package bs6.a;
import javax.inject.Provider;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import com.kwai.kds.baidumap.modules.KdsBaiduMapModule;

public final class a implements Provider	// class@0005f5
{
    public final ReactApplicationContext a;

    public void a(ReactApplicationContext p0){
       this.a = p0;
    }
    public final Object get(){
       return new KdsBaiduMapModule(this.a);
    }
}
