package com.kuaishou.live.audience.component.comments.editor.g;
import im8.g;
import vl8.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zx0.j0;
import zx0.i0;
import java.util.Map;
import java.util.HashMap;

public class g extends c implements g	// class@000aaf
{
    public a0 c;
    public BaseEditorFragment$Arguments d;
    public BaseEditorFragment e;
    public h f;
    public LiveAsrFloatEditorFragment$e g;
    public h h;
    public e i;

    public void g(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("injector")) {
          return new j0();
       }
       if (p0.equals("provider")) {
          return new i0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("injector")) {
          obj.put(g.class, new j0());
       }else if(p0.equals("provider")){
          obj.put(g.class, new i0());
       }else {
          obj.put(g.class, null);
       }
       return obj;
    }
}
