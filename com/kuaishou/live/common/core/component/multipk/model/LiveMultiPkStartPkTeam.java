package com.kuaishou.live.common.core.component.multipk.model.LiveMultiPkStartPkTeam;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveMultiPkStartPkTeam implements Serializable	// class@00164e
{
    public final List players;
    public final int teamId;

    public void LiveMultiPkStartPkTeam(int p0,List p1){
       a.p(p1, "players");
       super();
       this.teamId = p0;
       this.players = p1;
    }
    public static LiveMultiPkStartPkTeam copy$default(LiveMultiPkStartPkTeam p0,int p1,List p2,int p3,Object p4){
       LiveMultiPkStartPkTeam teamId;
       LiveMultiPkStartPkTeam players;
       if (p3 & 0x01) {
          teamId = p0.teamId;
       }
       if (p3 & 0x02) {
          players = p0.players;
       }
       return p0.copy(teamId, players);
    }
    public final int component1(){
       return this.teamId;
    }
    public final List component2(){
       return this.players;
    }
    public final LiveMultiPkStartPkTeam copy(int p0,List p1){
       if (PatchProxy.isSupport(LiveMultiPkStartPkTeam.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, LiveMultiPkStartPkTeam.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "players");
       return new LiveMultiPkStartPkTeam(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkStartPkTeam.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveMultiPkStartPkTeam && (this.teamId == p0.teamId && a.g(this.players, p0.players)))) {
          return true;
       }
       return false;
    }
    public final List getPlayers(){
       return this.players;
    }
    public final int getTeamId(){
       return this.teamId;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkStartPkTeam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.teamId * 31;
       LiveMultiPkStartPkTeam tplayers = this.players;
       int i1 = (tplayers != null)? tplayers.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkStartPkTeam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveMultiPkStartPkTeam\(teamId="+this.teamId+", players="+this.players+"\)";
    }
}
