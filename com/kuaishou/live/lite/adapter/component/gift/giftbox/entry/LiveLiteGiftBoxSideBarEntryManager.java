package com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$b;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import q73.a;
import wi1.c;
import yi1.a;
import wi1.b;
import xp5.i;
import z1.k;
import com.kuaishou.live.lite.sidebar.e;
import o73.b;
import o73.c;
import ug1.u0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$2;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$3;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$a;
import z1.a;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$e;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$d;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$c;
import android.view.View$OnClickListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.lite.sidebar.e$a;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$b;
import com.kuaishou.live.common.core.component.gift.update.UpdatedGiftResponse;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$handleUpdateGiftAnimation$task$1;
import ec3.f;
import msd.a;
import qi1.b;
import qm1.d;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem$a;
import androidx.lifecycle.DefaultLifecycleObserver;
import n2.a;
import ekd.k1;

public final class LiveLiteGiftBoxSideBarEntryManager extends LifecycleManager	// class@001dc9
{
    public LiveGiftSendWarningConfig c;
    public d d;
    public final c e;
    public final b f;
    public final LiveLiteGiftBoxSideBarItem g;
    public final a h;
    public final a i;
    public final i j;
    public final k k;
    public final e l;
    public final b m;
    public final c n;
    public final u0 o;
    public static final LiveLiteGiftBoxSideBarEntryManager$b p;

    static {
       LiveLiteGiftBoxSideBarEntryManager.p = new LiveLiteGiftBoxSideBarEntryManager$b(null);
    }
    public void LiveLiteGiftBoxSideBarEntryManager(LifecycleOwner p0,a p1,c p2,a p3,b p4,i p5,k p6,e p7,b p8,c p9,u0 p10){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "giftBoxEntryConfig");
       a.p(p2, "giftSendWarningConfigModel");
       a.p(p3, "giftBoxDisableModel");
       a.p(p4, "giftEnhanceFrequencyConfigModel");
       a.p(p5, "logPackageProvider");
       a.p(p6, "bizLogParams");
       a.p(p7, "liteSideBarService");
       a.p(p8, "dependency");
       a.p(p9, "listener");
       a.p(p10, "liveGiftTaskQueueDelegate");
       super(p0);
       this.h = p1;
       this.i = p3;
       this.j = p5;
       this.k = p6;
       this.l = p7;
       this.m = p8;
       this.n = p9;
       this.o = p10;
       p3.b(p0, new LiveLiteGiftBoxSideBarEntryManager$1(this));
       p2.b(p0, new LiveLiteGiftBoxSideBarEntryManager$2(this));
       p4.b(p0, new LiveLiteGiftBoxSideBarEntryManager$3(this));
       p7.e(new LiveLiteGiftBoxSideBarEntryManager$a(this));
       this.e = new LiveLiteGiftBoxSideBarEntryManager$e(this);
       this.f = new LiveLiteGiftBoxSideBarEntryManager$d(this);
       LiveLiteGiftBoxSideBarItem liveLiteGift = new LiveLiteGiftBoxSideBarItem(new LiveLiteGiftBoxSideBarEntryManager$c(this), p6);
       this.g = liveLiteGift;
       if (PatchProxy.applyVoid(null, this, LiveLiteGiftBoxSideBarEntryManager.class, "8")) {
       }else if(a.g(p3.a(), Boolean.TRUE)){
          b.Z(LiveLogTag.GIFT, "[LiveGiftBoxManager] [showGiftSideBar]: giftBoxDisableModel is true");
       }else {
          p7.b(liveLiteGift);
          p9.d();
          this.g();
       }
       return;
    }
    public final LiveLiteGiftBoxSideBarItem b(){
       return this.g;
    }
    public final c c(){
       return this.n;
    }
    public final void d(UpdatedGiftResponse p0,boolean p1){
       LiveLiteGiftBoxSideBarEntryManager liveLiteGift = LiveLiteGiftBoxSideBarEntryManager.class;
       if (PatchProxy.isSupport(liveLiteGift) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, liveLiteGift, "3")) {
          return;
       }
       LiveLiteGiftBoxSideBarEntryManager$handleUpdateGiftAnimation$task$1 ohandleUpdat = new LiveLiteGiftBoxSideBarEntryManager$handleUpdateGiftAnimation$task$1(this, p1, p0);
       if (f.h()) {
          this.o.E4("LiveLiteGiftBoxSideBarEntryManager::handleUpdateGiftAnimation", ohandleUpdat);
       }else {
          ohandleUpdat.invoke();
       }
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGiftBoxSideBarEntryManager.class, "9")) {
          return;
       }
       this.l.d(this.g);
       this.n.c();
       this.f();
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGiftBoxSideBarEntryManager.class, "11")) {
          return;
       }
       this.m.b(this.f);
       LiveLiteGiftBoxSideBarEntryManager td = this.d;
       if (td != null) {
          td.e();
       }
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGiftBoxSideBarEntryManager.class, "10")) {
          return;
       }
       this.m.a(this.f);
       LiveLiteGiftBoxSideBarEntryManager td = this.d;
       if (td != null) {
          td.f();
       }
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftBoxSideBarEntryManager.class, "6")) {
          return;
       }
       a.p(p0, "owner");
       super.onDestroy(p0);
       this.e();
       this.g.l();
       LiveLiteGiftBoxSideBarEntryManager td = this.d;
       if (td != null) {
          td.h();
       }
       this.g.o(null);
       return;
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftBoxSideBarEntryManager.class, "7")) {
          return;
       }
       a.p(p0, "owner");
       a.f(this, p0);
       k1.n(LiveLiteGiftBoxSideBarEntryManager.class);
       return;
    }
}
