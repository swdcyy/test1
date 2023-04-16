package com.kuaishou.live.common.core.component.gift.domain.giftbox.log.LiveGiftBoxLogger$b;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;

public final class LiveGiftBoxLogger$b implements x	// class@001202
{
    public static final LiveGiftBoxLogger$b b;

    static {
       LiveGiftBoxLogger$b.b = new LiveGiftBoxLogger$b();
    }
    public void LiveGiftBoxLogger$b(){
       super();
    }
    public Object get(){
       ArrayList uArrayList = PatchProxy.apply(null, this, LiveGiftBoxLogger$b.class, "1");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
       }
       return uArrayList;
    }
}
