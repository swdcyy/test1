package com.yxcorp.gifshow.album.preview.g;
import java.lang.Runnable;
import com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager;
import com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager$a;
import java.lang.Object;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.utility.Log;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.io.File;
import java.lang.System;
import android.graphics.Bitmap;
import kc7.a;
import java.lang.Boolean;
import java.lang.RuntimeException;
import java.lang.Throwable;
import ic7.b;
import ekd.k1;
import j79.k;

public final class g implements Runnable	// class@001a52
{
    public final MediaPreviewGenerateCoverManager b;
    public final MediaPreviewGenerateCoverManager$a c;

    public void g(MediaPreviewGenerateCoverManager p0,MediaPreviewGenerateCoverManager$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       boolean b;
       StringBuilder str2;
       g tb = this.b;
       g tc = this.c;
       Objects.requireNonNull(tb);
       String str = "generate cover index = ";
       String str1 = "MediaPreviewGenerateCoverManager";
       Log.g(str1, str+tc.a);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       if (PatchProxy.applyOneRefs(tc, obj, MediaPreviewGenerateCoverManager.class, "6") != patchProxyRe) {
       }else {
          long l = System.currentTimeMillis();
          Bitmap uBitmap = tc.a();
          File uFile = new File(tc.c+".temp");
          obj = PatchProxy.applyOneRefs(uBitmap, obj, a.class, "18");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(uBitmap != null && !uBitmap.isRecycled()){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             b.a(new RuntimeException("MediaPreviewGenerateCoverManager failed to create cover, task = "+tc.toString()));
          }else if(uFile.exists()){
             try{
                uFile.createNewFile();
                a.f(uBitmap, uFile.getAbsolutePath(), 85);
                uFile.renameTo(new File(tc.c));
                uBitmap.recycle();
                str2 = "";
             }catch(java.io.IOException e2){
                b.a(e2);
                str2 = "";
             }
             Log.g(str1, str2+str+tc.a+", cost = "+k1.t(l));
          }
       }
       k1.o(new k(tb, tc));
       return;
    }
}
