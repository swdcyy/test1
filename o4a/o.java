package o4a.o;
import com.kwai.framework.player.helper.b$b;
import com.yxcorp.gifshow.detail.plc.presenter.PlcEntryLoggerImplPresenter;
import java.lang.Object;

public final class o implements b$b	// class@00328f
{
    public final PlcEntryLoggerImplPresenter a;

    public void o(PlcEntryLoggerImplPresenter p0){
       this.a = p0;
    }
    public final void a(boolean p0){
       o ta = this.a;
       if (p0) {
          ta.X8();
       }else {
          ta.Y8();
       }
       return;
    }
}
