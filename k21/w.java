package k21.w;
import nl8.m;
import android.view.View$OnClickListener;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import z61.e;
import z61.b;
import k21.v;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nl8.l;
import nl8.o;
import lp3.e;

public class w implements m	// class@002c7c
{
    public e a;
    public final e b;
    public final MutableLiveData c;

    public void w(View$OnClickListener p0,boolean p1){
       e uoe;
       super();
       this.c = new MutableLiveData();
       w ow = w.class;
       if (PatchProxy.isSupport(ow)) {
          uoe = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, ow, "2");
          if (uoe != PatchProxyResult.class) {
          label_0041 :
             this.b = uoe;
             return;
          }
       }
       uoe = new e();
       uoe.mFeatureId = 1007;
       uoe.mClickCallback = new v(p0);
       uoe.mIsVisible = Boolean.FALSE;
       uoe.mTextRes = 0x7f101ee8;
       uoe.mIconRes = 0x7f081399;
       goto label_0041 ;
    }
    public void e(PresenterV2 p0){
       l.a(this, p0);
    }
    public void i(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "1")) {
          return;
       }
       this.a = p0.f("LIVE_SERVICE_MANAGER");
       return;
    }
    public void setVisible(boolean p0){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ow, "5")) {
          return;
       }
       this.b.mIsVisible = Boolean.valueOf(p0);
       this.c.setValue(this.b);
       return;
    }
}
