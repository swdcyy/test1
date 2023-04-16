package com.kuaishou.live.common.core.component.gift.giftpanel.tablist.LiveGiftPanelTabListAdapter$onCreateViewHolder$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.gift.giftpanel.tablist.LiveGiftPanelTabListAdapter;
import java.lang.String;
import ah1.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import wl1.j;

public final class LiveGiftPanelTabListAdapter$onCreateViewHolder$1 extends Lambda implements l	// class@001301
{
    public final LiveGiftPanelTabListAdapter this$0;

    public void LiveGiftPanelTabListAdapter$onCreateViewHolder$1(LiveGiftPanelTabListAdapter p0){
       this.this$0 = p0;
       super(1);
    }
    public final c invoke(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftPanelTabListAdapter$onCreateViewHolder$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return this.this$0.m.j(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
