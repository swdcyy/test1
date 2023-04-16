package com.kuaishou.live.core.show.redpacket.krn.k;
import lf3.g;
import com.kuaishou.live.core.show.redpacket.krn.l;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveKrnRedPackMessage$SCLiveKrnRedPackShow;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kuaishou.livestream.message.nano.LiveKrnRedPackMessage$LiveKrnRedPack;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tw1.f;
import java.lang.Long;
import java.util.Map;
import java.lang.StringBuilder;
import crd.b;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import ch2.i;
import erd.g;
import io.reactivex.subjects.PublishSubject;
import lf3.f;

public final class k implements g	// class@000edd
{
    public final l b;

    public void k(l p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       boolean b1;
       LiveKrnRedPackMessage$LiveKrnRedPack showDeadline;
       long l;
       k b = this.b;
       LiveKrnRedPackMessage$SCLiveKrnRedPackShow obj = p0;
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidOneRefs(obj, b, l.class, "4")) {
       }else {
          obj = obj.redPack;
          if (obj == null || obj.length <= 0) {
             b.P(l.v, "invalid KrnRedPacket msg");
          }else {
             int len = obj.length;
             int i = 0;
             while (i < len) {
                object oobject = obj[i];
                LiveKrnRedPackMessage$LiveKrnRedPack obj1 = PatchProxy.applyOneRefs(oobject, b, l.class, "8");
                String str = null;
                if (obj1 != PatchProxyResult.class) {
                   b1 = obj1.booleanValue();
                }else if(oobject == null){
                   b.P(l.v, "liveKrnRedPack is null");
                }else if(TextUtils.x(oobject.redPackId)){
                   b.P(l.v, "redPackId is null");
                }else {
                   obj1 = oobject.showPage;
                   if (obj1 == null || obj1.length <= 0) {
                      b.S(l.v, "showPage is null", "redPackId", oobject.redPackId);
                   }else {
                      obj1 = oobject.grabTime;
                      if (obj1 - str <= 0 || oobject.showTime - obj1 > 0) {
                         b.U(l.v, "invalid grabTime or showTime", "redPackId", oobject.redPackId, "showTime", Long.valueOf(oobject.showTime), "grabTime", Long.valueOf(oobject.grabTime));
                      }else if(oobject.showDeadline - f.a() <= 0 || oobject.showDeadline - oobject.grabTime < 0){
                         b.U(l.v, "invalid showDeadline", "redPackId", oobject.redPackId, "grabTime", Long.valueOf(oobject.grabTime), "showDeadline", Long.valueOf(oobject.showDeadline));
                      }else {
                         b1 = true;
                      }
                   }
                }
                b1 = false;
                if (!b1) {
                   b.P(l.v, "invalid liveKrnRedPack");
                }else {
                   obj1 = oobject.redPackId;
                   boolean b2 = b.p.containsKey(obj1);
                   if (b.q.containsKey(obj1) && !b2) {
                      b.P(l.v, "has grab, can not display, redPacketId = "+obj1);
                   }else if(PatchProxy.applyVoidTwoRefs(obj1, oobject, b, l.class, "5")){
                      List v = l.v;
                      b.S(v, "addRedPacketToShowingRedPackets", "redPacketId", obj1);
                      b.p.put(obj1, oobject);
                      showDeadline = oobject.showDeadline;
                      if (!PatchProxy.isSupport(l.class) || !PatchProxy.applyVoidTwoRefs(obj1, Long.valueOf(showDeadline), b, l.class, "7")) {
                         b9.a(b.q.get(obj1));
                         l = showDeadline - f.a();
                         String str1 = " expiredDuration = ";
                         if (l - str <= 0) {
                            b.P(v, "expiredDuration <=0  RedPacketId = "+obj1+str1+l);
                            b.P8(obj1);
                            b.q.remove(obj1);
                         }else {
                            b.P(v, "set PendantView timer RedPacketId = "+obj1+str1+l);
                            b.q.put(obj1, t.timer(l, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new i(b, obj1)));
                         }
                      }
                      b.r.onNext(b.p);
                   }
                }
                i = i + 1;
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
