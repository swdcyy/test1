package dbc.d;
import erd.g;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.relation.intimate.rn.IntimateRelationBridge;

public final class d implements g	// class@00215e
{
    public final Promise b;

    public void d(Promise p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       IntimateRelationBridge.lambda$approve$2(this.b, p0);
    }
}
