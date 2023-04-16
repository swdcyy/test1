package h0a.q;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import h0a.s;
import com.yxcorp.gifshow.detail.fragments.NormalDetailContainerFragment;
import java.lang.Object;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;

public class q extends Accessor	// class@002539
{
    public final NormalDetailContainerFragment c;
    public final s d;

    public void q(s p0,NormalDetailContainerFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.p;
    }
    public void set(Object p0){
       this.c.p = p0;
    }
}
