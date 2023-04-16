package com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationManager;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import androidx.lifecycle.LifecycleOwner;
import v51.a;
import zg1.l;
import zg1.e;
import z1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import wi1.a;

public final class LiveVipGradeNavigationManager extends LifecycleManager	// class@0011e5
{
    public final a c;
    public final k d;

    public void LiveVipGradeNavigationManager(LifecycleOwner p0,a p1,l p2,e p3,k p4,k p5){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "longConnectManager");
       a.p(p2, "userStatusServiceAdapter");
       a.p(p3, "dialogServiceAdapter");
       a.p(p4, "liveStreamId");
       a.p(p5, "anchorInfo");
       super(p0);
       this.d = p5;
       this.c = new a(p4, p1, p2, p3);
    }
}
