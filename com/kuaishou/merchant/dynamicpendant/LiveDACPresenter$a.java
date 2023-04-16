package com.kuaishou.merchant.dynamicpendant.LiveDACPresenter$a;
import java.lang.Runnable;
import com.kuaishou.merchant.dynamicpendant.LiveDACPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveDACPresenter$a implements Runnable	// class@00168c
{
    public final LiveDACPresenter b;

    public void LiveDACPresenter$a(LiveDACPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveDACPresenter$a.class, "1")) {
          return;
       }
       this.b.S8();
       return;
    }
}
