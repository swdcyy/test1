package com.kuaishou.live.audience.gzone.v2.comment.editor.LiveGzoneAsrEmotionFloatEditorFragment$c;
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
import com.kuaishou.live.audience.gzone.v2.comment.editor.c;
import java.util.Map;
import java.util.HashMap;

public class LiveGzoneAsrEmotionFloatEditorFragment$c extends c implements g	// class@000c2b
{
    public e p;
    public static String sLivePresenterClassName = "LiveGzoneAsrEmotionFloatEditorFragment$LiveGzoneAsrFloatEditorRootPresenter";

    public void LiveGzoneAsrEmotionFloatEditorFragment$c(e p0){
       super();
       this.p = p0;
       this.W7(p0);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAsrEmotionFloatEditorFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAsrEmotionFloatEditorFragment$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveGzoneAsrEmotionFloatEditorFragment$c.class, new c());
       }else {
          obj.put(LiveGzoneAsrEmotionFloatEditorFragment$c.class, null);
       }
       return obj;
    }
}
