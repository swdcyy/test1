package com.kwaishou.merchant.daccore.rnlive.RNLive$b;
import io.reactivex.g;
import com.kwaishou.merchant.daccore.rnlive.RNLive;
import java.lang.String;
import com.google.gson.JsonObject;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import java.lang.Object;
import brd.v;
import kotlin.Pair;
import qrd.r0;
import java.lang.Integer;
import java.util.Map;
import trd.t0;
import com.kwaishou.merchant.daccore.rnlive.RNLive$b$a;
import o08.a;
import o08.a$b;

public final class RNLive$b implements g	// class@00133a
{
    public final RNLive b;
    public final String c;
    public final JsonObject d;
    public final int e;
    public final PendantMountInfo f;
    public final String g;

    public void RNLive$b(RNLive p0,String p1,JsonObject p2,int p3,PendantMountInfo p4,String p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public final void subscribe(v p0){
       Pair[] pairArray = new Pair[4];
       pairArray[0] = r0.a("componentName", this.c);
       RNLive$b td = this.d;
       if (td != null) {
       }else {
          td = new JsonObject();
       }
       pairArray[1] = r0.a("data", td);
       pairArray[2] = r0.a("source", Integer.valueOf(this.e));
       RNLive$b tf = this.f;
       if (tf == null) {
          tf = new JsonObject();
       }
       pairArray[3] = r0.a("mountInfo", tf);
       Map map = t0.j0(pairArray);
       RNLive b = this.b.b;
       if (b != null) {
          a.d(b, "pendentSize", map, new RNLive$b$a(this, p0), null, 8, null);
       }
       return;
    }
}
