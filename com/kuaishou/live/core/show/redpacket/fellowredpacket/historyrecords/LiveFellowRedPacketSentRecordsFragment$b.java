package com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketSentRecordsFragment$b;
import y8c.g;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.historyrecords.LiveFellowRedPacketSentRecordsFragment$a;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import tg2.c;
import ml8.c;

public class LiveFellowRedPacketSentRecordsFragment$b extends g	// class@000e8e
{

    public void LiveFellowRedPacketSentRecordsFragment$b(){
       super();
    }
    public void LiveFellowRedPacketSentRecordsFragment$b(LiveFellowRedPacketSentRecordsFragment$a p0){
       super();
    }
    public f h1(ViewGroup p0,int p1){
       LiveFellowRedPacketSentRecordsFragment$b uob = LiveFellowRedPacketSentRecordsFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d0b0f), new c());
    }
}
