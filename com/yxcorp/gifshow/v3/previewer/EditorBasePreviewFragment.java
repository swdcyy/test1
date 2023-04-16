package com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class EditorBasePreviewFragment extends BaseEditorFragment	// class@00157b
{

    public void EditorBasePreviewFragment(){
       super();
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditorBasePreviewFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(EditorBasePreviewFragment.class, null);
       return objectsByTag;
    }
}
