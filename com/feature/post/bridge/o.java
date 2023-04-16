package com.feature.post.bridge.o;
import n3d.a;
import java.io.File;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions;
import z55.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import android.content.Intent;
import og.l;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$FileInfo;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$ErrorInfo;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$b;
import java.util.Objects;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$b$a;
import com.feature.post.bridge.q;
import java.lang.CharSequence;
import e17.i;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import mg.q1;
import java.lang.Runnable;
import t45.c;

public final class o implements a	// class@0014b1
{
    public final File b;
    public final JSSelectFileAndUploadOptions c;
    public final b d;
    public final GifshowActivity e;

    public void o(File p0,JSSelectFileAndUploadOptions p1,b p2,GifshowActivity p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       String failEventNam;
       o oo = this;
       int i = p1;
       o b = oo.b;
       o c = oo.c;
       o d = oo.d;
       o e = oo.e;
       if (p0 == 6) {
          Object[] objArray = new Object[0];
          l.D().w("JsSelectVideoUpdateFunction", "recordVideoAndUpload: resultCode = "+i, objArray);
          if (i == -1) {
             String absolutePath = b.getAbsolutePath();
             JSSelectFileAndUploadOptions$FileInfo fileInfo = c.getFileInfo(absolutePath);
             if (fileInfo.getDuration() - ((long)c.getLimitDurationInSeconds() + 1000) > 0) {
                Objects.requireNonNull(JSSelectFileAndUploadOptions$b.p);
                failEventNam = c.getFailEventName();
                Objects.requireNonNull(failEventNam);
                q.b(d, failEventNam, new JSSelectFileAndUploadOptions$ErrorInfo(null, JSSelectFileAndUploadOptions$b$a.c).toString());
                i.d(R.style.arg_RES_7f11066a, "视频时长超过一分钟，请重新拍摄");
             }else {
                String selectFileEv = c.getSelectFileEventName();
                Objects.requireNonNull(selectFileEv);
                q.b(d, selectFileEv, fileInfo.toString());
                q.c(c, absolutePath, d);
                long duration = fileInfo.getDuration();
                if (!PermissionUtils.a(e, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                   Object[] objArray1 = new Object[0];
                   l.D().A("JsSelectVideoUpdateFunction", "saveVideoToAlbum return, permission denied", objArray1);
                }else {
                   c.a(new q1(b, duration));
                }
             }
          }else {
             failEventNam = c.getFailEventName();
             Objects.requireNonNull(failEventNam);
             q.b(d, failEventNam, new JSSelectFileAndUploadOptions$ErrorInfo("user cancel", JSSelectFileAndUploadOptions$b.p.a()).toString());
          }
       }
       return;
    }
}
