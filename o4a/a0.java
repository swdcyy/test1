package o4a.a0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import o4a.b0;
import com.yxcorp.gifshow.detail.plc.presenter.PlcEntryLoggerImplPresenter;
import java.lang.Object;

public class a0 extends Accessor	// class@00327f
{
    public final PlcEntryLoggerImplPresenter c;
    public final b0 d;

    public void a0(b0 p0,PlcEntryLoggerImplPresenter p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c;
    }
}
