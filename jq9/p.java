package jq9.p;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jq9.v;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelFeed;
import java.lang.Object;
import com.kuaishou.android.model.mix.CommonMeta;

public class p extends Accessor	// class@002b56
{
    public final CoronaSubChannelFeed c;
    public final v d;

    public void p(v p0,CoronaSubChannelFeed p1){
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
