package com.yxcorp.gifshow.lelink.ScreencastManager$c;
import com.hpplay.sdk.source.api.ILelinkPlayerListener;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.lelink.util.KLogLelink;
import com.yxcorp.gifshow.lelink.util.KLogLelink$a;
import q87.c;
import com.yxcorp.gifshow.lelink.ScreencastManager$c$a;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.screencast.ScreencastStatus;
import com.yxcorp.gifshow.lelink.ScreencastManager$c$b;
import com.yxcorp.gifshow.lelink.ScreencastManager$c$c;
import java.lang.Long;
import com.yxcorp.gifshow.lelink.ScreencastManager$c$d;
import com.yxcorp.gifshow.lelink.ScreencastManager$c$e;
import com.yxcorp.gifshow.lelink.ScreencastManager$c$f;

public final class ScreencastManager$c implements ILelinkPlayerListener	// class@001a33
{
    public final ScreencastManager a;

    public void ScreencastManager$c(ScreencastManager p0){
       this.a = p0;
       super();
    }
    public void onCompletion(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager$c.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       KLogLelink.e.a().w(this.a.a, "onCompletion: ", objArray);
       k1.o(new ScreencastManager$c$a(this));
       return;
    }
    public void onError(int p0,int p1){
       ScreencastManager$c uoc = ScreencastManager$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       KLogLelink.e.a().w(this.a.a, "onError: what = "+p0+" extra = "+p1, objArray);
       p0.n = ScreencastStatus.BREAK;
       k1.o(new ScreencastManager$c$b(this));
       return;
    }
    public void onInfo(int p0,int p1){
    }
    public void onLoading(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager$c.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       KLogLelink.e.a().w(this.a.a, "onLoading: ", objArray);
       this.a.n = ScreencastStatus.START;
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager$c.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       KLogLelink.e.a().w(this.a.a, "onPause: ", objArray);
       this.a.n = ScreencastStatus.PAUSE;
       k1.o(new ScreencastManager$c$c(this));
       return;
    }
    public void onPositionUpdate(long p0,long p1){
       ScreencastManager$c uoc = ScreencastManager$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uoc, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       KLogLelink.e.a().w(this.a.a, "onPositionUpdate: max = "+p0+" cur = "+p1, objArray);
       p0.p = p1;
       k1.o(new ScreencastManager$c$d(this, p1));
       return;
    }
    public void onSeekComplete(int p0){
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager$c.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       KLogLelink.e.a().w(this.a.a, "onStart: ", objArray);
       this.a.n = ScreencastStatus.START;
       k1.o(new ScreencastManager$c$e(this));
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager$c.class, "4")) {
          return;
       }
       ScreencastManager n = this.a.n;
       if (n != ScreencastStatus.START && n != ScreencastStatus.PAUSE) {
          return;
       }
       Object[] objArray = new Object[0];
       KLogLelink.e.a().w(this.a.a, "onStop: ", objArray);
       this.a.n = ScreencastStatus.BREAK;
       k1.o(new ScreencastManager$c$f(this));
       return;
    }
    public void onVolumeChanged(float p0){
    }
}
