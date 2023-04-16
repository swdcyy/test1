package jq9.l0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jq9.q0;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneFeed;
import java.lang.Object;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneContent;

public class l0 extends Accessor	// class@002b4d
{
    public final CoronaZoneFeed c;
    public final q0 d;

    public void l0(q0 p0,CoronaZoneFeed p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mContent;
    }
    public void set(Object p0){
       this.c.mContent = p0;
    }
}
