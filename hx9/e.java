package hx9.e;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class e	// class@00272c
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final void a(String p0,int p1,QPhoto p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, e.class, "1")) {
          return;
       }
       a.p(p0, "tabName");
       a.p(p2, "photo");
       super();
       this.action2 = "SWITCH_AREA_TAB";
       i3 oi3 = i3.f();
       oi3.d("tab_name", p0);
       oi3.c("tab_num", Integer.valueOf(p1));
       this.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.g(p2.getEntity(), (p2.getPosition() + 1));
       u1.M("2859456", null, 1, this, uContentPack, null);
       return;
    }
}
