package com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment$f;
import im8.g;
import k51.c;
import com.kuaishou.live.audience.component.comments.editor.g;
import im8.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.audience.component.comments.editor.d;
import java.util.Map;
import java.util.HashMap;

public class LiveAsrFloatEditorFragment$f extends c implements g	// class@000a95
{
    public g p;
    public static String sLivePresenterClassName = "LiveAsrFloatEditorFragment$LiveAsrFloatEditorRootPresenter";

    public void LiveAsrFloatEditorFragment$f(g p0){
       super();
       this.p = p0;
       this.W7(p0);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAsrFloatEditorFragment$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveAsrFloatEditorFragment$f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveAsrFloatEditorFragment$f.class, new d());
       }else {
          obj.put(LiveAsrFloatEditorFragment$f.class, null);
       }
       return obj;
    }
}
