package jq9.r;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jq9.v;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelFeed;
import java.lang.Object;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelCommon;

public class r extends Accessor	// class@002b5a
{
    public final CoronaSubChannelFeed c;
    public final v d;

    public void r(v p0,CoronaSubChannelFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mCoronaSubChannelCommon;
    }
    public void set(Object p0){
       this.c.mCoronaSubChannelCommon = p0;
    }
}
