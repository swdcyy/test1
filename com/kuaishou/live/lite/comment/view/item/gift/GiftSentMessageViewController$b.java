package com.kuaishou.live.lite.comment.view.item.gift.GiftSentMessageViewController$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.lite.comment.view.item.gift.GiftSentMessageViewController;
import java.lang.Object;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import sc3.a$a;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$a;
import ba3.a;
import ip3.a;
import sc3.a;

public final class GiftSentMessageViewController$b implements Observer	// class@00082c
{
    public final GiftSentMessageViewController b;

    public void GiftSentMessageViewController$b(GiftSentMessageViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftSentMessageViewController$b.class, "1")) {
       }else {
          GiftSentMessageViewController$b tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, GiftSentMessageViewController.class, "5")) {
             a$a uoa = new a$a(new UserProfile(p0), LiveStreamClickType.FEED_LIST);
             uoa.c = true;
             p0 = tb.V2().g().get();
             if (p0 != null) {
                p0.a(uoa);
             }
          }
       }
       return;
    }
}
