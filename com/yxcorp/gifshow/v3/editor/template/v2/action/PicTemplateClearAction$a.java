package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateClearAction$a;
import erd.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import maa.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Asset$b;
import wba.f;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Asset;

public final class PicTemplateClearAction$a implements a	// class@001355
{
    public final c b;
    public final String c;

    public void PicTemplateClearAction$a(c p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PicTemplateClearAction$a.class, "1")) {
          return;
       }
       a uoa = this.b.o0();
       if (uoa != null) {
          a.o(uoa, "draft.assetDraft ?: return@fromAction");
          if (!uoa.D()) {
             uoa.c0();
          }
          Asset$b uob = f.a(uoa, this.c);
          if (uob != null) {
             uob.copyOnWrite();
             uob.instance.clearAtlasTemplate();
          }
       }
       return;
    }
}
