package com.yxcorp.gifshow.v3.editor.ktv.crop.KtvCropFragment$a;
import im8.g;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvCropFragment;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.ktv.crop.g;
import java.util.Map;
import java.util.HashMap;

public class KtvCropFragment$a implements g	// class@000fbc
{
    public KtvCropFragment b;
    public int c;
    public String d;
    public String e;
    public i f;
    public final KtvCropFragment g;

    public void KtvCropFragment$a(KtvCropFragment p0){
       this.g = p0;
       super();
       this.c = 1;
       this.d = "ktvClip";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KtvCropFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, KtvCropFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(KtvCropFragment$a.class, new g());
       }else {
          obj.put(KtvCropFragment$a.class, null);
       }
       return obj;
    }
}
