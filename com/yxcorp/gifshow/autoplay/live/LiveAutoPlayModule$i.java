package com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$i;
import sj3.b;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import java.lang.Object;
import sj3.a;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import u99.e;
import java.lang.Throwable;
import java.util.HashMap;
import u99.d;
import hj3.c;
import zb6.a;
import com.yxcorp.gifshow.exception.ServerException;
import java.lang.Long;
import tj3.i;
import tj3.e;
import com.kwai.video.waynelive.LivePlayerController;
import java.lang.CharSequence;
import android.text.TextUtils;
import e17.i;

public final class LiveAutoPlayModule$i implements b	// class@001c06
{
    public final LiveAutoPlayModule b;

    public void LiveAutoPlayModule$i(LiveAutoPlayModule p0){
       this.b = p0;
       super();
    }
    public void c(){
       a.a(this);
    }
    public void e(){
       a.d(this);
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAutoPlayModule$i.class, "1")) {
          return;
       }
       a.p(p0, "newConfig");
       a.p(p1, "oldConfig");
       a.b(this, p0, p1);
       LiveAutoPlayModule k = this.b.K;
       if (k != null) {
          k.b(1);
       }
       return;
    }
    public void onError(Throwable p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoPlayModule$i.class, "2")) {
          return;
       }
       a.p(p0, "e");
       d.h("LiveAutoPlayModule", "mReconnectListener", this.b.Q());
       LiveAutoPlayModule k = this.b.K;
       if (k != null) {
          k.b(c.a(p0));
       }
       if (a.h(p0)) {
          ServerException serverExcept = a.a(p0);
          ServerException errorCode = serverExcept.errorCode;
          if (errorCode == 601) {
             LiveAutoPlayModule$i tb = this.b;
             k = tb.K;
             if (k != null) {
                LiveAutoPlayModule f = tb.F;
                if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Long.valueOf(f), k, uoe, "5")) {
                   e f1 = k.f;
                   if (f1 == null) {
                      a.S("liveLogReporter");
                   }
                   i oi = f1.h();
                   oi.n(false);
                   oi.G(6);
                   k.c(f);
                }
             }
             this.b.X();
             this.b.V();
          }else if(errorCode == 607){
             k = this.b.k;
             if (k != null) {
                k.mute();
             }
             k = this.b.k;
             if (k != null && !k.isStop()) {
                k = this.b.k;
                if (k != null) {
                   k.stopPlay();
                }
                this.b.d0();
             }
             LiveAutoPlayModule$i tb1 = this.b;
             LiveAutoPlayModule k1 = tb1.K;
             if (k1 != null) {
                k = tb1.o;
                QLivePlayConfig mWatchingCou = (k != null)? k.mWatchingCount: 0;
                if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Long.valueOf(mWatchingCou), k1, uoe, "6")) {
                   uoe = k1.f;
                   if (uoe == null) {
                      a.S("liveLogReporter");
                   }
                   i oi1 = uoe.h();
                   oi1.n(true);
                   oi1.G(6);
                   k1.c(mWatchingCou);
                }
             }
             this.b.X();
             this.b.V();
          }
          ServerException errorCode1 = serverExcept.errorCode;
          if (errorCode1 >= 600 && (errorCode1 != 608 && !TextUtils.isEmpty(serverExcept.errorMessage))) {
             i.d(R.style.arg_RES_7f110668, serverExcept.errorMessage);
          }
       }
       return;
    }
}
