package com.yxcorp.gifshow.v3.editor.text.b1$e;
import voc.k;
import com.yxcorp.gifshow.v3.editor.text.b1;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import hba.a;
import haa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.yxcorp.gifshow.v3.editor.text.b1$e$a;
import java.util.Collection;
import ekd.q$a;
import ekd.q;
import uld.j;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Type;
import huc.a;

public class b1$e implements k	// class@0013af
{
    public final b1 a;

    public void b1$e(b1 p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b1$e.class, "3")) {
          return;
       }
       j.d(p0, q.g(a.r(this.a.s).z(), new b1$e$a(this)));
       return;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, b1$e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a.s.a1() == Workspace$Type.LONG_PICTURE || this.a.s.a1() == Workspace$Type.ATLAS)? true: false;
       return b;
    }
    public List c(){
       Object obj = PatchProxy.apply(null, this, b1$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.R.b();
    }
}
