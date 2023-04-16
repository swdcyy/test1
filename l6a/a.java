package l6a.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import l6a.d;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.NasaRecommendUserFeed;
import java.lang.Object;
import com.kuaishou.android.model.mix.CommonMeta;

public class a extends Accessor	// class@002d57
{
    public final NasaRecommendUserFeed c;
    public final d d;

    public void a(d p0,NasaRecommendUserFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mCommonMeta;
    }
    public void set(Object p0){
       this.c.mCommonMeta = p0;
    }
}
