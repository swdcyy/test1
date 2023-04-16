package com.yxcorp.gifshow.util.resource.Category;
import boc.b;
import java.lang.Enum;
import com.yxcorp.gifshow.util.resource.Category$1;
import java.lang.String;
import com.yxcorp.gifshow.util.resource.Category$2;
import com.yxcorp.gifshow.util.resource.Category$3;
import com.yxcorp.gifshow.util.resource.Category$4;
import com.yxcorp.gifshow.util.resource.Category$5;
import com.yxcorp.gifshow.util.resource.Category$6;
import com.yxcorp.gifshow.util.resource.Category$7;
import com.yxcorp.gifshow.util.resource.Category$8;
import com.yxcorp.gifshow.util.resource.Category$9;
import com.yxcorp.gifshow.util.resource.Category$10;
import com.yxcorp.gifshow.util.resource.Category$11;
import com.yxcorp.gifshow.util.resource.Category$12;
import com.yxcorp.gifshow.util.resource.Category$13;
import com.yxcorp.gifshow.util.resource.Category$14;
import com.yxcorp.gifshow.util.resource.Category$15;
import com.yxcorp.gifshow.util.resource.Category$16;
import com.yxcorp.gifshow.util.resource.Category$17;
import com.yxcorp.gifshow.util.resource.Category$18;
import com.yxcorp.gifshow.util.resource.Category$19;
import com.yxcorp.gifshow.util.resource.Category$20;
import com.yxcorp.gifshow.util.resource.Category$21;
import com.yxcorp.gifshow.util.resource.Category$22;
import com.yxcorp.gifshow.util.resource.Category$23;
import com.yxcorp.gifshow.util.resource.Category$24;
import com.yxcorp.gifshow.util.resource.Category$25;
import com.yxcorp.gifshow.util.resource.Category$26;
import com.yxcorp.gifshow.util.resource.Category$27;
import java.lang.Class;
import java.lang.Object;
import boc.a;
import java.io.File;
import java.nio.charset.Charset;
import com.yxcorp.gifshow.util.u0;
import java.lang.StringBuilder;
import com.kuaishou.android.model.response.ConfigResponse;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import doc.a;
import com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse$ModelConfig$DiffInfo;
import java.util.Random;
import java.lang.System;
import com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse;
import wkd.b;
import j80.c;
import boc.b0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qfc.a;
import q87.c;

public abstract class Category extends Enum implements b	// class@000cc6
{
    public String mEventUrl;
    public int mInitUrlIndex;
    public String mResource;
    public int mRetryTimes;
    public long mStartDownloadTime;
    public static final Category[] $VALUES;
    public static final Category DENOISE_MODEL;
    public static final Category DIRTY_LENS;
    public static final Category EFFECT;
    public static final Category EMOJI;
    public static final Category EMOJI_TTF;
    public static final Category FACE_MAGIC_EFFECT;
    public static final Category FILTER_HOLDER;
    public static final Category GLASSES;
    public static final Category HIAI_MAGIC_EMOJI_TRACK_DATA;
    public static final Category HUAWEI_HIAI;
    public static final Category KBAR_MMU;
    public static final Category MAGIC_FINGER;
    public static final Category MAGIC_YCNN_ARYA_DRL_CC;
    public static final Category MAGIC_YCNN_KTP_LIVE_CHAT;
    public static final Category MAGIC_YCNN_PLAYER_HLS_ABR;
    public static final Category MAGIC_YCNN_PLAYER_MP4_ABR;
    public static final Category MAGIC_YCNN_RICKON_DRL_CC;
    public static final Category MAGIC_YCNN_RICKON_DUGU;
    public static final Category MAGIC_YCNN_SCENE;
    public static final Category MAGIC_YCNN_SKIN_COLOR_DETECTION_V2;
    public static final Category MESSAGE_EMOJI;
    public static final Category SCREENCAST_PATCH;
    public static final Category STICKER;
    public static final Category STORY_STICKER;
    public static final Category TEXT;
    public static final Category THEME;
    public static final Category VOICE_DETECT;

    static {
       Category$1 u1 = new Category$1("MAGIC_YCNN_KTP_LIVE_CHAT", 0, "magic_ycnn_ktp_live_chat", "ks://download_magic_ycnn_ktp_live_chat");
       Category.MAGIC_YCNN_KTP_LIVE_CHAT = u1;
       Category$2 u2 = new Category$2("MAGIC_YCNN_PLAYER_MP4_ABR", 1, "magic_ycnn_player_mp4_abr", "ks://download_magic_ycnn_player_mp4_abr");
       Category.MAGIC_YCNN_PLAYER_MP4_ABR = u2;
       Category$3 u3 = new Category$3("MAGIC_YCNN_PLAYER_HLS_ABR", 2, "magic_ycnn_player_hls_abr", "ks://download_magic_ycnn_player_hls_abr");
       Category.MAGIC_YCNN_PLAYER_HLS_ABR = u3;
       Category$4 u4 = new Category$4("MAGIC_YCNN_RICKON_DRL_CC", 3, "magic_ycnn_rickon_drl_cc", "ks://download_magic_ycnn_rickon_drl_cc");
       Category.MAGIC_YCNN_RICKON_DRL_CC = u4;
       Category$5 u5 = new Category$5("MAGIC_YCNN_RICKON_DUGU", 4, "magic_ycnn_rickon_dugu", "ks://download_magic_ycnn_rickon_dugu");
       Category.MAGIC_YCNN_RICKON_DUGU = u5;
       Category$6 u6 = new Category$6("MAGIC_YCNN_ARYA_DRL_CC", 5, "magic_ycnn_arya_drl_cc", "ks://download_magic_ycnn_arya_drl_cc");
       Category.MAGIC_YCNN_ARYA_DRL_CC = u6;
       Category$7 u7 = new Category$7("FILTER_HOLDER", 6, "filter_resource", "");
       Category.FILTER_HOLDER = u7;
       Category$8 u8 = new Category$8("THEME", 7, "theme_resource", "ks://download_theme_resource");
       Category.THEME = u8;
       Category$9 u9 = new Category$9("EFFECT", 8, "effect_resource", "ks://download_effect_resource");
       Category.EFFECT = u9;
       Category$10 u10 = new Category$10("FACE_MAGIC_EFFECT", 9, "editor_face_magic_effect_resource", "ks://download_face_magic_effect_resource");
       Category.FACE_MAGIC_EFFECT = u10;
       Category$11 u11 = new Category$11("MAGIC_FINGER", 10, "magic_finger_resource", "ks://download_magic_finger_resource");
       Category.MAGIC_FINGER = u11;
       Category$12 u12 = new Category$12("MAGIC_YCNN_SCENE", 11, "magic_ycnn_model_scene", "ks://download_magic_ycnn_model_scene");
       Category.MAGIC_YCNN_SCENE = u12;
       Category$12 u121 = u12;
       Category$13 u13 = new Category$13("MAGIC_YCNN_SKIN_COLOR_DETECTION_V2", 12, "magic_ycnn_beautify_model_skin_color", "ks://magic_ycnn_beautify_model_skin_color");
       Category.MAGIC_YCNN_SKIN_COLOR_DETECTION_V2 = u13;
       Category$13 u131 = u13;
       Category$14 u14 = new Category$14("KBAR_MMU", 13, "qrcode_mmu_model", "ks://download_kbar_mmu");
       Category.KBAR_MMU = u14;
       Category$14 u141 = u14;
       Category$15 u15 = new Category$15("EMOJI", 14, "emoji_resource", "ks://download_emoji_resource");
       Category.EMOJI = u15;
       Category$15 u151 = u15;
       Category$16 u16 = new Category$16("MESSAGE_EMOJI", 15, "message_emoji_resource", "ks://download_message_emoji_resource");
       Category.MESSAGE_EMOJI = u16;
       Category$16 u161 = u16;
       Category$17 u17 = new Category$17("EMOJI_TTF", 16, "emoji_ttf_resource", "ks://download_emoji_ttf_resource");
       Category.EMOJI_TTF = u17;
       Category$17 u171 = u17;
       Category$18 u18 = new Category$18("HUAWEI_HIAI", 17, "huawei_hiai", "ks://download_huawei_hiai");
       Category.HUAWEI_HIAI = u18;
       Category$18 u181 = u18;
       Category$19 u19 = new Category$19("HIAI_MAGIC_EMOJI_TRACK_DATA", 18, "hiai_magic_emoji_resource", "ks://download_hiai_magic_emoji_track_data_resource");
       Category.HIAI_MAGIC_EMOJI_TRACK_DATA = u19;
       Category$19 u191 = u19;
       Category$20 u20 = new Category$20("TEXT", 19, "text_resource", "ks://download_text_resource");
       Category.TEXT = u20;
       Category$20 u201 = u20;
       Category$21 u21 = new Category$21("STICKER", 20, "sticker_resource", "ks://download_sticker_resource");
       Category.STICKER = u21;
       Category$21 u211 = u21;
       Category$22 u22 = new Category$22("STORY_STICKER", 21, "story_sticker_resource", "ks://download_story_sticker_resource");
       Category.STORY_STICKER = u22;
       Category$22 u221 = u22;
       Category$23 u23 = new Category$23("GLASSES", 22, "resource", "ks://download_glasses_resource");
       Category.GLASSES = u23;
       Category$23 u231 = u23;
       Category$24 u24 = new Category$24("SCREENCAST_PATCH", 23, "screencast_patch", "ks://download_screencast_patch");
       Category.SCREENCAST_PATCH = u24;
       Category$24 u241 = u24;
       Category$25 u25 = new Category$25("DIRTY_LENS", 24, "dirtylens_resource", "ks://download_dirtylens_resource");
       Category.DIRTY_LENS = u25;
       Category$25 u251 = u25;
       Category$26 u26 = new Category$26("VOICE_DETECT", 25, "voice_detect", "ks://download_voice_detect");
       Category.VOICE_DETECT = u26;
       Category$26 u261 = u26;
       Category$27 u27 = new Category$27("DENOISE_MODEL", 26, "denoise_model", "ks://download_denoise_model");
       Category.DENOISE_MODEL = u27;
       Category[] uCategoryArr = new Category[27];
       uCategoryArr[0] = u1;
       uCategoryArr[1] = u2;
       uCategoryArr[2] = u3;
       uCategoryArr[3] = u4;
       uCategoryArr[4] = u5;
       uCategoryArr[5] = u6;
       uCategoryArr[6] = u7;
       uCategoryArr[7] = u8;
       uCategoryArr[8] = u9;
       uCategoryArr[9] = u10;
       uCategoryArr[10] = u11;
       uCategoryArr[11] = u121;
       uCategoryArr[12] = u131;
       uCategoryArr[13] = u141;
       uCategoryArr[14] = u151;
       uCategoryArr[15] = u161;
       uCategoryArr[16] = u171;
       uCategoryArr[17] = u181;
       uCategoryArr[18] = u191;
       uCategoryArr[19] = u201;
       uCategoryArr[20] = u211;
       uCategoryArr[21] = u221;
       uCategoryArr[22] = u231;
       uCategoryArr[23] = u241;
       uCategoryArr[24] = u251;
       uCategoryArr[25] = u261;
       uCategoryArr[26] = u27;
       Category.$VALUES = uCategoryArr;
    }
    public void Category(String p0,int p1,String p2,String p3){
       super(p0, p1);
       this.mResource = p2;
       this.mEventUrl = p3;
    }
    public void Category(String p0,int p1,String p2,String p3,Category$1 p4){
       super(p0, p1, p2, p3);
    }
    public static Category valueOf(String p0){
       return Enum.valueOf(Category.class, p0);
    }
    public static Category[] values(){
       return Category.$VALUES.clone();
    }
    public void a(){
       a.a(this);
    }
    public boolean b(File p0){
       return a.d(this, p0);
    }
    public void c(boolean p0){
       a.g(this, p0);
    }
    public boolean checkFileValid(){
       return true;
    }
    public String d(String p0){
       return a.c(this, p0);
    }
    public void e(boolean p0){
       a.i(this, p0);
    }
    public boolean f(){
       return a.f(this);
    }
    public Charset getCharset(){
       return u0.b();
    }
    public String getDownloadId(){
       return this.name()+"_"+this.mStartDownloadTime;
    }
    public abstract String getDownloadUrlSuffix(ConfigResponse p0);
    public String getEmojiSubPath(){
       return MagicEmojiResourceHelper.h(this.mResource);
    }
    public String getEventUrl(){
       return this.mEventUrl;
    }
    public YlabModelConfigResponse$ModelConfig$DiffInfo getIncrementalInfo(a p0){
       return a.b(this, p0);
    }
    public String getInitDownloadUrl(a p0){
       this.mRetryTimes = 0;
       int cdnCount = p0.getCdnCount(this.mResource);
       String str = "";
       if (!cdnCount) {
          return str;
       }
       this.mInitUrlIndex = new Random().nextInt(cdnCount);
       this.mStartDownloadTime = System.currentTimeMillis();
       if (p0 instanceof ConfigResponse) {
          return p0.addCdnPrefix(this.getDownloadUrlSuffix(p0), this.mInitUrlIndex);
       }
       if (p0 instanceof YlabModelConfigResponse) {
          return p0.getDownloadUrlSuffix(this.mResource, this.mInitUrlIndex);
       }
       return str;
    }
    public String getResourceDir(){
       return this.getUnzipDir();
    }
    public String getResourceName(){
       return this.mResource;
    }
    public String getRetryDownloadUrl(a p0){
       String str = "";
       if (p0 == null) {
          return str;
       }
       int i = this.mRetryTimes + 1;
       int cdnCount = p0.getCdnCount(this.mResource);
       if (i >= cdnCount) {
          return str;
       }
       i = (i + this.mInitUrlIndex) % cdnCount;
       if (i > cdnCount) {
          return str;
       }
       this.mRetryTimes = this.mRetryTimes + 1;
       if (p0 instanceof ConfigResponse) {
          return p0.addCdnPrefix(this.getDownloadUrlSuffix(p0), i);
       }
       if (p0 instanceof YlabModelConfigResponse) {
          return p0.getDownloadUrlSuffix(this.mResource, i);
       }
       return str;
    }
    public int getRetryTimes(){
       return this.mRetryTimes;
    }
    public String getUnzipDir(){
       String separator = File.separator;
       return b.a(-1504323719).k()+separator+this.mResource+separator;
    }
    public boolean isNeedUnzip(){
       return a.e(this);
    }
    public void markHaveDownloaded(String p0){
       a.h(this, p0);
    }
    public boolean needAddNoMediaFile(){
       return false;
    }
    public boolean needDownload(a p0){
       Object[] objArray1;
       String str = (p0 instanceof ConfigResponse)? this.d(this.getDownloadUrlSuffix(p0)): this.d(this.getInitDownloadUrl(p0));
       String str1 = b0.d(this.mResource);
       boolean b = true;
       if (!TextUtils.x(str) && !str.equals(str1)) {
          Object[] objArray = new Object[0];
          a.C().t("Category", this.name()+" newUniqueId: "+str, objArray);
          objArray1 = new Object[0];
          a.C().t("Category", this.name()+" oldUniqueId: "+str1, objArray1);
          return b;
       }else if(this.b(new File(this.getResourceDir()))){
          objArray1 = new Object[0];
          a.C().t("Category", this.name()+" resourceLose", objArray1);
          return b;
       }else {
          Object[] objArray2 = new Object[0];
          a.C().t("Category", this.name()+str+" == "+str1, objArray2);
          return 0;
       }
    }
    public boolean needRename(){
       return false;
    }
    public void removeOutdatedFiles(){
    }
    public boolean supportIncrementalDownload(a p0){
       return a.j(this, p0);
    }
    public String toString(){
       return this.mResource;
    }
    public boolean useYcnnModelConfig(){
       return a.k(this);
    }
}
