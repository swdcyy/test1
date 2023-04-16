package com.feature.post.bridge.k;
import pm6.e$b;
import r16.f;
import android.app.Activity;
import com.kwai.feature.post.api.feature.bridge.JsVideoUploadStatusParams;
import f55.g;
import java.lang.Object;
import pm6.g;
import java.util.List;
import og.l;
import java.lang.String;
import q87.c;
import q46.r;
import java.util.Iterator;
import r26.a;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.postwork.PostStatus;
import java.lang.StringBuilder;
import com.kwai.feature.post.api.feature.bridge.JsVideoUploadStatusResult$StatusResultData;
import com.kwai.feature.post.api.feature.upload.model.UploadResult;
import com.kwai.feature.post.api.feature.bridge.JsVideoUploadStatusResult;
import brd.a0;
import com.feature.post.bridge.j;
import t45.d;
import brd.z;
import mg.p0;
import com.feature.post.bridge.d;
import erd.g;
import crd.b;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.io.File;
import qkd.b;
import mg.q0;
import com.feature.post.bridge.c;
import java.lang.Exception;
import com.kwai.plugin.dva.work.c$c;
import sj7.d;

public class k implements e$b	// class@001495
{
    public final f a;
    public final Activity b;
    public final JsVideoUploadStatusParams c;
    public final g d;

    public void k(f p0,Activity p1,JsVideoUploadStatusParams p2,g p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public boolean c(){
       return g.a(this);
    }
    public void j(List p0){
       String filePath;
       int i;
       JsVideoUploadStatusResult$StatusResultData statusResult;
       k ok = this;
       k a = ok.a;
       k d = ok.d;
       Object[] objArray = new Object[0];
       l.D().w("JsPublishFun", "getVideoUploadStatusReal: ", objArray);
       r or = r.b(ok.b, a);
       Iterator iterator = ok.c.mTaskIdList.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (a.Q3(obj) != null) {
             a uoa = a.Q3(obj);
             String str = a.oz(uoa);
             String str1 = "";
             if (uoa.getUploadInfo() != null) {
                filePath = uoa.getUploadInfo().getFilePath();
             }else if(uoa.getEncodeInfo() != null){
                filePath = uoa.getEncodeInfo().getOutputPath();
             }else {
                filePath = str1;
             }
             filePath = TextUtils.k(filePath);
             PostStatus status = uoa.getStatus();
             Object[] objArray1 = new Object[0];
             l.D().w("JsPublishFun", "getVideoUploadStatusReal, taskId:"+obj+" status:"+status+" , path:"+filePath+" , coverPath:"+str, objArray1);
             if (status == PostStatus.UPLOAD_COMPLETE) {
                i = 1;
                statusResult = new JsVideoUploadStatusResult$StatusResultData(obj, "", "100", 0, 0, "", "");
                if (uoa.getUploadInfo() != null) {
                   str.mRemainingTime = uoa.getUploadInfo().getUploadRemainingTime();
                   UploadResult uploadResult = uoa.getUploadInfo().getUploadResult();
                   if (uploadResult != null) {
                      str.mPhotoId = uploadResult.getPhotoId();
                      str.mCoverUrl = uploadResult.getThumbUrl();
                   }
                }
                d.onSuccess(new JsVideoUploadStatusResult(str, i));
             }else {
                i = 1;
                if (status != PostStatus.UPLOADING && (status != PostStatus.UPLOAD_PENDING && (status != PostStatus.ENCODING && (status == PostStatus.ENCODE_PENDING || status == PostStatus.ENCODE_COMPLETE)))) {
                   String[] stringArray = new String[i];
                   stringArray[0] = filePath;
                   q0 oq0 = new q0(obj, uoa, b.z(filePath), String.valueOf(b.B(stringArray).length()), d);
                   j.b(str, filePath).T(d.c).G(d.a).R(objArray1, c.b);
                   j.a(or, obj, d);
                }else if(uoa.getStatus() == PostStatus.UPLOAD_FAILED){
                   j.b(str, filePath).T(d.c).G(d.a).R(new p0(obj, d), d.b);
                }else {
                   statusResult = new JsVideoUploadStatusResult$StatusResultData(obj, "", "", -1, 0, "", "");
                   if (uoa.getUploadInfo() != null) {
                      str.mRemainingTime = uoa.getUploadInfo().getUploadRemainingTime();
                   }
                   int i1 = -1;
                   Bundle uBundle = new Bundle();
                   SerializableHook.putSerializable(uBundle, "bundle_result", new JsVideoUploadStatusResult(str, i1));
                   d.a(i1, str1, uBundle);
                   a.S(uoa.getId(), i);
                }
             }
          }
       }
       return;
    }
    public void onFailed(Exception p0){
       this.d.a(2, "so download error", new Bundle());
    }
    public void onProgress(float p0){
       g.c(this, p0);
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       this.j(p0);
    }
}
