package com.yxcorp.gifshow.postwork.w;
import hn5.c0;
import java.lang.Object;
import f0c.n0;
import r26.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import java.util.Objects;
import android.util.SparseArray;
import java.lang.System;
import java.lang.Long;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest$UploadPostType;
import androidx.core.app.NotificationCompat$Builder;
import android.content.Context;
import android.app.PendingIntent;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.CharSequence;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
import qkd.b;
import s7.b;
import android.app.Notification;
import tra.b;
import java.lang.StringBuilder;
import java.lang.Throwable;
import q87.c;
import com.yxcorp.gifshow.postwork.PostStatus;
import r26.b;
import f0c.n0$a;
import java.lang.Enum;
import java.io.File;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import e17.i;
import zb6.a;
import androidx.core.app.NotificationCompat$h;
import com.yxcorp.utility.RomUtils;
import androidx.core.app.NotificationCompat$j;
import java.lang.Integer;
import e17.i$b;
import android.text.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.feature.post.api.feature.upload.model.UploadResult;
import java.util.List;
import com.yxcorp.gifshow.share.o;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest;
import r16.d;
import lnc.x6;
import lnc.y6;
import android.content.Intent;
import android.content.ComponentName;
import f0c.m0;
import java.lang.Runnable;
import t45.c;

public class w implements c0	// class@0010da
{
    public final n0 b;

    public void w(){
       super();
       this.b = new n0();
    }
    public void V4(float p0,a p1){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, ow, "2")) {
          return;
       }
       ow = this.b;
       Objects.requireNonNull(ow);
       n0 on0 = n0.class;
       if (!PatchProxy.isSupport(on0) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, ow, on0, "3")) {
          float uiProgress = p1.getUiProgress(p0);
          if (ow.d(p1) && (p0 - 0x3f800000 && (ow.a.indexOfKey(p1.getId()) < 0 || ((System.currentTimeMillis() - ow.a.get(p1.getId()).longValue()) - 100 >= 0 && (p1.getUploadInfo() == null || p1.getUploadInfo().getUploadPostType() != IUploadRequest$UploadPostType.SCHOOL))))) {
             boolean b = false;
             int i = 0x7f104796;
             int i1 = 0x7f1036e3;
             boolean b1 = true;
             NotificationCompat$Builder uBuilder = new NotificationCompat$Builder(ow.c, "video_process_channel").setContentIntent(ow.c()).setAutoCancel(b).setLargeIcon(BitmapFactory.decodeResource(a.a().a().getResources(), R.drawable.notification_icon_large)).setProgress(1000, (int)(uiProgress * 1000.00f), b).setContentTitle(ow.c.getString(i)).setContentText(ow.c.getString(i1)).setOnlyAlertOnce(b1).setSmallIcon(R.drawable.notification_icon_small);
             if (p1.getEncodeInfo() == null || (p1.getEncodeInfo().getStatus() == EncodeInfo$Status.ENCODING || p1.getUploadInfo() == null)) {
                uBuilder.setContentTitle(ow.c.getString(i)).setContentText(ow.c.getString(i1));
             }else {
                Object[] objArray = new Object[b1];
                objArray[b] = b.i0(p1.getUploadInfo().computeUploadFileSize());
                Object[] objArray1 = new Object[b1];
                objArray1[b] = p1.getUploadInfo().getPrompt();
                Object[] objArray2 = new Object[b1];
                objArray2[b] = p1.getUploadInfo().getPrompt();
                uBuilder.setContentTitle(ow.c.getString(R.string.arg_RES_7f104fb2, objArray)).setContentText(ow.c.getString(R.string.arg_RES_7f1047ba, objArray1)).setTicker(ow.c.getString(R.string.arg_RES_7f1047ba, objArray2));
             }
             try{
                ow.b();
                b.g(p1.getId(), uBuilder.build());
             }catch(java.lang.Exception e1){
                b.C().e("ks://PostWorkNotifications", "onPostWorkProgressChanged\(\) called with: progress = ["+p0+"], postWorkInfo = ["+p1+"]", e1);
             }
             ow.a.put(p1.getId(), Long.valueOf(System.currentTimeMillis()));
          }
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void w9(PostStatus p0,a p1){
       Object[] objArray;
       NotificationCompat$Builder uBuilder;
       int i2;
       String str;
       NotificationCompat$h oh;
       int b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, w.class, "1")) {
          return;
       }
       w tb = this.b;
       b request = p1.getRequest();
       Objects.requireNonNull(tb);
       n0 on0 = n0.class;
       if (!PatchProxy.applyVoidTwoRefs(p1, request, tb, on0, "4") && tb.d(p1)) {
          try{
             int i = 2;
             objArray = new Object[i];
             int i1 = 0;
             objArray[i1] = "status";
             objArray[1] = p1.getStatus();
             b.C().s("ks://PostWorkNotifications", "PostWorkStatus", objArray);
             objArray = 0x7f104725;
             uBuilder = null;
             i2 = 0x7f081a34;
             switch (n0$a.a[p1.getStatus().ordinal()]){
                 case 1:
                   uBuilder = new NotificationCompat$Builder(tb.c, "video_process_channel").setContentIntent(tb.c()).setAutoCancel(i1).setSmallIcon(R.drawable.notification_icon_small).setLargeIcon(BitmapFactory.decodeResource(a.a().a().getResources(), i2)).setProgress(p1.getEncodeInfo().getCount(), i1, i1).setContentTitle(tb.c.getString(R.string.arg_RES_7f104796)).setContentText(tb.c.getString(R.string.arg_RES_7f1036e5));
                   break;
                 case 3:
                   if (request != null && request.a() == null) {
                      tb.b();
                      b.b(p1.getId());
                   }
                   break;
                 case 4:
                   d uod = y6.r(d.class);
                   if (p1.getEncodeInfo().getPreviewIntent() != null && uod != null) {
                      Intent previewInten = p1.getEncodeInfo().getPreviewIntent();
                      previewInten.setComponent(uod.zM(tb.c).getComponent());
                      previewInten.setFlags(0x34000000);
                      uBuilder = new NotificationCompat$Builder(tb.c, "video_process_channel").setContentIntent(PendingIntent.getActivity(tb.c, i1, previewInten, i1)).setAutoCancel(1).setSmallIcon(R.drawable.notification_icon_small).setLargeIcon(BitmapFactory.decodeResource(a.a().a().getResources(), i2)).setTicker(tb.c.getString(R.string.arg_RES_7f1036e2)).setContentTitle(tb.c.getString(R.string.arg_RES_7f1036e2)).setContentText(tb.c.getString(R.string.arg_RES_7f1005d0));
                   }
                   break;
                 case 5:
                   if (request != null && request.a() == null) {
                      objArray = new Object[]{b.i0(new File(p1.getUploadInfo().getFilePath()).length())};
                      Object[] objArray1 = new Object[]{p1.getUploadInfo().getPrompt()};
                      objArray1 = new Object[]{p1.getUploadInfo().getPrompt()};
                      uBuilder = new NotificationCompat$Builder(tb.c, "video_process_channel").setContentIntent(tb.c()).setAutoCancel(i1).setSmallIcon(R.drawable.notification_icon_small).setLargeIcon(BitmapFactory.decodeResource(a.a().a().getResources(), i2)).setContentTitle(tb.c.getString(R.string.arg_RES_7f104fb2, objArray)).setContentText(tb.c.getString(R.string.arg_RES_7f1047ba, objArray1)).setTicker(tb.c.getString(R.string.arg_RES_7f1047ba, objArray1));
                   }
                   break;
                 case 7:
                   if (p1.getUploadInfo().getUploadPostType() == IUploadRequest$UploadPostType.SCHOOL) {
                      tb.c.getString(R.string.arg_RES_7f104faf);
                   }else {
                      tb.c.getString(R.string.arg_RES_7f103f4d);
                   }
                   UploadResult uploadResult = p1.getUploadInfo().getUploadResult();
                   if (uploadResult != null) {
                      o.d(tb.c, uploadResult.getForwardResults());
                   }
                   tb.b();
                   b.b(p1.getId());
                   break;
                 case 8:
                   if (a.g(p1.getUploadInfo().getThrowable())) {
                      Object[] objArray2 = new Object[i];
                      objArray2[i1] = tb.c.getString(0x7f104fa1);
                      int i3 = 0x7f1038e7;
                      objArray2[1] = tb.c.getString(i3);
                      str = String.format("%s\(%s\)", objArray2);
                      oh = new NotificationCompat$h();
                      oh.z(tb.c.getString(objArray));
                      oh.y(tb.c.getString(R.string.arg_RES_7f104fa1));
                      oh.y(tb.c.getString(i3));
                   }else if(p1.getUploadInfo().getUploadPostType() == IUploadRequest$UploadPostType.SCHOOL){
                      str = tb.c.getString(R.string.arg_RES_7f104f9d);
                   }else {
                      str = tb.c.getString(R.string.arg_RES_7f100de4);
                   }
                   oh = uBuilder;
                   NotificationCompat$Builder uBuilder1 = new NotificationCompat$Builder(tb.c, "video_process_channel").setContentIntent(tb.c()).setAutoCancel(1).setSmallIcon(R.drawable.notification_icon_small).setTicker(str).setContentTitle(tb.c.getString(objArray)).setContentText(str);
                   if (oh != null && !RomUtils.q()) {
                      uBuilder1.setStyle(oh);
                   }
                   if (!p1.getRecoverStatus() && !tb.a(p1)) {
                      int errorCode = p1.getUploadInfo().getErrorCode();
                      String errorMessage = p1.getUploadInfo().getErrorMessage();
                      if (!PatchProxy.isSupport(on0) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(errorCode), errorMessage, tb, on0, "6")) {
                         i$b uob = new i$b();
                         if (TextUtils.isEmpty(errorMessage)) {
                            uob.x(R.string.arg_RES_7f104fa0);
                         }else {
                            uob.y(errorMessage);
                         }
                         uob.o(5000);
                         i.z(uob);
                         if (!PatchProxy.isSupport(on0) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(errorCode), tb, on0, "7")) {
                            ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                            uElementPack.action2 = "POST_FAILED_RESULT_TOAST";
                            JsonObject jsonObject = new JsonObject();
                            jsonObject.a0("fail_code", Integer.valueOf(errorCode));
                            uElementPack.params = jsonObject.toString();
                            u1.u0(i1, uElementPack, uBuilder);
                         }
                      }
                   }
                   uBuilder = uBuilder1;
                   break;
                 case 9:
                 case 10:
                   b = tb.a(p1);
                   if (p1.isPublished() && (p1.showCancelToast() && !b)) {
                      if (p1.getWorkspaceDirectory() != null) {
                         Object obj = PatchProxy.applyOneRefs(p1, tb, on0, "5");
                         if (obj != PatchProxyResult.class) {
                            b = obj.booleanValue();
                         }else if(p1.getEncodeInfo() != null && p1.getEncodeInfo().isCrashInEncodingAndGiveUpWorkspace()){
                            i1 = 1;
                         }
                         b = i1;
                         if (!b && p1.isSaveWorkSpace()) {
                            if (p1.getEncodeInfo() != null && !p1.getEncodeInfo().encodeOptionValid()) {
                               i.d(R.style.arg_RES_7f110669, tb.c.getString(R.string.arg_RES_7f104f9f));
                            }else {
                               i.d(R.style.arg_RES_7f110669, tb.c.getString(R.string.arg_RES_7f1043d8));
                            }
                         }
                      }
                   label_00ce :
                      i.d(R.style.arg_RES_7f11066a, tb.c.getString(R.string.arg_RES_7f1004c5));
                   }
                label_00dd :
                   tb.b();
                   b.b(p1.getId());
                   break;
                 default:
             }
          }catch(com.yxcorp.gifshow.exception.ForwardException e0){
             tb.c.getString(R.string.arg_RES_7f100d6f);
             uBuilder = new NotificationCompat$Builder(tb.c, "video_process_channel").setAutoCancel(1).setSmallIcon(R.drawable.notification_icon_small).setLargeIcon(BitmapFactory.decodeResource(a.a().a().getResources(), i2)).setContentTitle(tb.c.getString(objArray)).setContentIntent(tb.c()).setContentText(tb.c.getString(R.string.arg_RES_7f100d6f)).setTicker(tb.c.getString(R.string.arg_RES_7f100d6f));
          }catch(java.lang.Exception e0){
             PostUtils.D("ks://PostWorkNotifications", "UPLOAD_COMPLETE ", e0);
          }
       label_0411 :
          if (uBuilder != null && tb.d(p1)) {
             c.a(new m0(tb.b(), p1, uBuilder));
          }
       }
    label_0425 :
       return;
    }
}
