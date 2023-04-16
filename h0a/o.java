package h0a.o;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import h0a.p;
import com.yxcorp.gifshow.detail.fragments.NasaMilanoSlidePlayContainerFragment;
import java.lang.Object;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;

public class o extends Accessor	// class@002537
{
    public final NasaMilanoSlidePlayContainerFragment c;
    public final p d;

    public void o(p p0,NasaMilanoSlidePlayContainerFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.C;
    }
    public void set(Object p0){
       this.c.C = p0;
    }
}
