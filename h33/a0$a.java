package h33.a0$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h33.a0;
import h33.z;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.kwai.library.widget.button.SlipSwitchButton;
import oe6.e;
import android.content.SharedPreferences;
import android.view.View;
import ekd.m1;

public class a0$a extends PresenterV2	// class@002c17
{
    public SlipSwitchButton p;
    public SlipSwitchButton$b q;
    public final a0 r;
    public static String sLivePresenterClassName = "LiveRobotEntryHolder$ShieldFriendPresenter";

    public void a0$a(a0 p0){
       this.r = p0;
       super();
       this.q = z.a;
    }
    public void F8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a0$a.class, "2")) {
          return;
       }
       this.p.setOnSwitchChangeListener(objArray);
       this.p.setSwitch((e.a.getBoolean("hasAudienceOpenRobotSwitch", false) ^ 0x01));
       this.p.setOnSwitchChangeListener(this.q);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0$a.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3c3f);
       return;
    }
}
