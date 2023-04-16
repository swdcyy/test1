package b08.j;
import lf3.g;
import com.kwaishou.merchant.daccore.data.PendantDataServer;
import java.lang.String;
import com.kwaishou.merchant.daccore.PendantEnvReadyLatch;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$SCKwaishopResourceLivePendantData;
import f08.f;
import java.util.Objects;
import c08.a;
import b08.a;
import com.kwaishou.merchant.daccore.log.DACKeyNode;
import java.lang.StringBuilder;
import java.lang.Long;
import java.lang.Integer;
import com.kwaishou.merchant.daccore.log.DyTroubleShooting;
import java.util.Map;
import com.kwaishou.merchant.troubleshooting.core.model.RubasParams;
import f08.b;
import kotlin.Pair;
import qrd.r0;
import trd.t0;
import f08.b$a;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import zsd.u;
import java.lang.Throwable;
import brd.t;
import b08.h;
import b08.i;
import erd.g;
import crd.b;
import crd.a;
import lf3.f;

public final class j implements g	// class@0002f4
{
    public final PendantDataServer b;
    public final String c;
    public final PendantEnvReadyLatch d;

    public void j(PendantDataServer p0,String p1,PendantEnvReadyLatch p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void H4(MessageNano p0){
       int i;
       Long longx;
       LiveRoomSignalMessage$SCKwaishopResourceLivePendantData sCKwaishopRe1;
       PendantDataServer h = this.b.h;
       j tc = this.c;
       Objects.requireNonNull(f.a);
       try{
          i = 1;
          String str = a.d(h);
          DACKeyNode dAC_RECEIVER = DACKeyNode.DAC_RECEIVER_REQUEST_DATA;
          StringBuilder str1 = "receive old signal: materialId:";
          LiveRoomSignalMessage$SCKwaishopResourceLivePendantData sCKwaishopRe = null;
          if (p0 != null) {
             longx = Long.valueOf(p0.materialId);
          label_0029 :
             str1 = str1+longx+" action:";
             Integer integer = (p0 != null)? Integer.valueOf(p0.action): sCKwaishopRe;
             DyTroubleShooting.e(str, dAC_RECEIVER, str1+integer, DyTroubleShooting.c.m(), false, null, false, 112, null);
             Pair[] pairArray = new Pair[i];
             int i1 = 0;
             pairArray[i1] = r0.a("signalPayload", p0);
             b.a.d("receive old signal data", t0.j0(pairArray));
             str = (p0 == null)? "signalPayload is null": sCKwaishopRe;
             if (p0 != null) {
                sCKwaishopRe = p0.liveStreamId;
             }
             String str2 = (a.g(sCKwaishopRe, tc) ^ i)? "liveStreamId is not match": str;
             if (str2 == null || u.S1(str2)) {
                i1 = 1;
             }
             if (!i1) {
                DyTroubleShooting.j(a.d(h), dAC_RECEIVER, str2, null, null, false, null, 120, null);
             }
          }else {
             longx = sCKwaishopRe;
             goto label_0029 ;
          }
       }catch(java.lang.Exception e1){
          b$a.b(b.a, "logReceiveOldSignal error", e1, null, 4, null);
       }
       if (!(i ^ a.g(p0.liveStreamId, this.c))) {
          if (this.d.f()) {
             this.b.m(p0);
          }else {
             this.b.d().c(this.d.g(p0).subscribe(new h(this, p0), new i(this)));
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
