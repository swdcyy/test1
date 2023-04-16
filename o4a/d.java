package o4a.d;
import z1.a;
import com.yxcorp.gifshow.detail.plc.presenter.b;
import java.lang.Object;
import java.lang.Integer;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import f4a.b0;

public final class d implements a	// class@003284
{
    public final b a;

    public void d(b p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       d ta = this.a;
       ta.D.x(ta.K.getActionType(), p0.intValue());
    }
}
