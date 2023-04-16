package b62.i0;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.view.View;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class i0 extends c	// class@000341
{
    public String p;
    public TextView q;
    public static String sLivePresenterClassName = "LiveConditionRedPacketRecyclerUsersTipPresenter";

    public void i0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "3")) {
          return;
       }
       if (!TextUtils.x(this.p)) {
          this.q.setText(this.p);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a1b69);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "1")) {
          return;
       }
       this.p = this.r8("ConditionRedPacketRecyclerTips");
       return;
    }
}
