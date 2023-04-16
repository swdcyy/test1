package o4a.i;
import erd.g;
import com.yxcorp.gifshow.detail.plc.presenter.b;
import java.lang.Object;
import java.lang.Integer;

public final class i implements g	// class@003289
{
    public final b b;

    public void i(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.R8(p0.intValue());
    }
}
