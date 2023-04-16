package com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorFragmentV2$a;
import itc.l0;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.template.v2.e;
import java.util.Map;

public final class PicTemplateEditorFragmentV2$a extends l0	// class@00133b
{
    public PicTemplateEditorFragmentV2 v;
    public boolean w;
    public boolean x;

    public void PicTemplateEditorFragmentV2$a(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateEditorFragmentV2$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, PicTemplateEditorFragmentV2$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(PicTemplateEditorFragmentV2$a.class, new e());
       }else {
          obj.put(PicTemplateEditorFragmentV2$a.class, null);
       }
       return obj;
    }
}
