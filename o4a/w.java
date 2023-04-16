package o4a.w;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.plc.presenter.PlcEntryLoggerImplPresenter$a;
import java.lang.Object;
import com.yxcorp.gifshow.detail.plc.presenter.PlcEntryLoggerImplPresenter;
import com.yxcorp.gifshow.detail.plc.mix.f;

public final class w implements Runnable	// class@003297
{
    public final PlcEntryLoggerImplPresenter$a b;
    public final int c;

    public void w(PlcEntryLoggerImplPresenter$a p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.f.z.q(1, this.c);
    }
}
