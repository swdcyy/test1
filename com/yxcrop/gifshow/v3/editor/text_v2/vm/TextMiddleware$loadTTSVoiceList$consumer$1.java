package com.yxcrop.gifshow.v3.editor.text_v2.vm.TextMiddleware$loadTTSVoiceList$consumer$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import und.c;
import java.lang.Object;
import java.util.List;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2.vm.TextMiddleware$loadTTSVoiceList$consumer$1$a;
import java.lang.Runnable;

public final class TextMiddleware$loadTTSVoiceList$consumer$1 extends Lambda implements l	// class@000b6d
{
    public final c this$0;

    public void TextMiddleware$loadTTSVoiceList$consumer$1(c p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextMiddleware$loadTTSVoiceList$consumer$1.class, "1")) {
          return;
       }
       a.p(p0, "itemList");
       this.this$0.j(new TextMiddleware$loadTTSVoiceList$consumer$1$a(this, p0));
       return;
    }
}
