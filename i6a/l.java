package i6a.l;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import i6a.n;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestManagementV3Fragment;
import java.lang.Object;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;

public class l extends Accessor	// class@00279d
{
    public final InterestManagementV3Fragment c;
    public final n d;

    public void l(n p0,InterestManagementV3Fragment p1){
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
