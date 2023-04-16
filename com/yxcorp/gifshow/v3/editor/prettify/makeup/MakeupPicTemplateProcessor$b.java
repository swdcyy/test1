package com.yxcorp.gifshow.v3.editor.prettify.makeup.MakeupPicTemplateProcessor$b;
import erd.a;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.MakeupPicTemplateProcessor;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import xaa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Makeup;
import faa.a;
import q87.c;
import maa.a;
import haa.a;
import java.lang.Integer;
import oba.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.PostUtils;
import qsc.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Makeup$b;
import com.kuaishou.edit.draft.EffectSource;

public final class MakeupPicTemplateProcessor$b implements a	// class@001188
{
    public final MakeupPicTemplateProcessor b;
    public final c c;
    public final c d;
    public final String e;

    public void MakeupPicTemplateProcessor$b(MakeupPicTemplateProcessor p0,c p1,c p2,String p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MakeupPicTemplateProcessor$b.class, "1")) {
          return;
       }
       a uoa = this.c.w0();
       if (uoa != null) {
          objArray = uoa.v();
       }
       String str = "MakeupPicTemplateProcessor";
       if (objArray == null) {
          Object[] objArray1 = new Object[0];
          a.D().A(str, "apply: template makeup is null", objArray1);
          return;
       }else {
          a uoa1 = a.c(this.d);
          if (!uoa1.D()) {
             return;
          }else {
             Integer integer = a.a(uoa1, this.e);
             if (integer == null) {
                PostUtils.F(str, "apply: asset not found: "+this.e);
                return;
             }else {
                uoa1 = uoa1.h0(integer.intValue(), true);
                if (uoa1 == null) {
                   PostUtils.F(str, "apply: asset sub makeup draft is null");
                   return;
                }else {
                   this.b.i(uoa1);
                   Makeup$b uob = uoa1.k().clear().mergeFrom(objArray);
                   uob.copyOnWrite();
                   uob.instance.setEffectSource(EffectSource.PIC_TEMPLATE);
                   this.b.g(uoa1);
                   return;
                }
             }
          }
       }
    }
}
