package dbc.h;
import javax.inject.Provider;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import com.yxcorp.gifshow.relation.intimate.rn.IntimateRelationBridge;

public final class h implements Provider	// class@002162
{
    public final ReactApplicationContext a;

    public void h(ReactApplicationContext p0){
       this.a = p0;
    }
    public final Object get(){
       return new IntimateRelationBridge(this.a);
    }
}
