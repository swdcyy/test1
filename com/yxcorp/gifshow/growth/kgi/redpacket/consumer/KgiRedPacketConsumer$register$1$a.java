package com.yxcorp.gifshow.growth.kgi.redpacket.consumer.KgiRedPacketConsumer$register$1$a;
import xma.a;
import ooa.a;
import com.yxcorp.gifshow.growth.ai.KgiRedPacketServerResponse$Companion$KgiRedPacketResponse;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y76.b;
import noa.a;
import p76.g;
import java.lang.Integer;
import yb6.d;
import android.app.Activity;
import loa.h;
import java.lang.StringBuilder;
import i89.f;
import i89.e;
import brd.t;
import crd.b;

public final class KgiRedPacketConsumer$register$1$a extends a	// class@0013f5
{
    public final a a;
    public final KgiRedPacketServerResponse$Companion$KgiRedPacketResponse b;

    public void KgiRedPacketConsumer$register$1$a(a p0,KgiRedPacketServerResponse$Companion$KgiRedPacketResponse p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KgiRedPacketConsumer$register$1$a.class, "1")) {
          return;
       }
       b.e("Consumer#showKgiRedPacketDialog: onCanNotShow ", false, 2, objArray);
       a.b(a.c, false);
       this.a.b("trigger_fail");
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KgiRedPacketConsumer$register$1$a.class, "5")) {
          return;
       }
       a.b(a.c, false);
       b.e("Consumer#showKgiRedPacketDialog: onDiscard ", false, 2, objArray);
       this.a.b("trigger_fail");
       return;
    }
    public void g(int p0){
       boolean b;
       KgiRedPacketConsumer$register$1$a oregister$1$ = KgiRedPacketConsumer$register$1$a.class;
       if (PatchProxy.isSupport(oregister$1$) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oregister$1$, "4")) {
          return;
       }
       a.b(a.c, false);
       a.b = d.a();
       int i = 4;
       if (p0 == i) {
          this.a.b("opt_positive");
       }else {
          this.a.b("opt_negative");
       }
       if (p0 == i) {
          h.b(null, this.b, false);
       }else if(p0 && p0 != -1){
          oregister$1$ = this.b;
          b = (p0 == 3)? true: false;
          h.b(null, oregister$1$, b);
       }
       b.e("Consumer#showKgiRedPacketDialog: onDismiss dismissType = "+p0, false, 2, null);
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, KgiRedPacketConsumer$register$1$a.class, "2")) {
          return;
       }
       b.e("Consumer#showKgiRedPacketDialog: onPending ", false, 2, null);
       return;
    }
    public void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KgiRedPacketConsumer$register$1$a.class, "3")) {
          return;
       }
       b.e("Consumer#showKgiRedPacketDialog: onShow ", false, 2, objArray);
       h.f(objArray, this.b);
       e.a().b(String.valueOf(this.b.activityId)).subscribe();
       this.a.a();
       return;
    }
}
