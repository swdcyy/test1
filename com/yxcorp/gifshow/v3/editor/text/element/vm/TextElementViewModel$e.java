package com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel$e;
import erd.a;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hba.a;
import uuc.e;
import com.yxcorp.gifshow.edit.draft.model.c;
import faa.a;
import q87.c;

public final class TextElementViewModel$e implements a	// class@001420
{
    public final TextElementViewModel b;

    public void TextElementViewModel$e(TextElementViewModel p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TextElementViewModel$e.class, "1")) {
          return;
       }
       if (this.b.F.i().D()) {
          this.b.F.i().f();
       }
       Object[] objArray = new Object[0];
       a.D().w("TextElementViewModel", "waitAllTaskCompleteAndCommitDraft complete", objArray);
       return;
    }
}
