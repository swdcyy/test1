package com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MicSeatPendantId extends Enum	// class@00158a
{
    public static final MicSeatPendantId[] $VALUES;
    public static final MicSeatPendantId AboardAnimation;
    public static final MicSeatPendantId ActionBridge;
    public static final MicSeatPendantId AnchorKsCoin;
    public static final MicSeatPendantId AnchorMuted;
    public static final MicSeatPendantId AnchorState;
    public static final MicSeatPendantId Applying;
    public static final MicSeatPendantId AvatarFrame;
    public static final MicSeatPendantId Background;
    public static final MicSeatPendantId BubbleGuide;
    public static final MicSeatPendantId DecorationName;
    public static final MicSeatPendantId DecorationVipFrame;
    public static final MicSeatPendantId Emoji;
    public static final MicSeatPendantId Empty;
    public static final MicSeatPendantId Gift;
    public static final MicSeatPendantId GuestInvitationGuiding;
    public static final MicSeatPendantId Hat;
    public static final MicSeatPendantId KTVTag;
    public static final MicSeatPendantId KsCoin;
    public static final MicSeatPendantId LevelUpAnimation;
    public static final MicSeatPendantId Locked;
    public static final MicSeatPendantId MutedTag;
    public static final MicSeatPendantId OpenVideoTips;
    public static final MicSeatPendantId PKFireAnimation;
    public static final MicSeatPendantId Share;
    public static final MicSeatPendantId StateName;
    public static final MicSeatPendantId StickerCover;
    public static final MicSeatPendantId UserAvatar;
    public static final MicSeatPendantId UserMuted;
    public static final MicSeatPendantId UserName;
    public static final MicSeatPendantId UserSpeaking;
    public static final MicSeatPendantId Video;
    public static final MicSeatPendantId VideoLoading;
    public static final MicSeatPendantId VideoUserState;

    static {
       MicSeatPendantId[] micSeatPenda = new MicSeatPendantId[33];
       MicSeatPendantId micSeatPenda1 = new MicSeatPendantId("Empty", 0);
       MicSeatPendantId.Empty = micSeatPenda1;
       micSeatPenda[0] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("Locked", 1);
       MicSeatPendantId.Locked = micSeatPenda1;
       micSeatPenda[1] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("Applying", 2);
       MicSeatPendantId.Applying = micSeatPenda1;
       micSeatPenda[2] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("UserAvatar", 3);
       MicSeatPendantId.UserAvatar = micSeatPenda1;
       micSeatPenda[3] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("UserMuted", 4);
       MicSeatPendantId.UserMuted = micSeatPenda1;
       micSeatPenda[4] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("DecorationName", 5);
       MicSeatPendantId.DecorationName = micSeatPenda1;
       micSeatPenda[5] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("DecorationVipFrame", 6);
       MicSeatPendantId.DecorationVipFrame = micSeatPenda1;
       micSeatPenda[6] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("Hat", 7);
       MicSeatPendantId.Hat = micSeatPenda1;
       micSeatPenda[7] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("AvatarFrame", 8);
       MicSeatPendantId.AvatarFrame = micSeatPenda1;
       micSeatPenda[8] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("Gift", 9);
       MicSeatPendantId.Gift = micSeatPenda1;
       micSeatPenda[9] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("UserName", 10);
       MicSeatPendantId.UserName = micSeatPenda1;
       micSeatPenda[10] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("UserSpeaking", 11);
       MicSeatPendantId.UserSpeaking = micSeatPenda1;
       micSeatPenda[11] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("KsCoin", 12);
       MicSeatPendantId.KsCoin = micSeatPenda1;
       micSeatPenda[12] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("Emoji", 13);
       MicSeatPendantId.Emoji = micSeatPenda1;
       micSeatPenda[13] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("Share", 14);
       MicSeatPendantId.Share = micSeatPenda1;
       micSeatPenda[14] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("AboardAnimation", 15);
       MicSeatPendantId.AboardAnimation = micSeatPenda1;
       micSeatPenda[15] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("StateName", 16);
       MicSeatPendantId.StateName = micSeatPenda1;
       micSeatPenda[16] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("MutedTag", 17);
       MicSeatPendantId.MutedTag = micSeatPenda1;
       micSeatPenda[17] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("BubbleGuide", 18);
       MicSeatPendantId.BubbleGuide = micSeatPenda1;
       micSeatPenda[18] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("LevelUpAnimation", 19);
       MicSeatPendantId.LevelUpAnimation = micSeatPenda1;
       micSeatPenda[19] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("Background", 20);
       MicSeatPendantId.Background = micSeatPenda1;
       micSeatPenda[20] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("VideoUserState", 21);
       MicSeatPendantId.VideoUserState = micSeatPenda1;
       micSeatPenda[21] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("Video", 22);
       MicSeatPendantId.Video = micSeatPenda1;
       micSeatPenda[22] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("ActionBridge", 23);
       MicSeatPendantId.ActionBridge = micSeatPenda1;
       micSeatPenda[23] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("KTVTag", 24);
       MicSeatPendantId.KTVTag = micSeatPenda1;
       micSeatPenda[24] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("OpenVideoTips", 25);
       MicSeatPendantId.OpenVideoTips = micSeatPenda1;
       micSeatPenda[25] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("GuestInvitationGuiding", 26);
       MicSeatPendantId.GuestInvitationGuiding = micSeatPenda1;
       micSeatPenda[26] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("PKFireAnimation", 27);
       MicSeatPendantId.PKFireAnimation = micSeatPenda1;
       micSeatPenda[27] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("AnchorKsCoin", 28);
       MicSeatPendantId.AnchorKsCoin = micSeatPenda1;
       micSeatPenda[28] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("AnchorMuted", 29);
       MicSeatPendantId.AnchorMuted = micSeatPenda1;
       micSeatPenda[29] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("VideoLoading", 30);
       MicSeatPendantId.VideoLoading = micSeatPenda1;
       micSeatPenda[30] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("AnchorState", 31);
       MicSeatPendantId.AnchorState = micSeatPenda1;
       micSeatPenda[31] = micSeatPenda1;
       micSeatPenda1 = new MicSeatPendantId("StickerCover", 32);
       MicSeatPendantId.StickerCover = micSeatPenda1;
       micSeatPenda[32] = micSeatPenda1;
       MicSeatPendantId.$VALUES = micSeatPenda;
    }
    public void MicSeatPendantId(String p0,int p1){
       super(p0, p1);
    }
    public static MicSeatPendantId valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MicSeatPendantId.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MicSeatPendantId.class, p0);
    }
    public static MicSeatPendantId[] values(){
       Object obj = PatchProxy.apply(null, null, MicSeatPendantId.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MicSeatPendantId.$VALUES.clone();
    }
}
