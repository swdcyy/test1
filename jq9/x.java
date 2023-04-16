package jq9.x;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jq9.a0;
import com.yxcorp.gifshow.corona.common.model.CoronaTitleFeed;
import java.lang.Object;
import com.kuaishou.android.model.mix.CoronaInfo;

public class x extends Accessor	// class@002b66
{
    public final CoronaTitleFeed c;
    public final a0 d;

    public void x(a0 p0,CoronaTitleFeed p1){
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
