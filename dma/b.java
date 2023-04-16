package dma.b;
import javax.inject.Provider;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import com.yxcorp.gifshow.gamecenter.krn.bridge.ZtGameKrnDownloadBridge;

public final class b implements Provider	// class@0024c8
{
    public final ReactApplicationContext a;

    public void b(ReactApplicationContext p0){
       this.a = p0;
    }
    public final Object get(){
       return new ZtGameKrnDownloadBridge(this.a);
    }
}
