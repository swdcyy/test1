package dbc.c;
import erd.g;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.yxcorp.gifshow.relation.intimate.rn.IntimateRelationBridge;

public final class c implements g	// class@00215d
{
    public final Promise b;

    public void c(Promise p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       IntimateRelationBridge.lambda$changeShowStatus$4(this.b, p0);
    }
}
