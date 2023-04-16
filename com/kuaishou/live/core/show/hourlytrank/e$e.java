package com.kuaishou.live.core.show.hourlytrank.e$e;
import lf3.g;
import com.kuaishou.live.core.show.hourlytrank.e;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneLiveHourRankInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GzoneLiveHourRankTabInfo;
import java.lang.Boolean;
import java.lang.Integer;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.hourlytrank.e$b;
import lf3.f;

public final class e$e implements g	// class@000c07
{
    public final e b;

    public void e$e(e p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$e.class, "1")) {
       }else {
          e$e tb = this.b;
          if (tb.b == null) {
             tb.e = p0;
          }else {
             String str = "LiveHourlyRankPendantDataManager";
             if (p0 != null) {
                LiveStreamMessages$SCGzoneLiveHourRankInfo tabInfo = p0.tabInfo;
                if (tabInfo != null) {
                   int len = tabInfo.length;
                   for (int i = 0; i < len; i = i + 1) {
                      object oobject = tabInfo[i];
                      LiveLogTag hOURLY_RANK = LiveLogTag.HOURLY_RANK;
                      hOURLY_RANK.appendTag(str);
                      LiveLogTag liveLogTag = hOURLY_RANK;
                      Boolean uBoolean = (oobject != null)? Boolean.valueOf(oobject.isInTop): null;
                      Integer integer = (oobject != null)? Integer.valueOf(oobject.tabId): null;
                      LiveStreamMessages$GzoneLiveHourRankTabInfo gzoneLiveHou = (oobject != null)? oobject.rankName: null;
                      b.U(liveLogTag, "[from signal] publish gzone rank info", "isInTop", uBoolean, "tabId", integer, "rankName", gzoneLiveHou);
                   }
                   e f = this.b.f;
                   if (f != null) {
                      a.o(p0, "it");
                      f.f(p0);
                   }
                }
             }
             LiveLogTag hOURLY_RANK1 = LiveLogTag.HOURLY_RANK;
             hOURLY_RANK1.appendTag(str);
             LiveLogTag liveLogTag1 = hOURLY_RANK1;
             b.P(liveLogTag1, "[from signal] publish gzone rank info: content is null!");
             goto label_0062 ;
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
