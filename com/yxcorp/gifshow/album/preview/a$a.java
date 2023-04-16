package com.yxcorp.gifshow.album.preview.a$a;
import c79.d;
import com.yxcorp.gifshow.album.preview.a;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.widget.preview.c;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import r79.c;
import android.widget.ImageView;

public class a$a implements d	// class@001a47
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       CompatImageView uCompatImage = this.a.f.m();
       if (uCompatImage != null) {
          uCompatImage.setTag(R.id.cover_image_source, this.a.m.getPath());
       }
       return;
    }
    public void b(){
    }
}
