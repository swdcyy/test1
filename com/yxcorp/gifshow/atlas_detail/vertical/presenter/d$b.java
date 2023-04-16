package com.yxcorp.gifshow.atlas_detail.vertical.presenter.d$b;
import ub.a;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.d;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Animatable;
import bd.f;
import android.view.View;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.detail.nonslide.util.PhotoDetailCoverFrameReadyEvent;

public class d$b extends a	// class@001bdf
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       PatchProxy.applyVoidTwoRefs(p0, p1, this, d$b.class, "3");
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d$b.class, "2")) {
       }else {
          d u = this.b.u;
          if (u != null) {
             u.setVisibility(8);
          }
          RxBus.f.b(new PhotoDetailCoverFrameReadyEvent());
       }
       return;
    }
    public void onSubmit(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$b.class, "1")) {
          return;
       }
       d u = this.b.u;
       if (u != null) {
          u.setVisibility(0);
       }
       return;
    }
}
