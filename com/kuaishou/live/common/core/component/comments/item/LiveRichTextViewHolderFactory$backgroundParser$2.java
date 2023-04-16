package com.kuaishou.live.common.core.component.comments.item.LiveRichTextViewHolderFactory$backgroundParser$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.richtext.tools.LiveCommentBackgroundParser;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveRichTextViewHolderFactory$backgroundParser$2 extends Lambda implements a	// class@001097
{
    public static final LiveRichTextViewHolderFactory$backgroundParser$2 INSTANCE;

    static {
       LiveRichTextViewHolderFactory$backgroundParser$2.INSTANCE = new LiveRichTextViewHolderFactory$backgroundParser$2();
    }
    public void LiveRichTextViewHolderFactory$backgroundParser$2(){
       super(0);
    }
    public final LiveCommentBackgroundParser invoke(){
       Object obj = PatchProxy.apply(null, this, LiveRichTextViewHolderFactory$backgroundParser$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveCommentBackgroundParser();
    }
    public Object invoke(){
       return this.invoke();
    }
}
