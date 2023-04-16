package com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpViewModel$a;
import bt1.c;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpViewModel;
import java.lang.Object;
import bt1.b;
import bt1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;

public final class LiveMultiPkMvpViewModel$a implements c	// class@001636
{
    public final LiveMultiPkMvpViewModel b;

    public void LiveMultiPkMvpViewModel$a(LiveMultiPkMvpViewModel p0){
       this.b = p0;
       super();
    }
    public void Y0(){
       b.d(this);
    }
    public void Z1(){
       b.a(this);
    }
    public void e2(a p0){
       b.c(this, p0);
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkMvpViewModel$a.class, "1")) {
          return;
       }
       LiveMultiPkMvpViewModel$a tb = this.b;
       tb.r0(tb.v0()).setValue(null);
       tb = this.b;
       tb.r0(tb.u0()).setValue(null);
       return;
    }
}
