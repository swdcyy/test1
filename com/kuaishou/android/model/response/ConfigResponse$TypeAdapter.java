package com.kuaishou.android.model.response.ConfigResponse$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.response.ConfigResponse;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.response.LiveRetryConfig;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$j;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class ConfigResponse$TypeAdapter extends TypeAdapter	// class@000e92
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       ConfigResponse$TypeAdapter.d = a.get(ConfigResponse.class);
    }
    public void ConfigResponse$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
       this.c = p0.j(a.get(LiveRetryConfig.class));
    }
    public ConfigResponse a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ConfigResponse$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       ConfigResponse uConfigRespo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uConfigRespo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uConfigRespo;
       }else {
          p0.c();
          ConfigResponse uConfigRespo1 = new ConfigResponse();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x87fd548a:
                   if (str.equals("auto_origin_name_on")) {
                      i = 0;
                   }
                   break;
                 case 0x88d5a1a2:
                   if (str.equals("allowBaiduPlusErised")) {
                      i = 1;
                   }
                   break;
                 case 0x8cec7449:
                   if (str.equals("magic_finger_resource_v2")) {
                      i = 2;
                   }
                   break;
                 case 0x903d3c73:
                   if (str.equals("upload_contacts_interval")) {
                      i = 3;
                   }
                   break;
                 case 0x957bb2c0:
                   if (str.equals("editor_face_magic_effect_resource_v1")) {
                      i = 4;
                   }
                   break;
                 case 0x9591d29f:
                   if (str.equals("effect_resource_v2")) {
                      i = 5;
                   }
                   break;
                 case 0x985522b1:
                   if (str.equals("lowDelayConfig")) {
                      i = 6;
                   }
                   break;
                 case 0xa8f04e58:
                   if (str.equals("splash_game_resource_v2")) {
                      i = 7;
                   }
                   break;
                 case 0xa929be5e:
                   if (str.equals("dirtylens_resource_v2")) {
                      i = 8;
                   }
                   break;
                 case 0xb33262c0:
                   if (str.equals("prefixes")) {
                      i = 9;
                   }
                   break;
                 case 0xb6a08de8:
                   if (str.equals("kbar_model_v1")) {
                      i = 10;
                   }
                   break;
                 case 0xb6db3256:
                   if (str.equals("kwaiMusicianPlanLogoUrl")) {
                      i = 11;
                   }
                   break;
                 case 0xc180d43a:
                   if (str.equals("text_resource_v1")) {
                      i = 12;
                   }
                   break;
                 case 0xca3363e7:
                   if (str.equals("emoji_resource")) {
                      i = 13;
                   }
                   break;
                 case 0xccca004d:
                   if (str.equals("sticker_resource_v4")) {
                      i = 14;
                   }
                   break;
                 case 0xd84ec79c:
                   if (str.equals("message_emoji_resource_v2")) {
                      i = 15;
                   }
                   break;
                 case 0xdcbd49e8:
                   if (str.equals("screencast_patch_v3")) {
                      i = 16;
                   }
                   break;
                 case 0xe12ece49:
                   if (str.equals("defaultResource_v14")) {
                      i = 17;
                   }
                   break;
                 case 0xea8dafc0:
                   if (str.equals("progress_abtest_probability_v2")) {
                      i = 18;
                   }
                   break;
                 case 0x32b0ec:
                   if (str.equals("live")) {
                      i = 19;
                   }
                   break;
                 case 0xd6dfad7:
                   if (str.equals("theme_resource_v2")) {
                      i = 20;
                   }
                   break;
                 case 0x101db7fa:
                   if (str.equals("origin_name_on")) {
                      i = 21;
                   }
                   break;
                 case 0x1dbc4d3b:
                   if (str.equals("session_timeout_duration")) {
                      i = 22;
                   }
                   break;
                 case 0x1e88924f:
                   if (str.equals("hiai_magic_emoji_resource")) {
                      i = 23;
                   }
                   break;
                 case 0x21a3b15a:
                   if (str.equals("voice_detect_mode_v1_1")) {
                      i = 24;
                   }
                   break;
                 case 0x2a29bb31:
                   if (str.equals("new_security_app_package_names")) {
                      i = 25;
                   }
                   break;
                 case 0x30f88d7b:
                   if (str.equals("emoji_ttf_resource_v2")) {
                      i = 26;
                   }
                   break;
                 case 0x31810c41:
                   if (str.equals("huawei_hiai")) {
                      i = 27;
                   }
                   break;
                 case 0x438afecd:
                   if (str.equals("filter_resource_v12")) {
                      i = 28;
                   }
                   break;
                 case 0x556ba0ba:
                   if (str.equals("glasses_resource_v4")) {
                      i = 29;
                   }
                   break;
                 case 0x55a88a92:
                   if (str.equals("karaoke_denoise_model_v1")) {
                      i = 30;
                   }
                   break;
                 case 0x5b9a7a01:
                   if (str.equals("story_sticker_resource_v2")) {
                      i = 31;
                   }
                   break;
                 case 0x6a4aa0c7:
                   if (str.equals("new_upload_contacts_percentage")) {
                      i = 32;
                   }
                   break;
                 case 0x6e223f14:
                   if (str.equals("bufferTimeSizeMs")) {
                      i = 33;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uConfigRespo1.mAutoOriginNameOn = KnownTypeAdapters$g.a(p0, uConfigRespo1.mAutoOriginNameOn);
                   break;
                 case 1:
                   uConfigRespo1.mAllowBaiduPlusErised = KnownTypeAdapters$g.a(p0, uConfigRespo1.mAllowBaiduPlusErised);
                   break;
                 case 2:
                   uConfigRespo1.mMagicFingerResource = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uConfigRespo1.mUploadContactsInterval = KnownTypeAdapters$n.a(p0, uConfigRespo1.mUploadContactsInterval);
                   break;
                 case 4:
                   uConfigRespo1.mFaceMagicEffectResource = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   uConfigRespo1.mEffectResource = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uConfigRespo1.mLiveLowDelayConfig = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   uConfigRespo1.mSplashGameResource = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   uConfigRespo1.mDirtylensResource = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   uConfigRespo1.mUrlPrefixes = this.b.read(p0);
                   break;
                 case 10:
                   uConfigRespo1.mKbarMmuModel = TypeAdapters.A.read(p0);
                   break;
                 case 11:
                   uConfigRespo1.mMusicianPlanLogoUrl = TypeAdapters.A.read(p0);
                   break;
                 case 12:
                   uConfigRespo1.mTextResource = TypeAdapters.A.read(p0);
                   break;
                 case 13:
                   uConfigRespo1.mEmojiResource = TypeAdapters.A.read(p0);
                   break;
                 case 14:
                   uConfigRespo1.mStickerResource = TypeAdapters.A.read(p0);
                   break;
                 case 15:
                   uConfigRespo1.mMessageEmojiResource = TypeAdapters.A.read(p0);
                   break;
                 case 16:
                   uConfigRespo1.mScreencastPatch = TypeAdapters.A.read(p0);
                   break;
                 case 17:
                   uConfigRespo1.mDefaultResource = TypeAdapters.A.read(p0);
                   break;
                 case 18:
                   uConfigRespo1.mDetailLoadingABTestProbability = KnownTypeAdapters$j.a(p0, uConfigRespo1.mDetailLoadingABTestProbability);
                   break;
                 case 19:
                   uConfigRespo1.mLiveRetryConfig = this.c.read(p0);
                   break;
                 case 20:
                   uConfigRespo1.mThemeResource = TypeAdapters.A.read(p0);
                   break;
                 case 21:
                   uConfigRespo1.mOriginNameOn = KnownTypeAdapters$g.a(p0, uConfigRespo1.mOriginNameOn);
                   break;
                 case 22:
                   uConfigRespo1.mSessionTimeoutDuration = KnownTypeAdapters$k.a(p0, uConfigRespo1.mSessionTimeoutDuration);
                   break;
                 case 23:
                   uConfigRespo1.mHiaiMagicEmojiResource = TypeAdapters.A.read(p0);
                   break;
                 case 24:
                   uConfigRespo1.mVoiceDetectMode = TypeAdapters.A.read(p0);
                   break;
                 case 25:
                   uConfigRespo1.mSecurityAppPackageNames = this.b.read(p0);
                   break;
                 case 26:
                   uConfigRespo1.mEmojiTTFResource = TypeAdapters.A.read(p0);
                   break;
                 case 27:
                   uConfigRespo1.mHuaweiHiai = TypeAdapters.A.read(p0);
                   break;
                 case 28:
                   uConfigRespo1.mFilterResource = TypeAdapters.A.read(p0);
                   break;
                 case 29:
                   uConfigRespo1.mGlassesResource = TypeAdapters.A.read(p0);
                   break;
                 case 30:
                   uConfigRespo1.mDeNoiseMode = TypeAdapters.A.read(p0);
                   break;
                 case 31:
                   uConfigRespo1.mStoryStickerResource = TypeAdapters.A.read(p0);
                   break;
                 case 32:
                   uConfigRespo1.mUploadContactsPercentage = KnownTypeAdapters$j.a(p0, uConfigRespo1.mUploadContactsPercentage);
                   break;
                 case '!':
                   uConfigRespo1.mBufferTimeSizeMs = KnownTypeAdapters$k.a(p0, uConfigRespo1.mBufferTimeSizeMs);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uConfigRespo1;
       }
    }
    public void b(b p0,ConfigResponse p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ConfigResponse$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mUrlPrefixes != null) {
             p0.r("prefixes");
             this.b.write(p0, p1.mUrlPrefixes);
          }
          if (p1.mSecurityAppPackageNames != null) {
             p0.r("new_security_app_package_names");
             this.b.write(p0, p1.mSecurityAppPackageNames);
          }
          p0.r("origin_name_on");
          p0.P(p1.mOriginNameOn);
          p0.r("auto_origin_name_on");
          p0.P(p1.mAutoOriginNameOn);
          p0.r("upload_contacts_interval");
          p0.K(p1.mUploadContactsInterval);
          p0.r("new_upload_contacts_percentage");
          p0.J((double)p1.mUploadContactsPercentage);
          if (p1.mDefaultResource != null) {
             p0.r("defaultResource_v14");
             TypeAdapters.A.write(p0, p1.mDefaultResource);
          }
          if (p1.mGlassesResource != null) {
             p0.r("glasses_resource_v4");
             TypeAdapters.A.write(p0, p1.mGlassesResource);
          }
          if (p1.mEmojiResource != null) {
             p0.r("emoji_resource");
             TypeAdapters.A.write(p0, p1.mEmojiResource);
          }
          if (p1.mMessageEmojiResource != null) {
             p0.r("message_emoji_resource_v2");
             TypeAdapters.A.write(p0, p1.mMessageEmojiResource);
          }
          if (p1.mEmojiTTFResource != null) {
             p0.r("emoji_ttf_resource_v2");
             TypeAdapters.A.write(p0, p1.mEmojiTTFResource);
          }
          p0.r("allowBaiduPlusErised");
          p0.P(p1.mAllowBaiduPlusErised);
          p0.r("progress_abtest_probability_v2");
          p0.J((double)p1.mDetailLoadingABTestProbability);
          p0.r("session_timeout_duration");
          p0.K((long)p1.mSessionTimeoutDuration);
          p0.r("bufferTimeSizeMs");
          p0.K((long)p1.mBufferTimeSizeMs);
          if (p1.mLiveLowDelayConfig != null) {
             p0.r("lowDelayConfig");
             TypeAdapters.A.write(p0, p1.mLiveLowDelayConfig);
          }
          if (p1.mLiveRetryConfig != null) {
             p0.r("live");
             this.c.write(p0, p1.mLiveRetryConfig);
          }
          if (p1.mKbarMmuModel != null) {
             p0.r("kbar_model_v1");
             TypeAdapters.A.write(p0, p1.mKbarMmuModel);
          }
          if (p1.mHuaweiHiai != null) {
             p0.r("huawei_hiai");
             TypeAdapters.A.write(p0, p1.mHuaweiHiai);
          }
          if (p1.mHiaiMagicEmojiResource != null) {
             p0.r("hiai_magic_emoji_resource");
             TypeAdapters.A.write(p0, p1.mHiaiMagicEmojiResource);
          }
          if (p1.mStickerResource != null) {
             p0.r("sticker_resource_v4");
             TypeAdapters.A.write(p0, p1.mStickerResource);
          }
          if (p1.mTextResource != null) {
             p0.r("text_resource_v1");
             TypeAdapters.A.write(p0, p1.mTextResource);
          }
          if (p1.mStoryStickerResource != null) {
             p0.r("story_sticker_resource_v2");
             TypeAdapters.A.write(p0, p1.mStoryStickerResource);
          }
          if (p1.mFilterResource != null) {
             p0.r("filter_resource_v12");
             TypeAdapters.A.write(p0, p1.mFilterResource);
          }
          if (p1.mThemeResource != null) {
             p0.r("theme_resource_v2");
             TypeAdapters.A.write(p0, p1.mThemeResource);
          }
          if (p1.mEffectResource != null) {
             p0.r("effect_resource_v2");
             TypeAdapters.A.write(p0, p1.mEffectResource);
          }
          if (p1.mFaceMagicEffectResource != null) {
             p0.r("editor_face_magic_effect_resource_v1");
             TypeAdapters.A.write(p0, p1.mFaceMagicEffectResource);
          }
          if (p1.mMagicFingerResource != null) {
             p0.r("magic_finger_resource_v2");
             TypeAdapters.A.write(p0, p1.mMagicFingerResource);
          }
          if (p1.mSplashGameResource != null) {
             p0.r("splash_game_resource_v2");
             TypeAdapters.A.write(p0, p1.mSplashGameResource);
          }
          if (p1.mMusicianPlanLogoUrl != null) {
             p0.r("kwaiMusicianPlanLogoUrl");
             TypeAdapters.A.write(p0, p1.mMusicianPlanLogoUrl);
          }
          if (p1.mScreencastPatch != null) {
             p0.r("screencast_patch_v3");
             TypeAdapters.A.write(p0, p1.mScreencastPatch);
          }
          if (p1.mDirtylensResource != null) {
             p0.r("dirtylens_resource_v2");
             TypeAdapters.A.write(p0, p1.mDirtylensResource);
          }
          if (p1.mVoiceDetectMode != null) {
             p0.r("voice_detect_mode_v1_1");
             TypeAdapters.A.write(p0, p1.mVoiceDetectMode);
          }
          if (p1.mDeNoiseMode != null) {
             p0.r("karaoke_denoise_model_v1");
             TypeAdapters.A.write(p0, p1.mDeNoiseMode);
          }
          p0.j();
          return;
       }
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
