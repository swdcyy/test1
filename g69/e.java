package g69.e;
import na5.b;
import com.yxcorp.gifshow.aggregate.user.UserAggregateFragment$a;
import java.lang.Object;
import java.util.Map;
import com.yxcorp.gifshow.aggregate.user.UserAggregateFragment;
import com.yxcorp.gifshow.pymk.f;
import a7c.h;
import java.lang.Integer;

public final class e implements b	// class@002424
{
    public final UserAggregateFragment$a a;

    public void e(UserAggregateFragment$a p0){
       this.a = p0;
    }
    public final void a(Map p0){
       p0.put("portal", Integer.valueOf(this.a.c.O.s().l2()));
       p0.put("render", Integer.valueOf(0));
    }
}
