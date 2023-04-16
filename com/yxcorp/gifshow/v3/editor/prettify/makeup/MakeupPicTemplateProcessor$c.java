package com.yxcorp.gifshow.v3.editor.prettify.makeup.MakeupPicTemplateProcessor$c;
import erd.a;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.MakeupPicTemplateProcessor;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import maa.a;
import haa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.lang.Integer;
import oba.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.PostUtils;
import xaa.a;
import kotlin.jvm.internal.a;
import qsc.a;

public final class MakeupPicTemplateProcessor$c implements a	// class@001189
{
    public final MakeupPicTemplateProcessor b;
    public final c c;
    public final String d;

    public void MakeupPicTemplateProcessor$c(MakeupPicTemplateProcessor p0,c p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, MakeupPicTemplateProcessor$c.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MakeupPicTemplateProcessor", "clear: ", objArray);
       a uoa = a.c(this.c);
       if (!uoa.D()) {
          return;
       }
       Integer integer = a.a(uoa, this.d);
       if (integer == null) {
          PostUtils.F("MakeupPicTemplateProcessor", "clear: asset not found: "+this.d);
          return;
       }else {
          uoa = uoa.h0(integer.intValue(), i);
          if (uoa != null) {
             a.o(uoa, "assetDraft.getSubMakeupD\x20\x02     ?: return@fromAction\x00");
             this.b.i(uoa);
             uoa.d();
             this.b.g(uoa);
          }
          return;
       }
    }
}
