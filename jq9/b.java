package jq9.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jq9.g;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerFeed;
import java.lang.Object;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerCommon;

public class b extends Accessor	// class@002b37
{
    public final CoronaBannerFeed c;
    public final g d;

    public void b(g p0,CoronaBannerFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mCoronaBannerCommon;
    }
    public void set(Object p0){
       this.c.mCoronaBannerCommon = p0;
    }
}
