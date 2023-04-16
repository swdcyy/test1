package com.kuaishou.commercial.splash.presenter.r0$a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.ref.WeakReference;
import wkd.b;
import tjc.c;
import tjc.b;
import tkd.b;
import tkd.d;
import nl9.m;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.kuaishou.android.model.ads.SplashInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl;
import pxb.c;
import okd.b;
import mxb.u;
import n49.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import com.yxcorp.gifshow.w;

public class r0$a implements Runnable	// class@001604
{
    public boolean b;
    public WeakReference c;
    public u d;

    public void r0$a(){
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, r0$a.class, "2")) {
          return;
       }
       r0$a tc = this.c;
       if (tc != null && tc.get() != null) {
          b uob = b.a(-1608526086).a();
          if (uob == null) {
             return;
          }else {
             AdDataWrapper uAdDataWrapp = d.a(-2125799450).iJ(uob.b, 5);
             uAdDataWrapp.setCustomClickUrl(uob.a.mSplashClickUrlInfo);
             uAdDataWrapp.setDisplaySplashPopUpOnWeb(this.b);
             int i = 0;
             if (this.b != null && uAdDataWrapp instanceof c) {
                uAdDataWrapp.setActivityAnimation(R.anim.arg_RES_7f01004a, i);
             }
             if (this.d == null) {
                this.d = b.a(0x56718eb5);
             }
             if (this.d != null) {
                e uoe = new e(i);
                uoe.e = i;
                this.d.b(uAdDataWrapp, this.c.get(), uoe);
             }
             b.a(-1343064608).h0();
          }
       }
       return;
    }
}
