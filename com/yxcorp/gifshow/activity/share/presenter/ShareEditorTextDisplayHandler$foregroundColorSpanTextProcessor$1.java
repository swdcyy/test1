package com.yxcorp.gifshow.activity.share.presenter.ShareEditorTextDisplayHandler$foregroundColorSpanTextProcessor$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.activity.share.presenter.ShareEditorTextDisplayHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.EmojiEditText;
import android.content.Context;
import android.widget.EditText;
import ync.a;
import android.text.style.ForegroundColorSpan;

public final class ShareEditorTextDisplayHandler$foregroundColorSpanTextProcessor$1 extends Lambda implements a	// class@0013a4
{
    public final ShareEditorTextDisplayHandler this$0;

    public void ShareEditorTextDisplayHandler$foregroundColorSpanTextProcessor$1(ShareEditorTextDisplayHandler p0){
       this.this$0 = p0;
       super(0);
    }
    public final Object invoke(){
       Object obj = PatchProxy.apply(null, this, ShareEditorTextDisplayHandler$foregroundColorSpanTextProcessor$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = (this.this$0.w())? 0: a.c(this.this$0.u().getContext());
       return new ForegroundColorSpan(i);
    }
}
