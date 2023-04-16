package com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter$a;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import bf5.q;
import lnc.d2;
import uw9.o;
import q87.c;

public class MilanoProfileSidePresenter$a implements View$OnLayoutChangeListener	// class@001536
{
    public final MilanoProfileSidePresenter b;

    public void MilanoProfileSidePresenter$a(MilanoProfileSidePresenter p0){
       this.b = p0;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(MilanoProfileSidePresenter$a.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, MilanoProfileSidePresenter$a.class, "1")) {
             return;
          }
       }
       if (p4 != p8 && (!p4 || (p4 != this.b.O.a || (d2.g() && (p3 != p7 && p3))))) {
          this.b.x9();
          MilanoProfileSidePresenter$a tb = this.b;
          if (tb.Z0 != null && tb.a1 != null) {
             tb.b1 = true;
             Object[] objArray1 = new Object[0];
             o.C().w("MilanoProfileSideP", "layout change when viewpager is scrolling in multi window mode.", objArray1);
             return;
          }else {
             tb.V8();
             this.b.l9();
          }
       }
       return;
    }
}
