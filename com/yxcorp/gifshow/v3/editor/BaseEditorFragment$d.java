package com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import im8.g;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.h;
import java.util.Map;
import java.util.HashMap;

public class BaseEditorFragment$d implements g	// class@000d93
{
    public Set b;
    public Set c;
    public String d;
    public long e;
    public c f;
    public EditorDelegate g;
    public final BaseEditorFragment h;

    public void BaseEditorFragment$d(BaseEditorFragment p0){
       this.h = p0;
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseEditorFragment$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, BaseEditorFragment$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(BaseEditorFragment$d.class, new h());
       }else {
          obj.put(BaseEditorFragment$d.class, null);
       }
       return obj;
    }
}
