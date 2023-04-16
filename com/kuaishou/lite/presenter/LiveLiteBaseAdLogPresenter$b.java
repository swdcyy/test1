package com.kuaishou.lite.presenter.LiveLiteBaseAdLogPresenter$b;
import java.lang.Runnable;
import com.kuaishou.lite.presenter.LiveLiteBaseAdLogPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveLiteBaseAdLogPresenter$b implements Runnable	// class@00093c
{
    public final LiveLiteBaseAdLogPresenter b;

    public void LiveLiteBaseAdLogPresenter$b(LiveLiteBaseAdLogPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveLiteBaseAdLogPresenter$b.class, "1")) {
          return;
       }
       this.b.o9();
       LiveLiteBaseAdLogPresenter$b tb = this.b;
       tb.C = tb.j9() + 500;
       return;
    }
}
