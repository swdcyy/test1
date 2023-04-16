package i6a.h;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import i6a.j;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestManagementFragment;
import java.lang.Object;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;

public class h extends Accessor	// class@002799
{
    public final InterestManagementFragment c;
    public final j d;

    public void h(j p0,InterestManagementFragment p1){
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
