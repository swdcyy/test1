package h82.u;
import a71.a;
import h82.z;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h82.b0;
import t02.a0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import kg1.e;
import kg1.g;
import kg1.i;

public final class u implements a	// class@002cec
{
    public final z a;

    public void u(z p0){
       this.a = p0;
    }
    public final boolean a(int p0){
       u ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, ta, z.class, "11")) {
       }else if(ta.Q.g == null){
          ta.a9();
          LivePlayLogger.logLiveFollowButtonClickEvent(ta.M.Z2.b(), ta.M.Z2.a(), "BOTTOM_BTN");
       }else {
          int i = 2;
          if (ta.M.r1.r8()) {
             ta.M.r1.Zk("FANS_GROUP_PANEL_BOTTOM_BUTTON");
             i.c(ta.M.Z2.b(), false, i, objArray, ta.M.Z2.a());
          }else {
             b0 g = ta.Q.g;
             if (g != 1) {
                if (g == i) {
                   ta.M.r1.Zk("FANS_GROUP_PANEL_BOTTOM_BUTTON");
                   i.c(ta.M.Z2.b(), false, false, objArray, ta.M.Z2.a());
                }else if(g == 3){
                   ta.M.r1.Zk("FANS_GROUP_PANEL_BOTTOM_BUTTON");
                   i.c(ta.M.Z2.b(), false, 1, objArray, ta.M.Z2.a());
                }
             }
          }
       }
       return false;
    }
}
