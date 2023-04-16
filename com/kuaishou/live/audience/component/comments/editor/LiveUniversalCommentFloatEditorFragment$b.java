package com.kuaishou.live.audience.component.comments.editor.LiveUniversalCommentFloatEditorFragment$b;
import im8.g;
import k51.c;
import y31.e;
import im8.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.audience.component.comments.editor.k;
import java.util.Map;
import java.util.HashMap;

public class LiveUniversalCommentFloatEditorFragment$b extends c implements g	// class@000a9a
{
    public e p;
    public static String sLivePresenterClassName = "LiveUniversalCommentFloatEditorFragment$LiveGzoneAsrFloatEditorRootPresenter";

    public void LiveUniversalCommentFloatEditorFragment$b(e p0){
       super();
       this.p = p0;
       this.W7(p0);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveUniversalCommentFloatEditorFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveUniversalCommentFloatEditorFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveUniversalCommentFloatEditorFragment$b.class, new k());
       }else {
          obj.put(LiveUniversalCommentFloatEditorFragment$b.class, null);
       }
       return obj;
    }
}
