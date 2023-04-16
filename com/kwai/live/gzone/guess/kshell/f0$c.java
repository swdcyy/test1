package com.kwai.live.gzone.guess.kshell.f0$c;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.guess.kshell.j;
import java.util.Map;
import java.util.HashMap;

public class f0$c implements g	// class@000d36
{
    public PagerSlidingTabStrip$d b;
    public b c;
    public e d;
    public a e;
    public b f;
    public c g;
    public a h;
    public a i;

    public void f0$c(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f0$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f0$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f0$c.class, new j());
       }else {
          obj.put(f0$c.class, null);
       }
       return obj;
    }
}
