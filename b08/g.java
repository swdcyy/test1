package b08.g;
import vu.h;
import com.kwaishou.merchant.daccore.data.PendantDataServer;
import com.kwaishou.merchant.daccore.PendantEnvReadyLatch;
import java.lang.Object;
import com.kuaishou.bowl.data.center.data.model.live.signal.SignalData;
import f08.f;
import java.util.Objects;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kuaishou.bowl.data.center.data.model.live.signal.SignalPendant;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import c08.a;
import b08.a;
import com.kwaishou.merchant.daccore.log.DACKeyNode;
import com.kwaishou.merchant.daccore.log.DyTroubleShooting;
import java.util.Map;
import com.kwaishou.merchant.troubleshooting.core.model.RubasParams;
import f08.b;
import kotlin.Pair;
import fg6.a;
import com.google.gson.Gson;
import qrd.r0;
import trd.t0;
import f08.b$a;
import kotlin.jvm.internal.a;
import zsd.u;
import java.lang.Throwable;
import brd.t;
import b08.g$a;
import b08.g$b;
import erd.g;
import crd.b;
import crd.a;

public final class g implements h	// class@0002f1
{
    public final PendantDataServer a;
    public final PendantEnvReadyLatch b;

    public void g(PendantDataServer p0,PendantEnvReadyLatch p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(SignalData p0){
       g og;
       SignalData signalData;
       g a;
       String str;
       try{
          og = this;
          signalData = p0;
          a = og.a;
          PendantDataServer h = a.h;
          PendantDataServer g = a.g;
          Objects.requireNonNull(f.a);
          SignalData signalData1 = null;
          if (signalData) {
             SignalData pendantInfoL = signalData.pendantInfoList;
             if (pendantInfoL != null) {
                ArrayList uArrayList = new ArrayList(u.Y(pendantInfoL, 10));
                Iterator iterator = pendantInfoL.iterator();
                while (iterator.hasNext()) {
                   SignalPendant signalPendan = iterator.next();
                   uArrayList.add(signalPendan.pendantCode+" action:"+signalPendan.action);
                }
                str = CollectionsKt___CollectionsKt.V2(uArrayList, null, null, null, 0, null, null, 63, null);
             label_0062 :
                DACKeyNode dAC_RECEIVER = DACKeyNode.DAC_RECEIVER_REQUEST_DATA;
                DyTroubleShooting.e(a.d(h), dAC_RECEIVER, "receive new signal:"+str, DyTroubleShooting.c.m(), false, null, false, 112, null);
                Pair[] pairArray = new Pair[]{r0.a("signalData", a.a.q(signalData))};
                int i = 0;
                b.a.d("receive new signal data", t0.j0(pairArray));
                str = (signalData == null)? "signalData is null": signalData1;
                if (signalData != null) {
                   signalData1 = signalData.liveStreamId;
                }
                String str1 = (a.g(signalData1, g) ^ 1)? "liveStreamId is not match": str;
                if (str1 == null || u.S1(str1)) {
                   i = 1;
                }
                if (!i) {
                   DyTroubleShooting.j(a.d(h), dAC_RECEIVER, str1, null, null, false, null, 120, null);
                }
             }else {
             label_0061 :
                str = signalData1;
                goto label_0062 ;
             }
          }else {
             goto label_0061 ;
          }
       }catch(java.lang.Exception e0){
          Throwable throwable = e0;
          b$a.b(b.a, "logReceiveNewSignal error", throwable, null, 4, null);
       }
       if (signalData != null && !(a.g(signalData.liveStreamId, og.a.g) ^ 1)) {
          if (og.b.f()) {
             og.a.l(signalData);
          }else {
             og.a.d().c(og.b.g(signalData).subscribe(new g$a(og, signalData), new g$b(og)));
          }
       }
       return;
    }
}
