package com.facebook.imagepipeline.producers.l;
import com.facebook.imagepipeline.producers.j;
import java.util.concurrent.Executor;
import com.facebook.common.memory.b;
import android.content.res.Resources;
import com.facebook.imagepipeline.request.ImageRequest;
import android.net.Uri;
import java.lang.String;
import java.lang.Integer;
import bd.d;
import java.io.InputStream;
import android.content.res.AssetFileDescriptor;

public class l extends j	// class@00113b
{
    public final Resources c;

    public void l(Executor p0,b p1,Resources p2){
       super(p0, p1);
       this.c = p2;
    }
    public static int f(ImageRequest p0){
       return Integer.parseInt((p0.s().getPath()).substring(1));
    }
    public d c(ImageRequest p0){
       AssetFileDescriptor uAssetFileDe;
       int i1;
       InputStream inputStream = this.c.openRawResource(l.f(p0));
       try{
          int i = 0;
          uAssetFileDe = this.c.openRawResourceFd(l.f(p0));
          i1 = (int)uAssetFileDe.getLength();
       }catch(android.content.res.Resources$NotFoundException e0){
          i1 = -1;
          if (!uAssetFileDe) {
          label_002b :
             return this.d(e0, i1);
          }
       }
       try{
          uAssetFileDe.close();
          goto label_002b ;
       }catch(java.io.IOException e0){
       }
    }
    public String e(){
       return "LocalResourceFetchProducer";
    }
}
