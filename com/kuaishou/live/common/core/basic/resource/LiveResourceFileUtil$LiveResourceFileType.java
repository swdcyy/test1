package com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import java.lang.Enum;
import java.lang.String;
import java.util.HashMap;
import java.lang.Object;
import java.util.Map;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$b;

public final class LiveResourceFileUtil$LiveResourceFileType extends Enum	// class@000eb6
{
    public final String mDownloadBizType;
    public LiveResourceFileUtil$b mDownloadListener;
    public final LiveResourceFileUtil$d mFilePathInfo;
    public final boolean mIsNeedHighPriorityDownload;
    public final String mType;
    public static final LiveResourceFileUtil$LiveResourceFileType[] $VALUES;
    public static final LiveResourceFileUtil$LiveResourceFileType FIRST_RECHARGE;
    public static final LiveResourceFileUtil$LiveResourceFileType HONOR_MEDAL;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_ACTIVITY_RED_PACKET_RESOURCE;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_ARYA_AI_DENOISE_MODEL;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_ARYA_AUDIO_CAE_MODEL;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_ARYA_DEEP_AEC_MODEL;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_AUDIENCE_ROBOT_AUDIO;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_AUDIO_AVATAR_ANIM;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_CHATROOM_MICSEAT_SHARE;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_ENTER_ROOM_EFFECT;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_GIFT_BOX_EFFECT;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_GIFT_SLOT_BACKGROUND_RESOURCE;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_GIFT_SLOT_SPECIAL_COMBO_RESOURCE;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_ICONS_NEW_V2;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_LOADING_BACKGROUND_RESOURCE;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_MULTI_PK_RESOURCE;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_MULTI_PK_RESOURCE_IMAGE_ACTIVITY_SKIN;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_MULTI_PK_RESOURCE_IMAGE_HONOR_SKIN;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_MULTI_PK_RESOURCE_IMAGE_NORMAL_SKIN;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_NOBLE_ENTER_ROOM_MOUNT_RESOURCE;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_NOBLE_ENTER_ROOM_WELCOME_RESOURCE;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_OVER_ROOM_RESOURCE;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_PAY_BULLET_BACKGROUND;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_PK_IMAGE_ANCHOR_HONOR_V2;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_PK_IMAGE_CUSTOM_SKIN_V2;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_PK_RESOURCE;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_PK_SCORE_LIMIT_RESOURCE;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_SEND_GIFT_COMBO_BUTTON_RESOURCE;
    public static final LiveResourceFileUtil$LiveResourceFileType LIVE_WEALTH_GRADE_ENTER_ROOM_EFFECT;
    public static final LiveResourceFileUtil$LiveResourceFileType Live_MULTI_LINE_PUZZLE_IMAGE_RESOURCE;
    public static final LiveResourceFileUtil$LiveResourceFileType MERCHANT_LIVE_MMU_MODEL;
    public static final LiveResourceFileUtil$LiveResourceFileType MERCHANT_SKIN;
    public static final LiveResourceFileUtil$LiveResourceFileType MMU_MODEL;
    public static final LiveResourceFileUtil$LiveResourceFileType MMU_ROBOT_MODEL;
    public static final LiveResourceFileUtil$LiveResourceFileType QUIZ_SOUND;
    public static final LiveResourceFileUtil$LiveResourceFileType ROBOT_AUDIO;
    public static final Map VALUES_MAP;
    public static final LiveResourceFileUtil$LiveResourceFileType VOICE_PARTY;

    static {
       LiveResourceFileUtil$LiveResourceFileType liveResource = new LiveResourceFileUtil$LiveResourceFileType("MMU_MODEL", 0, 28, "mmu_models", "mxnet.mmux", "live_mmu_model");
       LiveResourceFileUtil$LiveResourceFileType.MMU_MODEL = v7;
       LiveResourceFileUtil$LiveResourceFileType liveResource1 = new LiveResourceFileUtil$LiveResourceFileType("MMU_ROBOT_MODEL", 1, 27, "mmu_models", "robot_mxnet.mmux", "live_mmu_robot_model");
       LiveResourceFileUtil$LiveResourceFileType.MMU_ROBOT_MODEL = liveResource;
       LiveResourceFileUtil$LiveResourceFileType liveResource2 = new LiveResourceFileUtil$LiveResourceFileType("ROBOT_AUDIO", 2, 3, "live_robot_audio", "", "live_robot_audio");
       LiveResourceFileUtil$LiveResourceFileType.ROBOT_AUDIO = v1;
       liveResource1 = new LiveResourceFileUtil$LiveResourceFileType("QUIZ_SOUND", 3, 19, "live_quiz_sound", "", "live_quiz_sound");
       LiveResourceFileUtil$LiveResourceFileType.QUIZ_SOUND = v2;
       liveResource2 = new LiveResourceFileUtil$LiveResourceFileType("VOICE_PARTY", 4, 16, "live_voice_party", "", "live_voice_party");
       LiveResourceFileUtil$LiveResourceFileType.VOICE_PARTY = v3;
       liveResource1 = new LiveResourceFileUtil$LiveResourceFileType("FIRST_RECHARGE", 5, 24, "live_first_recharge", "", "live_first_recharge");
       LiveResourceFileUtil$LiveResourceFileType.FIRST_RECHARGE = v4;
       liveResource2 = new LiveResourceFileUtil$LiveResourceFileType("HONOR_MEDAL", 6, 26, "live_honor_medal_resource", "", "live_honor_medal");
       LiveResourceFileUtil$LiveResourceFileType.HONOR_MEDAL = v5;
       liveResource1 = new LiveResourceFileUtil$LiveResourceFileType("MERCHANT_SKIN", 7, 30, "live_merchant_skin_resource", "", "live_merchant_skin");
       LiveResourceFileUtil$LiveResourceFileType.MERCHANT_SKIN = v6;
       liveResource2 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_ICONS_NEW_V2", 8, 31, "live_new_icons_v2", "", "live_icons_new_v2");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_ICONS_NEW_V2 = liveResource1;
       LiveResourceFileUtil$LiveResourceFileType liveResource3 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_ENTER_ROOM_EFFECT", 9, 34, "live_enter_room_effect", "", "live_enter_room_effect");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_ENTER_ROOM_EFFECT = v16;
       LiveResourceFileUtil$LiveResourceFileType liveResource4 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_WEALTH_GRADE_ENTER_ROOM_EFFECT", 10, 37, "live_wealth_grade_enter_room_effect", "", "live_wealth_grade_enter_room_effect");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_WEALTH_GRADE_ENTER_ROOM_EFFECT = liveResource3;
       LiveResourceFileUtil$LiveResourceFileType liveResource5 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_AUDIO_AVATAR_ANIM", 11, 38, "live_audio_lottie", "", "live_audio_avatar_anim");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_AUDIO_AVATAR_ANIM = v10;
       liveResource4 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_PAY_BULLET_BACKGROUND", 12, 39, "live_pay_bullet_resource", "", "live_pay_bullet_background");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_PAY_BULLET_BACKGROUND = v11;
       liveResource5 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_AUDIENCE_ROBOT_AUDIO", 13, 40, "live_robot_audio", "", "live_audience_robot_audio");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_AUDIENCE_ROBOT_AUDIO = v12;
       liveResource4 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_NOBLE_ENTER_ROOM_MOUNT_RESOURCE", 14, 44, "live_noble_enter_room_mount_resource", "", "live_noble_enter_room_mount");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_NOBLE_ENTER_ROOM_MOUNT_RESOURCE = v13;
       liveResource5 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_NOBLE_ENTER_ROOM_WELCOME_RESOURCE", 15, 45, "live_noble_enter_room_welcome_resource", "", "live_noble_enter_room_welcome");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_NOBLE_ENTER_ROOM_WELCOME_RESOURCE = v14;
       liveResource4 = new LiveResourceFileUtil$LiveResourceFileType("MERCHANT_LIVE_MMU_MODEL", 16, 50, "merchant_live_mmu", "merchant_cart.mmux", "live_merchant_mmu_model");
       LiveResourceFileUtil$LiveResourceFileType.MERCHANT_LIVE_MMU_MODEL = liveResource2;
       liveResource5 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_LOADING_BACKGROUND_RESOURCE", 17, 51, "live_magic_box_loading_background_resource", "", "live_loading_background");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_LOADING_BACKGROUND_RESOURCE = liveResource4;
       LiveResourceFileUtil$LiveResourceFileType liveResource6 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_SEND_GIFT_COMBO_BUTTON_RESOURCE", 18, 53, "live_send_gift_combo_button_animation_resource", "", "live_send_gift_combo_button");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_SEND_GIFT_COMBO_BUTTON_RESOURCE = v25;
       LiveResourceFileUtil$LiveResourceFileType liveResource7 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_ACTIVITY_RED_PACKET_RESOURCE", 19, 54, "live_activity_red_packet_resource", "", "live_activity_red_packet");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_ACTIVITY_RED_PACKET_RESOURCE = liveResource6;
       LiveResourceFileUtil$LiveResourceFileType liveResource8 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_CHATROOM_MICSEAT_SHARE", 20, 62, "live_chatroom_micseat_share", "", "live_chatroom_micseat_share");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_CHATROOM_MICSEAT_SHARE = v19;
       liveResource7 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_ARYA_AI_DENOISE_MODEL", 21, 55, "live_arya_ai_denoise_model", "ai_denoise_model.kmdl", "live_arya_ai_denoise_model");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_ARYA_AI_DENOISE_MODEL = v20;
       liveResource8 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_ARYA_AUDIO_CAE_MODEL", 22, 56, "live_arya_audio_cae_model", "live_cae_model.tflite", "live_arya_audio_cae_model");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_ARYA_AUDIO_CAE_MODEL = v21;
       liveResource7 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_ARYA_DEEP_AEC_MODEL", 23, 79, "live_arya_deep_aec_model", "deep_aec_android.kmdl", "live_arya_deep_aec_model");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_ARYA_DEEP_AEC_MODEL = v22;
       liveResource8 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_GIFT_SLOT_BACKGROUND_RESOURCE", 24, 63, "live_gift_slot_background_res", "", true, "live_gift_slot_background");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_GIFT_SLOT_BACKGROUND_RESOURCE = v23;
       liveResource7 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_GIFT_SLOT_SPECIAL_COMBO_RESOURCE", 25, 64, "live_gift_slot_special_combo_res", "", true, "live_gift_slot_special_combo");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_GIFT_SLOT_SPECIAL_COMBO_RESOURCE = liveResource5;
       LiveResourceFileUtil$LiveResourceFileType liveResource9 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_PK_RESOURCE", 26, 68, "live_pk_resource", "", "live_pk");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_PK_RESOURCE = liveResource7;
       LiveResourceFileUtil$LiveResourceFileType liveResource10 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_MULTI_PK_RESOURCE", 27, 69, "live_multi_pk", "", "live_multi_pk");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_MULTI_PK_RESOURCE = liveResource9;
       LiveResourceFileUtil$LiveResourceFileType liveResource11 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_PK_SCORE_LIMIT_RESOURCE", 28, 70, "live_pk_resource", "", "live_pk_score_limit");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_PK_SCORE_LIMIT_RESOURCE = liveResource10;
       LiveResourceFileUtil$LiveResourceFileType liveResource12 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_PK_IMAGE_CUSTOM_SKIN_V2", 29, 71, "live_pk_image_resource_custom_skin_v2", "", true, "live_pk_custom_skin_biz_type");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_PK_IMAGE_CUSTOM_SKIN_V2 = v28;
       liveResource11 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_PK_IMAGE_ANCHOR_HONOR_V2", 30, 72, "live_pk_image_resource_anchor_honor_v2", "", true, "live_pk_anchor_honor_skin_biz_type");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_PK_IMAGE_ANCHOR_HONOR_V2 = v29;
       LiveResourceFileUtil$LiveResourceFileType liveResource13 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_GIFT_BOX_EFFECT", 31, 73, "live_gift_box_effect_res", "", true, "live_gift_box_effect");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_GIFT_BOX_EFFECT = v30;
       liveResource11 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_MULTI_PK_RESOURCE_IMAGE_HONOR_SKIN", 32, 75, "live_multi_pk_resource_image_honor_skin", "", true, "live_multi_pk_resource_image_honor_skin_type");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_MULTI_PK_RESOURCE_IMAGE_HONOR_SKIN = v31;
       liveResource13 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_MULTI_PK_RESOURCE_IMAGE_NORMAL_SKIN", 33, 76, "live_multi_pk_resource_image_normal_skin", "", true, "live_multi_pk_resource_image_normal_skin_type");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_MULTI_PK_RESOURCE_IMAGE_NORMAL_SKIN = v32;
       liveResource11 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_MULTI_PK_RESOURCE_IMAGE_ACTIVITY_SKIN", 34, 77, "live_multi_pk_resource_image_activity_skin", "", true, "live_multi_pk_resource_image_activity_skin_type");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_MULTI_PK_RESOURCE_IMAGE_ACTIVITY_SKIN = liveResource8;
       liveResource13 = new LiveResourceFileUtil$LiveResourceFileType("LIVE_OVER_ROOM_RESOURCE", 35, 80, "live_over_room_resource", "", true, "live_over_room_biz_type");
       LiveResourceFileUtil$LiveResourceFileType.LIVE_OVER_ROOM_RESOURCE = liveResource11;
       LiveResourceFileUtil$LiveResourceFileType liveResource14 = new LiveResourceFileUtil$LiveResourceFileType("Live_MULTI_LINE_PUZZLE_IMAGE_RESOURCE", 36, 81, "live_multi_line_resource", "", true, "live_multi_line_puzzle_biz_type");
       LiveResourceFileUtil$LiveResourceFileType.Live_MULTI_LINE_PUZZLE_IMAGE_RESOURCE = v44;
       liveResource14 = liveResource2;
       LiveResourceFileUtil$LiveResourceFileType[] liveResource15 = new LiveResourceFileUtil$LiveResourceFileType[37];
       liveResource15[0] = v7;
       liveResource15[1] = liveResource;
       liveResource15[2] = v1;
       liveResource15[3] = v2;
       liveResource15[4] = v3;
       liveResource15[5] = v4;
       liveResource15[6] = v5;
       liveResource15[7] = v6;
       liveResource15[8] = liveResource1;
       liveResource15[9] = v16;
       liveResource15[10] = liveResource3;
       liveResource15[11] = v10;
       liveResource15[12] = v11;
       liveResource15[13] = v12;
       liveResource15[14] = v13;
       liveResource15[15] = v14;
       liveResource15[16] = liveResource14;
       liveResource15[17] = liveResource4;
       liveResource15[18] = v25;
       liveResource15[19] = liveResource6;
       liveResource15[20] = v19;
       liveResource15[21] = v20;
       liveResource15[22] = v21;
       liveResource15[23] = v22;
       liveResource15[24] = v23;
       liveResource15[25] = liveResource5;
       liveResource15[26] = liveResource7;
       liveResource15[27] = liveResource9;
       liveResource15[28] = liveResource10;
       liveResource15[29] = v28;
       liveResource15[30] = v29;
       liveResource15[31] = v30;
       liveResource15[32] = v31;
       liveResource15[33] = v32;
       liveResource15[34] = liveResource8;
       liveResource15[35] = liveResource11;
       liveResource15[36] = v44;
       LiveResourceFileUtil$LiveResourceFileType.$VALUES = liveResource15;
       LiveResourceFileUtil$LiveResourceFileType.VALUES_MAP = new HashMap();
       LiveResourceFileUtil$LiveResourceFileType[] liveResource16 = LiveResourceFileUtil$LiveResourceFileType.values();
       int len = liveResource16.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = liveResource16[i];
          LiveResourceFileUtil$LiveResourceFileType.VALUES_MAP.put(oobject.mType, oobject);
       }
    }
    public void LiveResourceFileUtil$LiveResourceFileType(String p0,int p1,int p2,String p3,String p4,String p5){
       super(p0, p1, p2, p3, p4, false, p5);
    }
    public void LiveResourceFileUtil$LiveResourceFileType(String p0,int p1,int p2,String p3,String p4,boolean p5,String p6){
       super(p0, p1);
       this.mType = String.valueOf(p2);
       this.mFilePathInfo = new LiveResourceFileUtil$d(p3, p4);
       this.mIsNeedHighPriorityDownload = p5;
       this.mDownloadBizType = p6;
    }
    public static LiveResourceFileUtil$LiveResourceFileType fromTypeString(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveResourceFileUtil$LiveResourceFileType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveResourceFileUtil$LiveResourceFileType.VALUES_MAP.get(p0);
    }
    public static LiveResourceFileUtil$LiveResourceFileType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveResourceFileUtil$LiveResourceFileType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveResourceFileUtil$LiveResourceFileType.class, p0);
    }
    public static LiveResourceFileUtil$LiveResourceFileType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveResourceFileUtil$LiveResourceFileType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveResourceFileUtil$LiveResourceFileType.$VALUES.clone();
    }
    public void clearLiveResourceDownloadListener(){
       this.mDownloadListener = null;
    }
    public void setLiveResourceDownloadListener(LiveResourceFileUtil$b p0){
       this.mDownloadListener = p0;
    }
}
