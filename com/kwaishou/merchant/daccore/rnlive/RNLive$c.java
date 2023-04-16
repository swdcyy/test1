package com.kwaishou.merchant.daccore.rnlive.RNLive$c;
import io.reactivex.g;
import com.kwaishou.merchant.daccore.rnlive.RNLive;
import java.lang.String;
import com.google.gson.JsonObject;
import n08.a;
import java.lang.Object;
import brd.v;
import kotlin.Pair;
import qrd.r0;
import java.lang.Integer;
import com.kwaishou.merchant.daccore.util.PendantUtil;
import com.kwaishou.merchant.daccore.log.DyTroubleShooting;
import c08.a;
import b08.a;
import com.kwaishou.merchant.daccore.log.DACKeyNode;
import java.util.Map;
import com.kwaishou.merchant.daccore.util.PendantUtil$Companion;
import trd.t0;
import com.kwaishou.merchant.daccore.rnlive.RNLive$c$a;
import o08.a;
import o08.a$b;

public final class RNLive$c implements g	// class@00133c
{
    public final RNLive b;
    public final String c;
    public final JsonObject d;
    public final int e;
    public final String f;
    public final a g;

    public void RNLive$c(RNLive p0,String p1,JsonObject p2,int p3,String p4,a p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public final void subscribe(v p0){
       Pair[] pairArray = new Pair[5];
       pairArray[0] = r0.a("componentName", this.c);
       RNLive$c td = this.d;
       if (td != null) {
       }else {
          td = new JsonObject();
       }
       pairArray[1] = r0.a("data", td);
       pairArray[2] = r0.a("source", Integer.valueOf(this.e));
       int i = 3;
       RNLive$c tf = this.f;
       if (tf == null) {
          tf = "";
       }
       pairArray[i] = r0.a("pendantId", tf);
       PendantUtil$Companion a = PendantUtil.a;
       RNLive$c tg = this.g;
       DyTroubleShooting c = DyTroubleShooting.c;
       RNLive d = this.b.d;
       String str = (d != null)? a.d(d): null;
       String str1 = c.p(str, this.f, DACKeyNode.COMPONENT_BUSINESS_LOGIC);
       if (str1 == null) {
          str1 = this.f;
       }
       pairArray[4] = r0.a("agreementInfo", a.b(tg, str1));
       Map map = t0.j0(pairArray);
       RNLive b = this.b.b;
       if (b != null) {
          a.d(b, "shouldShow", map, new RNLive$c$a(this, p0), null, 8, null);
       }
       return;
    }
}
