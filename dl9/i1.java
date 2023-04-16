package dl9.i1;
import ok.h;
import dl9.u1;
import java.lang.Object;
import java.lang.Void;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import dl9.l1;
import erd.g;
import crd.b;

public final class i1 implements h	// class@001f6b
{
    public final u1 b;

    public void i1(u1 p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       i1 tb = this.b;
       return tb.v.observable().subscribe(new l1(tb));
    }
}
