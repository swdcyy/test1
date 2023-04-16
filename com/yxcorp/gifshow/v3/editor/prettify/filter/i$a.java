package com.yxcorp.gifshow.v3.editor.prettify.filter.i$a;
import voc.y;
import com.yxcorp.gifshow.v3.editor.prettify.filter.i;
import java.lang.Object;
import voc.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Workspace$Source;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import faa.a;
import java.lang.StringBuilder;
import com.kuaishou.edit.draft.ColorFilter;
import com.kuaishou.edit.draft.FeatureId;
import q87.c;
import com.yxcorp.gifshow.v3.editor.i;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;

public class i$a implements y	// class@001171
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public void Md(){
       x.g(this);
    }
    public void N0(){
       x.f(this);
    }
    public void O(){
       x.e(this);
    }
    public void c2(){
       x.d(this);
    }
    public void o4(){
       x.h(this);
    }
    public void onRestart(){
       x.i(this);
    }
    public void rd(){
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i$a.class, "1")) {
          return;
       }
       i u = this.b.u;
       Object obj = PatchProxy.applyOneRefs(u, objArray, f.class, "15");
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(u.a1() != Workspace$Type.KUAISHAN && (u.T0() != Workspace$Source.KUAI_SHAN && (u.a1() != Workspace$Type.AI_CUT && u.T0() != Workspace$Source.AI_CUT_STYLE))){
          b = true;
       }else {
          b = false;
       }
       if (!b && this.b.w.v() != null) {
          Object[] objArray1 = new Object[i];
          a.D().w("FilterEditorPresenterV2", "saveEditorChanges"+this.b.w.v().getFeatureId(), objArray1);
       }
       this.b.t.c(true);
       u = this.b.A;
       if (u != null && u.getAdapter() != null) {
          this.b.A.getAdapter().k0();
       }
       return;
    }
    public void z2(){
       x.c(this);
    }
}
