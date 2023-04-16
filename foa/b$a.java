package foa.b$a;
import qw6.a;
import foa.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import px6.b;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import mx6.c;
import tx6.a;
import java.lang.CharSequence;
import com.yxcorp.gifshow.model.CDNUrl;
import kotlin.jvm.internal.a;
import hc6.b;
import rx6.d;
import nsd.u;
import foa.b$a$a;
import rx6.b;
import msd.l;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;

public final class b$a implements a	// class@0029a2
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void H2(){
    }
    public void N2(){
    }
    public void Q0(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "2")) {
          return;
       }
       b$a tb = this.b;
       tb.q = false;
       IWaynePlayer iWaynePlayer = tb.P8();
       if (iWaynePlayer != null && iWaynePlayer.isPlaying() == true) {
          this.b.S8();
       }
       b p = this.b.p;
       if (p != null) {
          p = p.getPlayerKitContext();
          if (p != null) {
             a uoa = p.d(c.class);
             if (uoa != null) {
                uoa.c(this.b.u);
             }
          }
       }
       return;
    }
    public void Q1(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       b$a tb = this.b;
       tb.q = true;
       int i = 0;
       tb = (!tb.R8().length())? 1: null;
       if (tb) {
          return;
       }else {
          b p = this.b.p;
          if (p != null) {
             p = p.getPlayerKitContext();
             if (p != null) {
                a uoa = p.d(c.class);
                if (uoa != null) {
                   uoa.d(this.b.u);
                }
             }
          }
          IWaynePlayer iWaynePlayer = this.b.P8();
          if (iWaynePlayer != null && iWaynePlayer.isPrepared() == true) {
             this.b.V8();
             return;
          }else {
             CDNUrl[] uCDNUrlArray = new CDNUrl[true];
             uCDNUrlArray[i] = new CDNUrl("", this.b.R8());
             p = this.b.p;
             a.m(p);
             b uob = new b(uCDNUrlArray, false, 0, null, 14, null);
             p.g(v9, new b$a$a());
             iWaynePlayer = this.b.P8();
             if (iWaynePlayer != null) {
                iWaynePlayer.setLooping(true);
             }
             return;
          }
       }
    }
}
