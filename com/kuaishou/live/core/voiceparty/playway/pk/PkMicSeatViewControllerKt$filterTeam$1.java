package com.kuaishou.live.core.voiceparty.playway.pk.PkMicSeatViewControllerKt$filterTeam$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.core.data.MicSeatTeam;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import ts2.b;
import java.lang.Integer;
import java.util.Collection;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;

public final class PkMicSeatViewControllerKt$filterTeam$1 extends Lambda implements p	// class@001868
{
    public final MicSeatTeam $team;

    public void PkMicSeatViewControllerKt$filterTeam$1(MicSeatTeam p0){
       this.$team = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final List invoke(List p0,p p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, PkMicSeatViewControllerKt$filterTeam$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "pendantDataList");
       a.p(p1, "teamInfo");
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          i = (p1.invoke(Integer.valueOf(obj1.a()), Integer.valueOf(i)) == this.$team)? 1: 0;
          if (i) {
             obj.add(obj1);
          }
          i = i1;
       }
       b.P(LiveVoicePartyLogTag.MIC_SEAT.appendTag("MicSeatPk"), "pendantDataList "+p0.size()+' '+this.$team+" ÂóÎ»ÁÐ±í "+obj);
       return obj;
    }
}
