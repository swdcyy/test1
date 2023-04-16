package h33.b0$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h33.b0;
import h33.b0$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.kwai.framework.model.user.QCurrentUser;
import android.view.View;
import ekd.m1;

public class b0$a extends PresenterV2	// class@002c1b
{
    public SlipSwitchButton p;
    public SlipSwitchButton$b q;
    public final b0 r;
    public static String sLivePresenterClassName = "NotShareLiveStreamSegmentEntryHolder$NotShareLiveStreamSegmentPresenter";

    public void b0$a(b0 p0){
       this.r = p0;
       super();
       this.q = new b0$a$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b0$a.class, "2")) {
          return;
       }
       this.p.setOnSwitchChangeListener(objArray);
       this.p.setSwitch(QCurrentUser.ME.isNotShareLiveStreamSegment());
       this.p.setOnSwitchChangeListener(this.q);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0$a.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3c3f);
       return;
    }
}
