package com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$b;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.teampk.VoicePartyTeamPkResult;
import com.kuaishou.livestream.message.nano.TeamPkStatisticInfo;
import com.kuaishou.livestream.message.nano.TeamStatisticInfo;

public final class TeamPkManager$b	// class@00144b
{
    public TeamPkStatisticInfo a;

    public void TeamPkManager$b(){
       super();
    }
    public final VoicePartyTeamPkResult a(){
       object oobject;
       TeamStatisticInfo score;
       VoicePartyTeamPkResult yELLOW_TEAM_;
       TeamPkManager$b ta = this.a;
       TeamStatisticInfo teamStatisti = null;
       TeamStatisticInfo teamStatisti1 = null;
       if (ta != null) {
          TeamPkStatisticInfo teamStatisti2 = ta.teamStatisticInfo;
          if (teamStatisti2 != null) {
             int len = teamStatisti2.length;
             int i = 0;
             while (true) {
                if (i < len) {
                   oobject = teamStatisti2[i];
                   TeamStatisticInfo teamStatisti3 = (oobject.team == 1)? 1: null;
                   if (teamStatisti3) {
                   label_0021 :
                      if (oobject != null) {
                         score = oobject.score;
                      label_0027 :
                         ta = this.a;
                         if (ta != null) {
                            teamStatisti2 = ta.teamStatisticInfo;
                            if (teamStatisti2 != null) {
                               int len1 = teamStatisti2.length;
                               int i1 = 0;
                               while (i1 < len1) {
                                  object oobject1 = teamStatisti2[i1];
                                  TeamStatisticInfo teamStatisti4 = (oobject1.team == 2)? 1: null;
                                  if (teamStatisti4) {
                                     teamStatisti = oobject1;
                                  }
                                  i1 = i1 + 1;
                               }
                               if (teamStatisti != null) {
                                  teamStatisti1 = teamStatisti.score;
                               }
                            }
                         }
                         v0 = score - teamStatisti1;
                         if (teamStatisti2 > 0) {
                            yELLOW_TEAM_ = VoicePartyTeamPkResult.YELLOW_TEAM_WIN;
                            break ;
                         }else if(teamStatisti2 < 0){
                            yELLOW_TEAM_ = VoicePartyTeamPkResult.BLUE_TEAM_WIN;
                            break ;
                         }else {
                            yELLOW_TEAM_ = VoicePartyTeamPkResult.DRAW;
                            break ;
                         }
                      }
                   }else {
                      i = i + 1;
                   }
                }else {
                   oobject = teamStatisti;
                   goto label_0021 ;
                }
             }
             return yELLOW_TEAM_;
          }
       }
       score = teamStatisti1;
       goto label_0027 ;
    }
    public final void b(TeamPkStatisticInfo p0){
       this.a = p0;
    }
}
