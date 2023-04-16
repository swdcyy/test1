package com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailDataService;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailDataService$a;
import nsd.u;
import androidx.lifecycle.Lifecycle;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import crd.a;
import mrd.a;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailDataService$1;
import androidx.lifecycle.LifecycleObserver;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import ekd.r0;
import java.lang.CharSequence;
import android.text.TextUtils;
import xn1.a;
import com.kuaishou.live.common.core.component.hotspot.http.LiveHotSpotApi;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailDataService$b;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailDataService$c;
import erd.g;
import crd.b;

public final class LiveHotSpotDetailDataService	// class@0013c3
{
    public final a a;
    public final a b;
    public static final LiveHotSpotDetailDataService$a c;

    static {
       LiveHotSpotDetailDataService.c = new LiveHotSpotDetailDataService$a(null);
    }
    public void LiveHotSpotDetailDataService(Lifecycle p0){
       a.p(p0, "lifecycle");
       super();
       this.a = new a();
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<DetailResponse>\(\)");
       this.b = uoa;
       p0.addObserver(new LiveHotSpotDetailDataService$1(this));
    }
    public final void a(String p0,int p1,Context p2){
       t ot;
       if (PatchProxy.isSupport(LiveHotSpotDetailDataService.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, LiveHotSpotDetailDataService.class, "1")) {
          return;
       }
       a.p(p2, "context");
       if (!r0.d(p2)) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          a.m(p0);
          ot = LiveHotSpotApi.a().b(p0);
       }else {
          ot = LiveHotSpotApi.a().a(p1);
       }
       this.a.c(ot.map(new e()).subscribe(new LiveHotSpotDetailDataService$b(this, p0, p1), new LiveHotSpotDetailDataService$c(this, p0, p1)));
       return;
    }
    public final a b(){
       return this.b;
    }
}
