package com.yxcorp.gifshow.ad.AdNonActionbarProcess$c;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.yxcorp.gifshow.ad.AdNonActionbarProcess;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.ad.AdProcess;

public final class AdNonActionbarProcess$c implements PopupInterface$d	// class@0014d4
{
    public final AdNonActionbarProcess a;

    public void AdNonActionbarProcess$c(AdNonActionbarProcess p0){
       this.a = p0;
       super();
    }
    public final void a(c p0,int p1){
       AdNonActionbarProcess$c uoc = AdNonActionbarProcess$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1")) {
          return;
       }
       AdNonActionbarProcess$c ta = this.a;
       ta.z(ta.d(), p1);
       return;
    }
}
