package com.yxcorp.gifshow.v3.editor.prettify.EditPrettifyFragment$b;
import u26.a;
import com.yxcorp.gifshow.v3.editor.prettify.EditPrettifyFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import e17.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import h69.j;
import com.yxcorp.gifshow.edit.draft.DraftUtils;

public class EditPrettifyFragment$b implements a	// class@001141
{
    public final EditPrettifyFragment a;

    public void EditPrettifyFragment$b(EditPrettifyFragment p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       EditPrettifyFragment$b uob = EditPrettifyFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "2")) {
          return;
       }
       if (p0 == p1) {
          return;
       }
       if (p1 == 0x7f0a03f8) {
          i.a(R.style.arg_RES_7f11066a, 0x7f100147);
       }
       if (p1 == 0x7f0a2a64) {
          i.a(R.style.arg_RES_7f11066a, 0x7f10014b);
       }
       if (p1 == 0x7f0a045d) {
          i.a(R.style.arg_RES_7f11066a, 0x7f100148);
       }
       return;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, EditPrettifyFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (j.g(this.a.kh().N()) || DraftUtils.e(this.a.kh().N()))? true: false;
       return b;
    }
}
