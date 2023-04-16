package com.yxcorp.gifshow.v3.editor.segment.v;
import y8c.f$b;
import com.yxcorp.gifshow.v3.editor.segment.model.SingleSegmentInfo;
import com.yxcorp.gifshow.v3.editor.segment.l$a;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.v3.editor.segment.l;
import voc.c0;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import etc.w;
import java.util.Map;

public class v extends f$b	// class@0011f5
{
    public int h;
    public SingleSegmentInfo i;
    public l$a j;
    public EditorSdk2V2$VideoEditorProject k;
    public l l;
    public c0 m;

    public void v(f$b p0,SingleSegmentInfo p1,l$a p2,EditorSdk2V2$VideoEditorProject p3,l p4,c0 p5){
       super(p0);
       this.h = this.b;
       this.i = p1;
       this.j = p2;
       this.k = p3;
       this.l = p4;
       this.m = p5;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, v.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new w();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, v.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(v.class, new w());
       }else {
          obj.put(v.class, null);
       }
       return obj;
    }
}
