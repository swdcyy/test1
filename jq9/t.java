package jq9.t;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jq9.v;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelFeed;
import java.lang.Object;
import com.kuaishou.android.model.mix.CoverMeta;

public class t extends Accessor	// class@002b5e
{
    public final CoronaSubChannelFeed c;
    public final v d;

    public void t(v p0,CoronaSubChannelFeed p1){
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
