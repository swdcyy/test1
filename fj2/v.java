package fj2.v;
import nl8.m;
import android.view.View$OnClickListener;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z61.e;
import z61.b;
import java.lang.Boolean;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import fj2.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nl8.l;
import nl8.o;
import lp3.e;
import java.lang.Integer;

public class v implements m	// class@002984
{
    public e a;
    public final e b;
    public final MutableLiveData c;

    public void v(View$OnClickListener p0){
       super();
       this.c = new MutableLiveData();
       e uoe = PatchProxy.applyOneRefs(p0, this, v.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e();
          uoe.mFeatureId = 1027;
          uoe.mIsVisible = Boolean.FALSE;
          uoe.mIconRes = 0x7f081394;
          uoe.mTextRes = 0x7f102c0a;
          uoe.mClickCallback = new u(p0);
       }
       this.b = uoe;
       return;
    }
    public void e(PresenterV2 p0){
       l.a(this, p0);
    }
    public void i(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "6")) {
          return;
       }
       this.a = p0.f("LIVE_SERVICE_MANAGER");
       return;
    }
    public void l(int p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ov, "3")) {
          return;
       }
       ov = this.b;
       ov.mTextRes = p0;
       this.c.setValue(ov);
       return;
    }
    public void setVisible(boolean p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ov, "2")) {
          return;
       }
       this.b.mIsVisible = Boolean.valueOf(p0);
       this.c.setValue(this.b);
       return;
    }
}
