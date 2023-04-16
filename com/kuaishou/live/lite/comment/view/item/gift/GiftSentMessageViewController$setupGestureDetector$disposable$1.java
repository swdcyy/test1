package com.kuaishou.live.lite.comment.view.item.gift.GiftSentMessageViewController$setupGestureDetector$disposable$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.widget.EmojiTextView;
import java.lang.Object;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService$c;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.comment.view.item.gift.GiftSentMessageViewController$setupGestureDetector$disposable$1$1;
import com.kuaishou.live.lite.comment.view.item.gift.GiftSentMessageViewController$setupGestureDetector$disposable$1$2;

public final class GiftSentMessageViewController$setupGestureDetector$disposable$1 extends Lambda implements l	// class@000830
{
    public final EmojiTextView $emojiTextView;

    public void GiftSentMessageViewController$setupGestureDetector$disposable$1(EmojiTextView p0){
       this.$emojiTextView = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveLiteGestureService$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftSentMessageViewController$setupGestureDetector$disposable$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.a(new GiftSentMessageViewController$setupGestureDetector$disposable$1$1(this));
       p0.c(GiftSentMessageViewController$setupGestureDetector$disposable$1$2.INSTANCE);
       return;
    }
}
