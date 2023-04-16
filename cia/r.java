package cia.r;
import erd.g;
import com.yxcorp.gifshow.action.i;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.data.FeedsResponse;
import com.yxcorp.gifshow.action.RealActionBizType;
import yv8.c;
import yv8.a;

public final class r implements g	// class@000514
{
    public final i b;

    public void r(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.d(RealActionBizType.FOLLOW, null);
    }
}
