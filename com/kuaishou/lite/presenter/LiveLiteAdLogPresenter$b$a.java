package com.kuaishou.lite.presenter.LiveLiteAdLogPresenter$b$a;
import z1.a;
import java.lang.Object;
import mxb.j0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public final class LiveLiteAdLogPresenter$b$a implements a	// class@000933
{
    public final int a;

    public void LiveLiteAdLogPresenter$b$a(int p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteAdLogPresenter$b$a.class, "1")) {
       }else {
          p0.q("num", Integer.valueOf(this.a));
       }
       return;
    }
}
