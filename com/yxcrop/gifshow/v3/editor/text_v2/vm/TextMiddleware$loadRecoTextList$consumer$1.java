package com.yxcrop.gifshow.v3.editor.text_v2.vm.TextMiddleware$loadRecoTextList$consumer$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import und.c;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.yxcrop.gifshow.v3.editor.text_v2.vm.TextMiddleware$loadRecoTextList$consumer$1$a;
import java.lang.Runnable;

public final class TextMiddleware$loadRecoTextList$consumer$1 extends Lambda implements l	// class@000b6b
{
    public final c this$0;

    public void TextMiddleware$loadRecoTextList$consumer$1(c p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(TextMiddleware$loadRecoTextList$consumer$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TextMiddleware$loadRecoTextList$consumer$1.class, "1")) {
          return;
       }
       if (p0) {
          this.this$0.j(new TextMiddleware$loadRecoTextList$consumer$1$a(this));
       }
       return;
    }
}
