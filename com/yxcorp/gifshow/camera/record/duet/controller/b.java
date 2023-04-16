package com.yxcorp.gifshow.camera.record.duet.controller.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager$LayoutMode;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.camerasdk.q;
import bd9.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.kwai.camerasdk.models.VideoSourceLayout;
import android.graphics.RectF;
import dj9.a;
import com.yxcorp.gifshow.camera.record.base.d;
import aj9.b;
import cd9.h;
import ekd.k1;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import android.view.View;
import com.yxcorp.utility.n;
import java.lang.StringBuilder;
import w46.b;

public final class b implements Runnable	// class@000dbe
{
    public final DuetLayoutManager b;
    public final int c;

    public void b(DuetLayoutManager p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b tb = this.b;
       b tc = this.c;
       tb.o.setImageResource(tb.v.mIconSmallRes);
       DuetLayoutManager q = tb.q;
       if (q != null) {
          q.setText(tb.v.mNameRes);
       }
       int i = 0;
       if (tb.t.G2() != null && tb.v.apply(tb.t.G2(), tb.x, tb.y, tb.z)) {
          if (!PatchProxy.applyVoid(null, tb, DuetLayoutManager.class, "19")) {
             Object[] objArray1 = new Object[i];
             a.D().w("duet", "onLayoutUpdate", objArray1);
             q = tb.v;
             if (q != null && q.mLayoutType != null) {
                DuetLayoutManager$LayoutMode mVideoSource = q.mVideoSourceLayout;
                if (mVideoSource != null) {
                   RectF rectF = a.b(mVideoSource);
                   RectF rectF1 = a.a(tb.v.mVideoSourceLayout);
                   if (!DuetLayoutManager.n2(rectF) || !DuetLayoutManager.n2(rectF1)) {
                      objArray1 = new Object[i];
                      a.D().w("duet", "onLayoutUpdate break 2", objArray1);
                   }else if(tb.h.isRecording() || tb.h.B()){
                      objArray1 = new Object[i];
                      a.D().w("duet", "onLayoutUpdate break 3", objArray1);
                   }else {
                      k1.o(new h(tb, rectF, rectF1));
                   }
                }
             }
             objArray1 = new Object[i];
             a.D().w("duet", "onLayoutUpdate break 1", objArray1);
          }
          tb.r.setVisibility(i);
          if (tb.v == DuetLayoutManager$LayoutMode.IN) {
             n.Y(tb.s, i, i);
          }else {
             n.Y(tb.s, 8, i);
          }
          Object[] objArray = new Object[i];
          a.D().w("duet", "tryApplyLayoutMode retry success "+tc, objArray);
       }else {
          Object[] objArray2 = new Object[i];
          a.D().t("duet", "tryApplyLayoutMode retry fail "+tc, objArray2);
          tb.o2((tc + 1), 300);
       }
       return;
    }
}
