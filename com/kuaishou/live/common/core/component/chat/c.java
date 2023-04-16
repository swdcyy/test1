package com.kuaishou.live.common.core.component.chat.c;
import java.util.Comparator;
import java.lang.Object;
import com.kuaishou.live.core.show.chat.model.LiveMultiChatGuestWidgetConfig;
import java.lang.Integer;

public final class c implements Comparator	// class@00103f
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return Integer.compare(p0.mSupportMultiChatCount, p1.mSupportMultiChatCount);
    }
}
