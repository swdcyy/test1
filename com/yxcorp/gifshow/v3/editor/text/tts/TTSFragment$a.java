package com.yxcorp.gifshow.v3.editor.text.tts.TTSFragment$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.yxcorp.gifshow.v3.editor.text.tts.TTSFragment;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mvc.k;
import kvc.e;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.editor.text.tts.g;

public class TTSFragment$a implements ViewModelProvider$Factory	// class@0014eb
{
    public final TTSFragment a;

    public void TTSFragment$a(TTSFragment p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       p0 = PatchProxy.applyOneRefs(p0, this, TTSFragment$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       TTSFragment$a ta = this.a;
       return new k(this.a.q, new e(ta.m, ta.n));
    }
}
