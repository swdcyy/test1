package jq9.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jq9.g;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerFeed;
import java.lang.Object;
import com.kuaishou.android.model.mix.CoverMeta;

public class e extends Accessor	// class@002b40
{
    public final CoronaBannerFeed c;
    public final g d;

    public void e(g p0,CoronaBannerFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mCoverMeta;
    }
    public void set(Object p0){
       this.c.mCoverMeta = p0;
    }
}
