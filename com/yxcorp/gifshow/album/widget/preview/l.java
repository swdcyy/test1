package com.yxcorp.gifshow.album.widget.preview.l;
import io.reactivex.g;
import com.yxcorp.gifshow.album.widget.preview.f;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import r79.c;
import android.graphics.Bitmap;
import kc7.a;
import brd.g;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public class l implements g	// class@001b3f
{
    public final f b;

    public void l(f p0){
       this.b = p0;
       super();
    }
    public void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       Bitmap uBitmap = a.b(new File(this.b.e.getPath()), 200, 200, false);
       if (uBitmap != null) {
          p0.onNext(uBitmap);
       }else {
          Log.d("VideoSdkPlayerPreviewItem", "prepareBubbleBackgroundColor bitmap is null, index="+this.b.f);
          p0.onComplete();
       }
       return;
    }
}
