package com.kwai.nearby.local.view.NearbyPageCostContainer;
import android.widget.FrameLayout;
import android.content.Context;
import mrd.a;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import java.lang.System;
import java.lang.Long;

public class NearbyPageCostContainer extends FrameLayout	// class@00100a
{
    public boolean b;
    public final a c;

    public void NearbyPageCostContainer(Context p0){
       super(p0);
       this.b = false;
       this.c = a.g();
    }
    public void NearbyPageCostContainer(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = false;
       this.c = a.g();
    }
    public void NearbyPageCostContainer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = false;
       this.c = a.g();
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyPageCostContainer.class, "2")) {
          return;
       }
       super.dispatchDraw(p0);
       if (this.b == null) {
          this.b = true;
          this.c.onNext(Long.valueOf(System.currentTimeMillis()));
       }
       return;
    }
}
