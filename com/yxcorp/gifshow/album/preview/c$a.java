package com.yxcorp.gifshow.album.preview.c$a;
import com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager$a;
import java.lang.String;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.media.ThumbnailUtils;
import kc7.a;
import o79.i;
import android.graphics.Bitmap$Config;

public class c$a extends MediaPreviewGenerateCoverManager$a	// class@001a4c
{

    public void c$a(int p0,String p1,String p2){
       super(p0, p1, p2);
    }
    public Bitmap a(){
       int i;
       Bitmap obj = PatchProxy.apply(null, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ThumbnailUtils.createVideoThumbnail(this.b, 2);
       if (obj == null) {
          obj = a.a(this.b, 2);
          if (obj == null) {
             return null;
          }
       }
       if (obj.getHeight() > obj.getWidth()) {
          i = (obj.getHeight() > i.j())? i.j() / 2: obj.getHeight();
       }else if(obj.getWidth() > i.k()){
          i = i.k() / 2;
       }else {
          i = obj.getWidth();
       }
       return a.g(obj, i, null);
    }
}
