package com.yxcrop.gifshow.v3.editor.crop.CropEditorFragment$b;
import im8.g;
import com.yxcrop.gifshow.v3.editor.crop.CropEditorFragment;
import java.lang.Object;
import com.yxcrop.gifshow.v3.editor.crop.CropEditorFragment$b$a;
import rwc.j;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcrop.gifshow.v3.editor.crop.m;
import java.util.Map;
import java.util.HashMap;

public class CropEditorFragment$b implements g	// class@000a0c
{
    public CropEditorFragment b;
    public int c;
    public String d;
    public String e;
    public i f;
    public int g;
    public z h;
    public k i;
    public PublishSubject j;
    public j k;
    public EditDecorationContainerView l;
    public final CropEditorFragment m;

    public void CropEditorFragment$b(CropEditorFragment p0){
       this.m = p0;
       super();
       this.c = 21;
       this.d = "cropEditor";
       this.g = 0;
       this.i = new CropEditorFragment$b$a(this);
       this.k = new j(null);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CropEditorFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, CropEditorFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(CropEditorFragment$b.class, new m());
       }else {
          obj.put(CropEditorFragment$b.class, null);
       }
       return obj;
    }
}
