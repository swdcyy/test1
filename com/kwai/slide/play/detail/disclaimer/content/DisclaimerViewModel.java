package com.kwai.slide.play.detail.disclaimer.content.DisclaimerViewModel;
import rq7.a;
import jh5.a;
import pp7.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import pp7.b;
import com.kwai.slide.play.detail.disclaimer.content.DisclaimerViewModel$MarginModel$Orientation;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kwai.slide.play.detail.disclaimer.content.DisclaimerViewModel$MarginModel;
import qrd.l1;

public final class DisclaimerViewModel extends a	// class@0017ab
{
    public final a d;
    public final a e;
    public final a f;
    public final a g;

    public void DisclaimerViewModel(){
       super(null);
    }
    public void DisclaimerViewModel(a p0){
       super();
       this.d = new a(p0);
       this.e = new a(p0);
       this.f = new a(p0);
       this.g = new a(p0);
    }
    public final void g(float p0){
       DisclaimerViewModel uDisclaimerV = DisclaimerViewModel.class;
       if (PatchProxy.isSupport(uDisclaimerV) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uDisclaimerV, "3")) {
          return;
       }
       this.f.f(Float.valueOf(p0));
       return;
    }
    public final void h(DisclaimerViewModel$MarginModel$Orientation p0,int p1){
       DisclaimerViewModel uDisclaimerV = DisclaimerViewModel.class;
       if (PatchProxy.isSupport(uDisclaimerV) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uDisclaimerV, "5")) {
          return;
       }
       a.p(p0, "orientation");
       uDisclaimerV = this.g;
       DisclaimerViewModel$MarginModel marginModel = new DisclaimerViewModel$MarginModel();
       marginModel.b = p1;
       if (!PatchProxy.applyVoidOneRefs(p0, marginModel, DisclaimerViewModel$MarginModel.class, "1")) {
          a.p(p0, "<set-?>");
          marginModel.a = p0;
       }
       uDisclaimerV.f(marginModel);
       return;
    }
    public final void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DisclaimerViewModel.class, "1")) {
          return;
       }
       a.p(p0, "v");
       this.d.f(p0);
       return;
    }
}
