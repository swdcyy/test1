package com.kuaishou.live.audience.component.comments.editor.LiveCommentFloatEditorExpFragment;
import com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.audience.component.comments.editor.g;
import java.util.List;
import zx0.k0;
import t02.a0;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class LiveCommentFloatEditorExpFragment extends LiveAsrFloatEditorFragment	// class@000a97
{
    public int J1;
    public static final int K1;

    public void LiveCommentFloatEditorExpFragment(){
       super();
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCommentFloatEditorExpFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveCommentFloatEditorExpFragment.class, null);
       return objectsByTag;
    }
    public g ki(){
       g obj = PatchProxy.apply(null, this, LiveCommentFloatEditorExpFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.ki();
       obj.c = this.Y0;
       obj.f = this.X0;
       return obj;
    }
    public List li(){
       List obj = PatchProxy.apply(null, this, LiveCommentFloatEditorExpFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.li();
       obj.add(new k0().a(this.Y0, this, this.J1));
       return obj;
    }
    public a0 qi(){
       return this.Y0;
    }
}
