package com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$b;
import fr6.i;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter;
import java.lang.Object;
import wq6.h;
import fr6.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import jr6.b;

public final class BottomActionBarPresenter$b implements i	// class@001747
{
    public final BottomActionBarPresenter a;

    public void BottomActionBarPresenter$b(BottomActionBarPresenter p0){
       this.a = p0;
       super();
    }
    public void a(h p0,int p1){
       h.a(this, p0, p1);
    }
    public void b(h p0,h p1,int p2,int p3,float p4){
       h.b(this, p0, p1, p2, p3, p4);
    }
    public void c(h p0,int p1){
       BottomActionBarPresenter$b uob = BottomActionBarPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       a.p(p0, "tab");
       BottomActionBarPresenter$b ta = this.a;
       if (p1 != ta.p) {
          ta.p = -1;
       }
       BottomActionBarPresenter.P8(ta).z(p1);
       return;
    }
}
