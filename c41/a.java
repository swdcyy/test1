package c41.a;
import im8.g;
import c12.f;
import c41.a$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.utility.n;
import ekd.m1;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import c41.d;
import java.util.Map;
import java.util.HashMap;

public class a extends f implements g	// class@00046a
{
    public View K;
    public View L;
    public View M;
    public ViewGroup N;
    public Activity O;
    public c P;
    public b Q;
    public static String sLivePresenterClassName = "LiveAudienceRecruitExplainViewAssistPresenter";

    public void a(){
       super();
       this.Q = new a$a(this);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.O = n.d(p0);
       this.K = m1.f(p0, 0x7f0a3fd0);
       this.L = m1.f(p0, 0x7f0a2885);
       this.M = m1.f(p0, 0x7f0a30e6);
       this.N = p0.findViewById(0x7f0a193d);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new d());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
}
