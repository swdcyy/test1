package com.kwai.yoda.function.ui.e;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.kwai.yoda.model.LaunchModel;
import org.json.JSONObject;

public class e extends c	// class@00123a
{

    public void e(){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoe, "1")) {
             return;
          }
       }
       if (p0 != null && p0.getLaunchModel() != null) {
          p0.getLaunchModel().setPhysicalBackBehavior(new JSONObject(p3).optString("behavior"), 70);
       }
       this.p(p0, p1, p2, p4);
       return;
    }
}
