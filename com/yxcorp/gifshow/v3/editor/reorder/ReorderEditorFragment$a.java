package com.yxcorp.gifshow.v3.editor.reorder.ReorderEditorFragment$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.yxcorp.gifshow.v3.editor.reorder.ReorderEditorFragment;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.reorder.vm.ReorderViewModel;
import uwc.b;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.util.Map;
import nwc.k;
import t36.f;
import xsc.c;
import xsc.a;
import atc.a;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;

public class ReorderEditorFragment$a implements ViewModelProvider$Factory	// class@0011ab
{
    public final ReorderEditorFragment a;

    public void ReorderEditorFragment$a(ReorderEditorFragment p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ReorderEditorFragment$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       ReorderViewModel reorderViewM = new ReorderViewModel(this.a.I.b(), f.p0(this.a.I.f().u(), k.class), f.p0(this.a.I.f().u(), c.class), f.p0(this.a.I.f().u(), a.class), new a(this.a.t.N()));
       return p0;
    }
}
