package dbc.g;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.intimate.rn.IntimateRelationBridge;
import com.yxcorp.gifshow.relation.intimate.rn.IntimateRNModel;
import java.lang.Object;

public final class g implements Runnable	// class@002161
{
    public final IntimateRelationBridge b;
    public final IntimateRNModel c;

    public void g(IntimateRelationBridge p0,IntimateRNModel p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       IntimateRelationBridge.a(this.b, this.c);
    }
}
