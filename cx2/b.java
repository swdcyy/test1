package cx2.b;
import cx2.a;
import x61.c;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import z61.e;
import z61.b;
import java.lang.Boolean;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import cx2.b$a;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class b implements a	// class@0023f5
{
    public final MutableLiveData a;
    public final e b;
    public final c c;

    public void b(c p0,a p1){
       a.p(p0, "bottomBarService");
       a.p(p1, "clickListener");
       super();
       this.c = p0;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.a = mutableLiveD;
       e uoe = new e();
       uoe.mFeatureId = 2004;
       uoe.mIsVisible = Boolean.TRUE;
       uoe.mIconRes = 0x7f081138;
       uoe.mClickCallback = new b$a(p1);
       this.b = uoe;
       mutableLiveD.setValue(uoe);
       p0.v1(mutableLiveD);
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.c.O0(2004);
       return;
    }
}
