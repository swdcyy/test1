package com.kuaishou.live.core.voiceparty.crossroompk.resource.VoicePartyCrossRoomPkSkinResource;
import java.lang.Enum;
import com.kuaishou.live.common.core.component.pk.LivePkResourcePathConstant;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VoicePartyCrossRoomPkSkinResource extends Enum	// class@00147e
{
    public final String backUpCdnUrl;
    public final int backUpDrawableRes;
    public final String localFileResPath;
    public final String lottieImageResFolderPath;
    public static final VoicePartyCrossRoomPkSkinResource[] $VALUES;
    public static final VoicePartyCrossRoomPkSkinResource COUNT_DOWN_LEFT_ICON;
    public static final VoicePartyCrossRoomPkSkinResource INVITATION_WAITING_DIALOG_TEAM_INFO_BG;
    public static final VoicePartyCrossRoomPkSkinResource INVITATION_WAITING_DIALOG_TEAM_INFO_BLUE_AVATAR_BORDER;
    public static final VoicePartyCrossRoomPkSkinResource INVITATION_WAITING_DIALOG_TEAM_INFO_YELLOW_AVATAR_BORDER;
    public static final VoicePartyCrossRoomPkSkinResource RESULT_DIALOG_BLUE_TEAM_CONTRIBUTOR_AVATAR_BORDER;
    public static final VoicePartyCrossRoomPkSkinResource RESULT_DIALOG_LOSE_ANIM;
    public static final VoicePartyCrossRoomPkSkinResource RESULT_DIALOG_PK_TIE_ANIM;
    public static final VoicePartyCrossRoomPkSkinResource RESULT_DIALOG_WIN_ANIM;
    public static final VoicePartyCrossRoomPkSkinResource RESULT_DIALOG_YELLOW_TEAM_CONTRIBUTOR_AVATAR_BORDER;
    public static final VoicePartyCrossRoomPkSkinResource START_CROSS_ROOM_BATTLE_ANIM;

    static {
       VoicePartyCrossRoomPkSkinResource[] voicePartyCr = new VoicePartyCrossRoomPkSkinResource[10];
       VoicePartyCrossRoomPkSkinResource voicePartyCr1 = new VoicePartyCrossRoomPkSkinResource("INVITATION_WAITING_DIALOG_TEAM_INFO_BG", 0, "invitation_waiting_dialog_res_dir/invitation_waiting_dialog_team_info_bg_new.png", LivePkResourcePathConstant.LIVE_PK_VOICE_PARTY_CROSS_ROOM_PK_INVITATION_WAITING_DIALOG_TEAM_INFO_BG_PATH.getResourcePath(), -1);
       VoicePartyCrossRoomPkSkinResource.INVITATION_WAITING_DIALOG_TEAM_INFO_BG = v7;
       voicePartyCr[0] = v7;
       VoicePartyCrossRoomPkSkinResource voicePartyCr2 = new VoicePartyCrossRoomPkSkinResource("INVITATION_WAITING_DIALOG_TEAM_INFO_YELLOW_AVATAR_BORDER", 1, "invitation_waiting_dialog_res_dir/invitation_waiting_dialog_team_info_yellow_avatar_border.webp", LivePkResourcePathConstant.LIVE_LIVE_PKYELLOWTEAM_PATH.getResourcePath(), -1);
       VoicePartyCrossRoomPkSkinResource.INVITATION_WAITING_DIALOG_TEAM_INFO_YELLOW_AVATAR_BORDER = voicePartyCr1;
       voicePartyCr[1] = voicePartyCr1;
       VoicePartyCrossRoomPkSkinResource voicePartyCr3 = new VoicePartyCrossRoomPkSkinResource("INVITATION_WAITING_DIALOG_TEAM_INFO_BLUE_AVATAR_BORDER", 2, "invitation_waiting_dialog_res_dir/invitation_waiting_dialog_team_info_blue_avatar_border.webp", LivePkResourcePathConstant.LIVE_LIVE_PKBLUETEAM_PATH.getResourcePath(), -1);
       VoicePartyCrossRoomPkSkinResource.INVITATION_WAITING_DIALOG_TEAM_INFO_BLUE_AVATAR_BORDER = voicePartyCr1;
       voicePartyCr[2] = voicePartyCr1;
       voicePartyCr3 = new VoicePartyCrossRoomPkSkinResource("COUNT_DOWN_LEFT_ICON", 3, "cross_room_count_down_area/live_pk_icon_battle.png", LivePkResourcePathConstant.LIVE_VOICE_PARTY_CROSS_ROOM_COUNT_DOWN_LEFT_ICON.getResourcePath(), -1);
       VoicePartyCrossRoomPkSkinResource.COUNT_DOWN_LEFT_ICON = voicePartyCr1;
       voicePartyCr[3] = voicePartyCr1;
       voicePartyCr3 = new VoicePartyCrossRoomPkSkinResource("START_CROSS_ROOM_BATTLE_ANIM", 4, "pk_status_res_dir/cross_room_pk_start_anim.webp", LivePkResourcePathConstant.LIVE_VOICE_PARTY_CROSS_ROOM_PK_START_ANIM_PATH.getResourcePath(), -1);
       VoicePartyCrossRoomPkSkinResource.START_CROSS_ROOM_BATTLE_ANIM = voicePartyCr1;
       voicePartyCr[4] = voicePartyCr1;
       voicePartyCr3 = new VoicePartyCrossRoomPkSkinResource("RESULT_DIALOG_WIN_ANIM", 5, "result_dialog_res_dir/live_cross_room_pk_result_win.webp", LivePkResourcePathConstant.LIVE_PK_WIN_BACKUP_V3_PATH.getResourcePath(), -1);
       VoicePartyCrossRoomPkSkinResource.RESULT_DIALOG_WIN_ANIM = voicePartyCr1;
       voicePartyCr[5] = voicePartyCr1;
       voicePartyCr3 = new VoicePartyCrossRoomPkSkinResource("RESULT_DIALOG_PK_TIE_ANIM", 6, "result_dialog_res_dir/live_cross_room_pk_result_tie.webp", LivePkResourcePathConstant.LIVE_PK_TIE_BACKUP_V3_PATH.getResourcePath(), -1);
       VoicePartyCrossRoomPkSkinResource.RESULT_DIALOG_PK_TIE_ANIM = voicePartyCr1;
       voicePartyCr[6] = voicePartyCr1;
       voicePartyCr3 = new VoicePartyCrossRoomPkSkinResource("RESULT_DIALOG_LOSE_ANIM", 7, "result_dialog_res_dir/live_cross_room_pk_result_lose.webp", LivePkResourcePathConstant.LIVE_PK_LOSE_BACKUP_V3_PATH.getResourcePath(), -1);
       VoicePartyCrossRoomPkSkinResource.RESULT_DIALOG_LOSE_ANIM = voicePartyCr1;
       voicePartyCr[7] = voicePartyCr1;
       voicePartyCr3 = new VoicePartyCrossRoomPkSkinResource("RESULT_DIALOG_YELLOW_TEAM_CONTRIBUTOR_AVATAR_BORDER", 8, "result_dialog_res_dir/cross_room_pk_result_dialog_yellow_contributor_avatar_border.webp", "", 0x7f081362);
       VoicePartyCrossRoomPkSkinResource.RESULT_DIALOG_YELLOW_TEAM_CONTRIBUTOR_AVATAR_BORDER = voicePartyCr1;
       voicePartyCr[8] = voicePartyCr1;
       voicePartyCr3 = new VoicePartyCrossRoomPkSkinResource("RESULT_DIALOG_BLUE_TEAM_CONTRIBUTOR_AVATAR_BORDER", 9, "result_dialog_res_dir/cross_room_pk_result_dialog_blue_contributor_avatar_border.webp", "", 0x7f08132d);
       VoicePartyCrossRoomPkSkinResource.RESULT_DIALOG_BLUE_TEAM_CONTRIBUTOR_AVATAR_BORDER = voicePartyCr1;
       voicePartyCr[9] = voicePartyCr1;
       VoicePartyCrossRoomPkSkinResource.$VALUES = voicePartyCr;
    }
    public void VoicePartyCrossRoomPkSkinResource(String p0,int p1,String p2,String p3,int p4){
       super(p0, p1, "", p2, p3, p4);
    }
    public void VoicePartyCrossRoomPkSkinResource(String p0,int p1,String p2,String p3,String p4,int p5){
       super(p0, p1);
       this.lottieImageResFolderPath = p2;
       this.localFileResPath = p3;
       this.backUpCdnUrl = p4;
       this.backUpDrawableRes = p5;
    }
    public static VoicePartyCrossRoomPkSkinResource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VoicePartyCrossRoomPkSkinResource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VoicePartyCrossRoomPkSkinResource.class, p0);
    }
    public static VoicePartyCrossRoomPkSkinResource[] values(){
       Object obj = PatchProxy.apply(null, null, VoicePartyCrossRoomPkSkinResource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VoicePartyCrossRoomPkSkinResource.$VALUES.clone();
    }
    public final String getBackUpCdnUrl(){
       return this.backUpCdnUrl;
    }
    public final int getBackUpDrawableRes(){
       return this.backUpDrawableRes;
    }
    public final String getLocalFileResPath(){
       return this.localFileResPath;
    }
    public final String getLottieImageResFolderPath(){
       return this.lottieImageResFolderPath;
    }
}
