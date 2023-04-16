package com.yxcrop.gifshow.v3.editor.text_v3.vm.TextMiddlewareV3$loadTTSVoiceList$consumer$1$a;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.text_v3.vm.TextMiddlewareV3$loadTTSVoiceList$consumer$1;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import com.yxcrop.gifshow.v3.editor.text_v2.action.TTSVoiceListResultAction;
import tvc.a;

public final class TextMiddlewareV3$loadTTSVoiceList$consumer$1$a implements Runnable	// class@000c6f
{
    public final TextMiddlewareV3$loadTTSVoiceList$consumer$1 b;
    public final List c;

    public void TextMiddlewareV3$loadTTSVoiceList$consumer$1$a(TextMiddlewareV3$loadTTSVoiceList$consumer$1 p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TextMiddlewareV3$loadTTSVoiceList$consumer$1$a.class, "1")) {
          return;
       }
       KSStore kSStore = this.b.this$0.a();
       if (kSStore != null) {
          kSStore.a(new TTSVoiceListResultAction(this.c));
       }
       return;
    }
}
