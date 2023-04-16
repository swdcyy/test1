package com.yxcorp.gifshow.v3.editor.prettify.filter.FilterPicTemplateProcessor$c;
import erd.a;
import com.yxcorp.gifshow.v3.editor.prettify.filter.FilterPicTemplateProcessor;
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
import saa.a;
import kotlin.jvm.internal.a;
import qsc.a;

public final class FilterPicTemplateProcessor$c implements a	// class@001163
{
    public final FilterPicTemplateProcessor b;
    public final c c;
    public final String d;

    public void FilterPicTemplateProcessor$c(FilterPicTemplateProcessor p0,c p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, FilterPicTemplateProcessor$c.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("FilterPicTemplateProcessor", "clear: ", objArray);
       a uoa = a.c(this.c);
       if (!uoa.D()) {
          return;
       }
       Integer integer = a.a(uoa, this.d);
       if (integer == null) {
          PostUtils.F("FilterPicTemplateProcessor", "clear: asset not found: "+this.d);
          return;
       }else {
          uoa = uoa.g0(integer.intValue(), i);
          if (uoa != null) {
             a.o(uoa, "assetDraft.getSubColorFi\x20\x02     ?: return@fromAction\x00");
             this.b.i(uoa);
             uoa.d();
             this.b.g(uoa);
          }
          return;
       }
    }
}
