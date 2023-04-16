package jw8.g;
import java.util.concurrent.Callable;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Object;
import mca.a;

public final class g implements Callable	// class@0029be
{
    public final VideoContext b;

    public void g(VideoContext p0){
       this.b = p0;
    }
    public final Object call(){
       return a.p(this.b);
    }
}
