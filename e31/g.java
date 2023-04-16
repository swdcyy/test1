package e31.g;
import a71.d;
import e31.h;
import w4.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import e31.j;
import androidx.lifecycle.MutableLiveData;
import java.lang.Integer;
import com.kuaishou.live.core.basic.model.LiveAudienceTaskConfig;
import f31.b;
import e31.f;
import java.lang.Runnable;
import e93.f;

public class g implements d	// class@002097
{
    public final e a;
    public final int b;
    public final int c;
    public final h d;

    public void g(h p0,e p1,int p2,int p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void D(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "2")) {
          return;
       }
       g td = this.d;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoid(objArray, td, h.class, "10")) {
          h a = td.a;
          a.b = objArray;
          td.b.setValue(a);
          td.c = -1;
       }
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       g td = this.d;
       g ta = this.a;
       g tb = this.b;
       g tc = this.c;
       Objects.requireNonNull(td);
       if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(ta, Integer.valueOf(tb), Integer.valueOf(tc), td, h.class, "9")) {
          h a = td.a;
          a.b = ta;
          td.b.setValue(a);
          td.c = tb;
          if (PatchProxy.isSupport(h.class) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(tb), td, h.class, "11") && tb == null)) {
             td.h.d(td.g.mBizId);
          }
          f uof = new f(td, tc);
          LiveAudienceTaskConfig mTaskGuideSh = td.g.mTaskGuideShowDurationMs;
          if (mTaskGuideSh - null <= 0) {
             mTaskGuideSh = 0x2710;
          }
          f.k("stopBottomBarAnim", uof, td, mTaskGuideSh);
       }
       return;
    }
}
