package com.yxcorp.gifshow.autoplay.live.c$a;
import sj3.b;
import com.yxcorp.gifshow.autoplay.live.c;
import java.lang.Object;
import sj3.a;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tj3.e;
import java.lang.Throwable;
import java.util.HashMap;
import u99.d;
import hj3.c;
import zb6.a;
import com.yxcorp.gifshow.exception.ServerException;
import tj3.i;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$b;
import com.kwai.video.waynelive.LivePlayerController;
import java.lang.CharSequence;
import android.text.TextUtils;
import e17.i;

public class c$a implements b	// class@001c10
{
    public final c b;

    public void c$a(c p0){
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$a.class, "1")) {
          return;
       }
       this.b.j.u(1);
       return;
    }
    public void onError(Throwable p0){
       LiveAutoPlay d;
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       d.h("LiveAutoPlayController", "mReconnectListener", this.b.C());
       this.b.j.u(c.a(p0));
       if (a.h(p0)) {
          ServerException serverExcept = a.a(p0);
          ServerException errorCode = serverExcept.errorCode;
          if (errorCode == 601) {
             i oi = this.b.j.h();
             oi.n(false);
             oi.G(6);
             this.b.M();
             c$a tb = this.b;
             tb.x = true;
             d = tb.d;
             if (d != null) {
                d.onRenderStop();
                this.b.d.onAnchorEndLive();
             }
          }else if(errorCode == 607){
             i oi1 = this.b.j.h();
             oi1.n(true);
             oi1.G(6);
             this.b.M();
             this.b.i.mute();
             if (!this.b.i.isStop()) {
                this.b.i.stopPlay();
                this.b.J();
             }
             c$a tb1 = this.b;
             tb1.x = true;
             LiveAutoPlay d1 = tb1.d;
             if (d1 != null) {
                d1.onRenderStop();
                this.b.d.onAnchorEndLive();
             }
          }
          errorCode = serverExcept.errorCode;
          if (errorCode >= 600 && (errorCode != 608 && !TextUtils.isEmpty(serverExcept.errorMessage))) {
             i.d(R.style.arg_RES_7f110668, serverExcept.errorMessage);
          }
       }
    label_00bc :
       return;
    }
}
