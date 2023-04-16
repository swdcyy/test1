package com.yxcorp.gifshow.v3.editor.segment.l;
import y8c.g;
import com.yxcorp.gifshow.v3.editor.segment.l$a;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import voc.c0;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g9c.a;
import com.yxcorp.gifshow.v3.editor.segment.model.SingleSegmentInfo;
import y8c.f$b;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.segment.v;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Integer;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.v3.editor.segment.x;
import ml8.c;

public class l extends g	// class@0011d6
{
    public l$a w;
    public int x;
    public EditorSdk2V2$VideoEditorProject y;
    public c0 z;

    public void l(l$a p0,EditorSdk2V2$VideoEditorProject p1){
       super();
       this.x = -1;
       this.z = new c0();
       this.w = p0;
       this.y = p1;
    }
    public void W0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       super.W0(p0);
       int i = 0;
       while (i < p0.size()) {
          if (p0.get(i).isSelected()) {
             this.x = i;
          }
          i = i + 1;
       }
       return;
    }
    public f$b d1(f$b p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, l.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object obj1 = this.N0(p0.b);
       obj = new HashMap();
       boolean b = (obj1 != null && obj1.isMoveEnabled())? true: false;
       obj.put("item_move_enabled", Boolean.valueOf(b));
       p0.g = obj;
       v ov = new v(p0, obj1, this.w, this.y, this, this.z);
       return obj;
    }
    public f h1(ViewGroup p0,int p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ol, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d14a3), new x());
    }
}
