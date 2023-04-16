package o4a.y;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import o4a.b0;
import com.yxcorp.gifshow.detail.plc.presenter.PlcEntryLoggerImplPresenter;
import java.lang.Object;
import f4a.z;

public class y extends Accessor	// class@003299
{
    public final PlcEntryLoggerImplPresenter c;
    public final b0 d;

    public void y(b0 p0,PlcEntryLoggerImplPresenter p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.u;
    }
    public void set(Object p0){
       this.c.u = p0;
    }
}
