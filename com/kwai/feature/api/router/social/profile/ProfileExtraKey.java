package com.kwai.feature.api.router.social.profile.ProfileExtraKey;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ProfileExtraKey extends Enum	// class@00107a
{
    public final String value;
    public static final ProfileExtraKey[] $VALUES;
    public static final ProfileExtraKey AD_CALLBACK_PARAM;
    public static final ProfileExtraKey AD_EXTRA_INFO;
    public static final ProfileExtraKey ARG_PROFILE_ORIGIN_INTENT_DATA;
    public static final ProfileExtraKey BUSINESS_SCENE_TYPE;
    public static final ProfileExtraKey COLLECT_SUB_TAB_NAME;
    public static final ProfileExtraKey DISALLOW_MOMENT_FOLLOW;
    public static final ProfileExtraKey ENABLE_SMOOTH_SWIPE;
    public static final ProfileExtraKey FOLLOW_REFER;
    public static final ProfileExtraKey LOCATE_MOMENT;
    public static final ProfileExtraKey MUSIC_EXTRA_BACKGROUND;
    public static final ProfileExtraKey MUSIC_EXTRA_RESULT_ORIGIN_PATH_RANGES;
    public static final ProfileExtraKey PHOTO_EXP_TAG;
    public static final ProfileExtraKey PHOTO_ID;
    public static final ProfileExtraKey PHOTO_INDEX;
    public static final ProfileExtraKey PHOTO_LLSID;
    public static final ProfileExtraKey PHOTO_SCENE_TYPE;
    public static final ProfileExtraKey PROFILE_TAB;
    public static final ProfileExtraKey REFER_PHOTO;
    public static final ProfileExtraKey USER;

    static {
       ProfileExtraKey[] profileExtra = new ProfileExtraKey[19];
       ProfileExtraKey profileExtra1 = new ProfileExtraKey("ENABLE_SMOOTH_SWIPE", 0, "arg_enable_smooth_swipe");
       ProfileExtraKey.ENABLE_SMOOTH_SWIPE = profileExtra1;
       profileExtra[0] = profileExtra1;
       profileExtra1 = new ProfileExtraKey("REFER_PHOTO", 1, "arg_refer_photo");
       ProfileExtraKey.REFER_PHOTO = profileExtra1;
       profileExtra[1] = profileExtra1;
       profileExtra1 = new ProfileExtraKey("PHOTO_ID", 2, "arg_photo_id");
       ProfileExtraKey.PHOTO_ID = profileExtra1;
       profileExtra[2] = profileExtra1;
       profileExtra1 = new ProfileExtraKey("PHOTO_EXP_TAG", 3, "arg_photo_exp_tag");
       ProfileExtraKey.PHOTO_EXP_TAG = profileExtra1;
       profileExtra[3] = profileExtra1;
       profileExtra1 = new ProfileExtraKey("PHOTO_LLSID", 4, "arg_photo_llsid");
       ProfileExtraKey.PHOTO_LLSID = profileExtra1;
       profileExtra[4] = profileExtra1;
       profileExtra1 = new ProfileExtraKey("PHOTO_INDEX", 5, "arg_photo_index_id");
       ProfileExtraKey.PHOTO_INDEX = profileExtra1;
       profileExtra[5] = profileExtra1;
       profileExtra1 = new ProfileExtraKey("PHOTO_SCENE_TYPE", 6, "PHOTO_SCENE_TYPE");
       ProfileExtraKey.PHOTO_SCENE_TYPE = profileExtra1;
       profileExtra[6] = profileExtra1;
       profileExtra1 = new ProfileExtraKey("USER", 7, "arg_user");
       ProfileExtraKey.USER = profileExtra1;
       profileExtra[7] = profileExtra1;
       profileExtra1 = new ProfileExtraKey("FOLLOW_REFER", 8, "follow_refer");
       ProfileExtraKey.FOLLOW_REFER = profileExtra1;
       profileExtra[8] = profileExtra1;
       profileExtra1 = new ProfileExtraKey("PROFILE_TAB", 9, "profile_tab");
       ProfileExtraKey.PROFILE_TAB = profileExtra1;
       profileExtra[9] = profileExtra1;
       profileExtra1 = new ProfileExtraKey("COLLECT_SUB_TAB_NAME", 10, "collect_sub_tab_name");
       ProfileExtraKey.COLLECT_SUB_TAB_NAME = profileExtra1;
       profileExtra[10] = profileExtra1;
       profileExtra1 = new ProfileExtraKey("DISALLOW_MOMENT_FOLLOW", 11, "DISALLOW_MOMENT_FOLLOW");
       ProfileExtraKey.DISALLOW_MOMENT_FOLLOW = profileExtra1;
       profileExtra[11] = profileExtra1;
       profileExtra1 = new ProfileExtraKey("LOCATE_MOMENT", 12, "jump_to_moment_tab_and_locate");
       ProfileExtraKey.LOCATE_MOMENT = profileExtra1;
       profileExtra[12] = profileExtra1;
       profileExtra1 = new ProfileExtraKey("ARG_PROFILE_ORIGIN_INTENT_DATA", 13, "profile_origin_intent_data");
       ProfileExtraKey.ARG_PROFILE_ORIGIN_INTENT_DATA = profileExtra1;
       profileExtra[13] = profileExtra1;
       profileExtra1 = new ProfileExtraKey("MUSIC_EXTRA_BACKGROUND", 14, "background");
       ProfileExtraKey.MUSIC_EXTRA_BACKGROUND = profileExtra1;
       profileExtra[14] = profileExtra1;
       profileExtra1 = new ProfileExtraKey("MUSIC_EXTRA_RESULT_ORIGIN_PATH_RANGES", 15, "background");
       ProfileExtraKey.MUSIC_EXTRA_RESULT_ORIGIN_PATH_RANGES = profileExtra1;
       profileExtra[15] = profileExtra1;
       profileExtra1 = new ProfileExtraKey("BUSINESS_SCENE_TYPE", 16, "BUSINESS_SCENE_TYPE");
       ProfileExtraKey.BUSINESS_SCENE_TYPE = profileExtra1;
       profileExtra[16] = profileExtra1;
       profileExtra1 = new ProfileExtraKey("AD_EXTRA_INFO", 17, "AD_EXTRA_INFO");
       ProfileExtraKey.AD_EXTRA_INFO = profileExtra1;
       profileExtra[17] = profileExtra1;
       profileExtra1 = new ProfileExtraKey("AD_CALLBACK_PARAM", 18, "callbackParam");
       ProfileExtraKey.AD_CALLBACK_PARAM = profileExtra1;
       profileExtra[18] = profileExtra1;
       ProfileExtraKey.$VALUES = profileExtra;
    }
    public void ProfileExtraKey(String p0,int p1,String p2){
       super(p0, p1);
       this.value = p2;
    }
    public static ProfileExtraKey valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ProfileExtraKey.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ProfileExtraKey.class, p0);
    }
    public static ProfileExtraKey[] values(){
       Object obj = PatchProxy.apply(null, null, ProfileExtraKey.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ProfileExtraKey.$VALUES.clone();
    }
    public final String getValue(){
       return this.value;
    }
}
