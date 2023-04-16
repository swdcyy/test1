package com.feature.post.bridge.p;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions;
import z55.b;
import java.lang.Object;
import java.lang.Boolean;
import android.content.Context;
import java.lang.String;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$ErrorInfo;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$b;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$b$a;
import java.util.Objects;
import com.feature.post.bridge.q;
import android.app.Activity;
import java.io.File;
import wkd.b;
import j80.c;
import java.lang.StringBuilder;
import java.lang.System;
import android.content.Intent;
import o56.c;
import o56.a;
import android.app.Application;
import android.net.Uri;
import androidx.core.content.FileProvider;
import android.os.Parcelable;
import com.kwai.feature.post.api.feature.bridge.JSSelectFileAndUploadOptions$UploadConfig;
import com.feature.post.bridge.o;
import n3d.a;

public final class p implements g	// class@0014b3
{
    public final GifshowActivity b;
    public final JSSelectFileAndUploadOptions c;
    public final b d;

    public void p(GifshowActivity p0,JSSelectFileAndUploadOptions p1,b p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       p tb = this.b;
       p tc = this.c;
       p td = this.d;
       String str = "android.permission.CAMERA";
       String str1 = "android.permission.RECORD_AUDIO";
       int i = 1;
       StringBuilder str2 = (PermissionUtils.a(tb, str) && PermissionUtils.a(tb, str1))? 1: null;
       if (p0.booleanValue() || str2) {
          p0 = new File(b.a(-1504323719).o(), System.currentTimeMillis()+".mp4");
          Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
          intent.putExtra("output", FileProvider.getUriForFile(a.a().a(), a.a().a().getPackageName()+".fileprovider", p0));
          intent.putExtra("android.intent.extra.videoQuality", i);
          intent.putExtra("android.intent.extra.durationLimit", tc.getUploadConfig().getMaxDuration());
          intent.addFlags(i);
          tb.t1(intent, 6, new o(p0, tc, td, tb));
       }else {
          String failEventNam = tc.getFailEventName();
          Objects.requireNonNull(failEventNam);
          q.b(td, failEventNam, new JSSelectFileAndUploadOptions$ErrorInfo("permission denied", JSSelectFileAndUploadOptions$b.p.a()).toString());
          p0 = new String[]{str,str1,"android.permission.WRITE_EXTERNAL_STORAGE"};
          PermissionUtils.n(tb, p0);
       }
       return;
    }
}
