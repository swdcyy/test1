package com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3$d;
import io.reactivex.g;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateHostViewBinderV3;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import java.util.concurrent.atomic.AtomicBoolean;
import rod.m;
import q87.c;
import mn9.b;
import java.util.Objects;
import pod.a;
import lod.b;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;

public final class TextPanelTemplateHostViewBinderV3$d implements g	// class@000c65
{
    public final TextPanelTemplateHostViewBinderV3 b;

    public void TextPanelTemplateHostViewBinderV3$d(TextPanelTemplateHostViewBinderV3 p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextPanelTemplateHostViewBinderV3$d.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       Object[] objArray = new Object[0];
       a.D().w("TextPanelTemplateHostViewBinderV3", "showTextTemplatePanel request textTemplateRepoV3NeedRequestNetwork:"+this.b.d.w0().get(), objArray);
       b uob = this.b.d.v0();
       Objects.requireNonNull(uob, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateDataProviderV3");
       uob = uob.i();
       Objects.requireNonNull(uob, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3");
       CachePolicy nETWORK_ELSE = (this.b.d.w0().get())? CachePolicy.NETWORK_ELSE_CACHE: CachePolicy.CACHE_ELSE_NETWORK;
       uob.g(nETWORK_ELSE, p0);
       return;
    }
}
