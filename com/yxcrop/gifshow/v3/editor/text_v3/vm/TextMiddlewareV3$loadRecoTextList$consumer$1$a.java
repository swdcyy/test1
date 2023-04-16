package com.yxcrop.gifshow.v3.editor.text_v3.vm.TextMiddlewareV3$loadRecoTextList$consumer$1$a;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.text_v3.vm.TextMiddlewareV3$loadRecoTextList$consumer$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import com.yxcrop.gifshow.v3.editor.text_v2.action.RecoTextListResultAction;
import yod.b;
import knd.d;
import tvc.a;

public final class TextMiddlewareV3$loadRecoTextList$consumer$1$a implements Runnable	// class@000c6d
{
    public final TextMiddlewareV3$loadRecoTextList$consumer$1 b;

    public void TextMiddlewareV3$loadRecoTextList$consumer$1$a(TextMiddlewareV3$loadRecoTextList$consumer$1 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TextMiddlewareV3$loadRecoTextList$consumer$1$a.class, "1")) {
          return;
       }
       KSStore kSStore = this.b.this$0.a();
       if (kSStore != null) {
          kSStore.a(new RecoTextListResultAction(this.b.this$0.e.a(false)));
       }
       return;
    }
}
