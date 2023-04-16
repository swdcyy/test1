package com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFlipperView;
import android.widget.ViewFlipper;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class NearbyFlipperView extends ViewFlipper	// class@001aab
{

    public void NearbyFlipperView(Context p0){
       super(p0, null, 2, null);
    }
    public void NearbyFlipperView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public void NearbyFlipperView(Context p0,AttributeSet p1,int p2,u p3){
       super(p0, null);
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, NearbyFlipperView.class, "1")) {
          return;
       }
       try{
          super.onDetachedFromWindow();
       }catch(java.lang.IllegalArgumentException e0){
          this.stopFlipping();
       }
       return;
    }
}
