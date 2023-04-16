package bl3.i$a;
import yqb.c;
import bl3.i;
import java.lang.Object;
import com.yxcorp.gifshow.autoplay.live.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.video.waynelive.LivePlayerController;
import bl3.h;
import java.lang.Integer;
import com.yxcorp.gifshow.autoplay.live.c;
import java.util.HashMap;
import u99.d;
import java.lang.System;
import wkd.b;
import rj3.c;
import rj3.a$a;
import tj3.e;
import tj3.d;
import rj3.d;
import rj3.a;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.util.Set;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$b;

public class i$a implements c	// class@0003ed
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public boolean r(){
       boolean b1;
       g og = g.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i obj = PatchProxy.apply(null, this, i$a.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.b.E;
       Objects.requireNonNull(obj);
       h obj1 = PatchProxy.apply(null, obj, og, "9");
       boolean b = false;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else if(!TextUtils.x(obj.n) && (obj.Q() != null && obj.Q().isPlaying())){
          b1 = true;
       }else {
          b1 = false;
       }
       if (b1) {
          i$a tb = this.b;
          if (tb.P == null) {
             i e = tb.E;
             int i = 5;
             obj1 = new h(this);
             Objects.requireNonNull(e);
             if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), obj1, e, og, "8")) {
                LivePlayerController livePlayerCo = e.Q();
                if (livePlayerCo != null) {
                   e.o = true;
                   g c = e.c;
                   Objects.requireNonNull(c);
                   c uoc = c.class;
                   if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, c, uoc, "31")) {
                      d.h("LiveAutoPlayController", "enableReleasePlayer= false", c.C());
                      c.G = b;
                   }
                   long l = System.currentTimeMillis();
                   c uoc1 = b.a(0x59ca4ae1);
                   g n = e.n;
                   a$a uoa = new a$a(livePlayerCo);
                   if (e.S() != null) {
                      b = e.S().b().r;
                   }
                   uoa.b(b);
                   uoa.c(i);
                   uoa.e(l);
                   uoa.d(obj1);
                   uoc1.b(n, uoa.a());
                   d.d("LivePlayModule", "[LiveReuse]cacheLivePlayerController, reuse key: "+e.n+", reuse type: "+i+", timestamp: "+l);
                   if (!PatchProxy.applyVoid(null, e, og, "18")) {
                      Iterator iterator = e.g.iterator();
                      while (iterator.hasNext()) {
                         iterator.next().onPlayerCached();
                      }
                   }
                }
             }
             return true;
          }
       }
       return b;
    }
    public String w(){
       return this.b.L;
    }
}
