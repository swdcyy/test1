package com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLitGiftBoxBottomBarEntryManager;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLitGiftBoxBottomBarEntryManager$b;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import q73.a;
import wi1.c;
import yi1.a;
import xp5.i;
import z1.k;
import com.kuaishou.live.lite.sidebar.e;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import o73.b;
import o73.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLitGiftBoxBottomBarEntryManager$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLitGiftBoxBottomBarEntryManager$a;
import z1.a;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLitGiftBoxBottomBarEntryManager$3;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLitGiftBoxBottomBarEntryManager$e;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLitGiftBoxBottomBarEntryManager$d;
import p73.a;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLitGiftBoxBottomBarEntryManager$c;
import android.view.View$OnClickListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import qi1.b;
import qm1.d;

public final class LiveLitGiftBoxBottomBarEntryManager extends LifecycleManager	// class@001dbd
{
    public LiveGiftSendWarningConfig c;
    public d d;
    public final c e;
    public final b f;
    public final a g;
    public final a h;
    public final a i;
    public final i j;
    public final k k;
    public final e l;
    public final LiveLiteBottomBarService m;
    public final b n;
    public final c o;
    public static final LiveLitGiftBoxBottomBarEntryManager$b p;

    static {
       LiveLitGiftBoxBottomBarEntryManager.p = new LiveLitGiftBoxBottomBarEntryManager$b(null);
    }
    public void LiveLitGiftBoxBottomBarEntryManager(LifecycleOwner p0,a p1,c p2,a p3,i p4,k p5,e p6,LiveLiteBottomBarService p7,b p8,c p9){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "giftBoxEntryConfig");
       a.p(p2, "giftSendWarningConfigModel");
       a.p(p3, "giftPanelDisableModel");
       a.p(p4, "logPackageProvider");
       a.p(p5, "bizLogParams");
       a.p(p6, "liteSideBarService");
       a.p(p7, "liteBottomBarService");
       a.p(p8, "dependency");
       a.p(p9, "listener");
       super(p0);
       this.h = p1;
       this.i = p3;
       this.j = p4;
       this.k = p5;
       this.l = p6;
       this.m = p7;
       this.n = p8;
       this.o = p9;
       p3.b(p0, new LiveLitGiftBoxBottomBarEntryManager$1(this));
       p6.e(new LiveLitGiftBoxBottomBarEntryManager$a(this));
       p2.b(p0, new LiveLitGiftBoxBottomBarEntryManager$3(this));
       this.e = new LiveLitGiftBoxBottomBarEntryManager$e(this);
       this.f = new LiveLitGiftBoxBottomBarEntryManager$d(this);
       this.g = new a(new LiveLitGiftBoxBottomBarEntryManager$c(this), p5);
    }
    public final c b(){
       return this.o;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LiveLitGiftBoxBottomBarEntryManager.class, "7")) {
          return;
       }
       this.m.c(this.g);
       this.o.c();
       this.n.b(this.f);
       LiveLitGiftBoxBottomBarEntryManager td = this.d;
       if (td != null) {
          td.e();
       }
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitGiftBoxBottomBarEntryManager.class, "5")) {
          return;
       }
       a.p(p0, "owner");
       super.onDestroy(p0);
       this.c();
       LiveLitGiftBoxBottomBarEntryManager td = this.d;
       if (td != null) {
          td.h();
       }
       return;
    }
}
