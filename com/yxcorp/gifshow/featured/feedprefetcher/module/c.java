package com.yxcorp.gifshow.featured.feedprefetcher.module.c;
import fw8.b;
import com.yxcorp.gifshow.featured.feedprefetcher.module.PhotoPrefetcherInitModule;
import com.yxcorp.gifshow.featured.feedprefetcher.module.c$a;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import hn5.n;
import android.content.Context;
import pea.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c$b;
import crd.b;
import lnc.b9;

public class c extends b	// class@000fc8
{
    public final c$b b;
    public final PhotoPrefetcherInitModule c;

    public void c(PhotoPrefetcherInitModule p0){
       this.c = p0;
       super();
       this.b = new c$a(this);
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       if (d.a(-1883158055).U3(p0)) {
          b.g("InitModule Home Created");
          p0.getSupportFragmentManager().registerFragmentLifecycleCallbacks(this.b, true);
       }else {
          this.c.s0();
       }
       return;
    }
    public void onActivityDestroyed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       if (d.a(-1883158055).U3(p0)) {
          b.g("InitModule Home Destroyed");
          p0.getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this.b);
          b9.a(this.c.w);
          p0.t = false;
       }
       return;
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       if (d.a(-1883158055).U3(p0)) {
          b.g("InitModule Home resume");
          this.c.x0();
       }
       return;
    }
}
