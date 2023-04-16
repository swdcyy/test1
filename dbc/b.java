package dbc.b;
import erd.g;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import com.yxcorp.gifshow.relation.intimate.model.IntimateDeleteResponse;
import com.yxcorp.gifshow.relation.intimate.rn.IntimateRelationBridge;

public final class b implements g	// class@00215c
{
    public final Promise b;

    public void b(Promise p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       IntimateRelationBridge.lambda$delete$5(this.b, p0);
    }
}
