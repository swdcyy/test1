package com.kuaishou.live.common.core.component.gift.domain.giftbox.model.LiveGiftBoxRefreshModel;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import androidx.lifecycle.LifecycleOwner;
import v51.a;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import z1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import nsd.u;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.model.LiveGiftBoxRefreshModel$a;
import hf3.a;
import com.kuaishou.livestream.message.nano.SCLiveGiftPanelRefresh;
import lf3.g;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.model.LiveGiftBoxRefreshModel$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;

public final class LiveGiftBoxRefreshModel extends Model	// class@001206
{
    public final g i;
    public final LifecycleOwner j;
    public final a k;
    public final LiveGiftSendModel l;
    public final k m;

    public void LiveGiftBoxRefreshModel(LifecycleOwner p0,a p1,LiveGiftSendModel p2,k p3){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "longConnectManager");
       a.p(p2, "giftSendModel");
       a.p(p3, "giftPanelRefreshConfig");
       String name = LiveGiftBoxRefreshModel.class.getName();
       a.o(name, "LiveGiftBoxRefreshModel::class.java.name");
       super(name, null, false, false, 14, null);
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.m = p3;
       LiveGiftBoxRefreshModel$a uoa = new LiveGiftBoxRefreshModel$a(this);
       this.i = uoa;
       p1.u().u0(797, SCLiveGiftPanelRefresh.class, uoa);
       p2.b(p0, new LiveGiftBoxRefreshModel$1(this));
    }
}
