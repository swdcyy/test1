package jq9.o0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jq9.q0;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneFeed;
import java.lang.Object;
import com.kuaishou.android.model.mix.CoverMeta;

public class o0 extends Accessor	// class@002b53
{
    public final CoronaZoneFeed c;
    public final q0 d;

    public void o0(q0 p0,CoronaZoneFeed p1){
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
