package com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.util.m0;
import ok.x;
import com.google.common.base.Suppliers;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import o56.c;
import o56.a;
import xf6.g;
import gq.a;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import q87.c;
import com.kwai.framework.abtest.f;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.EditAbilityConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.activity.GifshowActivity;
import p16.b;
import r16.d;
import java.lang.Class;
import lnc.x6;
import lnc.y6;
import xf6.l;
import w16.b;
import com.kwai.feature.post.api.feature.bridge.JsApplyRecordMusicParam;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import wba.p0;
import com.kwai.sdk.switchconfig.a;
import android.os.Build$VERSION;
import com.yxcorp.gifshow.model.config.ShowAlbum;
import com.yxcorp.utility.SystemUtil;
import lnc.p3;
import lnc.s6;
import com.kwai.social.config.utils.HoldoutConfigUtilKt;
import android.util.Pair;
import java.lang.Float;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.config.CoCreatorConfig;
import oa0.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import com.yxcorp.gifshow.util.PostExperimentUtils$a;
import java.lang.Enum;
import tkd.b;
import tkd.d;
import om6.i;
import java.lang.Runtime;
import rq.a;
import mca.a;
import com.yxcorp.utility.AbiUtil;
import cq.a;
import java.lang.Integer;
import h69.b;
import i69.f;
import com.yxcorp.gifshow.util.PostExperimentUtils$MusicPanelV2Param;
import fg6.a;
import com.google.gson.Gson;
import java.util.Locale;
import com.kuaishou.android.post.BoolArg;
import com.kuaishou.android.post.PostPageArg;
import lnc.a1;

public final class PostExperimentUtils	// class@001f19
{
    public static x a;

    static {
       PostExperimentUtils.a = Suppliers.a(m0.b);
    }
    public static boolean A(c p0){
       return PostExperimentUtils.D(p0);
    }
    public static boolean A0(){
       String str = "postEditNativeGetVideoDurationAnrOpt";
       if (!a.a().c()) {
          return f.a(str);
       }
       boolean i = g.X0();
       int i1 = 0;
       Object[] objArray = new Object[i1];
       a.D().w("PostExperimentUtils", "getVideoDurationFast getVideoDuratonFastEnable:"+i, objArray);
       if (!i) {
          i = f.a(str);
          Object[] objArray1 = new Object[i1];
          a.D().w("PostExperimentUtils", "getVideoDurationFast ab:"+i, objArray1);
          return i;
       }else if(g.X0() == 1){
          i1 = true;
       }
       return i1;
    }
    public static boolean A1(){
       return f.a("enableNewListAdr");
    }
    public static boolean B(boolean p0){
       p0 = (p0 || !TextUtils.x(EditAbilityConfig.enableEditorCode(i.g())))? true: false;
       return p0;
    }
    public static boolean B0(GifshowActivity p0){
       int i;
       if (!p0 instanceof b) {
          return true;
       }
       d uod = y6.r(d.class);
       if (uod == null) {
          return true;
       }
       if (!uod.lc(p0)) {
          return true;
       }
       if (PostExperimentUtils.D1()) {
          return true;
       }
       if (a.a().c()) {
          i = (l.c("KEY_ENABLE_AUTO_MUSIC_SWITCH", false))? 1: f.a("automusicswitch");
       }else {
          i = f.a("automusicswitch");
       }
       if (!i) {
          return true;
       }else {
          return false;
       }
    }
    public static boolean B1(b p0){
       JsApplyRecordMusicParam mExtraParam = p0.a.mExtraParam;
       if (mExtraParam != null) {
          String str = "isLowActiveAutoApplyMusic";
          if (mExtraParam.e0(str) != null && mExtraParam.e0(str).d()) {
             mExtraParam = 1;
          label_001d :
             if (!PostExperimentUtils.e0()) {
                return true;
             }else if(PostExperimentUtils.e0() && mExtraParam){
                return false;
             }else {
                return true;
             }
          }
       }
       mExtraParam = 0;
       goto label_001d ;
    }
    public static boolean C(){
       int i = 0;
       int i1 = f.f("textInteractionUpgradeclick", i);
       int i2 = g.R();
       if (a.a().c()) {
          if (i2 == 3) {
             if (i1 == 1 || i1 == 2) {
             label_001e :
                i = true;
             }
          }else if(i2){
             goto label_001e ;
          }
       }else if(i1 == 1 || i1 == 2){
          goto label_001e ;
       }
       return PostExperimentUtils.B(i);
    }
    public static boolean C0(){
       return f.a("previewfunction");
    }
    public static boolean C1(){
       boolean b = (PostExperimentUtils.e0() != 2)? true: false;
       return b;
    }
    public static boolean D(c p0){
       if (p0 == null) {
          return PostExperimentUtils.C();
       }
       Workspace$Type type = p0.a1();
       Workspace$Source source = p0.T0();
       boolean b = (PostExperimentUtils.C() && (type != Workspace$Type.VIDEO || (!p0.a(source) && (type != Workspace$Type.KTV_MV && type != Workspace$Type.KTV_SONG))))? true: false;
       return PostExperimentUtils.B(b);
    }
    public static int D0(){
       return f.e("previewline");
    }
    public static boolean D1(){
       return a.t().d("disableAutoSelectMusic", false);
    }
    public static boolean E(){
       boolean b = (PostExperimentUtils.C() && PostExperimentUtils.H())? true: false;
       return b;
    }
    public static boolean E0(){
       if (!a.d() || !g.m1()) {
          return f.a("modelbubble");
       }
       boolean b = true;
       if (g.m1() != b) {
          b = false;
       }
       return b;
    }
    public static boolean F(c p0){
       boolean b = (PostExperimentUtils.D(p0) && PostExperimentUtils.I(p0))? true: false;
       return b;
    }
    public static boolean F0(){
       if (!a.d() || !g.m1()) {
          return f.a("albumbubble");
       }
       boolean b = true;
       if (g.m1() != b) {
          b = false;
       }
       return b;
    }
    public static boolean G(boolean p0){
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PostExperimentUtils", "enableNewV3Text enableNewV3Text:"+p0, objArray);
       if (PostExperimentUtils.C() && (PostExperimentUtils.H() && p0)) {
          i = true;
       }
    label_002c :
       return i;
    }
    public static boolean G0(){
       return f.a("albumstyleupdate");
    }
    public static boolean H(){
       boolean b = f.a("texttempletestyle");
       int i = l.e("KEY_ENABLE_NEW_TEXT_V3", 2);
       int i1 = 0;
       Object[] objArray = new Object[i1];
       a.D().w("PostExperimentUtils", "enableNewV3Text expConfig:"+b+",testConfig:"+i, objArray);
       if (!a.a().c()) {
          return b;
       }
       if (i == 2) {
          return b;
       }
       if (i == 1) {
          i1 = true;
       }
       return i1;
    }
    public static boolean H0(){
       return l.c("ax2c", true);
    }
    public static boolean I(c p0){
       if (p0 == null) {
          return PostExperimentUtils.H();
       }
       Workspace$Type type = p0.a1();
       Workspace$Source source = p0.T0();
       boolean b = (PostExperimentUtils.H() && (type != Workspace$Type.VIDEO || (!p0.a(source) && (type != Workspace$Type.KTV_MV && (type != Workspace$Type.KTV_SONG && (type != Workspace$Type.SINGLE_PICTURE && (type != Workspace$Type.ATLAS && (type != Workspace$Type.LONG_PICTURE && type != Workspace$Type.PHOTO_MOVIE))))))))? true: false;
       return b;
    }
    public static boolean I0(){
       String str = "backgroundPostAdr";
       if (!a.a().c()) {
          return f.a(str);
       }
       if (!g.k()) {
          return f.a(str);
       }
       boolean b = true;
       if (g.k() == b) {
          b = false;
       }
       return b;
    }
    public static boolean J(){
       int i = 0;
       if (Build$VERSION.SDK_INT < 23) {
          Object[] objArray = new Object[i];
          a.D().w("PostExperimentUtils", "enablePictureRecreationEntrance low 6.0 entrance: false", objArray);
          return i;
       }else {
          String str = "picture_forward_Ard";
          if (!a.a().c()) {
             return f.a(str);
          }
          if (!g.S()) {
             return f.a(str);
          }
          if (g.S() == 2) {
             i = true;
          }
          return i;
       }
    }
    public static boolean J0(){
       int i = 0;
       if (a.t().a("fixUploadCompleteCallBack", i) > 0) {
          i = true;
       }
       return i;
    }
    public static boolean K(){
       boolean b = false;
       if (!a.a().c()) {
          return a.t().d("enableSDKRequestPoi", b);
       }
       if (l.c("enableSDKRequestPoi", b) || a.t().d("enableSDKRequestPoi", b)) {
          b = true;
       }
       return b;
    }
    public static boolean K0(){
       return PostExperimentUtils.q1();
    }
    public static boolean L(){
       boolean b = false;
       if (!a.a().c()) {
          return a.t().d("enablePostEditAnrGovernance", b);
       }
       if (l.c("KEY_ENABLE_POST_EDIT_ANR_GOVERNANCE", b) || a.t().d("enablePostEditAnrGovernance", b)) {
          b = true;
       }
       return b;
    }
    public static boolean L0(){
       String str = "aICutStyleLyric4adr";
       if (!a.a().c()) {
          return f.a(str);
       }
       if (!g.w()) {
          return f.a(str);
       }
       boolean b = true;
       if (g.w() == b) {
          b = false;
       }
       return b;
    }
    public static boolean M(){
       boolean b = false;
       if (!a.a().c()) {
          return a.t().d("enablePostEditSdkLogAsync", b);
       }
       if (l.c("KEY_ENABLE_POST_EDIT_SDK_LOG_ASYNC", b) || a.t().d("enablePostEditSdkLogAsync", b)) {
          b = true;
       }
       return b;
    }
    public static boolean M0(){
       if (!a.a().c() || !g.x()) {
          return f.a("enableMusicBeatCutting4adr");
       }
       boolean b = true;
       if (g.x() != b) {
          b = false;
       }
       return b;
    }
    public static boolean N(){
       boolean b = (PostExperimentUtils.u0() > 0)? true: false;
       return b;
    }
    public static boolean N0(){
       boolean b = true;
       String str = (g.o1() && l.c("key_enable_album_three_column", false))? 1: null;
       if (!str && !f.d("albumLayout")) {
          b = false;
       }
       return b;
    }
    public static boolean O(){
       String str = "visibleDurationDisplay";
       if (!a.a().c()) {
          return f.a(str);
       }
       if (!g.V()) {
          return f.a(str);
       }
       boolean b = true;
       if (g.V() != b) {
          b = false;
       }
       return b;
    }
    public static boolean O0(ShowAlbum p0){
       boolean b = true;
       if (SystemUtil.K() && (a.d() && g.b())) {
          return b;
       }
       if (p0 == null || p0.mEnableAlbumTool == null) {
          b = false;
       }
       return b;
    }
    public static boolean P(){
       if (!a.a().c()) {
          return f.d("enableRecoMusicTagAdr");
       }
       boolean b = false;
       if (l.c("key_enable_reco_music_reason", b) || f.d("enableRecoMusicTagAdr")) {
          b = true;
       }
       return b;
    }
    public static boolean P0(){
       if (!a.a().c()) {
          return f.a("useTemplate");
       }
       int i = 0;
       int i1 = l.e("key_kuaishan_enable_background_media_scene", i);
       if (i1 == 1) {
          return i;
       }
       if (i1 != 2) {
          return f.a("useTemplate");
       }
       return true;
    }
    public static boolean Q(){
       boolean b = true;
       if (a.a().c() && l.c("key_enable_record_audio", false)) {
          return b;
       }
       if (!f.a("audiobtn") || PostExperimentUtils.v0() <= 0) {
          b = false;
       }
       return b;
    }
    public static boolean Q0(){
       return f.a("enableCapeEncodeAndr");
    }
    public static boolean R(){
       boolean b = (PostExperimentUtils.w0())? true: false;
       return b;
    }
    public static boolean R0(){
       if (a.a().c()) {
          return l.c("key_enable_clip_opti", false);
       }
       return f.a("androidOptiClipThumbnail");
    }
    public static boolean S(){
       boolean b = true;
       if (f.e("produceKuaiyingIconUpdate") == b) {
       }else {
          b = false;
       }
       return b;
    }
    public static boolean S0(){
       if (!a.a().c()) {
          return f.a("EnableDetectKuaishanVideo");
       }
       boolean b = false;
       if (l.c("key_kuaishan_enable_detect", b) || f.a("EnableDetectKuaishanVideo")) {
          b = true;
       }
       return b;
    }
    public static boolean T(){
       boolean b = true;
       if (f.e("produceM2UIconUpdate") == b) {
       }else {
          b = false;
       }
       return b;
    }
    public static boolean T0(){
       return f.a("enableDynamicEncodeTypeAndr");
    }
    public static boolean U(){
       if (!a.d()) {
          return f.a("editReplaceOpt");
       }
       boolean b = false;
       if (l.c("key_enable_edit_replace_unify", b) || f.a("editReplaceOpt")) {
          b = true;
       }
       return b;
    }
    public static boolean U0(){
       boolean b = false;
       if (!a.a().c()) {
          return a.t().d("enablePartiallyFriendVisible", b);
       }
       if (l.c("part_friend_privacy", b) || a.t().d("enablePartiallyFriendVisible", b)) {
          b = true;
       }
       return b;
    }
    public static boolean V(){
       if (a.a().c() && l.c("enableShootAssistanceOpt", false)) {
          return true;
       }
       return f.a("enableShootAssistanceOpt");
    }
    public static boolean V0(){
       if (!a.a().c()) {
          return f.a("editAddButtonOpt");
       }
       if (l.c("KEY_EDIT_ADD_BUTTON_OPT", false)) {
          return true;
       }
       return f.a("editAddButtonOpt");
    }
    public static boolean W(){
       if (a.a().c() && l.c("enableShootGesture", false)) {
          return true;
       }
       return f.a("enableShootGesture");
    }
    public static boolean W0(){
       if (!a.a().c()) {
          return f.a("prodEditProgressBar");
       }
       if (l.c("KEY_ENABLE_EDIT_PROGRESS_BAR", false)) {
          return true;
       }
       return f.a("prodEditProgressBar");
    }
    public static boolean X(){
       boolean b = false;
       if (l.c("KEY_STICKER_DEFAULT_TIME", b) || f.d("stickerDefaultTimeAdr")) {
          b = true;
       }
       return b;
    }
    public static boolean X0(){
       return a.t().d("ks_audio_player_anr_fix", false);
    }
    public static boolean Y(){
       boolean b;
       String str = "takePhotoToEditOptimization";
       int i = 0;
       if (a.a().c()) {
          int i1 = l.e(str, i);
          b = true;
          if (i1 != b) {
             b = (i1 != 2)? a.t().d(str, i): false;
          }
       }else {
          b = a.t().d(str, i);
       }
       Object[] objArray = new Object[i];
       p3.D().w("PostExperimentUtils", "拍照进编辑耗时优化实验:"+b, objArray);
       return b;
    }
    public static boolean Y0(){
       String str = "longPictureOpt";
       if (!a.a().c()) {
          return f.a(str);
       }
       if (!g.H()) {
          return f.a(str);
       }
       boolean b = true;
       if (g.H() != b) {
          b = false;
       }
       return b;
    }
    public static boolean Z(){
       boolean b = false;
       if (PostExperimentUtils.H()) {
          return b;
       }
       if (PostExperimentUtils.w()) {
          return b;
       }
       int i = f.f("textInteractionUpgradeclick", b);
       int i1 = g.R();
       if (a.a().c()) {
          if (i1 == 3) {
             if (i == 1) {
                b = true;
             }
             return b;
          }else if(i1 == 1){
             b = true;
          }
          return b;
       }else if(i == 1){
          b = true;
       }
       return b;
    }
    public static boolean Z0(){
       if (!a.a().c()) {
          return f.a("enableNewMagicIcon");
       }
       boolean b = false;
       if (l.c("KEY_ENABLE_NEW_MAGIC_ICON", b) || f.a("enableNewMagicIcon")) {
          b = true;
       }
       return b;
    }
    public static boolean a(){
       String str = "autoCopyWritingOpt";
       if (!a.a().c()) {
          return f.a(str);
       }
       if (!g.A0()) {
          return f.a(str);
       }
       boolean b = true;
       if (g.A0() == b) {
          b = false;
       }
       return b;
    }
    public static boolean a0(){
       if (!a.a().c()) {
          return f.a("KuaiShanReturn");
       }
       boolean b = false;
       if (l.c("key_enable_template_navi_back_to_album", b) || f.a("KuaiShanReturn")) {
          b = true;
       }
       return b;
    }
    public static boolean a1(){
       return s6.B();
    }
    public static int b(){
       int i = (HoldoutConfigUtilKt.a())? 0: 2;
       return i;
    }
    public static boolean b0(){
       String str = "enableTextContentRecommendAdr";
       if (!a.a().c()) {
          return f.d(str);
       }
       if (!g.Z()) {
          return f.d(str);
       }
       boolean b = true;
       if (g.Z() == b) {
          b = false;
       }
       return b;
    }
    public static boolean b1(){
       String str = "previewShadowOpt";
       if (!a.a().c()) {
          return f.a(str);
       }
       if (!g.U()) {
          return f.a(str);
       }
       boolean b = true;
       if (g.U() != b) {
          b = false;
       }
       return b;
    }
    public static boolean c(){
       return a.t().d("edit_linear_bitmap_container_optimize", false);
    }
    public static boolean c0(){
       String str = "enableCustomCover";
       boolean b = false;
       if (!a.a().c()) {
          return a.t().d(str, b);
       }
       if (!g.b0()) {
          return a.t().d(str, b);
       }
       if (g.b0() != 1) {
          b = true;
       }
       return b;
    }
    public static boolean c1(){
       return f.a("video_pic");
    }
    public static boolean d(){
       boolean b = true;
       boolean b1 = (Build$VERSION.SDK_INT > 22)? true: false;
       if (a.a().c()) {
          if (!b1 || (!g.a() && !f.a("enableProducePicTitleAdr"))) {
             b = false;
          }
          return b;
       }else if(b1 && f.a("enableProducePicTitleAdr")){
          b = false;
       }
       return b;
    }
    public static Pair d0(){
       String str = "";
       String str1 = a.t().c("musicPointKeyParams", str);
       try{
          String[] stringArray = str1.split(",");
          return new Pair(Float.valueOf(stringArray[0]), Float.valueOf(stringArray[1]));
       }catch(java.lang.Exception e0){
          PostUtils.D("PostExperimentUtils", str, e0);
          return new Pair(Float.valueOf(0x3fa00000), Float.valueOf(2.50f));
       }
    }
    public static boolean d1(){
       if (!a.a().c()) {
          return f.a("body_picture2");
       }
       boolean b = true;
       if (g.g() == b) {
          return b;
       }
       if (g.g() == 2) {
          return false;
       }
       return f.a("body_picture2");
    }
    public static boolean e(){
       return PostExperimentUtils.a.get().booleanValue();
    }
    public static int e0(){
       if (a.a().c()) {
          if (!g.l()) {
             return f.f("bringRecommendMusicToEditLevel", 0);
          }
          return g.l();
       }else {
          Object[] objArray = new Object[0];
          a.D().w("PostExperimentUtils", "bringRecommendMusicToEditLevel is:"+f.f("bringRecommendMusicToEditLevel", 0), objArray);
          return f.f("bringRecommendMusicToEditLevel", 0);
       }
    }
    public static boolean e1(){
       if (!a.a().c()) {
          return a.t().d("enableTemplateMusicUpgrade", false);
       }
       if (l.c("KEY_ENABLE_TEMPLATE_MUSIC_UPGRADE", false)) {
          return true;
       }
       return a.t().d("enableTemplateMusicUpgrade", false);
    }
    public static boolean f(){
       if (!a.a().c()) {
          return f.a("enableAlbumPreviewNextShow4adr");
       }
       boolean b = false;
       if (l.c("key_post_album_preview_next_show", b) || f.a("enableAlbumPreviewNextShow4adr")) {
          b = true;
       }
       return b;
    }
    public static long f0(){
       if (a.a().c() && g.m() > 0) {
          return g.m();
       }
       return a.t().b("mp4_byte_stream_upload_size_kb", 0);
    }
    public static boolean f1(){
       int i = 0;
       if (a.t().a("fixUploadCompleteCallBack", i) == 2) {
          i = true;
       }
       return i;
    }
    public static boolean g(){
       return f.a("albumclassify");
    }
    public static CoCreatorConfig g0(){
       CoCreatorConfig uCoCreatorCo;
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PostExperimentUtils", "getCoCreateInfo\(\) debug="+g.M0(), objArray);
       boolean b = true;
       if (g.M0() == b) {
          return new CoCreatorConfig();
       }
       String str = "每个用户每月最多共创4次哦";
       int i1 = 2;
       if (g.M0() == i1) {
          uCoCreatorCo = new CoCreatorConfig();
          uCoCreatorCo.mShowCoCreateEntrance = b;
          uCoCreatorCo.mCoCreateTimesQuota = i1;
          uCoCreatorCo.mCoCreateTimeAlertText = str;
          return uCoCreatorCo;
       }else if(g.M0() == 3){
          uCoCreatorCo = new CoCreatorConfig();
          uCoCreatorCo.mShowCoCreateEntrance = b;
          uCoCreatorCo.mCoCreateTimesQuota = i;
          uCoCreatorCo.mCoCreateTimeAlertText = str;
          return uCoCreatorCo;
       }else {
          uCoCreatorCo = CoCreatorConfig.class;
          String str1 = a.a.getString("coCreateInfo", "null");
          uCoCreatorCo = (str1 == null || str1 == "")? null: b.a(str1, uCoCreatorCo);
          Object[] objArray1 = new Object[i];
          a.D().w("PostExperimentUtils", "getCoCreateInfo\(\) "+uCoCreatorCo, objArray1);
          if (uCoCreatorCo == null) {
             uCoCreatorCo = new CoCreatorConfig();
          }
          return uCoCreatorCo;
       }
    }
    public static boolean g1(){
       if (a.a().c() && l.c("key_follow_shoot_use_cache", false)) {
          return true;
       }
       return f.a("FollowShootUseCache");
    }
    public static boolean h(){
       boolean b = (PostExperimentUtils.f0() > 0)? true: false;
       return b;
    }
    public static String h0(Workspace$Type p0,boolean p1){
       if (p1) {
          return f.b("enableEditPageFeatureReorderVideoAdr", String.class, "");
       }
       switch (PostExperimentUtils$a.a[p0.ordinal()]){
           case 1:
           case 2:
             return f.b("enableEditPageFeatureReorderVideoAdr", String.class, "");
           case 3:
             return f.b("enableEditPageFeatureReorderSinglePicAdr", String.class, "");
           case 4:
           case 5:
             return f.b("enableEditPageFeatureReorderLongAndMultiPicAdr", String.class, "");
           case 6:
           case 7:
             return f.b("enableEditPageFeatureReorderAutoVideoAdr", String.class, "");
           case 8:
             return f.b("enableEditPageFeatureReorderPicFilmAdr", String.class, "");
           default:
             return "";
       }
    }
    public static boolean h1(){
       boolean b = (PostExperimentUtils.j0() == 2)? true: false;
       return b;
    }
    public static boolean i(){
       if (!a.a().c() || !g.C()) {
          return f.a("enableCoverSize43");
       }
       boolean b = (g.C() == 2)? true: false;
       return b;
    }
    public static int i0(){
       if (!a.a().c()) {
          return f.e("editMusicOpt");
       }
       if (!g.q()) {
          return f.e("editMusicOpt");
       }
       return g.q();
    }
    public static boolean i1(){
       String str = "canvasOpt";
       if (!a.a().c()) {
          return f.a(str);
       }
       if (!g.g0()) {
          return f.a(str);
       }
       boolean b = true;
       if (g.g0() != b) {
          b = false;
       }
       return b;
    }
    public static boolean j(){
       if (a.a().c() && l.c("KEY_COVER_TEXT_BUBBLE_AND_STICKER_NAME", false)) {
          return true;
       }
       return false;
    }
    public static int j0(){
       int i = f.f("PopupPageStyle", 0);
       if (i && (i != 1 && i != 2)) {
          return 0;
       }
       return i;
    }
    public static boolean j1(){
       boolean b = (!f.e("enableLastUsedTextAdr"))? true: false;
       return b;
    }
    public static boolean k(){
       if (!a.a().c()) {
          return f.d("enableDraftRemindAdr");
       }
       boolean b = false;
       if (l.c("key_enable_draft_remind_bubble", b) || f.d("enableDraftRemindAdr")) {
          b = true;
       }
       return b;
    }
    public static int k0(){
       int i = l.e("record_pic_draft_tab", 0);
       if (i) {
          return i;
       }
       if (d.a(-1304126307).rI()) {
          return 1;
       }
       return f.e("graphicShootingTab");
    }
    public static boolean k1(){
       boolean b;
       Object[] objArray;
       String str = "post_edit_load_project_anr_opt";
       int i = 0;
       if (a.a().c()) {
          if (!g.m0()) {
             b = f.a(str);
             objArray = new Object[i];
             a.D().w("PostExperimentUtils", "isLoadProjectOpt test online:"+b, objArray);
             return b;
          }else {
             b = g.m0();
             Object[] objArray1 = new Object[i];
             a.D().w("PostExperimentUtils", "isLoadProjectOpt test result:"+b, objArray1);
             if (b != 1) {
                i = true;
             }
             return i;
          }
       }else {
          b = f.a(str);
          objArray = new Object[i];
          a.D().w("PostExperimentUtils", "isLoadProjectOpt online:"+b, objArray);
          return b;
       }
    }
    public static boolean l(){
       boolean b = l.c("KEY_ENABLE_EDIT_PUBLISH_TEST_CASE", false);
       Object[] objArray = new Object[false];
       a.D().w("PostExperimentUtils", "enableEditPublishTestCase result:"+b, objArray);
       return b;
    }
    public static int l0(){
       if (a.a().c()) {
          if (l.c("key_enable_import_music_duration_kswitch", true)) {
             return a.t().a("ImportMusicDurationLongestLimit", 900);
          }else if(g.h0() > 0){
             return g.h0();
          }
       }
       return a.t().a("ImportMusicDurationLongestLimit", 900);
    }
    public static boolean l1(){
       int i = 0;
       Runtime runtime = Runtime.getRuntime();
       long l = runtime.maxMemory();
       long l1 = l - (runtime.totalMemory() - runtime.freeMemory());
       Object[] objArray = new Object[i];
       a.D().s("PostExperimentUtils", "free memory: "+(l1 / 0x100000), objArray);
       long l2 = (l - 0x20000000 >= 0)? 0x1900000: 0xf00000;
       if (SystemUtil.K()) {
          PostUtils.x("PostisLowMemory", l1+","+l2);
       }
       if (l1 - l2 < 0) {
          i = true;
       }
       return i;
    }
    public static boolean m(){
       return a.t().d("editToShareCostOpt", false);
    }
    public static int m0(){
       if (a.a().c() && g.j0() != 3) {
          return g.j0();
       }
       return f.e("kuaishanRecently");
    }
    public static boolean m1(){
       boolean b = (PostExperimentUtils.i0() == 2)? true: false;
       return b;
    }
    public static boolean n(){
       return f.a("hidePanelCloseButton");
    }
    public static int n0(){
       if (!a.a().c()) {
          return f.f("editFrameChange", 2);
       }
       if (g.k0() == 4) {
          return f.f("editFrameChange", 2);
       }
       return g.k0();
    }
    public static boolean n1(String p0){
       Object[] objArray;
       int i = 0;
       if (a.a().c() && g.k1()) {
          objArray = new Object[i];
          a.D().w("PostExperimentUtils", "isPhotoRelayEnable test channel:"+p0, objArray);
          return true;
       }else {
          String str = a.i();
          objArray = new Object[i];
          a.D().w("PostExperimentUtils", "isPhotoRelayEnable test value:"+str+",entrance:"+p0, objArray);
          return str.contains(p0);
       }
    }
    public static boolean o(){
       boolean b = true;
       if (PostExperimentUtils.m0() != b && PostExperimentUtils.m0() != 2) {
          b = false;
       }
       return b;
    }
    public static int o0(){
       return f.f("magicfaceScrollNumber", 0);
    }
    public static boolean o1(String p0){
       String str = a.j();
       Object[] objArray = new Object[0];
       a.D().w("PostExperimentUtils", "isPhotoRelayEnableNew test value:"+str+",entrance:"+p0, objArray);
       return str.contains(p0);
    }
    public static boolean p(){
       return f.d("magicFaceRename");
    }
    public static int p0(){
       return f.e("forward_music_button");
    }
    public static boolean p1(){
       String str = "PostExperimentUtils";
       int i = 0;
       if (!a.x()) {
          Object[] objArray = new Object[i];
          a.D().w(str, "isPicturePlayer isImageClipkitParam not open", objArray);
          return i;
       }else {
          int i1 = l.e("KEY_ENABLE_PICTURE_PLAYER", i);
          boolean b = a.t().d("atlasPlayerRender", i);
          Object[] objArray1 = new Object[i];
          a.D().w(str, "isPicturePlayer testConfig:"+i1+",ab:"+b, objArray1);
          if (!a.a().c()) {
             return b;
          }
          if (!i1) {
             return b;
          }
          if (i1 == 1) {
             i = true;
          }
          return i;
       }
    }
    public static boolean q(){
       String str = "Int_bac";
       if (!a.a().c()) {
          return f.a(str);
       }
       if (!g.L()) {
          return f.a(str);
       }
       boolean b = true;
       if (g.L() == b) {
          b = false;
       }
       return b;
    }
    public static int q0(){
       if (a.a().c() && g.u0() != 3) {
          return g.u0();
       }
       int i = 0;
       int i1 = f.f("musicboxsearchstyle", i);
       if (i1 < 0 || i1 > 2) {
          Object[] objArray = new Object[i];
          a.D().w("PostExperimentUtils", "getMusicSearchEntranceStyle style incorrect :"+i1, objArray);
       }else {
          i = i1;
       }
       return i;
    }
    public static boolean q1(){
       return AbiUtil.b();
    }
    public static boolean r(){
       String str = "textUpdateFontBG";
       if (!a.a().c()) {
          return f.a(str);
       }
       if (!g.M()) {
          return f.a(str);
       }
       boolean b = true;
       if (g.M() == b) {
          b = false;
       }
       return b;
    }
    public static int r0(){
       if (!a.a().c()) {
          return f.e("enablePhotoMovieBeats");
       }
       if (g.x0() > 0) {
          return (g.x0() - 1);
       }
       return f.e("enablePhotoMovieBeats");
    }
    public static boolean r1(){
       if (a.a().c() && l.c("key_same_frame_use_h265", false)) {
          return true;
       }
       return f.a("SameFrameUse265");
    }
    public static boolean s(){
       String str = "enableFrontCoverTab";
       if (!a.a().c()) {
          return f.a(str);
       }
       if (!g.N()) {
          return f.a(str);
       }
       boolean b = true;
       if (g.N() == b) {
          b = false;
       }
       return b;
    }
    public static boolean s0(){
       boolean b = a.t().d("PhotoPublishEncodeApi", true);
       Object[] objArray = new Object[0];
       a.D().w("PostExperimentUtils", "getPhotoPublishEncodeApi result:"+b, objArray);
       return b;
    }
    public static boolean s1(){
       if (!a.d() || !g.m1()) {
          return f.a("updateone");
       }
       boolean b = true;
       if (g.m1() != b) {
          b = false;
       }
       return b;
    }
    public static boolean t(){
       boolean b = true;
       if (PostExperimentUtils.i0() != b && PostExperimentUtils.i0() != 2) {
          b = false;
       }
       return b;
    }
    public static int t0(){
       int i;
       if (HoldoutConfigUtilKt.a()) {
          return 0;
       }
       if (i.h() && i.m().z("camera_page_source") == Integer.valueOf(20)) {
          return 2;
       }
       i = -873393519;
       if (d.a(i).getProject() != null && d.a(i).getProject().isAnnualAlbum()) {
          return 0;
       }
       return 2;
    }
    public static boolean t1(){
       boolean b = true;
       if (a.a().c()) {
          if (g.V0() == 2) {
             if (!f.f("enableTextTemplateUpdateAdr", 0)) {
                b = false;
             }
             return b;
          }else if(g.V0()){
             b = false;
          }
          return b;
       }else if(f.f("enableTextTemplateUpdateAdr", 0)){
          b = false;
       }
       return b;
    }
    public static boolean u(){
       boolean b = (PostExperimentUtils.q0())? true: false;
       return b;
    }
    public static int u0(){
       if (!a.d()) {
          return f.e("postDiskClearStrategy");
       }
       int i = l.e("key_post_disk_clear_strategy", 0);
       if (i > 0) {
          return (i - 1);
       }
       return f.e("postDiskClearStrategy");
    }
    public static boolean u1(){
       boolean b = true;
       if (a.a().c()) {
          if (g.W0() == 2) {
             if (f.f("enableTextTemplateEnterOptimize", 0)) {
                b = false;
             }
             return b;
          }else if(!g.W0()){
             b = false;
          }
          return b;
       }else if(!f.f("enableTextTemplateEnterOptimize", 0)){
          b = false;
       }
       return b;
    }
    public static boolean v(){
       if (!a.a().c()) {
          return f.a("MusicTemplate1");
       }
       boolean b = false;
       if (l.c("KEY_ENABLE_MUSIC_TEMPLATE", b) || f.a("MusicTemplate1")) {
          b = true;
       }
       return b;
    }
    public static int v0(){
       if (a.a().c() && g.H0()) {
          return g.H0();
       }
       return a.t().a("cameraDeviceOffset", 0);
    }
    public static boolean v1(String p0){
       Object[] objArray;
       int i = 0;
       if (a.a().c() && g.k1()) {
          objArray = new Object[i];
          a.D().w("PostExperimentUtils", "isVideoRelayEnable test channel:"+p0, objArray);
          return true;
       }else {
          String str = a.t().c("PostKuaiYingRelayOpenParam", "");
          objArray = new Object[i];
          a.D().w("PostExperimentUtils", "isVideoRelayEnable test value:"+str+",entrance:"+p0, objArray);
          return str.contains(p0);
       }
    }
    public static boolean w(){
       boolean b = false;
       if (!PostExperimentUtils.z()) {
          return b;
       }
       String str = "stickerinteraction";
       if (!a.a().c()) {
          return f.a(str);
       }
       if (!g.Q()) {
          return f.a(str);
       }
       if (g.Q() != 1) {
          b = true;
       }
       return b;
    }
    public static int w0(){
       if (a.a().c() && g.I0() != -1) {
          return g.I0();
       }
       int i = 0;
       int i1 = f.f("guide_mode_android", i);
       if (i1 >= 0 && i1 <= 5) {
          i = i1;
       }
       return i;
    }
    public static boolean w1(String p0){
       String str = a.h();
       Object[] objArray = new Object[0];
       a.D().w("PostExperimentUtils", "isVideoRelayEnableNew test value:"+str+",entrance:"+p0, objArray);
       return str.contains(p0);
    }
    public static boolean x(c p0){
       if (!PostExperimentUtils.A(p0)) {
          return false;
       }
       return PostExperimentUtils.w();
    }
    public static int x0(){
       if (!a.a().c()) {
          return f.e("multiselectbtn");
       }
       if (g.Q0() < 4) {
          return g.Q0();
       }
       return f.e("multiselectbtn");
    }
    public static PostExperimentUtils$MusicPanelV2Param x1(){
       String str = a.t().c("MusicPanelV2Param", "");
       a uoa = a.D();
       String str1 = "musicPanelV2Param paramString:"+str;
       Object[] objArray = new Object[0];
       try{
          uoa.w("PostExperimentUtils", str1, objArray);
          PostExperimentUtils$MusicPanelV2Param musicPanelV2 = a.a.h(str, PostExperimentUtils$MusicPanelV2Param.class);
          if (musicPanelV2 != null) {
             return musicPanelV2;
          }
          return new PostExperimentUtils$MusicPanelV2Param();
       }catch(java.lang.Exception e0){
          return new PostExperimentUtils$MusicPanelV2Param();
       }
    }
    public static boolean y(c p0){
       boolean b = (PostExperimentUtils.D(p0) && !PostExperimentUtils.I(p0))? true: false;
       return b;
    }
    public static int y0(){
       if (!a.a().c()) {
          return f.e("takePicEdit");
       }
       if (g.S0() == 3) {
          return f.e("takePicEdit");
       }
       return g.S0();
    }
    public static boolean y1(){
       boolean b = false;
       if (!(Locale.getDefault().getLanguage()).equals("zh")) {
          return b;
       }
       if (i.g().getDisableShareCaptionEdit().get(Boolean.FALSE).booleanValue()) {
          return b;
       }
       if (a.a().c()) {
          if (g.z0() > 0) {
             if ((g.z0() - 1) > 0) {
                b = true;
             }
             return b;
          }else if(f.e("autoCopywriting") > 0 || PostExperimentUtils.a()){
             b = true;
          }
          return b;
       }else if(f.e("autoCopywriting") > 0 || PostExperimentUtils.a()){
          b = true;
       }
       return b;
    }
    public static boolean z(){
       return PostExperimentUtils.C();
    }
    public static String z0(){
       return a1.p(0x7f100b4f);
    }
    public static boolean z1(){
       return f.a("duet_with_creator");
    }
}
