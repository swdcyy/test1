package f6a.g$a;
import android.telephony.PhoneStateListener;
import f6a.g;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;

public final class g$a extends PhoneStateListener	// class@0022d1
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void onCallStateChanged(int p0,String p1){
       if (PatchProxy.isSupport2(g$a.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(Integer.valueOf(p0), p1, this, g$a.class, "1")) {
          return;
       }
       super.onCallStateChanged(p0, p1);
       if (p0) {
          if (p0 == 1) {
             this.a.l9(3);
          }
       }else {
          this.a.m9(3);
       }
       PatchProxy.onMethodExit(g$a.class, "1");
       return;
    }
}
