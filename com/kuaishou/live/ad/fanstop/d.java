package com.kuaishou.live.ad.fanstop.d;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import pl0.g;
import pl0.h;
import ok.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mxb.j0;
import mxb.i0;
import mxb.j;
import com.kuaishou.live.ad.fanstop.c;
import erd.g;
import java.lang.Runnable;
import ekd.k1;
import tl8.d;
import com.kwai.video.waynelive.LivePlayerState;
import java.lang.Enum;

public class d implements LivePlayerStateChangeListener	// class@00099f
{
    public int b;
    public Runnable c;
    public Runnable d;
    public BaseFeed e;
    public static final int[] f;

    static {
       d.f = new int[4]{3000,0x36b0,0xea60,0x30d40};
    }
    public void d(BaseFeed p0){
       super();
       this.b = 0;
       this.c = new g(this);
       this.d = new h(this);
       n.j(p0);
       this.e = p0;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       int[] f = d.f;
       if (this.b >= f.length) {
          return;
       }
       i0.a().u(i0.a().g(this.e).a(c.b), f[this.b]);
       int i = this.b + 1;
       this.b = i;
       if (i < f.length) {
          k1.r(this.c, (long)(f[i] - f[(i - 1)]));
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       k1.m(this.c);
       k1.m(this.d);
       if (this.e.get("AD") != null) {
          k1.o(this.d);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       k1.m(this.c);
       k1.m(this.d);
       return;
    }
    public void onStateChange(LivePlayerState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "5")) {
          return;
       }
       if (p0.equals(LivePlayerState.PLAYING)) {
          this.b();
       }else if(p0.equals(LivePlayerState.STOP)){
          this.c();
       }
       return;
    }
}
