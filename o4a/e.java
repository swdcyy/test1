package o4a.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.plc.presenter.b;
import java.lang.Object;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import f4a.f;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger$Event;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger;

public final class e implements Runnable	// class@003285
{
    public final b b;

    public void e(b p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       if (tb.s.mStyleInfo.mHidePlcAfterStrongDisappear != null) {
          if (tb.W.d != null) {
             tb.R8(9);
          }
       }else if(tb.W.b != null){
          tb.R8(4);
       }
       TunaPlcLogger.d(TunaPlcLogger$Event.AUTO_DISMISS, tb.p);
       return;
    }
}
