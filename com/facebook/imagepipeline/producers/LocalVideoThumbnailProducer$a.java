package com.facebook.imagepipeline.producers.LocalVideoThumbnailProducer$a;
import id.i0;
import com.facebook.imagepipeline.producers.LocalVideoThumbnailProducer;
import id.i;
import id.e0;
import id.c0;
import java.lang.String;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Object;
import com.facebook.common.references.a;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.content.ContentResolver;
import bd.c;
import sc.e;
import bd.g;
import fb.c;
import bd.h;
import java.util.Map;
import com.facebook.imagepipeline.image.a;
import java.io.Closeable;
import java.lang.Exception;
import com.facebook.common.internal.ImmutableMap;

public class LocalVideoThumbnailProducer$a extends i0	// class@001122
{
    public final e0 g;
    public final c0 h;
    public final ImageRequest i;
    public final LocalVideoThumbnailProducer j;

    public void LocalVideoThumbnailProducer$a(LocalVideoThumbnailProducer p0,i p1,e0 p2,c0 p3,String p4,e0 p5,c0 p6,ImageRequest p7){
       this.j = p0;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       super(p1, p2, p3, p4);
    }
    public void b(Object p0){
       a.f(p0);
    }
    public Object c(){
       String localFilePat;
       a uoa = null;
       try{
          localFilePat = this.j.getLocalFilePath(this.i);
       }catch(java.lang.IllegalArgumentException e0){
          localFilePat = e0;
       }
       Bitmap uBitmap = (localFilePat != null)? ThumbnailUtils.createVideoThumbnail(localFilePat, LocalVideoThumbnailProducer.calculateKind(this.i)): LocalVideoThumbnailProducer.createThumbnailFromContentProvider(this.j.mContentResolver, this.i.s());
       if (uBitmap != null) {
          c uoc = new c(uBitmap, e.b(), g.d, 0);
          this.h.m("image_format", "thumbnail");
          uoc.f(this.h.getExtras());
          uoa = a.o(uoc);
       }
       return e0;
    }
    public void e(Exception p0){
       super.e(p0);
       this.g.onUltimateProducerReached(this.h, "VideoThumbnailProducer", false);
       this.h.o("local");
    }
    public void f(Object p0){
       super.f(p0);
       LocalVideoThumbnailProducer$a tg = this.g;
       LocalVideoThumbnailProducer$a th = this.h;
       boolean b = (p0 != null)? true: false;
       tg.onUltimateProducerReached(th, "VideoThumbnailProducer", b);
       this.h.o("local");
       return;
    }
    public Map g(Object p0){
       boolean b = (p0 != null)? true: false;
       return ImmutableMap.of("createdThumbnail", String.valueOf(b));
    }
}
