package com.yxcorp.gifshow.v3.editor.prettify.EditPrettifyFragment$a;
import voc.y;
import com.yxcorp.gifshow.v3.editor.prettify.EditPrettifyFragment;
import java.lang.Object;
import voc.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.prettify.EditPrettifyFragment$c;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import wba.k;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import oa0.a;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kuaishou.perf.page.impl.d;

public class EditPrettifyFragment$a implements y	// class@001140
{
    public final EditPrettifyFragment b;

    public void EditPrettifyFragment$a(EditPrettifyFragment p0){
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
       if (PatchProxy.applyVoid(objArray, this, EditPrettifyFragment$a.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().w("prettifyEdit", "discardEditChanges", objArray1);
       EditPrettifyFragment$c c = this.b.H.c;
       if (c != null && c.isAdded()) {
          c uoc = this.b.kh().N();
          Object obj = PatchProxy.applyOneRefs(uoc, objArray, k.class, "4");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(uoc.a1() != Workspace$Type.KUAISHAN && (uoc.T0() != Workspace$Source.KUAI_SHAN && uoc.a1() != Workspace$Type.AI_CUT)){
             i = 1;
          }
       label_005e :
          b = i;
          if (b) {
             EditPrettifyFragment$a tb = this.b;
             if (tb.H.i == null) {
                a.j1(tb.I);
             }
          }
       }
    label_006e :
       return;
    }
    public void z2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EditPrettifyFragment$a.class, "2")) {
          return;
       }
       EditPrettifyFragment$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, EditPrettifyFragment.class, "1")) {
          Object[] objArray1 = new Object[0];
          a.D().s("prettifyEdit", "monitorPrettify:"+tb.I, objArray1);
          if (TextUtils.n(tb.I, "beauty_tab")) {
             d.d("postBeautifyPanelMonitor").c();
          }else if(TextUtils.n(tb.I, "lookup_tab")){
             d.d("postFilterPanelMonitor").c();
          }
       }
       return;
    }
}
