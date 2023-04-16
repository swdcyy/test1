package com.yxcorp.gifshow.ad.webview.jsbridge.a;
import erd.o;
import java.lang.String;
import android.app.Activity;
import java.lang.Object;
import zq8.a;
import java.lang.Boolean;
import brd.t;
import org.json.JSONObject;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.StringBuilder;
import ekd.a0;
import java.lang.System;
import android.os.Environment;
import java.io.File;
import com.yxcorp.gifshow.ad.webview.jsbridge.c;
import io.reactivex.g;

public final class a implements o	// class@0018ca
{
    public final String b;
    public final Activity c;

    public void a(String p0,Activity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       a tb = this.b;
       a tc = this.c;
       if (p0.b == null) {
          p0 = t.just(Boolean.FALSE);
       }else {
          p0 = new JSONObject(tb).optString("url");
          p0 = t.create(new c(tc, ImageRequestBuilder.k(Uri.parse(p0)).a(), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath()+File.separator+a0.c(p0)+System.currentTimeMillis()+".jpg"));
       }
       return p0;
    }
}
