package com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$d;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.accompanyplay.audience.k;
import java.util.Map;
import java.util.HashMap;

public class LiveGzoneAccompanyTabHostFragment$d implements g	// class@000b5f
{
    public k0$g b;
    public LiveGzoneAccompanyTabHostFragment$e c;
    public p0$e d;

    public void LiveGzoneAccompanyTabHostFragment$d(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAccompanyTabHostFragment$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAccompanyTabHostFragment$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveGzoneAccompanyTabHostFragment$d.class, new k());
       }else {
          obj.put(LiveGzoneAccompanyTabHostFragment$d.class, null);
       }
       return obj;
    }
}
