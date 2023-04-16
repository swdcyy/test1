package o4a.r;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.plc.presenter.PlcEntryLoggerImplPresenter;
import java.lang.Object;

public final class r implements Runnable	// class@003292
{
    public final PlcEntryLoggerImplPresenter b;

    public void r(PlcEntryLoggerImplPresenter p0){
       this.b = p0;
    }
    public final void run(){
       r tb = this.b;
       long l = tb.H + 1000;
       tb.H = l;
       if (tb.G == null && l - tb.I >= 0) {
          tb.G = true;
          tb.P8();
       }
       return;
    }
}
