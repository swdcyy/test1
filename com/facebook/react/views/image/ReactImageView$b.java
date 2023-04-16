package com.facebook.react.views.image.ReactImageView$b;
import dd.b;
import com.facebook.react.views.image.ReactImageView;
import java.lang.String;
import java.lang.Throwable;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.widget.ImageView;
import com.facebook.react.bridge.ReactContext;
import pf.b;
import df.b;
import com.facebook.react.uimanager.events.ProfileModule;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Boolean;

public class ReactImageView$b extends b	// class@0013be
{
    public final ReactImageView a;

    public void ReactImageView$b(ReactImageView p0){
       this.a = p0;
       super();
    }
    public void onProducerFinishWithFailure(String p0,String p1,Throwable p2,Map p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, ReactImageView$b.class, "6")) {
          return;
       }
       ProfileModule.dispatchEvent(this.a.getContext(), new b(this.a.getId(), 9));
       return;
    }
    public void onProducerFinishWithSuccess(String p0,String p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ReactImageView$b.class, "5")) {
          return;
       }
       ProfileModule.dispatchEvent(this.a.getContext(), new b(this.a.getId(), 9));
       return;
    }
    public void onProducerStart(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactImageView$b.class, "4")) {
          return;
       }
       ProfileModule.dispatchEvent(this.a.getContext(), new b(this.a.getId(), 8));
       return;
    }
    public void onRequestFailure(ImageRequest p0,String p1,Throwable p2,boolean p3){
       if (PatchProxy.isSupport(ReactImageView$b.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, ReactImageView$b.class, "3")) {
          return;
       }
       ProfileModule.dispatchEvent(this.a.getContext(), new b(this.a.getId(), 7));
       return;
    }
    public void onRequestStart(ImageRequest p0,Object p1,String p2,boolean p3){
       if (PatchProxy.isSupport(ReactImageView$b.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, ReactImageView$b.class, "1")) {
          return;
       }
       ProfileModule.dispatchEvent(this.a.getContext(), new b(this.a.getId(), 6));
       return;
    }
    public void onRequestSuccess(ImageRequest p0,String p1,boolean p2){
       if (PatchProxy.isSupport(ReactImageView$b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, ReactImageView$b.class, "2")) {
          return;
       }
       ProfileModule.dispatchEvent(this.a.getContext(), new b(this.a.getId(), 7));
       return;
    }
}
