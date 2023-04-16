package com.kwaishou.merchant.daccore.rnlive.RNLive$c$a;
import o08.a$b;
import com.kwaishou.merchant.daccore.rnlive.RNLive$c;
import brd.v;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwaishou.merchant.daccore.rnlive.RNLive;
import java.util.Map;
import java.lang.Boolean;
import brd.g;
import java.lang.Class;
import java.lang.Throwable;

public final class RNLive$c$a implements a$b	// class@00133b
{
    public final RNLive$c a;
    public final v b;

    public void RNLive$c$a(RNLive$c p0,v p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(Object p0){
       RNLive$c$a ta = this.a;
       RNLive.d(ta.b, ta.f, "RNLive shouldShow result:"+p0, null, 4, null);
       if (p0 instanceof Boolean) {
          this.b.onNext(p0);
       }else {
          ta = this.a;
          RNLive$c b = ta.b;
          RNLive$c f = ta.f;
          StringBuilder str = "RNLive shouldShow result not boolean type:";
          p0 = (p0 != null)? p0.getClass().getSimpleName(): null;
          RNLive.b(b, f, str+p0, null, null, 12, null);
          this.b.onNext(Boolean.FALSE);
       }
       return;
    }
}
