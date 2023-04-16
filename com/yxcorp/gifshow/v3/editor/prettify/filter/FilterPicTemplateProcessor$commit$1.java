package com.yxcorp.gifshow.v3.editor.prettify.filter.FilterPicTemplateProcessor$commit$1;
import erd.a;
import com.yxcorp.gifshow.v3.editor.prettify.filter.FilterPicTemplateProcessor;
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
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.prettify.filter.FilterPicTemplateProcessor$commit$1$1;
import msd.l;
import com.yxcorp.gifshow.edit.draft.util.VideoContextDraftExtKt;

public final class FilterPicTemplateProcessor$commit$1 implements a	// class@001165
{
    public final FilterPicTemplateProcessor b;
    public final c c;

    public void FilterPicTemplateProcessor$commit$1(FilterPicTemplateProcessor p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, FilterPicTemplateProcessor$commit$1.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("FilterPicTemplateProcessor", "commit: ", objArray);
       this.b.g(this.c.o0());
       VideoContext videoContext = this.c.d1();
       a.o(videoContext, "projectDraft.videoContext");
       VideoContextDraftExtKt.b(videoContext, this.c, FilterPicTemplateProcessor$commit$1$1.INSTANCE);
       return;
    }
}
