package com.kuaishou.live.common.core.component.gift.domain.slot.data.a;
import java.util.Comparator;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.domain.slot.data.GiftSlotMessage;

public final class a implements Comparator	// class@001263
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p1.mComboCount - p0.mComboCount);
    }
}
