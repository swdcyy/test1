package jq9.s;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jq9.v;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelFeed;
import java.lang.Object;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelContent;

public class s extends Accessor	// class@002b5c
{
    public final CoronaSubChannelFeed c;
    public final v d;

    public void s(v p0,CoronaSubChannelFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mCoronaSubChannelContent;
    }
    public void set(Object p0){
       this.c.mCoronaSubChannelContent = p0;
    }
}
