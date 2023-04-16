package com.yxcorp.gifshow.album.viewbinder.MultiSelectPreviewFragmentViewBinder$onInterceptUserEventAlbum$1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectPreviewFragmentViewBinder;
import j79.l0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.preview.MediaPreviewInfo;
import kotlin.jvm.internal.a;

public final class MultiSelectPreviewFragmentViewBinder$onInterceptUserEventAlbum$1 implements View$OnClickListener	// class@001af1
{
    public final MultiSelectPreviewFragmentViewBinder b;
    public final l0 c;

    public void MultiSelectPreviewFragmentViewBinder$onInterceptUserEventAlbum$1(MultiSelectPreviewFragmentViewBinder p0,l0 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiSelectPreviewFragmentViewBinder$onInterceptUserEventAlbum$1.class, "1")) {
          return;
       }
       MultiSelectPreviewFragmentViewBinder$onInterceptUserEventAlbum$1 tc = this.c;
       if (tc != null) {
          MediaPreviewInfo mediaPreview = tc.t0();
          a.h(mediaPreview, "it.currentMedia");
          if (this.b.w(tc, mediaPreview, this.c.s)) {
             tc.L0();
          }
          tc.K0(false);
       }
       return;
    }
}
