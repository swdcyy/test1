package com.kuaishou.lite.presenter.LiveLiteAdLogPresenter$b;
import la3.a;
import com.kuaishou.lite.presenter.LiveLiteAdLogPresenter;
import java.lang.Object;
import z1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.lite.presenter.LiveLiteBaseAdLogPresenter;
import com.kuaishou.lite.presenter.LiveLiteAdLogPresenter$b$a;

public final class LiveLiteAdLogPresenter$b implements a	// class@000934
{
    public final LiveLiteAdLogPresenter a;

    public void LiveLiteAdLogPresenter$b(LiveLiteAdLogPresenter p0){
       this.a = p0;
       super();
    }
    public void a(int p0,a p1){
       LiveLiteAdLogPresenter$b uob = LiveLiteAdLogPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "2")) {
          return;
       }
       LiveLiteBaseAdLogPresenter.s9(this.a, p0, p1, null, 4, null);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveLiteAdLogPresenter$b.class, "1")) {
          return;
       }
       LiveLiteBaseAdLogPresenter.s9(this.a, 728, null, null, 6, null);
       return;
    }
    public void c(int p0){
       LiveLiteAdLogPresenter$b uob = LiveLiteAdLogPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "3")) {
          return;
       }
       LiveLiteBaseAdLogPresenter.s9(this.a, 301, null, new LiveLiteAdLogPresenter$b$a(p0), 2, null);
       return;
    }
}
