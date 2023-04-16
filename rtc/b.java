package rtc.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import ekd.m1;
import android.widget.RelativeLayout;
import java.lang.Integer;

public class b extends PresenterV2	// class@003957
{
    public RelativeLayout p;
    public int q;
    public int r;
    public int s;

    public void b(){
       super();
    }
    public void E8(){
       PatchProxy.applyVoid(null, this, b.class, "3");
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3b65);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.q = this.r8("POSITION").intValue();
       this.r = this.r8("ARG_STICKER_COLS").intValue();
       this.s = this.r8("ARG_STICKER_SPACING").intValue();
       return;
    }
}
