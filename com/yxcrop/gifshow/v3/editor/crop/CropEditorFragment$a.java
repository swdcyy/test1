package com.yxcrop.gifshow.v3.editor.crop.CropEditorFragment$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.yxcrop.gifshow.v3.editor.crop.CropEditorFragment;
import t36.f;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcrop.gifshow.v3.editor.crop.vm.CropViewModel;
import com.yxcrop.gifshow.v3.editor.crop.CropEditorFragment$b;
import uwc.b;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.util.Map;
import xsc.c;
import qld.a;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import lld.d;
import ok.x;
import android.app.Activity;
import k2b.e0;

public class CropEditorFragment$a implements ViewModelProvider$Factory	// class@000a0a
{
    public final f a;
    public final f b;
    public final CropEditorFragment c;

    public void CropEditorFragment$a(CropEditorFragment p0,f p1,f p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public ViewModel create(Class p0){
       p0 = PatchProxy.applyOneRefs(p0, this, CropEditorFragment$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       CropViewModel uCropViewMod = new CropViewModel(this.c.G.f.b(), f.p0(this.c.G.f.f().u(), c.class), new a(this.c.t.N(), new d(this), this.a, this.b), this.a, this.c.t.getContext());
       return p0;
    }
}
