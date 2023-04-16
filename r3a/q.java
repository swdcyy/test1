package r3a.q;
import com.yxcorp.gifshow.util.t0$a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;

public abstract class q implements t0$a	// class@003860
{

    public void q(){
       super();
    }
    public void a(){
    }
    public void b(){
    }
    public abstract QPhoto c();
    public boolean d(){
       return false;
    }
    public void onAudioFocusChange(int p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oq, "1")) {
          return;
       }
       if (this.d()) {
          return;
       }
       QPhoto qPhoto = this.c();
       if (qPhoto == null) {
          return;
       }
       Log.g("NasaAudioChangeP", "onAudioFocusChanged: "+p0);
       if (p0 != -2) {
          if (p0 == 1) {
             a.d().k(new PlayEvent(qPhoto, PlayEvent$Status.RESUME, 516));
          }
       }else {
          a.d().k(new PlayEvent(qPhoto, PlayEvent$Status.PAUSE, 516));
       }
       return;
    }
}
