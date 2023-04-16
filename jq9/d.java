package jq9.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jq9.g;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerFeed;
import java.lang.Object;
import com.kuaishou.android.model.mix.CoronaInfo;

public class d extends Accessor	// class@002b3d
{
    public final CoronaBannerFeed c;
    public final g d;

    public void d(g p0,CoronaBannerFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mCoronaInfo;
    }
    public void set(Object p0){
       this.c.mCoronaInfo = p0;
    }
}
