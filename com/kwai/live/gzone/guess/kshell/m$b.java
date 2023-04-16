package com.kwai.live.gzone.guess.kshell.m$b;
import y8c.f$b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.guess.kshell.v0;
import java.util.Map;

public class m$b extends f$b	// class@000d4e
{
    public m$a h;
    public List i;
    public b j;
    public c k;

    public void m$b(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new v0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, m$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(m$b.class, new v0());
       }else {
          obj.put(m$b.class, null);
       }
       return obj;
    }
}
