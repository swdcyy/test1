package com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam extends Enum	// class@001947
{
    public int value;
    public static final VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam[] $VALUES;
    public static final VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam BLUE;
    public static final VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam YELLOW;

    static {
       VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam topScoreUser = new VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam("YELLOW", 0, 0);
       VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam.YELLOW = topScoreUser;
       VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam topScoreUser1 = new VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam("BLUE", 1, 1);
       VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam.BLUE = topScoreUser1;
       VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam[] topScoreUser2 = new VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam[]{topScoreUser,topScoreUser1};
       VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam.$VALUES = topScoreUser2;
    }
    public void VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam.class, p0);
    }
    public static VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam[] values(){
       Object obj = PatchProxy.apply(null, null, VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VoicePartyTeamPkTopScoreUserView$TopScoreUserListTeam.$VALUES.clone();
    }
}
