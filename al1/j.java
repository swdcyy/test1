package al1.j;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHint;
import java.lang.Iterable;
import qk.m;
import al1.i;
import ok.o;
import com.google.common.collect.ImmutableList;

public class j	// class@0000d1
{

    public void j(){
       super();
    }
    public static List a(GiftPanelItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return m.s(p0.mItemHint.mHints).p(i.b).B();
    }
}
