package nfd.p0;
import erd.g;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.feature.api.feed.misc.retrofit.response.TagCollectResponse;

public final class p0 implements g	// class@001def
{
    public final Runnable b;

    public void p0(Runnable p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.run();
    }
}
