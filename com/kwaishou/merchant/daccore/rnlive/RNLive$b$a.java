package com.kwaishou.merchant.daccore.rnlive.RNLive$b$a;
import o08.a$b;
import com.kwaishou.merchant.daccore.rnlive.RNLive$b;
import brd.v;
import java.lang.Object;
import java.util.Map;
import kotlin.Pair;
import qrd.r0;
import trd.t0;
import java.lang.String;
import com.kwaishou.merchant.daccore.rnlive.RNLive;
import java.lang.Throwable;
import java.util.HashMap;
import brd.g;

public final class RNLive$b$a implements a$b	// class@001339
{
    public final RNLive$b a;
    public final v b;

    public void RNLive$b$a(RNLive$b p0,v p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(Object p0){
       if (p0 instanceof Map) {
          RNLive$b$a ta = this.a;
          RNLive$b b = ta.b;
          RNLive$b g = ta.g;
          Pair[] pairArray = new Pair[]{r0.a("data", p0)};
          Map map = t0.j0(pairArray);
          try{
             b.c(g, "RNLive pendantInfo result", map);
          }catch(java.lang.Exception e3){
             RNLive.b(this.a.b, this.a.g, "RNLive pendantInfo result cast error", e3, null, 8, null);
             p0 = new HashMap();
          }
          this.b.onNext(p0);
       }else {
          this.b.onNext(new HashMap());
       }
       return;
    }
}
