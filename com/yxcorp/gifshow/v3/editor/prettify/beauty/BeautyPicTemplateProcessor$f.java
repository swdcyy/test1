package com.yxcorp.gifshow.v3.editor.prettify.beauty.BeautyPicTemplateProcessor$f;
import erd.a;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.BeautyPicTemplateProcessor;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import qsc.a;

public final class BeautyPicTemplateProcessor$f implements a	// class@00114d
{
    public final BeautyPicTemplateProcessor b;
    public final c c;

    public void BeautyPicTemplateProcessor$f(BeautyPicTemplateProcessor p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, BeautyPicTemplateProcessor$f.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("BeautyPicTemplateProcessor", "start: ", objArray);
       a uoa = this.c.o0();
       if (uoa != null) {
          this.b.i(uoa);
       }
       return;
    }
}
