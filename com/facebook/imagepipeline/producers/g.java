package com.facebook.imagepipeline.producers.g;
import com.facebook.imagepipeline.producers.j;
import java.util.concurrent.Executor;
import com.facebook.common.memory.b;
import android.content.res.AssetManager;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.String;
import android.net.Uri;
import bd.d;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import android.content.res.AssetFileDescriptor;

public class g extends j	// class@001134
{
    public final AssetManager c;

    public void g(Executor p0,b p1,AssetManager p2){
       super(p0, p1);
       this.c = p2;
    }
    public static String f(ImageRequest p0){
       return (p0.s().getPath()).substring(1);
    }
    public d c(ImageRequest p0){
       AssetFileDescriptor uAssetFileDe;
       int i1;
       InputStream inputStream = SplitAssetHelper.open(this.c, g.f(p0), 2);
       try{
          int i = 0;
          uAssetFileDe = SplitAssetHelper.openFd(this.c, g.f(p0));
          i1 = (int)uAssetFileDe.getLength();
       }catch(java.io.IOException e0){
          i1 = -1;
          if (!uAssetFileDe) {
          label_002c :
             return this.d(e0, i1);
          }
       }
       try{
          uAssetFileDe.close();
          goto label_002c ;
       }catch(java.io.IOException e0){
       }
    }
    public String e(){
       return "LocalAssetFetchProducer";
    }
}
