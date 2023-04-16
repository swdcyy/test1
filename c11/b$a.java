package c11.b$a;
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
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import java.lang.Boolean;
import c11.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nl8.l;
import nl8.o;
import kotlin.jvm.internal.a;
import lp3.e;

public final class b$a implements m	// class@00044b
{
    public e a;
    public final MutableLiveData b;
    public e c;
    public final View$OnClickListener d;

    public void b$a(View$OnClickListener p0){
       super();
       this.d = p0;
       this.b = new MutableLiveData();
       e uoe = PatchProxy.apply(null, this, b$a.class, "5");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e();
          uoe.mFeatureId = 1040;
          uoe.mIconRes = 0x7f08133d;
          uoe.mTextRes = 0x7f101257;
          uoe.mIsVisible = Boolean.FALSE;
          uoe.mClickCallback = new a(this);
       }
       this.c = uoe;
       return;
    }
    public void e(PresenterV2 p0){
       l.a(this, p0);
    }
    public void i(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       a.p(p0, "injector");
       p0 = p0.f("LIVE_SERVICE_MANAGER");
       a.o(p0, "injector.inject\(LiveAcce¡­Ids.LIVE_SERVICE_MANAGER\)");
       this.a = p0;
       return;
    }
}
