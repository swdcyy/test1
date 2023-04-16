package com.kwai.slide.play.detail.strongplc.PlcStrongGroup$mLayoutChangeLnr$2$a;
import android.view.View$OnLayoutChangeListener;
import com.kwai.slide.play.detail.strongplc.PlcStrongGroup$mLayoutChangeLnr$2;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import qp7.h;
import qp7.e;
import vq7.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import qp7.d;
import android.view.ViewGroup;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class PlcStrongGroup$mLayoutChangeLnr$2$a implements View$OnLayoutChangeListener	// class@001877
{
    public final PlcStrongGroup$mLayoutChangeLnr$2 b;

    public void PlcStrongGroup$mLayoutChangeLnr$2$a(PlcStrongGroup$mLayoutChangeLnr$2 p0){
       this.b = p0;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(PlcStrongGroup$mLayoutChangeLnr$2$a.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, PlcStrongGroup$mLayoutChangeLnr$2$a.class, "1")) {
             return;
          }
       }
       d uod = this.b.this$0.t();
       if (uod != null) {
          ArrayList uArrayList = uod.a();
          if (uArrayList != null) {
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                d uod1 = iterator.next();
                if (p1 == p5 && (p2 == p6 && (p3 != p7 || p4 != p8))) {
                   View view = uod1.p();
                   if (view != null) {
                      if (view instanceof ViewGroup && !view.getChildCount()) {
                         return;
                      }else {
                         try{
                            while (view instanceof ViewGroup && view.getChildCount() > 0) {
                               View childAt = view.getChildAt(0);
                               if (childAt != null) {
                                  view = childAt;
                               }else {
                                  continue ;
                               }
                            }
                            view.requestLayout();
                         }catch(java.lang.Exception e0){
                            ExceptionHandler.handleCaughtException(new IllegalStateException("fix pip plc ui bug crash!", e0));
                            goto label_0069 ;
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
