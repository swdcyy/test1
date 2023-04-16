package com.kwai.live.gzone.accompanyplay.edit.g0$c;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.accompanyplay.edit.e;
import java.util.Map;
import java.util.HashMap;

public class g0$c implements g	// class@000bf3
{
    public d b;
    public c c;
    public m d;

    public void g0$c(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g0$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g0$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g0$c.class, new e());
       }else {
          obj.put(g0$c.class, null);
       }
       return obj;
    }
}
