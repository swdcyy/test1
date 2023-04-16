package com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$Companion$obtainClassToGeneratorBindingList$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$a;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class ItemViewControllerFactory$Companion$obtainClassToGeneratorBindingList$1 extends Lambda implements q	// class@000814
{
    public static final ItemViewControllerFactory$Companion$obtainClassToGeneratorBindingList$1 INSTANCE;

    static {
       ItemViewControllerFactory$Companion$obtainClassToGeneratorBindingList$1.INSTANCE = new ItemViewControllerFactory$Companion$obtainClassToGeneratorBindingList$1();
    }
    public void ItemViewControllerFactory$Companion$obtainClassToGeneratorBindingList$1(){
       super(3);
    }
    public final SimpleCommentMessageViewController invoke(LiveData p0,LiveData p1,ItemViewControllerFactory$a p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ItemViewControllerFactory$Companion$obtainClassToGeneratorBindingList$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "positionLiveData");
       a.p(p1, "messageLiveData");
       a.p(p2, "dependence");
       return new SimpleCommentMessageViewController(p0, p1, p2);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       return this.invoke(p0, p1, p2);
    }
}
