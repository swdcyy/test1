package com.kuaishou.live.core.show.liveslidesquare.b;
import os5.e;
import java.lang.Object;
import com.smile.gifshow.annotation.plugin.a;
import java.lang.Class;
import com.smile.gifshow.annotation.plugin.Factory;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Intent;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import za2.j;
import android.content.Context;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.LiveShellActivity;
import z0.a;
import za2.i;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import za2.k;
import za2.l;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import tkd.b;
import tkd.d;
import za2.g;
import androidx.fragment.app.Fragment;

public class b implements e	// class@000c92
{
    public final e b;

    public void b(){
       super();
       this.b = new a(e.class).getInstance();
    }
    public void QH(GifshowActivity p0,Intent p1,int p2){
       if (PatchProxy.isSupport2(b.class, "4") && PatchProxy.applyVoidThreeRefsWithListener(p0, p1, Integer.valueOf(p2), this, b.class, "4")) {
          return;
       }
       LiveShellActivity.u3(p0, new j(this, p0, p1, p2), "navigateNewLiveSlidePlay3");
       PatchProxy.onMethodExit(b.class, "4");
       return;
    }
    public void ai(Context p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "5")) {
          return;
       }
       LiveShellActivity.u3(p0, new i(this, p0, p1), "LiveSlideUriHandler.handleInternal");
       return;
    }
    public void b1(GifshowActivity p0,LiveSlidePlayEnterParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "2")) {
          return;
       }
       LiveShellActivity.u3(p0, new k(this, p0, p1), "navigateNewLiveSlidePlay1");
       return;
    }
    public void eO(GifshowActivity p0,LiveSlidePlayEnterParam p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, b.class, "3")) {
          return;
       }
       LiveShellActivity.u3(p0, new l(this, p0, p1, p2), "navigateNewLiveSlidePlay2");
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public final e n(){
       b tb;
       e obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (LivePluginManager.c())? d.a(0x5ce05f7).U50(): this.b;
       return obj;
    }
    public Fragment vM(){
       Object obj = PatchProxy.apply(null, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n().vM();
    }
}
