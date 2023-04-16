package com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$Companion;
import java.lang.Object;
import nsd.u;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import com.kuaishou.live.lite.comment.model.SimpleCommentMessage;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$Companion$obtainClassToGeneratorBindingList$1;
import com.kuaishou.live.lite.comment.model.GiftSentMessage;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$Companion$obtainClassToGeneratorBindingList$2;
import com.kuaishou.live.lite.comment.model.AuthorReplyMessage;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$Companion$obtainClassToGeneratorBindingList$3;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class ItemViewControllerFactory$Companion	// class@000817
{

    public void ItemViewControllerFactory$Companion(){
       super();
    }
    public void ItemViewControllerFactory$Companion(u p0){
       super();
    }
    public final List a(){
       Pair[] obj = PatchProxy.apply(null, this, ItemViewControllerFactory$Companion.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Pair[]{new Pair(SimpleCommentMessage.class, ItemViewControllerFactory$Companion$obtainClassToGeneratorBindingList$1.INSTANCE),new Pair(GiftSentMessage.class, ItemViewControllerFactory$Companion$obtainClassToGeneratorBindingList$2.INSTANCE),new Pair(AuthorReplyMessage.class, ItemViewControllerFactory$Companion$obtainClassToGeneratorBindingList$3.INSTANCE)};
       return CollectionsKt__CollectionsKt.L(obj);
    }
}
