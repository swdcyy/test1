package com.kwai.component.misc.report.ReportActivity;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import java.lang.String;
import com.kwai.component.misc.report.ReportInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.net.Uri;
import ekd.w0;
import android.net.Uri$Builder;
import com.yxcorp.utility.SystemUtil;
import xf6.h;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import android.os.Parcelable;
import org.parceler.b;
import com.yxcorp.gifshow.webview.c;
import android.content.res.Resources;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import com.google.gson.JsonObject;
import ekd.x0;
import fg6.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import android.os.SystemClock;
import java.lang.System;
import java.lang.Exception;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;

public class ReportActivity extends KwaiWebViewActivity	// class@0009d5
{

    public void ReportActivity(){
       super();
    }
    public static String O3(String p0,ReportInfo p1){
       ReportInfo obj = PatchProxy.applyTwoRefs(p0, p1, null, ReportActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Uri$Builder uBuilder = w0.f(p0).buildUpon();
       if (SystemUtil.K() && !TextUtils.x(h.h())) {
          uBuilder.authority(h.h());
       }
       uBuilder.appendQueryParameter("refer", TextUtils.I(p1.mRefer));
       uBuilder.appendQueryParameter("prerefer", TextUtils.I(p1.mPreRefer)).appendQueryParameter("reportType", TextUtils.I(p1.mReportType)).appendQueryParameter("sourceType", TextUtils.I(p1.mSourceType)).appendQueryParameter("voicePartyId", TextUtils.I(p1.mVoicePartyId)).appendQueryParameter("reportSource", TextUtils.I(p1.mReportSource)).appendQueryParameter("negativeSource", TextUtils.I(p1.mNegativeSource));
       obj = p1.mSourceType;
       Objects.requireNonNull(obj);
       int i = -1;
       switch (obj.hashCode()){
           case 0x86e31720:
             if (obj.equals("moment_comment")) {
                i = 0;
             }
             break;
           case 0xc04f8200:
             if (obj.equals("moment")) {
                i = 1;
             }
             break;
           case 0xef2346f1:
             if (obj.equals("public_group_message")) {
                i = 2;
             }
             break;
           case 3107:
             if (obj.equals("ad")) {
                i = 3;
             }
             break;
           case 0x32b0ec:
             if (obj.equals("live")) {
                i = 4;
             }
             break;
           case 0x36ebcb:
             if (obj.equals("user")) {
                i = 5;
             }
             break;
           case 0x5e0f67f:
             if (obj.equals("group")) {
                i = 6;
             }
             break;
           case 0x65b3e32:
             if (obj.equals("photo")) {
                i = 7;
             }
             break;
           case 0x339bd929:
             if (obj.equals("public_group")) {
                i = 8;
             }
             break;
           case 0x38a5ee5f:
             if (obj.equals("comment")) {
                i = 9;
             }
             break;
           case 0x38eb0007:
             if (obj.equals("message")) {
                i = 10;
             }
             break;
           case 0x3a26ea04:
             if (obj.equals("audience")) {
                i = 11;
             }
             break;
           case 0x3bf8ae47:
             if (obj.equals("group_message")) {
                i = 12;
             }
             break;
           case 0x47abe0c5:
             if (obj.equals("live_guest")) {
                i = 13;
             }
             break;
           default:
       }
    label_013c :
       String str = "momentId";
       String str1 = "groupId";
       switch (i){
           case 0:
             uBuilder.appendQueryParameter(str, p1.mMomentId);
             uBuilder.appendQueryParameter("commentId", p1.mMomentCommentId);
             break;
           case 1:
             uBuilder.appendQueryParameter(str, p1.mMomentId);
             break;
           case 2:
           case 12:
             uBuilder.appendQueryParameter("messageId", p1.mMessageId);
             uBuilder.appendQueryParameter("reportedUserId", p1.mReportedUserId).appendQueryParameter("imSubbiz", p1.mIMSubbiz).appendQueryParameter(str1, p1.mGroupId).appendQueryParameter("messageType", String.valueOf(p1.mMessageType));
             break;
           case 3:
             uBuilder.appendQueryParameter("exp_tag", TextUtils.I(p1.mExpTag));
             uBuilder.appendQueryParameter("photoId", p1.mPhotoId);
             break;
           case 4:
             uBuilder.appendQueryParameter("liveStreamId", p1.mLiveId);
             uBuilder.appendQueryParameter("source", String.valueOf(p1.mSource));
             uBuilder.appendQueryParameter("reportedUserId", p1.mReportedUserId);
             break;
           case 5:
             uBuilder.appendQueryParameter("reportedUserId", p1.mReportedUserId);
             uBuilder.appendQueryParameter("exp_tag", TextUtils.I(p1.mExpTag)).appendQueryParameter("user_id", TextUtils.I(QCurrentUser.me().getId())).appendQueryParameter("liveStreamId", TextUtils.I(p1.mLiveId));
             break;
           case 6:
           case 8:
             uBuilder.appendQueryParameter(str1, p1.mGroupId);
             uBuilder.appendQueryParameter("imSubbiz", p1.mIMSubbiz);
             break;
           case 7:
             uBuilder.appendQueryParameter("exp_tag", TextUtils.I(p1.mExpTag));
             uBuilder.appendQueryParameter("photoId", p1.mPhotoId).appendQueryParameter("reportedUserId", TextUtils.I(p1.mReportedUserId));
             break;
           case 9:
             uBuilder.appendQueryParameter("commentId", p1.mCommentId);
             uBuilder.appendQueryParameter("photoId", p1.mPhotoId);
             break;
           case 10:
             uBuilder.appendQueryParameter("messageId", p1.mMessageId);
             uBuilder.appendQueryParameter("reportedUserId", p1.mReportedUserId).appendQueryParameter("imSubbiz", p1.mIMSubbiz).appendQueryParameter("imReportSource", p1.mImReportSource);
             break;
           case 11:
             uBuilder.appendQueryParameter("liveStreamId", p1.mLiveId);
             uBuilder.appendQueryParameter("reportedUserId", p1.mReportedUserId);
             break;
           case 13:
             uBuilder.appendQueryParameter("liveStreamId", p1.mLiveId);
             uBuilder.appendQueryParameter("reportedUserId", p1.mReportedUserId);
             break;
           default:
       }
       return uBuilder.build().toString();
    }
    public static void P3(Context p0,String p1,ReportInfo p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, ReportActivity.class, "1")) {
          return;
       }
       Intent intent = KwaiWebViewActivity.M3(p0, ReportActivity.class, ReportActivity.O3(p1, p2)).a();
       intent.putExtra("key_photo", b.c(p2.mPhoto));
       c.i(p0, intent);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ReportActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://report";
    }
    public void onCreate(Bundle p0){
       ReportActivity reportActivi = ReportActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, reportActivi, "2")) {
          return;
       }
       try{
          Intent intent = this.getIntent();
          JsonObject jsonObject = JsonObject.class;
          if (!PatchProxy.applyVoidOneRefs(intent, this, reportActivi, "3")) {
             Uri data = intent.getData();
             Gson a = a.a;
             JsonObject jsonObject1 = a.h(x0.a(data, "info"), jsonObject);
             JsonElement jsonElement = jsonObject1.e0("momentId");
             JsonElement jsonElement1 = jsonObject1.e0("commentId");
             String str = x0.a(data, "sourceType");
             ReportInfo reportInfo = new ReportInfo();
             if (jsonElement != null) {
                reportInfo.mMomentId = jsonElement.w();
             }
             if (jsonElement1 != null) {
                reportInfo.mMomentCommentId = jsonElement1.w();
             }
             jsonObject = a.h(x0.a(data, "eventInfo"), jsonObject);
             reportInfo.mRefer = jsonObject.e0("refer").w();
             reportInfo.mPreRefer = jsonObject.e0("prerefer").w();
             reportInfo.mSourceType = str;
             intent.putExtra("key_photo", b.c(reportInfo.mPhoto));
             intent.addFlags(0x10000000);
             intent.putExtra("userIntentRealTime", SystemClock.elapsedRealtime());
             intent.putExtra("userIntentTimestamp", System.currentTimeMillis());
             this.setIntent(KwaiWebViewActivity.M3(this, reportActivi, ReportActivity.O3(WebEntryUrls.k, reportInfo)).a());
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       BaseFeed uBaseFeed = b.a(this.getIntent().getParcelableExtra("key_photo"));
       if (uBaseFeed != null) {
          this.I3("key_qphoto", new QPhoto(uBaseFeed));
       }
       super.onCreate(p0);
       return;
    }
}
