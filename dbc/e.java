package dbc.e;
import erd.g;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.relation.intimate.rn.IntimateRelationBridge;

public final class e implements g	// class@00215f
{
    public final Promise b;

    public void e(Promise p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       IntimateRelationBridge.lambda$approveChange$3(this.b, p0);
    }
}
