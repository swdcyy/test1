package com.yxcorp.gifshow.detail.article.imagepreview.k;
import erd.o;
import com.yxcorp.gifshow.detail.article.imagepreview.r;
import android.net.Uri;
import java.lang.Object;
import zq8.a;
import java.util.Objects;
import java.lang.Boolean;
import brd.t;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.StringBuilder;
import java.lang.String;
import ekd.a0;
import java.lang.System;
import android.os.Environment;
import java.io.File;
import com.yxcorp.gifshow.detail.article.imagepreview.q;
import io.reactivex.g;

public final class k implements o	// class@001355
{
    public final r b;
    public final Uri c;

    public void k(r p0,Uri p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       k tb = this.b;
       k tc = this.c;
       Objects.requireNonNull(tb);
       p0 = (p0.b == null)? t.just(Boolean.FALSE): t.create(new q(tb, ImageRequestBuilder.k(tc).a(), Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath()+File.separator+a0.c(tc.toString())+System.currentTimeMillis()+".jpg"));
       return p0;
    }
}
