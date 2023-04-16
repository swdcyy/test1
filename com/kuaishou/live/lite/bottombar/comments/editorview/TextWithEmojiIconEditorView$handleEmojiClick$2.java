package com.kuaishou.live.lite.bottombar.comments.editorview.TextWithEmojiIconEditorView$handleEmojiClick$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import l12.b;
import k93.l;
import s93.s$a;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;

public final class TextWithEmojiIconEditorView$handleEmojiClick$2 extends Lambda implements a	// class@001ec6
{
    public final b $config;
    public final l $delegate;
    public final s$a $sendCommentCallback;

    public void TextWithEmojiIconEditorView$handleEmojiClick$2(b p0,l p1,s$a p2){
       this.$config = p0;
       this.$delegate = p1;
       this.$sendCommentCallback = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, TextWithEmojiIconEditorView$handleEmojiClick$2.class, "1")) {
          return;
       }
       TextWithEmojiIconEditorView$handleEmojiClick$2 t$config = this.$config;
       if (t$config != null) {
          String str = t$config.a();
          if (str != null) {
             this.$delegate.a(str+str+str, this.$sendCommentCallback);
          }
       }
       return;
    }
}
