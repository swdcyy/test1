package com.yxcorp.gifshow.util.r;
import java.lang.Runnable;
import lnc.s2;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.BindPhoneTipsModel;
import java.lang.Class;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.image.fresco.wrapper.c;
import android.net.Uri;
import ekd.w0;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import wkd.b;
import j80.c;
import java.lang.StringBuilder;
import java.lang.System;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.yxcorp.gifshow.HomeActivity;
import android.app.Activity;
import lnc.n2;
import ekd.k1;
import java.lang.Exception;

public final class r implements Runnable	// class@001f9f
{
    public final s2 b;
    public final String c;

    public void r(s2 p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       r tb = this.b;
       r tc = this.c;
       try{
          Objects.requireNonNull(tb);
          BindPhoneTipsModel uBindPhoneTi = new Gson().h(tc, BindPhoneTipsModel.class);
          File uFile = null;
          if (!TextUtils.x(uBindPhoneTi.mBackgroundUrl)) {
             c uoc = c.w();
             a.d(ImageRequestBuilder.k(w0.f(uBindPhoneTi.mBackgroundUrl)).a(), uoc);
             Drawable uDrawable = uoc.q();
             if (uDrawable instanceof BitmapDrawable) {
                uFile = new File(b.a(-1504323719).o(), System.currentTimeMillis()+".jpg");
                BitmapUtil.Q(uDrawable.getBitmap(), uFile.getAbsolutePath(), 100);
             }
          }
          HomeActivity homeActivity = HomeActivity.H3();
          if (homeActivity != null && !homeActivity.isFinishing()) {
             k1.o(new n2(tb, homeActivity, uBindPhoneTi, uFile));
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
    label_0089 :
       return;
    }
}
