package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaSidebarFeedPresenter$a;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaSidebarFeedPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;

public class NasaSidebarFeedPresenter$a implements View$OnLayoutChangeListener	// class@0017f3
{
    public final NasaSidebarFeedPresenter b;

    public void NasaSidebarFeedPresenter$a(NasaSidebarFeedPresenter p0){
       this.b = p0;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport2(NasaSidebarFeedPresenter$a.class, "1")) {
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
          if (PatchProxy.applyVoid(objArray, this, NasaSidebarFeedPresenter$a.class, "1")) {
             return;
          }
       }
       if (p4 != p8 && (!p4 || (p4 != this.b.g1 || (p3 != p7 && (p3 && p3 != this.b.f1))))) {
          if (n.I(this.b.getActivity())) {
             p0.j1 = 0x3f800000;
          }
          this.b.o9();
          NasaSidebarFeedPresenter$a tb = this.b;
          tb.V8(tb.j1);
       }
    label_0085 :
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter$a.class, "1");
       return;
    }
}
