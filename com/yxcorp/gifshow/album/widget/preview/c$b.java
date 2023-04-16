package com.yxcorp.gifshow.album.widget.preview.c$b;
import io.reactivex.g;
import com.yxcorp.gifshow.album.widget.preview.c;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import android.graphics.Bitmap;
import kc7.a;
import brd.g;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public class c$b implements g	// class@001b2d
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       Bitmap uBitmap = a.b(new File(this.b.c), 200, 200, false);
       if (uBitmap != null) {
          p0.onNext(uBitmap);
       }else {
          Log.d("ImagePreviewItem", "prepareBubbleBackgroundColor bitmap is null, index="+this.b.b);
          p0.onComplete();
       }
       return;
    }
}
