package com.kuaishou.android.post.PostArguments;
import java.io.Serializable;
import nsd.u;
import java.lang.Object;
import com.kuaishou.android.post.StrArg;
import java.lang.String;
import com.kuaishou.android.post.BoolArg;
import com.kuaishou.android.post.AlbumTabArrayArg;
import com.kuaishou.android.post.OnceDataArg;
import com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.IntArg;
import com.kuaishou.android.post.LocationArg;
import com.kuaishou.android.post.MiniAppBusinessArg;
import com.kuaishou.android.post.PreselectMusicArg;
import com.kuaishou.android.post.HotspotArg;
import com.kuaishou.android.post.PostPageArg;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.IllegalArgumentException;
import lnc.p3;
import q87.c;
import android.content.Intent;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Boolean;
import java.util.Set;
import java.util.Map$Entry;
import android.os.Bundle;

public final class PostArguments implements Serializable	// class@000ea4
{
    public final StrArg activity;
    public final AlbumTabArrayArg albumTab;
    public final StrArg assistantModeSources;
    public final List b;
    public final Map c;
    public final SerialArg challengeStickerInfo;
    public final StrArg childMagicFaceId;
    public final BoolArg clipShowFullVideo;
    public final SerialArg customMagicInfo;
    public final Map d;
    public final StrArg defaultEditPreviewTab;
    public final BoolArg disableBannedAlert;
    public final BoolArg disableQuickPublish;
    public final BoolArg disableShareCaptionEdit;
    public final StrArg disableShareCaptionEditToast;
    public int e;
    public final SerialArg editAbilityConfig;
    public final SerialArg editQPhoto;
    public final StrArg editorCopyText;
    public final StrArg extActivityParams;
    public final IntArg flywheelTaskType;
    public final BoolArg fromThirdParty;
    public final BoolArg hideAICutEntrance;
    public final BoolArg hideSmartAlbumEntrance;
    public final HotspotArg hotspotParams;
    public final StrArg interactiveStickerForEdit;
    public final IntArg interactiveStickerType;
    public boolean isPublished;
    public final SerialArg jsGoToPostParam;
    public final MiniAppBusinessArg miniAppBusinessInfo;
    public final StrArg pageMonitorSource;
    public final PreselectMusicArg preSelectMusic;
    public final LocationArg publishLocation;
    public final StrArg selectedEffectId;
    public final StrArg serviceLinkInfo;
    public final StrArg shareInitCaption;
    public final SerialArg simpleEditParam;
    public final StrArg startEditorParam;
    public final SerialArg stickerParam;
    public final StrArg thirdPartyAppPackage;
    public final StrArg thirdPartyPubInfo;
    public final IntArg uploadMockFeedOption;
    public final BoolArg uploadNoSystemNotification;
    public final IntArg uploadPage;
    public final SerialArg uploadParamArg;
    public final IntArg uploadStrictMode;
    public final OnceDataArg whenGoHomeListenerKey;
    public final boolean writeable;

    public void PostArguments(){
       super(false, 1, null);
    }
    public void PostArguments(boolean p0){
       PostArguments postArgument = this;
       super();
       postArgument.writeable = p0;
       SerialArg obj = this;
       StrArg strArg = new StrArg("share_app_package", null, obj, false, 8, null);
       postArgument.thirdPartyAppPackage = v8;
       strArg = new StrArg("share_publish_info", null, obj, false, 8, null);
       postArgument.thirdPartyPubInfo = v9;
       BoolArg uBoolArg = new BoolArg("from_third_app", null, postArgument);
       postArgument.fromThirdParty = uBoolArg;
       BoolArg uBoolArg1 = new BoolArg("hide_album_ai_cut", "hideAICut", postArgument);
       postArgument.hideAICutEntrance = uBoolArg1;
       BoolArg uBoolArg2 = new BoolArg("hide_smart_album", "hideSmartAlbum", postArgument);
       postArgument.hideSmartAlbumEntrance = uBoolArg2;
       AlbumTabArrayArg uAlbumTabArr = new AlbumTabArrayArg("albumTabList", "albumTabList", postArgument);
       postArgument.albumTab = uAlbumTabArr;
       BoolArg uBoolArg3 = new BoolArg("show_clip_full_video", "showClipFullVideo", postArgument);
       postArgument.clipShowFullVideo = uBoolArg3;
       strArg = v6;
       StrArg strArg1 = v6;
       strArg = new StrArg("editor_copy_text", null, obj, false, 8, 0);
       postArgument.editorCopyText = strArg1;
       OnceDataArg onceDataArg = new OnceDataArg("when_go_home_listener_key", null, postArgument);
       postArgument.whenGoHomeListenerKey = onceDataArg;
       SerialArg serialArg = new SerialArg("stickerDetailInfo", null, postArgument);
       postArgument.stickerParam = serialArg;
       strArg = v4;
       StrArg strArg2 = v4;
       SerialArg serialArg1 = serialArg;
       OnceDataArg onceDataArg1 = onceDataArg;
       strArg = new StrArg("specialEffectIdUsed", "specialEffectIdUsed", obj, null, 8, null);
       StrArg strArg3 = strArg2;
       postArgument.selectedEffectId = strArg3;
       StrArg strArg4 = new StrArg("EDIT_STATR_PARAMETER", "startEditorParam", postArgument, true);
       postArgument.startEditorParam = strArg4;
       obj = new SerialArg("editAbilityConfig", "editAbilityConfig", postArgument);
       postArgument.editAbilityConfig = obj;
       SerialArg serialArg2 = new SerialArg("editSimpleParam", "editSimpleParam", postArgument);
       postArgument.simpleEditParam = serialArg2;
       SerialArg serialArg3 = new SerialArg("jsGoToPostParam", "jsGoToPostParam", postArgument);
       postArgument.jsGoToPostParam = serialArg3;
       StrArg strArg5 = strArg;
       SerialArg serialArg4 = serialArg3;
       SerialArg serialArg5 = serialArg2;
       SerialArg serialArg6 = obj;
       HotspotArg obj1 = this;
       StrArg strArg6 = strArg4;
       StrArg strArg7 = strArg3;
       strArg = new StrArg("defaultEditPreviewTab", "defaultEditPreviewTab", obj1, null, 8, 0);
       strArg3 = strArg5;
       postArgument.defaultEditPreviewTab = strArg3;
       serialArg = new SerialArg("key_custom_magic_info", null, postArgument);
       postArgument.customMagicInfo = serialArg;
       strArg = v4;
       StrArg strArg8 = v4;
       SerialArg serialArg7 = serialArg;
       strArg5 = strArg3;
       strArg = new StrArg("key_child_magic_id", null, obj1, null, 8, 0);
       strArg3 = strArg8;
       postArgument.childMagicFaceId = strArg3;
       serialArg = new SerialArg("edit_qphoto", null, postArgument);
       postArgument.editQPhoto = serialArg;
       StrArg strArg9 = new StrArg("interactive_sticker_data", null, postArgument, true);
       postArgument.interactiveStickerForEdit = strArg9;
       IntArg intArg = serialArg2;
       IntArg intArg1 = serialArg2;
       StrArg strArg10 = strArg9;
       SerialArg serialArg8 = serialArg;
       strArg8 = strArg3;
       intArg = new IntArg("interactive_sticker_type", null, this, null, 8, null);
       IntArg intArg2 = intArg1;
       postArgument.interactiveStickerType = intArg2;
       serialArg = new SerialArg("CHALLENGE_STICKER_INFO", null, postArgument);
       postArgument.challengeStickerInfo = serialArg;
       LocationArg locationArg = new LocationArg("location", "poiId", postArgument);
       postArgument.publishLocation = locationArg;
       super("share_initial_caption", "initialCaption", postArgument, true);
       postArgument.shareInitCaption = this;
       BoolArg uBoolArg4 = new BoolArg("disablePublishInfoEdit", "disablePublishInfoEdit", postArgument);
       postArgument.disableShareCaptionEdit = uBoolArg4;
       StrArg strArg11 = intArg;
       BoolArg uBoolArg5 = uBoolArg4;
       StrArg strArg12 = this;
       obj1 = this;
       LocationArg locationArg1 = locationArg;
       SerialArg serialArg9 = serialArg;
       IntArg intArg3 = intArg2;
       strArg = new StrArg("disablePublishInfoEditToastMessage", "disablePublishInfoEditToastMessage", obj1, null, 8, 0);
       strArg3 = strArg11;
       postArgument.disableShareCaptionEditToast = strArg3;
       serialArg = new SerialArg("whole_upload_params", null, postArgument);
       postArgument.uploadParamArg = serialArg;
       intArg = locationArg;
       IntArg intArg4 = locationArg;
       SerialArg serialArg10 = serialArg;
       strArg11 = strArg3;
       intArg = new IntArg("mock_feed_option", "mockFeedOption", obj1, null, 8, 0);
       intArg2 = intArg4;
       postArgument.uploadMockFeedOption = intArg2;
       intArg = serialArg;
       IntArg intArg5 = serialArg;
       IntArg intArg6 = intArg2;
       intArg = new IntArg("upload_restrict", "upload_restrict", obj1, false, 8, 0);
       intArg2 = intArg5;
       postArgument.uploadStrictMode = intArg2;
       BoolArg uBoolArg6 = new BoolArg("no_system_notification", "no_system_notification", postArgument);
       postArgument.uploadNoSystemNotification = uBoolArg6;
       intArg = locationArg;
       IntArg intArg7 = locationArg;
       BoolArg uBoolArg7 = uBoolArg6;
       intArg5 = intArg2;
       intArg = new IntArg("start_upload_page", "start_upload_page", obj1, null, 8, 0);
       intArg2 = intArg7;
       postArgument.uploadPage = intArg2;
       strArg = uBoolArg6;
       StrArg strArg13 = uBoolArg6;
       IntArg intArg8 = intArg2;
       strArg = new StrArg("serviceLinkData", "serviceLinkInfo", obj1, false, 8, null);
       strArg3 = strArg13;
       postArgument.serviceLinkInfo = strArg3;
       MiniAppBusinessArg miniAppBusin = new MiniAppBusinessArg("miniAppBusinessInfo", "appId", postArgument);
       postArgument.miniAppBusinessInfo = miniAppBusin;
       PreselectMusicArg preselectMus = new PreselectMusicArg("preSelectMusic", "preSelectMusic", postArgument);
       postArgument.preSelectMusic = preselectMus;
       obj1 = new HotspotArg("connect_hotspot", "hotspotParams", postArgument);
       postArgument.hotspotParams = obj1;
       BoolArg uBoolArg8 = new BoolArg("disableQuickPublish", "disableQuickPublish", postArgument);
       postArgument.disableQuickPublish = uBoolArg8;
       strArg = uBoolArg4;
       StrArg strArg14 = uBoolArg4;
       BoolArg uBoolArg9 = uBoolArg8;
       HotspotArg hotspotArg = obj1;
       PreselectMusicArg preselectMus1 = preselectMus;
       MiniAppBusinessArg miniAppBusin1 = miniAppBusin;
       StrArg strArg15 = strArg3;
       strArg = new StrArg("extActivityParams", "extActivityParams", this, null, 8, 0);
       strArg3 = strArg14;
       postArgument.extActivityParams = strArg3;
       IntArg intArg9 = new IntArg("entranceTaskType", "taskType", postArgument, true);
       postArgument.flywheelTaskType = intArg9;
       strArg = this;
       StrArg strArg16 = this;
       IntArg intArg10 = intArg9;
       StrArg strArg17 = strArg3;
       strArg = new StrArg("assistantModeSources", "assistantModeSources", this, null, 8, 0);
       strArg = strArg16;
       postArgument.assistantModeSources = strArg;
       StrArg strArg18 = new StrArg("page_monitor_source", "page_monitor_source", postArgument, true);
       postArgument.pageMonitorSource = strArg18;
       uBoolArg8 = new BoolArg("disableBannedAlert", "disableBannedAlert", postArgument);
       postArgument.disableBannedAlert = uBoolArg8;
       strArg9 = new StrArg("activity", "activity", postArgument, true);
       postArgument.activity = strArg9;
       PostPageArg[] postPageArgA = new PostPageArg[42];
       postPageArgA[0] = uBoolArg;
       postPageArgA[1] = v8;
       postPageArgA[2] = v9;
       postPageArgA[3] = uBoolArg3;
       postPageArgA[4] = uBoolArg1;
       postPageArgA[5] = uBoolArg2;
       postPageArgA[6] = strArg1;
       postPageArgA[7] = onceDataArg1;
       postPageArgA[8] = locationArg1;
       postPageArgA[9] = strArg12;
       postPageArgA[10] = uBoolArg5;
       postPageArgA[11] = strArg11;
       postPageArgA[12] = serialArg10;
       postPageArgA[13] = intArg6;
       postPageArgA[14] = intArg5;
       postPageArgA[15] = uBoolArg7;
       postPageArgA[16] = intArg8;
       postPageArgA[17] = uAlbumTabArr;
       postPageArgA[18] = strArg15;
       postPageArgA[19] = strArg7;
       postPageArgA[20] = strArg9;
       postPageArgA[21] = strArg6;
       postPageArgA[22] = serialArg1;
       postPageArgA[23] = miniAppBusin1;
       postPageArgA[24] = serialArg6;
       postPageArgA[25] = serialArg5;
       postPageArgA[26] = hotspotArg;
       postPageArgA[27] = preselectMus1;
       postPageArgA[28] = uBoolArg9;
       postPageArgA[29] = strArg17;
       postPageArgA[30] = serialArg4;
       postPageArgA[31] = strArg18;
       postPageArgA[32] = strArg5;
       postPageArgA[33] = strArg10;
       postPageArgA[34] = intArg3;
       postPageArgA[35] = serialArg9;
       postPageArgA[36] = intArg10;
       postPageArgA[37] = serialArg7;
       postPageArgA[38] = strArg8;
       postPageArgA[39] = serialArg8;
       postPageArgA[40] = strArg;
       postPageArgA[41] = uBoolArg8;
       List list = CollectionsKt__CollectionsKt.L(postPageArgA);
       postArgument.b = list;
       postArgument.c = new LinkedHashMap();
       postArgument.d = new LinkedHashMap();
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          PostPageArg postPageArg = iterator.next();
          postArgument.a(postArgument.c, postPageArg.getIntentKey(), postPageArg);
          String schemeJsKey = postPageArg.getSchemeJsKey();
          String str = (schemeJsKey == null || !schemeJsKey.length())? 1: null;
          if (!str) {
             postArgument.a(postArgument.d, postPageArg.getSchemeJsKey(), postPageArg);
          }
       }
       postArgument.fromThirdParty.setLiveWithSession(true);
       postArgument.thirdPartyAppPackage.setLiveWithSession(true);
       postArgument.thirdPartyPubInfo.setLiveWithSession(true);
       postArgument.e = -1;
       return;
    }
    public void PostArguments(boolean p0,int p1,u p2){
       if (p1 & 1) {
          p0 = true;
       }
       super(p0);
       return;
    }
    public final void a(Map p0,String p1,PostPageArg p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PostArguments.class, "4")) {
          return;
       }
       if (p0.containsKey(p1)) {
          PostUtils.D("PostArguments", "addToMap\(\)", new IllegalStateException("duplicate key="+p1));
          return;
       }else {
          p0.put(p1, p2);
          return;
       }
    }
    public final void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostArguments.class, "8")) {
          return;
       }
       StringBuilder str = (p1 == null || !p1.length())? 1: null;
       if (str) {
          PostUtils.D("PostArguments", "parseFromStr\(\)", new IllegalArgumentException("found a empty value "+p1));
          return;
       }else {
          PostPageArg postPageArg = this.d.get(p0);
          if (postPageArg == null) {
             p3.D().z("PostArguments", "parseFromStr\(\)", new IllegalArgumentException("cant find key "+p0));
             return;
          }else {
             postPageArg.readFromStr(p1);
             return;
          }
       }
    }
    public final AlbumTabArrayArg getAlbumTab(){
       return this.albumTab;
    }
    public final StrArg getAssistantModeSources(){
       return this.assistantModeSources;
    }
    public final SerialArg getChallengeStickerInfo(){
       return this.challengeStickerInfo;
    }
    public final StrArg getChildMagicFaceId(){
       return this.childMagicFaceId;
    }
    public final BoolArg getClipShowFullVideo(){
       return this.clipShowFullVideo;
    }
    public final SerialArg getCustomMagicInfo(){
       return this.customMagicInfo;
    }
    public final StrArg getDefaultEditPreviewTab(){
       return this.defaultEditPreviewTab;
    }
    public final BoolArg getDisableBannedAlert(){
       return this.disableBannedAlert;
    }
    public final BoolArg getDisableQuickPublish(){
       return this.disableQuickPublish;
    }
    public final BoolArg getDisableShareCaptionEdit(){
       return this.disableShareCaptionEdit;
    }
    public final StrArg getDisableShareCaptionEditToast(){
       return this.disableShareCaptionEditToast;
    }
    public final SerialArg getEditAbilityConfig(){
       return this.editAbilityConfig;
    }
    public final SerialArg getEditQPhoto(){
       return this.editQPhoto;
    }
    public final StrArg getEditorCopyText(){
       return this.editorCopyText;
    }
    public final StrArg getExtActivityParams(){
       return this.extActivityParams;
    }
    public final IntArg getFlywheelTaskType(){
       return this.flywheelTaskType;
    }
    public final BoolArg getFromThirdParty(){
       return this.fromThirdParty;
    }
    public final BoolArg getHideAICutEntrance(){
       return this.hideAICutEntrance;
    }
    public final BoolArg getHideSmartAlbumEntrance(){
       return this.hideSmartAlbumEntrance;
    }
    public final HotspotArg getHotspotParams(){
       return this.hotspotParams;
    }
    public final StrArg getInteractiveStickerForEdit(){
       return this.interactiveStickerForEdit;
    }
    public final IntArg getInteractiveStickerType(){
       return this.interactiveStickerType;
    }
    public final SerialArg getJsGoToPostParam(){
       return this.jsGoToPostParam;
    }
    public final MiniAppBusinessArg getMiniAppBusinessInfo(){
       return this.miniAppBusinessInfo;
    }
    public final StrArg getPageMonitorSource(){
       return this.pageMonitorSource;
    }
    public final PreselectMusicArg getPreSelectMusic(){
       return this.preSelectMusic;
    }
    public final LocationArg getPublishLocation(){
       return this.publishLocation;
    }
    public final StrArg getSelectedEffectId(){
       return this.selectedEffectId;
    }
    public final StrArg getServiceLinkInfo(){
       return this.serviceLinkInfo;
    }
    public final StrArg getShareInitCaption(){
       return this.shareInitCaption;
    }
    public final SerialArg getSimpleEditParam(){
       return this.simpleEditParam;
    }
    public final StrArg getStartEditorParam(){
       return this.startEditorParam;
    }
    public final SerialArg getStickerParam(){
       return this.stickerParam;
    }
    public final StrArg getThirdPartyAppPackage(){
       return this.thirdPartyAppPackage;
    }
    public final StrArg getThirdPartyPubInfo(){
       return this.thirdPartyPubInfo;
    }
    public final IntArg getUploadMockFeedOption(){
       return this.uploadMockFeedOption;
    }
    public final BoolArg getUploadNoSystemNotification(){
       return this.uploadNoSystemNotification;
    }
    public final IntArg getUploadPage(){
       return this.uploadPage;
    }
    public final SerialArg getUploadParamArg(){
       return this.uploadParamArg;
    }
    public final IntArg getUploadStrictMode(){
       return this.uploadStrictMode;
    }
    public final OnceDataArg getWhenGoHomeListenerKey(){
       return this.whenGoHomeListenerKey;
    }
    public final boolean getWriteable(){
       return this.writeable;
    }
    public final void onActivityCreate(Intent p0,int p1){
       if (PatchProxy.isSupport(PostArguments.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PostArguments.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       if (this.e < null) {
          this.e = p1;
       }
       Object[] objArray = new Object[0];
       p3.D().w("PostArguments", "onActivityCreate pageId="+p1+" firstPageId="+this.e, objArray);
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          PostPageArg postPageArg = iterator.next();
          if (PostPageArg.read$default(postPageArg, p0, 0, 2, null)) {
             postPageArg.initPageId(p1);
          }
       }
       return;
    }
    public final void onActivityDestroy(int p0){
       Integer pageId;
       if (PatchProxy.isSupport(PostArguments.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PostArguments.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("PostArguments", "onActivityDestroy pageId="+p0+' '+"isPublished="+this.isPublished+" firstPageId="+this.e, objArray);
       if (this.isPublished != null) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Integer obj1 = obj;
          pageId = obj1.getPageId();
          if (pageId != null && (pageId.intValue() == p0 && !obj1.getLiveWithSession())) {
             PostArguments te = this.e;
             obj1 = obj1.getPageId();
             if (obj1 == null || te != obj1.intValue()) {
                Object obj2 = 1;
             label_008f :
                if (obj1) {
                   uArrayList.add(obj);
                }
             }
          }
          obj1 = null;
          goto label_008f ;
       }
       Iterator iterator1 = uArrayList.iterator();
       while (iterator1.hasNext()) {
          iterator1.next().clear();
       }
       return;
    }
    public final void onNewIntent(Intent p0,int p1,boolean p2){
       Integer pageId;
       if (PatchProxy.isSupport(PostArguments.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, PostArguments.class, "2")) {
          return;
       }
       a.p(p0, "intent");
       Object[] objArray = new Object[0];
       p3.D().w("PostArguments", "onNewIntent pageId="+p1+", ignoreCheck:"+p2, objArray);
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          PostPageArg postPageArg = iterator.next();
          pageId = postPageArg.getPageId();
          if (pageId != null && pageId.intValue() == p1) {
             postPageArg.read(p0, p2);
          }
       }
       return;
    }
    public final void parseFromMap(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostArguments.class, "7")) {
          return;
       }
       if (p0 != null) {
          Iterator iterator = p0.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             this.b(key, uEntry.getValue());
          }
       }
       this.publishLocation.readFromMap(p0);
       this.miniAppBusinessInfo.readFromMap(p0);
       this.preSelectMusic.readFromMap(p0);
       this.hotspotParams.readFromMap(p0);
       return;
    }
    public final void setPublished(){
       if (PatchProxy.applyVoid(null, this, PostArguments.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("PostArguments", "setPublished\(\)", objArray);
       this.isPublished = true;
       return;
    }
    public final void write(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostArguments.class, "5")) {
          return;
       }
       a.p(p0, "intent");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (obj.hasValue()) {
             uArrayList.add(obj);
          }
       }
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          PostPageArg postPageArg = iterator.next();
          Object[] objArray = new Object[0];
          p3.D().w("PostArguments", "write\(\) "+postPageArg, objArray);
          postPageArg.writeIntent(p0);
       }
       return;
    }
    public final void write(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostArguments.class, "6")) {
          return;
       }
       a.p(p0, "bundle");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (obj.hasValue()) {
             uArrayList.add(obj);
          }
       }
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          PostPageArg postPageArg = iterator.next();
          Object[] objArray = new Object[0];
          p3.D().w("PostArguments", "write\(\) bundle "+postPageArg, objArray);
          postPageArg.writeBundle(p0);
       }
       return;
    }
}
