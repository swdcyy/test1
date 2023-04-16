package com.yxcorp.gifshow.album.preview.MediaPreviewFragment$c;
import com.yxcorp.gifshow.album.preview.PreviewViewPager$e;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j79.q;
import j79.x;
import java.lang.Float;
import androidx.lifecycle.MutableLiveData;
import q79.d;

public class MediaPreviewFragment$c implements PreviewViewPager$e	// class@001a2a
{
    public final MediaPreviewFragment a;

    public void MediaPreviewFragment$c(MediaPreviewFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, MediaPreviewFragment$c.class, "3")) {
          return;
       }
       MediaPreviewFragment o = this.a.o;
       if (o != null) {
          o.k(false);
       }
       o = this.a.p;
       if (o != null) {
          o.i(false);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, MediaPreviewFragment$c.class, "2")) {
          return;
       }
       MediaPreviewFragment o = this.a.o;
       if (o != null) {
          o.k(true);
       }
       o = this.a.p;
       if (o != null) {
          o.i(true);
       }
       return;
    }
    public void c(float p0){
       MediaPreviewFragment$c uoc = MediaPreviewFragment$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.a.D.F0().setValue(Float.valueOf(p0));
       return;
    }
}
