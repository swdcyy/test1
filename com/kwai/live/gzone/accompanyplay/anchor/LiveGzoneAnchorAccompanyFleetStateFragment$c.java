package com.kwai.live.gzone.accompanyplay.anchor.LiveGzoneAnchorAccompanyFleetStateFragment$c;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.accompanyplay.anchor.j;
import java.util.Map;
import java.util.HashMap;

public class LiveGzoneAnchorAccompanyFleetStateFragment$c implements g	// class@000af3
{
    public LiveGzoneAnchorAccompanyFleetStateFragment b;
    public String c;
    public String d;
    public String e;
    public a f;
    public a g;
    public p1 h;
    public d i;

    public void LiveGzoneAnchorAccompanyFleetStateFragment$c(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAnchorAccompanyFleetStateFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAnchorAccompanyFleetStateFragment$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveGzoneAnchorAccompanyFleetStateFragment$c.class, new j());
       }else {
          obj.put(LiveGzoneAnchorAccompanyFleetStateFragment$c.class, null);
       }
       return obj;
    }
}
