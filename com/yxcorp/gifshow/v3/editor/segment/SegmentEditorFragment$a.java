package com.yxcorp.gifshow.v3.editor.segment.SegmentEditorFragment$a;
import im8.g;
import com.yxcorp.gifshow.v3.editor.segment.SegmentEditorFragment;
import java.lang.Object;
import java.lang.Integer;
import mrd.a;
import xl8.b;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.segment.k;
import java.util.Map;
import java.util.HashMap;

public class SegmentEditorFragment$a implements g	// class@0011c1
{
    public int b;
    public SegmentEditorFragment c;
    public i d;
    public String e;
    public a f;
    public boolean g;
    public boolean h;
    public b i;
    public boolean j;
    public final SegmentEditorFragment k;

    public void SegmentEditorFragment$a(SegmentEditorFragment p0){
       this.k = p0;
       super();
       this.b = 19;
       this.e = "";
       this.f = a.h(Integer.valueOf(0));
       this.g = false;
       this.h = false;
       this.i = new b(Boolean.TRUE);
       this.j = true;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SegmentEditorFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, SegmentEditorFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(SegmentEditorFragment$a.class, new k());
       }else {
          obj.put(SegmentEditorFragment$a.class, null);
       }
       return obj;
    }
}
