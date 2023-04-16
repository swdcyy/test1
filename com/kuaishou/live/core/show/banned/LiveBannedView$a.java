package com.kuaishou.live.core.show.banned.LiveBannedView$a;
import ub.b;
import com.kuaishou.live.core.show.banned.LiveBannedView;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import boc.d0;
import android.graphics.drawable.Animatable;
import bd.f;

public class LiveBannedView$a implements b	// class@0009dd
{
    public final LiveBannedView a;

    public void LiveBannedView$a(LiveBannedView p0){
       this.a = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveBannedView$a.class, "2")) {
          return;
       }
       d0.b(this.a.d, LiveBannedView.k);
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
    }
    public void onIntermediateImageFailed(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveBannedView$a.class, "1")) {
          return;
       }
       d0.b(this.a.d, LiveBannedView.k);
       return;
    }
    public void onIntermediateImageSet(String p0,Object p1){
    }
    public void onRelease(String p0){
    }
    public void onSubmit(String p0,Object p1){
    }
}
