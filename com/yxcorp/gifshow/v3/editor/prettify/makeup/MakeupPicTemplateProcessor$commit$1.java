package com.yxcorp.gifshow.v3.editor.prettify.makeup.MakeupPicTemplateProcessor$commit$1;
import erd.a;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.MakeupPicTemplateProcessor;
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
import com.yxcorp.gifshow.prettify.makeup.d;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import com.yxcorp.gifshow.prettify.makeup.m;
import kotlin.jvm.internal.a;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.MakeupPicTemplateProcessor$commit$1$1;
import msd.l;
import com.yxcorp.gifshow.edit.draft.util.VideoContextDraftExtKt;

public final class MakeupPicTemplateProcessor$commit$1 implements a	// class@00118b
{
    public final MakeupPicTemplateProcessor b;
    public final c c;

    public void MakeupPicTemplateProcessor$commit$1(MakeupPicTemplateProcessor p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, MakeupPicTemplateProcessor$commit$1.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MakeupPicTemplateProcessor", "commit: ", objArray);
       this.b.g(this.c.o0());
       m om = d.a().b(MakeupKey.EDIT);
       a.o(om, "MakeupConfigManager.getI¡­eupModule\(MakeupKey.EDIT\)");
       VideoContext videoContext = this.c.d1();
       a.o(videoContext, "projectDraft.videoContext");
       VideoContextDraftExtKt.c(videoContext, this.c, new MakeupPicTemplateProcessor$commit$1$1(om));
       return;
    }
}
