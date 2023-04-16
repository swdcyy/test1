package com.yxcorp.gifshow.map.map.markerStyle.BaseMarkerViewStyle$b;
import ub.a;
import h6b.b;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class BaseMarkerViewStyle$b extends a	// class@001c91
{
    public final b b;

    public void BaseMarkerViewStyle$b(b p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, BaseMarkerViewStyle$b.class, "1")) {
       }else {
          BaseMarkerViewStyle$b tb = this.b;
          if (tb != null) {
             tb.onFinish();
          }
       }
       return;
    }
}
