package i6a.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import i6a.e;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestLabelsFragment;
import java.lang.Object;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;

public class c extends Accessor	// class@00278d
{
    public final InterestLabelsFragment c;
    public final e d;

    public void c(e p0,InterestLabelsFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.F;
    }
    public void set(Object p0){
       this.c.F = p0;
    }
}
