package f62.g;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.i;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import com.kwai.framework.model.user.User;
import p91.m;
import java.lang.Boolean;
import android.widget.TextView;
import android.view.View;
import ekd.m1;
import java.util.Map;

public class g extends i	// class@0028b3
{
    public TextView F;
    public static String sLivePresenterClassName = "LiveConditionRedPacketShareCurrentInfoTopLayoutPresenter";

    public void g(){
       super();
    }
    public String R8(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a1.p(0x7f101fc6);
    }
    public int S8(){
       return 133;
    }
    public User V8(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.C.I();
    }
    public void a9(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "4")) {
          return;
       }
       super.a9(p0);
       og = this.F;
       int i = (p0)? 0: 8;
       og.setVisibility(i);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       super.doBindView(p0);
       this.F = m1.f(p0, 0x7f0a1b84);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(g.class, null);
       return objectsByTag;
    }
}
