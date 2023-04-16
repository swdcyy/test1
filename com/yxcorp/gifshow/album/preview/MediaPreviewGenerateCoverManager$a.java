package com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager$a;
import java.lang.String;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public abstract class MediaPreviewGenerateCoverManager$a	// class@001a2f
{
    public final int a;
    public final String b;
    public final String c;
    public b0 d;

    public void MediaPreviewGenerateCoverManager$a(int p0,String p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public abstract Bitmap a();
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MediaPreviewGenerateCoverManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MediaGenerateCoverTask : item index = "+this.a+", media path = "+this.b+", cover file path = "+this.c;
    }
}
