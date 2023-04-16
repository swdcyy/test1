package com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBottomBarConfig;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBottomBarConfig$c;
import nsd.u;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem;
import java.lang.String;
import lnc.a1;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import msd.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBottomBarConfig$bottomBarHeight$2;
import qrd.p;
import qrd.s;
import ih1.e;
import yg1.e;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBottomBarConfig$a;
import yg1.a;
import ih1.d;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBottomBarConfig$b;

public final class LiveGiftBottomBarConfig	// class@0011d0
{
    public String a;
    public List b;
    public final p c;
    public static final List d;
    public static final LiveGiftBottomBarConfig$c e;

    static {
       LiveGiftBottomBarConfig.e = new LiveGiftBottomBarConfig$c(null);
       LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem[] liveGiftBatc = new LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem[]{new LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem(1314, a1.p(0x7f103a61)),new LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem(520, a1.p(0x7f103a64)),new LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem(188, a1.p(0x7f103a62)),new LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem(66, a1.p(0x7f103a65)),new LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem(30, a1.p(0x7f103a63)),new LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem(10, a1.p(0x7f103a60)),new LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem(1, a1.p(0x7f103a5f))};
       LiveGiftBottomBarConfig.d = CollectionsKt__CollectionsKt.L(liveGiftBatc);
    }
    public void LiveGiftBottomBarConfig(){
       super(null);
    }
    public void LiveGiftBottomBarConfig(a p0){
       super();
       this.c = s.c(new LiveGiftBottomBarConfig$bottomBarHeight$2(p0));
       new e().a("[LiveGiftBottomBarConfig][init]", new e(new Object()), new LiveGiftBottomBarConfig$a(this));
       new d().a("[LiveGiftBottomBarConfig][init]", new e(new Object()), new LiveGiftBottomBarConfig$b(this));
    }
}
