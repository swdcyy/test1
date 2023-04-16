package com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub$c;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.album.preview.MediaPreviewSelectViewStub;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;

public final class MediaPreviewSelectViewStub$c implements Animator$AnimatorListener	// class@001a36
{
    public final MediaPreviewSelectViewStub a;
    public final boolean b;

    public void MediaPreviewSelectViewStub$c(MediaPreviewSelectViewStub p0,boolean p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPreviewSelectViewStub$c.class, "3")) {
          return;
       }
       this.a.o(this.b);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPreviewSelectViewStub$c.class, "2")) {
          return;
       }
       this.a.o(this.b);
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaPreviewSelectViewStub$c.class, "1")) {
          return;
       }
       ViewGroup viewGroup = this.a.l();
       if (viewGroup != null) {
          viewGroup.setVisibility(0);
       }
       return;
    }
}
