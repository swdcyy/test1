package com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import id.o0;
import java.util.concurrent.Executor;
import com.facebook.common.memory.b;
import android.content.ContentResolver;
import java.lang.Object;
import uc.d;
import id.p0;
import java.lang.String;
import java.io.File;
import android.net.Uri;
import android.media.ExifInterface;
import ib.c;
import android.content.res.AssetFileDescriptor;
import android.os.Build$VERSION;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer$Api24Utils;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer$a;
import java.io.FileDescriptor;
import java.lang.Class;
import cb.a;
import id.i;
import id.c0;
import id.e0;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer$b;
import id.i0;
import id.d0;
import java.lang.Runnable;

public class LocalExifThumbnailProducer implements o0	// class@001121
{
    public final Executor a;
    public final b b;
    public final ContentResolver c;

    public void LocalExifThumbnailProducer(Executor p0,b p1,ContentResolver p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public boolean a(d p0){
       return p0.b(512, 512, p0);
    }
    public boolean b(String p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       File uFile = new File(p0);
       if (uFile.exists() && uFile.canRead()) {
          b = true;
       }
       return b;
    }
    public ExifInterface c(Uri p0){
       int i;
       String str = c.b(this.c, p0);
       try{
          i = 0;
          if (this.b(str)) {
             return new ExifInterface(str);
          }else {
             AssetFileDescriptor uAssetFileDe = c.a(this.c, p0);
             if (uAssetFileDe != null && Build$VERSION.SDK_INT >= 24) {
                uAssetFileDe.close();
                return new LocalExifThumbnailProducer$Api24Utils(this, i).a(uAssetFileDe.getFileDescriptor());
             }
          }
       }catch(java.io.IOException e0){
       }catch(java.lang.StackOverflowError e0){
          a.c(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
       }
       return i;
    }
    public void produceResults(i p0,c0 p1){
       p1.n("local", "exif");
       LocalExifThumbnailProducer$a uoa = new LocalExifThumbnailProducer$a(this, p0, p1.l(), p1, "LocalExifThumbnailProducer", p1.b());
       p1.k(new LocalExifThumbnailProducer$b(this, v7));
       this.a.execute(v7);
    }
}
