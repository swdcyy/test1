package com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$d;
import java.util.Comparator;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView;
import java.lang.Object;
import java.util.Map$Entry;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;

public class GiftAnimContainerView$d implements Comparator	// class@00111b
{
    public final GiftAnimContainerView b;

    public void GiftAnimContainerView$d(GiftAnimContainerView p0){
       this.b = p0;
       super();
    }
    public int compare(Object p0,Object p1){
       int i;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, GiftAnimContainerView$d.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else if((v2 = p1.getValue().longValue() - p0.getValue().longValue()) > 0){
          i = 1;
       }else if(!v2){
          i = 0;
       }else {
          i = -1;
       }
       return i;
    }
}
