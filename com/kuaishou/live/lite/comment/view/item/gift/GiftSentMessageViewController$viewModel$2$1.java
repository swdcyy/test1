package com.kuaishou.live.lite.comment.view.item.gift.GiftSentMessageViewController$viewModel$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.comment.view.item.gift.GiftSentMessageViewController$viewModel$2;
import ca3.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.LiveData;

public final class GiftSentMessageViewController$viewModel$2$1 extends Lambda implements a	// class@000831
{
    public final GiftSentMessageViewController$viewModel$2 this$0;

    public void GiftSentMessageViewController$viewModel$2$1(GiftSentMessageViewController$viewModel$2 p0){
       this.this$0 = p0;
       super(0);
    }
    public final c invoke(){
       Object obj = PatchProxy.apply(null, this, GiftSentMessageViewController$viewModel$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this.this$0.$giftSentMessageLiveData);
    }
    public Object invoke(){
       return this.invoke();
    }
}
