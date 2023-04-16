package gqb.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fqb.c;
import android.app.Activity;
import ypb.a;
import zpb.a;
import gqb.a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.music.radio.notification.MusicNotificationHelper;
import fqb.b;
import rm9.a;
import android.content.ServiceConnection;
import qm9.f;
import java.lang.RuntimeException;
import q87.c;

public class b extends PresenterV2	// class@002b72
{
    public b p;
    public c q;
    public a r;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.q = new c(this.getActivity());
       this.r = a.a(this.getActivity());
       b tq = this.q;
       a uoa = new a(this);
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoidOneRefs(uoa, tq, c.class, "1")) {
          a.p(uoa, "callBack");
          tq.c = uoa;
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, b.class, str)) {
          return;
       }
       b tp = this.p;
       if (tp != null && tp.a() != null) {
          this.p.a().v();
       }
       tp = this.q;
       if (tp != null) {
          Objects.requireNonNull(tp);
          if (!PatchProxy.applyVoid(objArray, tp, c.class, str)) {
             c a = tp.a;
             if (a != null) {
                try{
                   tp.d.unbindService(a);
                }catch(java.lang.RuntimeException e0){
                   Object[] objArray1 = new Object[0];
                   f.C().t("MusicRadioService", e0.toString(), objArray1);
                }
             }
          }
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("MUSIC_RADIO_NOTIFICATION_HELPER");
       return;
    }
}
