package jq9.q;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jq9.v;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelFeed;
import java.lang.Object;
import com.kuaishou.android.model.mix.CoronaInfo;

public class q extends Accessor	// class@002b58
{
    public final CoronaSubChannelFeed c;
    public final v d;

    public void q(v p0,CoronaSubChannelFeed p1){
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
