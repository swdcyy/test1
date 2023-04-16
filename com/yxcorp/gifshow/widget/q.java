package com.yxcorp.gifshow.widget.q;
import java.lang.Object;
import java.util.ArrayList;
import android.app.Activity;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import xyb.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.FlashPointsView;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import tyc.p1;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.FlashPointsView$b;
import java.util.Objects;
import java.lang.StringBuilder;
import java.util.Random;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import java.lang.Runnable;
import java.lang.System;
import java.util.List;

public class q	// class@0019a7
{
    public Activity a;
    public View b;
    public FlashPointsView c;
    public List d;

    public void q(){
       super();
       this.d = new ArrayList();
    }
    public void a(Activity p0){
       this.a = p0;
    }
    public void b(View p0){
       this.b = p0;
    }
    public void c(boolean p0){
       q oq = q.class;
       String str = "1";
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oq, str)) {
          return;
       }
       Object[] objArray = null;
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, oq, "5") && this.c == null) {
          Object[] objArray2 = new Object[i];
          a.D().s("FlashingManager", "add view", objArray2);
          this.c = new FlashPointsView(this.a);
          ViewGroup viewGroup = this.a.findViewById(0x1020002);
          ViewGroup$LayoutParams layoutParams = new ViewGroup$LayoutParams(-1, -1);
          int[] ointArray = new int[2];
          q tb = this.b;
          if (tb == null) {
             tb = viewGroup;
          }
          tb.getLocationInWindow(ointArray);
          this.c.setTranslationY((float)ointArray[1]);
          int i1 = ointArray[1] + tb.getHeight();
          int i2 = viewGroup.getHeight() - 360;
          layoutParams.height = (i1 > i2)? (tb.getHeight() - i1) + i2: tb.getHeight();
          viewGroup.addView(this.c, layoutParams);
       }
       this.c.setEndCallBack(new p1(this));
       oq = this.c;
       Objects.requireNonNull(oq);
       if (!PatchProxy.isSupport(FlashPointsView.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), oq, FlashPointsView.class, str)) {
          Object[] objArray1 = new Object[i];
          a.D().w("FlashPoints", "startFlashing autoTimeout "+p0, objArray1);
          oq.e = p0;
          oq.g = 0;
          oq.b = objArray;
          oq.c = new Random();
          Paint paint = new Paint();
          oq.d = paint;
          paint.setColor(-1);
          oq.d.setStyle(Paint$Style.FILL);
          oq.post(oq.h);
       }
       return;
    }
    public void d(boolean p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oq, "3")) {
          return;
       }
       oq = this.c;
       if (oq != null) {
          Objects.requireNonNull(oq);
          if (!PatchProxy.isSupport(FlashPointsView.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), oq, FlashPointsView.class, "4")) {
             Object[] objArray = new Object[0];
             a.D().w("FlashPoints", "stopFlash", objArray);
             oq.g = System.currentTimeMillis();
             if (!p0) {
                FlashPointsView b = oq.b;
                if (b != null) {
                   b.clear();
                }
                oq.invalidate();
                oq.removeCallbacks(oq.h);
             }
          }
       }
       return;
    }
}
