package com.kuaishou.live.core.show.statistics.logreporter.a;
import im8.g;
import com.kuaishou.live.core.show.statistics.logreporter.LiveLogReporterBasePresenter;
import ck2.a;
import ck2.i;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ck2.d;
import java.util.Map;
import java.util.HashMap;

public class a extends LiveLogReporterBasePresenter implements g	// class@0010a1
{
    public final e N;
    public i O;
    public static String sLivePresenterClassName = "LiveAudienceLogReporterPresenter";

    public void a(){
       super();
       this.N = new a(this);
    }
    public i P8(){
       return this.O;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
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
