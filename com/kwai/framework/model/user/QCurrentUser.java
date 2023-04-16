package com.kwai.framework.model.user.QCurrentUser;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import pa6.p;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import pa6.b;
import erd.g;
import crd.b;
import java.lang.Long;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.SharedPreferences$Editor;
import java.lang.StringBuilder;
import oe6.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import com.yxcorp.gifshow.model.CDNUrl;
import org.json.JSONArray;
import java.lang.Integer;
import java.util.Map;
import java.util.HashMap;
import com.kwai.framework.model.user.UserOwnerCount;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.System;
import o56.a;
import km8.b;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Objects;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.framework.model.user.UserSettingOption;

public class QCurrentUser	// class@000bd2
{
    public boolean enableUseCache;
    public String mAvatar;
    public CDNUrl[] mAvatars;
    public SharedPreferences$Editor mEditor;
    public boolean mLiveRedPackRainKoi;
    public String mPreUserId;
    public SharedPreferences mPrefs;
    public p mUserConfig;
    public static final String CURRENT_USER_CACHE = "enableQCurrentUserCache";
    public static final String FOLLOWER_COUNT = "follower_count";
    public static final String INVALID_USER = "0";
    public static final String KEY_ACQUAINTANCE_CONTACT = "gifshow_acquaintance_contact";
    public static final String KEY_AGE = "gifshow_age";
    public static final String KEY_ALLOW_COMMENT = "gifshow_allow_comment";
    public static final String KEY_ALLOW_COMMENT_MY_MOMENT = "allow_comment_my_moment";
    public static final String KEY_ALLOW_FIND_ME_BY_MOBILE = "gifshow_allow_find_me_by_mobile";
    public static final String KEY_ALLOW_FREQUENT_USERS = "gifshow_show_frequent_users";
    public static final String KEY_ALLOW_KNOCKU = "gifshow_allow_knock";
    public static final String KEY_ALLOW_MISSU = "gifshow_allow_miss";
    public static final String KEY_ALLOW_MSG = "gifshow_allow_msg";
    public static final String KEY_ALLOW_OTHERS_REWARD_ME = "allow_reward_me";
    public static final String KEY_ALLOW_PUSH_MY_COMMENTS_TO_OTHERS = "gifshow_allown_push_my_comments_to_others";
    public static final String KEY_ALLOW_SAVE = "gifshow_allow_save";
    public static final String KEY_API_SERVICE_TOKEN = "gifshow_api_service_token";
    public static final String KEY_AUTO_SAVE_TO_LOCAL = "gifshow_auto_save_to_local";
    public static final String KEY_AVATAR = "gifshow_avatar";
    public static final String KEY_AVATARS = "gifshow_avatars";
    public static final String KEY_AVATAR_PENDANT = "gifshow_avatar_pendant";
    public static final String KEY_AVATAR_PENDANT_TYPE = "gifshow_avatar_pendant_type";
    public static final String KEY_BACKGROUND = "gifshow_background";
    public static final String KEY_BACKGROUNDS = "gifshow_backgrounds";
    public static final String KEY_DEFAULT_HEAD = "gifshow_default_head";
    public static final String KEY_DISABLE_IM_ONLINE_STATUS = "gifshow_disable_im_online_status";
    public static final String KEY_DISABLE_LATEST_ALBUM_ASSET = "KEY_DISABLE_LATEST_ALBUM_ASSET";
    public static final String KEY_DISABLE_NEARBY_ONLINE_STATUS = "gifshow_disable_nearby_online_status";
    public static final String KEY_DISABLE_SCREENSHOT_FEEDBACK = "gifshow_disable_screen_feedback";
    public static final String KEY_DISABLE_SMART_ALBUM_TABS = "KEY_DISABLE_SMART_ALBUM_TABS";
    public static final String KEY_ENABLE_ADD_WATERMARK = "gifshow_add_watermark_saving_self_photo";
    public static final String KEY_ENABLE_FOLLOW_AUTO_PLAY = "gifshow_enable_follow_auto_play";
    public static final String KEY_ENABLE_LOCAL_INTELLIGENCE_ALBUM = "gifshow_enable_local_intelligence_album";
    public static final String KEY_ENABLE_MOMENT = "gifshow_enable_moment";
    public static final String KEY_ENABLE_NOTIFICATION_QUICK_UTILS = "gifshow_enable_notification_quick_utils";
    public static final String KEY_ENABLE_SHAKE_FRIEND = "gifshow_enable_shake_friend";
    public static final String KEY_ENABLE_SHOW_REMOVED = "enable_show_removed";
    public static final String KEY_ENABLE_SHOW_REVERSE_REMOVED = "enable_show_reverse_removed";
    public static final String KEY_ENABLE_TOPIC_DETAIL_V2_AUTO_PLAY = "gifshow_enable_topic_detail_v2_auto_play";
    public static final String KEY_FOLLOW_LIST_PRIVACY = "gifshow_follow_list_privacy";
    public static final String KEY_H5_SERVICE_TOKEN = "gifshow_h5_service_token";
    public static final String KEY_IS_NEW_REGISTER_USER = "gifshow_is_new_register_user";
    public static final String KEY_IS_NEW_THIRD_PLATFORM_USER = "gifshow_is_new_third_platform_user";
    public static final String KEY_KWAIID = "key_kwaiid";
    public static final String KEY_MENTIONED_ME_WORKS_SETTING = "at_me_tab_privacy_setting";
    public static final String KEY_MESSAGE_PRIVACY = "gifshow_message_privacy";
    public static final String KEY_NAME = "gifshow_name";
    public static final String KEY_NOT_PUBLIC_COLLECT = "gifshow_not_public_collect";
    public static final String KEY_ONLINE_STATUS_SETTING = "gifshow_online_status_setting";
    public static final String KEY_OPEN_HOT_CHANNEL = "open_hot_channel";
    public static final String KEY_OPEN_PENDANT = "open_pendant";
    public static final String KEY_PASS_TOKEN = "gifshow_pass_token";
    public static final String KEY_PRE_USER_ID = "pre_user_id";
    public static final String KEY_PRIVATE_LOCATION = "gifshow_private_location";
    public static final String KEY_PRIVATE_NEWS = "gifshow_private_news_v2";
    public static final String KEY_PRIVATE_NEWS_BANNED_COUNT = "gifshow_private_news_v2_banned_count";
    public static final String KEY_PRIVATE_USER = "gifshow_private_user";
    public static final String KEY_PUBLIC_FOLLOW = "gifshow_public_follow";
    public static final String KEY_SAME_FOLLOW = "gifshow_same_follow";
    public static final String KEY_SECURITY_TOKEN = "gifshow_security_token";
    public static final String KEY_SEX = "gifshow_sex";
    public static final String KEY_SHOW_INTIMATE_RELATION = "gifshow_show_intimate_relation";
    public static final String KEY_SID = "gifshow_sid";
    public static final String KEY_TOKEN = "gifshow_token";
    public static final String KEY_TOKEN_CLIENT_SALT = "token_client_salt";
    public static final String KEY_USERID = "gifshow_userid";
    public static final String KEY_USER_TYPE = "gifshow_user_type";
    public static final String KEY_WIFI_PREUPLOAD_DENY = "gifshow_wifi_preupload";
    public static QCurrentUser ME;
    public static final String WECHAT_EXPIRES;
    public static final String WECHAT_NAME;
    public static final String WECHAT_OPEN_ID;
    public static final String WECHAT_TOKEN;
    public static final String WECHAT_UNION_ID;
    public static ConcurrentHashMap stringValueCache;

    static {
       QCurrentUser.ME = new QCurrentUser();
       QCurrentUser.stringValueCache = new ConcurrentHashMap();
    }
    public void QCurrentUser(){
       super();
       this.mUserConfig = new p();
       this.mPreUserId = "";
       this.mPrefs = this.obtainPref();
       t.timer(5, TimeUnit.SECONDS).subscribeOn(d.c).subscribe(new b(this));
    }
    public static void a(QCurrentUser p0,Long p1){
       p0.lambda$new$0(p1);
    }
    private void lambda$new$0(Long p0){
       this.enableUseCache = a.t().d("enableQCurrentUserCache", false);
    }
    public static QCurrentUser me(){
       return QCurrentUser.ME;
    }
    public void clearUserPreferenceValues(){
       if (PatchProxy.applyVoid(null, this, QCurrentUser.class, "166")) {
          return;
       }
       this.ensureUserPreference();
       String id = this.getId();
       SharedPreferences$Editor uEditor = this.mPrefs.edit();
       uEditor.remove("gifshow_token");
       uEditor.remove("gifshow_pass_token");
       uEditor.remove("gifshow_api_service_token");
       uEditor.remove("gifshow_h5_service_token");
       uEditor.remove("gifshow_user_type");
       uEditor.remove("gifshow_userid");
       uEditor.remove("gifshow_avatar");
       uEditor.remove("gifshow_avatars");
       uEditor.remove("gifshow_avatar_pendant_type");
       uEditor.remove("gifshow_background");
       uEditor.remove("gifshow_backgrounds");
       uEditor.remove("gifshow_default_head");
       uEditor.remove("gifshow_sex");
       uEditor.remove("at_me_tab_privacy_setting"+id);
       uEditor.remove("gifshow_private_user"+id);
       uEditor.remove("gifshow_disable_im_online_status"+id);
       uEditor.remove("gifshow_private_news_v2"+id);
       uEditor.remove("gifshow_private_news_v2_banned_count"+id);
       uEditor.remove("gifshow_private_location"+id);
       uEditor.remove("gifshow_wifi_preupload"+id);
       uEditor.remove("gifshow_public_follow");
       uEditor.remove("gifshow_same_follow");
       uEditor.remove("gifshow_acquaintance_contact");
       uEditor.remove("gifshow_enable_follow_auto_play");
       uEditor.remove("gifshow_allow_comment"+id);
       uEditor.remove("gifshow_allow_msg"+id);
       uEditor.remove("gifshow_message_privacy"+id);
       uEditor.remove("gifshow_follow_list_privacy"+id);
       uEditor.remove("gifshow_allow_save"+id);
       uEditor.remove("gifshow_name");
       uEditor.remove("gifshow_is_new_third_platform_user"+id);
       uEditor.remove("gifshow_security_token");
       uEditor.remove("token_client_salt");
       uEditor.remove("key_kwaiid");
       uEditor.remove("gifshow_is_new_register_user");
       uEditor.remove("gifshow_disable_screen_feedback"+id);
       uEditor.remove("gifshow_add_watermark_saving_self_photo"+id);
       uEditor.remove("gifshow_enable_shake_friend"+id);
       uEditor.remove("open_hot_channel"+id);
       uEditor.remove("allow_reward_me"+id);
       g.a(uEditor);
       return;
    }
    public synchronized void commitChanges(){
       if (PatchProxy.applyVoid(null, this, QCurrentUser.class, "2")) {
          return;
       }
       QCurrentUser tmEditor = this.mEditor;
       if (tmEditor != null) {
          g.a(tmEditor);
       }
       return;
    }
    public boolean enableFollowAutoPlay(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "80");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_enable_follow_auto_play"+this.getId(), true);
    }
    public boolean enablePhotoGuest(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "96");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("enable_photo_viewer"+this.getId(), false);
    }
    public boolean enableShowAlbumInProfile(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "94");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("enable_show_album_in_profile"+this.getId(), false);
    }
    public boolean enableShowFrequentUsers(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "110");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_show_frequent_users"+this.getId(), true);
    }
    public boolean enableTopicDetailV2AutoPlay(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "78");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_enable_topic_detail_v2_auto_play"+this.getId(), true);
    }
    public final void ensureEditor(){
       if (PatchProxy.applyVoid(null, this, QCurrentUser.class, "170")) {
          return;
       }
       if (this.mEditor == null) {
          this.startEdit();
       }
       return;
    }
    public final void ensureUserPreference(){
       if (PatchProxy.applyVoid(null, this, QCurrentUser.class, "169")) {
          return;
       }
       if (this.mPrefs == null || this.mEditor == null) {
          this.reload();
       }
       return;
    }
    public int getAge(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getIntValue("gifshow_age", 0);
    }
    public String getApiServiceToken(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getStringValue("gifshow_api_service_token", "");
    }
    public String getAvatar(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getStringValue("gifshow_avatar", null);
    }
    public CDNUrl[] getAvatars(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return CDNUrl.fromJsonArray(new JSONArray(this.getStringValue("gifshow_avatars", "")));
       }catch(java.lang.Exception e0){
          return v1;
       }
    }
    public String getBackgroundUrl(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getStringValue("gifshow_background", null);
    }
    public CDNUrl[] getBackgroundUrls(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return CDNUrl.fromJsonArray(new JSONArray(this.getStringValue("gifshow_backgrounds", "")));
       }catch(java.lang.Exception e0){
          return v1;
       }
    }
    public final boolean getBooleanValue(String p0,boolean p1){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, qCurrentUser, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.ensureUserPreference();
       return this.mPrefs.getBoolean(p0, p1);
    }
    public String getCacheAvatar(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mAvatar == null) {
          this.mAvatar = this.getAvatar();
       }
       return this.mAvatar;
    }
    public CDNUrl[] getCacheAvatars(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mAvatars == null) {
          this.mAvatars = this.getAvatars();
       }
       return this.mAvatars;
    }
    public boolean getDefaultHead(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_default_head", false);
    }
    public String getDisplayName(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getName();
    }
    public int getFollowListVisibilityOption(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "121");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getIntValue("gifshow_follow_list_privacy"+this.getId(), 1);
    }
    public int getFollowerCount(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getIntValue("follower_count", 0);
    }
    public String getH5ServiceToken(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getStringValue("gifshow_h5_service_token", "");
    }
    public String getId(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getStringValue("gifshow_userid", "0");
    }
    public final int getIntValue(String p0,int p1){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, qCurrentUser, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.ensureUserPreference();
       return this.mPrefs.getInt(p0, p1);
    }
    public String getKwaiId(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getStringValue("key_kwaiid", "");
    }
    public final long getLongValue(String p0,long p1){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, qCurrentUser, "10");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       this.ensureUserPreference();
       return this.mPrefs.getLong(p0, p1);
    }
    public Map getMapFromUserPreference(){
       String obj = PatchProxy.apply(null, this, QCurrentUser.class, "165");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getId();
       HashMap hashMap = new HashMap();
       hashMap.put("gifshow_token", this.getToken());
       hashMap.put("gifshow_pass_token", this.getPassToken());
       hashMap.put("gifshow_api_service_token", this.getApiServiceToken());
       hashMap.put("gifshow_h5_service_token", this.getH5ServiceToken());
       hashMap.put("gifshow_user_type", Integer.valueOf(this.getUserType()));
       hashMap.put("gifshow_userid", this.getId());
       hashMap.put("gifshow_avatar", this.getAvatar());
       hashMap.put("gifshow_avatars", this.getAvatars());
       hashMap.put("gifshow_avatar_pendant_type", Integer.valueOf(this.getPendantType()));
       hashMap.put("gifshow_background", this.getBackgroundUrl());
       hashMap.put("gifshow_backgrounds", this.getBackgroundUrls());
       hashMap.put("gifshow_default_head", Boolean.valueOf(this.getDefaultHead()));
       hashMap.put("gifshow_sex", this.getSex());
       hashMap.put("gifshow_private_user"+obj, Boolean.valueOf(this.isPrivateUser()));
       hashMap.put("gifshow_disable_im_online_status"+obj, Boolean.valueOf(this.isTurnOffOnlineStatus()));
       hashMap.put("gifshow_disable_nearby_online_status"+obj, Boolean.valueOf(this.isTurnOffNearbyOnlineStatus()));
       hashMap.put("gifshow_private_news_v2"+obj, Integer.valueOf(this.getNewsPrivate()));
       hashMap.put("gifshow_private_news_v2_banned_count"+obj, Integer.valueOf(this.getPrivateNewsBlackCount()));
       hashMap.put("gifshow_private_location"+obj, Boolean.valueOf(this.isPrivateLocation()));
       hashMap.put("gifshow_wifi_preupload"+obj, Boolean.valueOf(this.isWifiPreloadDeny()));
       hashMap.put("gifshow_public_follow", Boolean.valueOf(this.isPublicFollow()));
       hashMap.put("gifshow_same_follow", Boolean.valueOf(this.isCloseSameFollow()));
       hashMap.put("gifshow_enable_follow_auto_play", Boolean.valueOf(this.enableFollowAutoPlay()));
       hashMap.put("gifshow_allow_comment"+obj, Boolean.valueOf(this.isAllowComment()));
       hashMap.put("gifshow_allow_msg"+obj, Boolean.valueOf(this.isAllowMsg()));
       hashMap.put("gifshow_message_privacy"+obj, Integer.valueOf(this.getMessagePrivacy()));
       hashMap.put("gifshow_follow_list_privacy"+obj, Integer.valueOf(this.getFollowListVisibilityOption()));
       hashMap.put("gifshow_allow_save"+obj, Boolean.valueOf(this.isAllowSave()));
       hashMap.put("gifshow_name", this.getName());
       hashMap.put("gifshow_is_new_third_platform_user"+obj, Boolean.valueOf(this.isNewThirdPlatformUser()));
       hashMap.put("gifshow_security_token", this.getSecurityToken());
       hashMap.put("token_client_salt", this.getTokenClientSalt());
       hashMap.put("at_me_tab_privacy_setting"+obj, Integer.valueOf(this.getMentionedMeWorksSetting()));
       hashMap.put("key_kwaiid", this.getKwaiId());
       hashMap.put("gifshow_disable_screen_feedback"+obj, Boolean.valueOf(this.isScreenshotFeedbackDisabled()));
       hashMap.put("gifshow_add_watermark_saving_self_photo"+obj, Boolean.valueOf(this.isAddWatermarkEnabled()));
       hashMap.put("gifshow_enable_shake_friend"+obj, Boolean.valueOf(this.isShakeFriendEnabled()));
       hashMap.put("open_hot_channel"+obj, Boolean.valueOf(this.isOpenHotChannel()));
       hashMap.put("allow_reward_me"+obj, Boolean.valueOf(this.isAllowOthersRewardMe()));
       return hashMap;
    }
    public int getMentionedMeWorksSetting(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "150");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getIntValue("at_me_tab_privacy_setting"+this.getId(), 1);
    }
    public int getMessagePrivacy(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "120");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getIntValue("gifshow_message_privacy"+this.getId(), 1);
    }
    public String getName(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getStringValue("gifshow_name", "");
    }
    public int getNewsPrivate(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "127");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getIntValue("gifshow_private_news_v2"+this.getId(), 0);
    }
    public int getOnlineStatusSetting(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "130");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getIntValue("gifshow_online_status_setting"+this.getId(), 1);
    }
    public UserOwnerCount getOwnerCount(){
       return this.mUserConfig.mOwnerCount;
    }
    public String getPassToken(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getStringValue("gifshow_pass_token", "");
    }
    public int getPendantType(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getIntValue("gifshow_avatar_pendant_type", 0);
    }
    public CDNUrl[] getPendants(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return CDNUrl.fromJsonArray(new JSONArray(this.getStringValue("gifshow_avatar_pendant", "")));
       }catch(java.lang.Exception e0){
          return v1;
       }
    }
    public String getPreUserId(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "157");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getPreUserIdByExp();
    }
    public final String getPreUserIdByExp(){
       return this.mPreUserId;
    }
    public int getPrivateNewsBlackCount(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "129");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getIntValue("gifshow_private_news_v2_banned_count"+this.getId(), 0);
    }
    public String getSecurityToken(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getStringValue("gifshow_security_token", null);
    }
    public String getSex(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getStringValue("gifshow_sex", "U");
    }
    public String getSid(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "174");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getStringValue("gifshow_sid", "");
    }
    public final String getStringValue(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, QCurrentUser.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.ensureUserPreference();
       if (this.enableUseCache == null) {
          return this.mPrefs.getString(p0, p1);
       }
       if (QCurrentUser.stringValueCache.containsKey(p0)) {
          return QCurrentUser.stringValueCache.get(p0);
       }
       p1 = this.mPrefs.getString(p0, p1);
       if (p1 != null) {
          QCurrentUser.stringValueCache.put(p0, p1);
       }
       return p1;
    }
    public String getText(){
       return this.mUserConfig.mUserText;
    }
    public String getToken(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getStringValue("gifshow_token", null);
    }
    public String getTokenClientSalt(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getStringValue("token_client_salt", "");
    }
    public p getUserConfig(){
       return this.mUserConfig;
    }
    public int getUserType(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getIntValue("gifshow_user_type", 0);
    }
    public long getWechatExpires(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getLongValue("wechat_expires", 0);
    }
    public String getWechatOpenId(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getStringValue("wechat_open_id", "");
    }
    public String getWechatUnionId(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getStringValue("wechat_union_id", "");
    }
    public boolean isAddWatermarkEnabled(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "145");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_add_watermark_saving_self_photo"+this.getId(), false);
    }
    public boolean isAllowComment(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "102");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_allow_comment"+this.getId(), true);
    }
    public boolean isAllowCommentMoment(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "123");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("allow_comment_my_moment"+this.getId(), false);
    }
    public boolean isAllowFindByMobilee(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "116");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_allow_find_me_by_mobile"+this.getId(), false);
    }
    public boolean isAllowKnockU(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "106");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_allow_knock"+this.getId(), true);
    }
    public boolean isAllowMissU(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "105");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_allow_miss"+this.getId(), true);
    }
    public boolean isAllowMsg(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "112");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_allow_msg"+this.getId(), true);
    }
    public boolean isAllowOthersRewardMe(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "154");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("allow_reward_me"+this.getId(), false);
    }
    public boolean isAllowPushMyCommentsToOther(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "117");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_allown_push_my_comments_to_others"+this.getId(), false);
    }
    public boolean isAllowSave(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "100");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_allow_save"+this.getId(), false);
    }
    public boolean isAutoSaveToLocal(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_auto_save_to_local"+this.getId(), false);
    }
    public boolean isBanned(){
       return this.mUserConfig.mUserBanned;
    }
    public boolean isBlocked(){
       return this.mUserConfig.isBlacked;
    }
    public boolean isCloseAcquaintanceContact(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "140");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_acquaintance_contact", true);
    }
    public boolean isCloseSameFollow(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "138");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_same_follow", true);
    }
    public boolean isDisableLatestAlbumAsset(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("KEY_DISABLE_LATEST_ALBUM_ASSET"+this.getId(), false);
    }
    public boolean isDisableSmartAlbumTabs(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("KEY_DISABLE_SMART_ALBUM_TABS"+this.getId(), false);
    }
    public boolean isEnableLocalIntelligenceAlbum(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_enable_local_intelligence_album"+this.getId(), true);
    }
    public boolean isEnableMoment(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "75");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_enable_moment", false);
    }
    public boolean isEnableNotificationQuickUtils(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "172");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_enable_notification_quick_utils"+this.getId(), true);
    }
    public boolean isEnableShowRemoved(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "158");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("enable_show_removed"+this.getId(), false);
    }
    public boolean isEnableShowReverseRemoved(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "160");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("enable_show_reverse_removed"+this.getId(), false);
    }
    public boolean isFemale(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "178");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("F").equals(this.getSex());
    }
    public boolean isGiftUnfollow(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "87");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gift_unfollow"+this.getId(), false);
    }
    public boolean isLiveRedPackRainKoi(){
       return this.mLiveRedPackRainKoi;
    }
    public boolean isLogined(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.getToken()) || (!TextUtils.isEmpty(this.getApiServiceToken()) && !TextUtils.isEmpty(this.getH5ServiceToken())))? true: false;
       return b;
    }
    public boolean isMale(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "177");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("M").equals(this.getSex());
    }
    public boolean isMentionedTabPrivate(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "152");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getMentionedMeWorksSetting() == 2)? true: false;
       return b;
    }
    public boolean isModifiedAutomaticPlaySwitch(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "79");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mPrefs.contains("gifshow_enable_follow_auto_play"+this.getId());
    }
    public boolean isNewRegisterUser(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "153");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_is_new_register_user", false);
    }
    public boolean isNewThirdPlatformUser(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "149");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_is_new_third_platform_user"+this.getId(), false);
    }
    public boolean isNotPublicProfileCollect(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "91");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("not_public_collect"+this.getId(), false);
    }
    public boolean isNotRecommendToContacts(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "83");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("not_recommend_to_contacts"+this.getId(), false);
    }
    public boolean isNotRecommendToQQFriend(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "97");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("not_recommend_to_qq_friends"+this.getId(), false);
    }
    public boolean isNotShareLiveStreamSegment(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "89");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("not_share_live_stream_fragment"+this.getId(), false);
    }
    public boolean isOpenHotChannel(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "147");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("open_hot_channel"+this.getId(), true);
    }
    public boolean isOpenPendant(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "156");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("open_pendant"+this.getId(), true);
    }
    public boolean isPrivateLocation(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_private_location"+this.getId(), false);
    }
    public boolean isPrivateNews(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "125");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.getNewsPrivate() != b) {
          b = false;
       }
       return b;
    }
    public boolean isPrivateUser(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "68");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_private_user"+this.getId(), false);
    }
    public boolean isPublicFollow(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "136");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_public_follow", false);
    }
    public boolean isRecommendToOthers(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("enable_recommended_know_people"+this.getId(), true);
    }
    public boolean isScreenshotFeedbackDisabled(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "143");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_disable_screen_feedback"+this.getId(), false);
    }
    public boolean isShakeFriendEnabled(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "141");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_enable_shake_friend"+this.getId(), false);
    }
    public boolean isShowIntimateRelation(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "107");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_show_intimate_relation"+this.getId(), false);
    }
    public boolean isTurnOffNearbyOnlineStatus(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_disable_nearby_online_status"+this.getId(), false);
    }
    public boolean isTurnOffOnlineStatus(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_disable_im_online_status"+this.getId(), false);
    }
    public boolean isValidUser(){
       String obj = PatchProxy.apply(null, this, QCurrentUser.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getId();
       boolean b = (!TextUtils.isEmpty(obj) && !("0").equals(obj))? true: false;
       return b;
    }
    public boolean isVerified(){
       return this.mUserConfig.mVerified;
    }
    public boolean isWechatLogined(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getStringValue("wechat_token", null) != null && this.getLongValue("wechat_expires", 0) - System.currentTimeMillis() > 0)? true: false;
       return b;
    }
    public boolean isWifiPreloadDeny(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "82");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getBooleanValue("gifshow_wifi_preupload"+this.getId(), false);
    }
    public SharedPreferences obtainPref(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "168");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.c(a.w, 4);
    }
    public void reload(){
       if (PatchProxy.applyVoid(null, this, QCurrentUser.class, "167")) {
          return;
       }
       SharedPreferences sharedPrefer = this.obtainPref();
       this.mPrefs = sharedPrefer;
       this.mEditor = sharedPrefer.edit();
       return;
    }
    public final void removeNebulaTokenClientSalt(){
       if (PatchProxy.applyVoid(null, this, QCurrentUser.class, "176")) {
          return;
       }
       this.ensureUserPreference();
       SharedPreferences$Editor uEditor = this.mPrefs.edit();
       uEditor.remove("nebula_token_client_salt");
       g.a(uEditor);
       return;
    }
    public void restoreUserPreferenceValues(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QCurrentUser.class, "164")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.ensureUserPreference();
       SharedPreferences$Editor uEditor = this.mPrefs.edit();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object value = uEntry.getValue();
          String key = uEntry.getKey();
          if (value instanceof Boolean) {
             uEditor.putBoolean(key, value.booleanValue());
          }else if(value instanceof Integer){
             uEditor.putInt(key, value.intValue());
          }else if(value instanceof Long){
             uEditor.putLong(key, value.longValue());
          }else if(value instanceof String){
             uEditor.putString(key, value);
          }else if(value != null){
             this.updateJsonField(key, value);
          }
       }
       g.a(uEditor);
       return;
    }
    public QCurrentUser setAge(int p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, qCurrentUser, "40");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateIntField("gifshow_age", p0);
    }
    public QCurrentUser setAllowComment(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "101");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_allow_comment"+this.getId(), p0);
    }
    public QCurrentUser setAllowCommentMoment(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "124");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("allow_comment_my_moment"+this.getId(), p0);
    }
    public QCurrentUser setAllowFindByMobilee(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "114");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_allow_find_me_by_mobile"+this.getId(), p0);
    }
    public QCurrentUser setAllowFrequentUsers(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "109");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_show_frequent_users"+this.getId(), p0);
    }
    public QCurrentUser setAllowKnockU(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "104");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_allow_knock"+this.getId(), p0);
    }
    public QCurrentUser setAllowMissU(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "103");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_allow_miss"+this.getId(), p0);
    }
    public QCurrentUser setAllowMsg(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "113");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_allow_msg"+this.getId(), p0);
    }
    public QCurrentUser setAllowOthersRewardMe(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "155");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("allow_reward_me"+this.getId(), p0);
    }
    public QCurrentUser setAllowPushMyCommentsToOther(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "115");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_allown_push_my_comments_to_others"+this.getId(), p0);
    }
    public QCurrentUser setAllowSave(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "99");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_allow_save"+this.getId(), p0);
    }
    public QCurrentUser setApiServiceToken(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QCurrentUser.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return this;
       }
       return this.updateStringField("gifshow_api_service_token", p0);
    }
    public QCurrentUser setAutoSaveToLocal(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "61");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_auto_save_to_local"+this.getId(), p0);
    }
    public QCurrentUser setAvatar(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QCurrentUser.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return this;
       }
       this.mAvatar = p0;
       return this.updateStringField("gifshow_avatar", p0);
    }
    public QCurrentUser setAvatars(CDNUrl[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QCurrentUser.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mAvatars = p0;
       return this.updateJsonField("gifshow_avatars", p0);
    }
    public QCurrentUser setBackground(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QCurrentUser.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.updateStringField("gifshow_background", p0);
    }
    public QCurrentUser setBackgrounds(CDNUrl[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QCurrentUser.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.updateJsonField("gifshow_backgrounds", p0);
    }
    public QCurrentUser setBanned(boolean p0){
       this.mUserConfig.mUserBanned = p0;
       return this;
    }
    public QCurrentUser setBlocked(boolean p0){
       this.mUserConfig.isBlacked = p0;
       return this;
    }
    public QCurrentUser setCloseAcquaintanceContact(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "139");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_acquaintance_contact", p0);
    }
    public QCurrentUser setCloseSameFollow(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "137");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_same_follow", p0);
    }
    public QCurrentUser setDefaultHead(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "51");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_default_head", p0);
    }
    public QCurrentUser setDisableLatestAlbumAsset(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "65");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("KEY_DISABLE_LATEST_ALBUM_ASSET"+this.getId(), p0);
    }
    public QCurrentUser setDisableScreenshotFeedback(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "144");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_disable_screen_feedback"+this.getId(), p0);
    }
    public QCurrentUser setDisableSmartAlbumTabs(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "67");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("KEY_DISABLE_SMART_ALBUM_TABS"+this.getId(), p0);
    }
    public QCurrentUser setEnableAddWatermark(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "146");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_add_watermark_saving_self_photo"+this.getId(), p0);
    }
    public void setEnableFollowAutoPlay(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "76")) {
          return;
       }
       this.updateBooleanField("gifshow_enable_follow_auto_play"+this.getId(), p0);
       return;
    }
    public QCurrentUser setEnableLocalIntelligenceAlbum(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "63");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_enable_local_intelligence_album"+this.getId(), p0);
    }
    public void setEnableMoment(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "74")) {
          return;
       }
       this.updateBooleanField("gifshow_enable_moment", p0);
       return;
    }
    public QCurrentUser setEnableNotificationQuickUtils(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "173");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_enable_notification_quick_utils"+this.getId(), p0);
    }
    public QCurrentUser setEnablePhotoGuest(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "95");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("enable_photo_viewer"+this.getId(), p0);
    }
    public QCurrentUser setEnableShowAlbumInProfile(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "93");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("enable_show_album_in_profile"+this.getId(), p0);
    }
    public QCurrentUser setEnableShowRemoved(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "159");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("enable_show_removed"+this.getId(), p0);
    }
    public QCurrentUser setEnableShowReverseRemoved(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "161");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("enable_show_reverse_removed"+this.getId(), p0);
    }
    public void setEnableTopicDetailV2AutoPlay(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "77")) {
          return;
       }
       this.updateBooleanField("gifshow_enable_topic_detail_v2_auto_play"+this.getId(), p0);
       return;
    }
    public QCurrentUser setFollowListVisibilityOption(int p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, qCurrentUser, "119");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateIntField("gifshow_follow_list_privacy"+this.getId(), p0);
    }
    public QCurrentUser setFollowerCount(int p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, qCurrentUser, "33");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.updateIntField("follower_count", p0);
       return this;
    }
    public QCurrentUser setGiftUnfollow(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "88");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gift_unfollow"+this.getId(), p0);
    }
    public QCurrentUser setH5ServiceToken(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QCurrentUser.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return this;
       }
       return this.updateStringField("gifshow_h5_service_token", p0);
    }
    public QCurrentUser setId(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QCurrentUser.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       QCurrentUser qCurrentUser = (p0 != null)? this.updateStringField("gifshow_userid", p0): this;
       return qCurrentUser;
    }
    public QCurrentUser setIsNewRegisterUser(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "133");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_is_new_register_user", p0);
    }
    public QCurrentUser setIsNewThirdPartyPlatformUser(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "132");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_is_new_third_platform_user"+this.getId(), p0);
    }
    public QCurrentUser setKwaiId(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QCurrentUser.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.updateStringField("key_kwaiid", p0);
       return this;
    }
    public QCurrentUser setLiveRedPackRainKoi(boolean p0){
       this.mLiveRedPackRainKoi = p0;
       return this;
    }
    public QCurrentUser setMentionedMeWorksSetting(int p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, qCurrentUser, "151");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateIntField("at_me_tab_privacy_setting"+this.getId(), p0);
    }
    public QCurrentUser setMessagePrivacy(int p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, qCurrentUser, "118");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateIntField("gifshow_message_privacy"+this.getId(), p0);
    }
    public QCurrentUser setName(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QCurrentUser.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          this.updateStringField("gifshow_name", p0);
       }
       return this;
    }
    public QCurrentUser setNearbyOnlineStatus(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "73");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_disable_nearby_online_status"+this.getId(), p0);
    }
    public QCurrentUser setNotPublicProfileCollect(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "92");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("not_public_collect"+this.getId(), p0);
    }
    public QCurrentUser setNotRecommendToContacts(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "84");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("not_recommend_to_contacts"+this.getId(), p0);
    }
    public QCurrentUser setNotRecommendToQQFriend(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "98");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("not_recommend_to_qq_friends"+this.getId(), p0);
    }
    public QCurrentUser setNotShareLiveStreamSegment(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "90");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("not_share_live_stream_fragment"+this.getId(), p0);
    }
    public QCurrentUser setOnlineStatus(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "71");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_disable_im_online_status"+this.getId(), p0);
    }
    public QCurrentUser setOnlineStatusSetting(int p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, qCurrentUser, "131");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateIntField("gifshow_online_status_setting"+this.getId(), p0);
    }
    public QCurrentUser setOpenHotChannel(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "148");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("open_hot_channel"+this.getId(), p0);
    }
    public QCurrentUser setOpenPendant(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "162");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("open_pendant"+this.getId(), p0);
    }
    public void setOwnerCount(UserOwnerCount p0){
       this.mUserConfig.mOwnerCount = p0;
    }
    public QCurrentUser setPassToken(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QCurrentUser.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return this;
       }
       return this.updateStringField("gifshow_pass_token", p0);
    }
    public QCurrentUser setPendantType(int p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, qCurrentUser, "54");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateIntField("gifshow_avatar_pendant_type", p0);
    }
    public QCurrentUser setPendants(CDNUrl[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QCurrentUser.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.updateJsonField("gifshow_avatar_pendant", p0);
    }
    public QCurrentUser setPreUserId(String p0){
       this.mPreUserId = p0;
       return this;
    }
    public void setPrivacyOption(String p0,boolean p1){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, qCurrentUser, "163")) {
          return;
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0x8ae2ad71:
             if (p0.equals("wifi_preupload_deny")) {
                i = 0;
             }
             break;
           case 0x8bbfeb0b:
             if (p0.equals("not_recommend_to_qq_friends")) {
                i = 1;
             }
             break;
           case 0x90168e28:
             if (p0.equals("not_recommend_to_contacts")) {
                i = 2;
             }
             break;
           case 0x93a36e95:
             if (p0.equals("disable_nearby_online_status")) {
                i = 3;
             }
             break;
           case 0xa3160028:
             if (p0.equals("not_share_live_stream_fragment")) {
                i = 4;
             }
             break;
           case 0xaf699b18:
             if (p0.equals("enable_knock")) {
                i = 5;
             }
             break;
           case 0xafd7694a:
             if (p0.equals("enable_shake")) {
                i = 6;
             }
             break;
           case 0xb350a344:
             if (p0.equals("message_deny")) {
                i = 7;
             }
             break;
           case 0xb40f268c:
             if (p0.equals("privacy_location")) {
                i = 8;
             }
             break;
           case 0xbba695cf:
             if (p0.equals("frequent_user_deny")) {
                i = 9;
             }
             break;
           case 0xc18ffee1:
             if (p0.equals("disable_push_my_comments_to_others")) {
                i = 10;
             }
             break;
           case 0xda817622:
             if (p0.equals("privacy_user")) {
                i = 11;
             }
             break;
           case 0xda86c2c8:
             if (p0.equals("acquaintance_deny")) {
                i = 12;
             }
             break;
           case 0xe1ffa440:
             if (p0.equals("not_public_collect")) {
                i = 13;
             }
             break;
           case 0xe255809c:
             if (p0.equals("open_hot_channel")) {
                i = 14;
             }
             break;
           case 0xe4df542b:
             if (p0.equals("add_watermark_saving_self_photo")) {
                i = 15;
             }
             break;
           case 0xecaafffb:
             if (p0.equals("disable_smart_album_tabs")) {
                i = 16;
             }
             break;
           case 0xed4d4787:
             if (p0.equals("not_allow_find_me_by_mobile")) {
                i = 17;
             }
             break;
           case 0x1df0363:
             if (p0.equals("download_deny")) {
                i = 18;
             }
             break;
           case 0xdfb2f92:
             if (p0.equals("missu_deny")) {
                i = 19;
             }
             break;
           case 0x119451b9:
             if (p0.equals("gift_unfollow")) {
                i = 20;
             }
             break;
           case 0x1785a699:
             if (p0.equals("auto_save_to_local")) {
                i = 21;
             }
             break;
           case 0x1b147902:
             if (p0.equals("allow_others_reward_me")) {
                i = 22;
             }
             break;
           case 0x1e091883:
             if (p0.equals("show_same_follow_deny")) {
                i = 23;
             }
             break;
           case 0x2f3316ac:
             if (p0.equals("enable_profile_show_intimate_relation")) {
                i = 24;
             }
             break;
           case 0x2f64ebec:
             if (p0.equals("comment_deny")) {
                i = 25;
             }
             break;
           case 0x36ee031f:
             if (p0.equals("disable_latest_album_asset")) {
                i = 26;
             }
             break;
           case 0x3dfeae47:
             if (p0.equals("public_follow")) {
                i = 27;
             }
             break;
           case 0x5ead4d7f:
             if (p0.equals("enable_local_intelligence_album")) {
                i = 28;
             }
             break;
           case 0x6b5c7667:
             if (p0.equals("disable_screenshot_feedback")) {
                i = 29;
             }
             break;
           case 0x6d257459:
             if (p0.equals("photo_share_add_watermark")) {
                i = 30;
             }
             break;
           case 0x71325ffa:
             if (p0.equals("disable_im_online_status")) {
                i = 31;
             }
             break;
           case 0x73f267a5:
             if (p0.equals("enable_show_album_in_profile")) {
                i = 32;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             this.setWifiPreUploadDeny(p1);
             break;
           case 1:
             this.setNotRecommendToQQFriend(p1);
             break;
           case 2:
             this.setNotRecommendToContacts(p1);
             break;
           case 3:
             this.setNearbyOnlineStatus(p1);
             break;
           case 4:
             this.setNotShareLiveStreamSegment(p1);
             break;
           case 5:
             this.setAllowKnockU((p1 ^ 0x01));
             break;
           case 6:
             this.setShakeFriendEnable(p1);
             break;
           case 7:
             this.setAllowMsg((p1 ^ 0x01));
             break;
           case 8:
             this.setPrivateLocation(p1);
             break;
           case 9:
             this.setAllowFrequentUsers((p1 ^ 0x01));
             break;
           case 10:
             this.setAllowPushMyCommentsToOther(p1);
             break;
           case 11:
             this.setPrivateUser(p1);
             break;
           case 12:
             this.setCloseAcquaintanceContact(p1);
             break;
           case 13:
             this.setNotPublicProfileCollect(p1);
             break;
           case 14:
             this.setOpenHotChannel(p1);
             break;
           case 15:
             this.setEnableAddWatermark(p1);
             break;
           case 16:
             this.setDisableSmartAlbumTabs(p1);
             break;
           case 17:
             this.setAllowFindByMobilee(p1);
             break;
           case 18:
             this.setAllowSave(p1);
             break;
           case 19:
             this.setAllowMissU((p1 ^ 0x01));
             break;
           case 20:
             this.setGiftUnfollow(p1);
             break;
           case 21:
             this.setAutoSaveToLocal(p1);
             break;
           case 22:
             this.setAllowOthersRewardMe(p1);
             break;
           case 23:
             this.setCloseSameFollow(p1);
             break;
           case 24:
             this.setShowIntimateRelation(p1);
             break;
           case 25:
             this.setAllowComment((p1 ^ 0x01));
             break;
           case 26:
             this.setDisableLatestAlbumAsset(p1);
             break;
           case 27:
             this.setPublicFollow(p1);
             break;
           case 28:
             this.setEnableLocalIntelligenceAlbum(p1);
             break;
           case 29:
             this.setDisableScreenshotFeedback(p1);
             break;
           case 30:
             this.setWatermarkEnable(p1);
             break;
           case 31:
             this.setOnlineStatus(p1);
             break;
           case 32:
             this.setEnableShowAlbumInProfile(p1);
             break;
           default:
             this.updateBooleanField(p0+this.getId(), p1);
       }
       return;
    }
    public QCurrentUser setPrivate(boolean p0){
       this.mUserConfig.mPrivacyUser = p0;
       return this;
    }
    public QCurrentUser setPrivateLocation(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "122");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_private_location"+this.getId(), p0);
    }
    public QCurrentUser setPrivateNews(int p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, qCurrentUser, "126");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateIntField("gifshow_private_news_v2"+this.getId(), p0);
    }
    public QCurrentUser setPrivateNewsBlackCount(int p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, qCurrentUser, "128");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateIntField("gifshow_private_news_v2_banned_count"+this.getId(), p0);
    }
    public QCurrentUser setPrivateUser(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "69");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_private_user"+this.getId(), p0);
    }
    public QCurrentUser setPublicFollow(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "135");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_public_follow", p0);
    }
    public QCurrentUser setRecommendToOthers(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "86");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("enable_recommended_know_people"+this.getId(), p0);
    }
    public QCurrentUser setSecurityToken(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QCurrentUser.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return this;
       }
       return this.updateStringField("gifshow_security_token", p0);
    }
    public QCurrentUser setSex(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QCurrentUser.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          this.updateStringField("gifshow_sex", p0);
       }
       return this;
    }
    public QCurrentUser setShakeFriendEnable(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "142");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_enable_shake_friend"+this.getId(), p0);
    }
    public QCurrentUser setShowIntimateRelation(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "108");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_show_intimate_relation"+this.getId(), p0);
    }
    public QCurrentUser setSid(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QCurrentUser.class, "175");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.updateStringField("gifshow_sid", p0);
    }
    public QCurrentUser setText(String p0){
       this.mUserConfig.mUserText = p0;
       return this;
    }
    public QCurrentUser setToken(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QCurrentUser.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return this;
       }
       return this.updateStringField("gifshow_token", p0);
    }
    public QCurrentUser setTokenClientSalt(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QCurrentUser.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return this;
       }
       return this.updateStringField("token_client_salt", p0);
    }
    public QCurrentUser setUserMsgDeny(boolean p0){
       this.mUserConfig.mUserMsgDeny = p0;
       return this;
    }
    public QCurrentUser setUserType(int p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, qCurrentUser, "42");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateIntField("gifshow_user_type", p0);
    }
    public QCurrentUser setVerified(boolean p0){
       this.mUserConfig.mVerified = p0;
       return this;
    }
    public QCurrentUser setWatermarkEnable(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "111");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("photo_share_add_watermark"+this.getId(), p0);
    }
    public QCurrentUser setWifiPreUploadDeny(boolean p0){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, qCurrentUser, "134");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.updateBooleanField("gifshow_wifi_preupload"+this.getId(), p0);
    }
    public synchronized QCurrentUser startEdit(){
       Object obj = PatchProxy.apply(null, this, QCurrentUser.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.commitChanges();
       this.ensureUserPreference();
       return this;
    }
    public final QCurrentUser updateBooleanField(String p0,boolean p1){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, qCurrentUser, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.ensureEditor();
       this.mEditor.putBoolean(p0, p1);
       return this;
    }
    public void updateBySystemStatResponse(p p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QCurrentUser.class, "171")) {
          return;
       }
       if (!TextUtils.isEmpty(p0.mOwnerId) && (p0.mOwnerId).equals(this.getId())) {
          this.mUserConfig = p0;
          this.setAllowMsg((p0.mMessageDeny ^ 0x01));
          this.setAllowComment((p0.mCommentDeny ^ 0x01));
          this.setAllowSave((p0.mDownloadDeny ^ 0x01));
          p mUserProfile = p0.mUserProfileBgUrl;
          if (mUserProfile != null) {
             this.setBackground(mUserProfile);
          }
          mUserProfile = p0.mUserProfileBgUrls;
          if (mUserProfile != null) {
             this.setBackgrounds(mUserProfile);
          }
          mUserProfile = p0.mOwnerName;
          if (mUserProfile != null) {
             this.setName(mUserProfile);
          }
          mUserProfile = p0.mOwnerSex;
          if (mUserProfile != null) {
             this.setSex(mUserProfile);
          }
          mUserProfile = p0.mOwnerHead;
          if (mUserProfile != null) {
             this.setAvatar(mUserProfile);
          }
          mUserProfile = p0.mOwnerHeads;
          if (mUserProfile != null) {
             this.setAvatars(mUserProfile);
          }
          mUserProfile = p0.mAvatarPendants;
          if (mUserProfile != null) {
             this.setPendants(mUserProfile);
             this.setPendantType(p0.mPendantType);
          }
       }
    label_006d :
       return;
    }
    public final QCurrentUser updateIntField(String p0,int p1){
       QCurrentUser qCurrentUser = QCurrentUser.class;
       if (PatchProxy.isSupport(qCurrentUser)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, qCurrentUser, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.ensureEditor();
       this.mEditor.putInt(p0, p1);
       return this;
    }
    public final QCurrentUser updateJsonField(String p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, QCurrentUser.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p1 = (p1 != null)? a.a.q(p1): "";
       return this.updateStringField(p0, p1);
    }
    public void updateSettingOption(UserSettingOption p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, QCurrentUser.class, "179")) {
          return;
       }
       this.setPrivate(p0.isPrivacyUser);
       this.setAllowMsg((p0.isMessageDenied ^ 0x01));
       this.setAllowComment((p0.isCommentDenied ^ 0x01));
       this.setAllowSave((p0.isDownloadDenied ^ 0x01));
       return;
    }
    public final QCurrentUser updateStringField(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, QCurrentUser.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.ensureEditor();
       this.mEditor.putString(p0, p1);
       if (this.enableUseCache != null && QCurrentUser.stringValueCache.contains(p0)) {
          QCurrentUser.stringValueCache.remove(p0);
       }
       return this;
    }
}
