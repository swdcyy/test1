package com.kuaishou.live.audience.component.gift.giftNaming.LiveGiftBoxGiftNamingNavigationBarManager;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import android.view.View;
import vq5.d;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import jk1.f;
import rl1.i;
import v01.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.viewcontroller.ViewControllerManagerImpl;
import com.kuaishou.live.viewcontroller.ViewHost;
import com.kuaishou.live.viewcontroller.ViewHost$Companion;
import rl1.a;
import com.kuaishou.live.audience.component.gift.giftNaming.LiveGiftBoxGiftNamingNavigationBarManager$a;
import com.kuaishou.live.audience.component.gift.giftNaming.LiveGiftBoxGiftNamingNavigationBarManager$observer$1;

public final class LiveGiftBoxGiftNamingNavigationBarManager	// class@000b74
{
    public final ViewControllerManagerImpl a;
    public final a b;
    public LiveGiftNamingNavigationVC c;
    public GiftPanelItem d;
    public boolean e;
    public final LiveGiftBoxGiftNamingNavigationBarManager$a f;
    public final Model$a g;
    public final LifecycleOwner h;
    public final Activity i;
    public final View j;
    public final d k;
    public final ClientContent$LiveStreamPackage l;
    public final f m;
    public final i n;
    public final b o;

    public void LiveGiftBoxGiftNamingNavigationBarManager(LifecycleOwner p0,Activity p1,View p2,d p3,ClientContent$LiveStreamPackage p4,f p5,i p6,b p7){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "activity");
       a.p(p2, "rootView");
       a.p(p3, "routerManager");
       a.p(p5, "giftBoxService");
       a.p(p6, "giftNamingService");
       a.p(p7, "listener");
       super();
       this.h = p0;
       this.i = p1;
       this.j = p2;
       this.k = p3;
       this.l = p4;
       this.m = p5;
       this.n = p6;
       this.o = p7;
       this.a = new ViewControllerManagerImpl(p0, p1, ViewHost.a.b(p2));
       this.b = p6.ra();
       this.f = new LiveGiftBoxGiftNamingNavigationBarManager$a(this);
       this.g = new LiveGiftBoxGiftNamingNavigationBarManager$observer$1(this);
    }
    public final Activity a(){
       return this.i;
    }
    public final b b(){
       return this.o;
    }
    public final ClientContent$LiveStreamPackage c(){
       return this.l;
    }
    public final d d(){
       return this.k;
    }
}
