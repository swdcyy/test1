package com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController$c;
import androidx.lifecycle.Observer;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController;
import java.lang.Object;
import com.kuaishou.live.lite.comment.model.SimpleCommentMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import sc3.a$a;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import com.kuaishou.live.lite.comment.model.AbstractCommentMessage;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$a;
import ba3.a;
import ip3.a;
import sc3.a;

public final class SimpleCommentMessageViewController$c implements Observer	// class@000820
{
    public final SimpleCommentMessageViewController b;

    public void SimpleCommentMessageViewController$c(SimpleCommentMessageViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SimpleCommentMessageViewController$c.class, "1")) {
       }else {
          SimpleCommentMessageViewController$c tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, SimpleCommentMessageViewController.class, "8")) {
             a$a uoa = new a$a(new UserProfile(p0.getUserInfo()), LiveStreamClickType.FEED_LIST);
             uoa.d = p0.isAnonymous();
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
