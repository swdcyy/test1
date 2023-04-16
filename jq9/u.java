package jq9.u;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jq9.v;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelFeed;
import java.lang.Object;

public class u extends Accessor	// class@002b60
{
    public final CoronaSubChannelFeed c;
    public final v d;

    public void u(v p0,CoronaSubChannelFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c;
    }
}
