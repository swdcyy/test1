package com.kuaishou.live.core.shared.guest.AutoInviteFriendsGuidingPanel$Entrance;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AutoInviteFriendsGuidingPanel$Entrance extends Enum	// class@00091f
{
    public static final AutoInviteFriendsGuidingPanel$Entrance[] $VALUES;
    public static final AutoInviteFriendsGuidingPanel$Entrance MultiChat;
    public static final AutoInviteFriendsGuidingPanel$Entrance VoiceParty;

    static {
       AutoInviteFriendsGuidingPanel$Entrance uEntrance;
       AutoInviteFriendsGuidingPanel$Entrance[] uEntranceArr = new AutoInviteFriendsGuidingPanel$Entrance[]{uEntrance,uEntrance};
       uEntrance = new AutoInviteFriendsGuidingPanel$Entrance("VoiceParty", 0);
       AutoInviteFriendsGuidingPanel$Entrance.VoiceParty = uEntrance;
       uEntrance = new AutoInviteFriendsGuidingPanel$Entrance("MultiChat", 1);
       AutoInviteFriendsGuidingPanel$Entrance.MultiChat = uEntrance;
       AutoInviteFriendsGuidingPanel$Entrance.$VALUES = uEntranceArr;
    }
    public void AutoInviteFriendsGuidingPanel$Entrance(String p0,int p1){
       super(p0, p1);
    }
    public static AutoInviteFriendsGuidingPanel$Entrance valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AutoInviteFriendsGuidingPanel$Entrance.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AutoInviteFriendsGuidingPanel$Entrance.class, p0);
    }
    public static AutoInviteFriendsGuidingPanel$Entrance[] values(){
       Object obj = PatchProxy.apply(null, null, AutoInviteFriendsGuidingPanel$Entrance.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AutoInviteFriendsGuidingPanel$Entrance.$VALUES.clone();
    }
}
