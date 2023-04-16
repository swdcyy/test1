package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.header.vm.LiveMultiLineArenaLineHeaderViewModel$c;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.header.vm.LiveMultiLineArenaLineHeaderViewModel;
import java.lang.Object;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaLiveState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cr1.a;
import java.lang.Enum;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import java.lang.Boolean;
import is1.a;
import lnc.a1;
import dr1.f;
import dr1.d;

public final class LiveMultiLineArenaLineHeaderViewModel$c implements Observer	// class@00152b
{
    public final LiveMultiLineArenaLineHeaderViewModel b;

    public void LiveMultiLineArenaLineHeaderViewModel$c(LiveMultiLineArenaLineHeaderViewModel p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineArenaLineHeaderViewModel$c.class, "1")) {
       }else if(p0 == null){
          int i = a.a[p0.ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (i == 3) {
                   i = this.b;
                   i.r0(i.v0()).setValue(Boolean.TRUE);
                   this.b.u0().c();
                   i = this.b;
                   i.r0(i.w0()).setValue(a1.p(R.string.arg_RES_7f102a0f));
                   i = this.b;
                   i.r0(i.x0()).setValue(Boolean.FALSE);
                   i = this.b.i.d().getValue();
                   if (i != null) {
                      this.b.u0().d(i.i, 1000);
                   }
                }
             }else {
                i = this.b;
                Boolean tRUE = Boolean.TRUE;
                i.r0(i.v0()).setValue(tRUE);
                i = this.b;
                i.r0(i.x0()).setValue(tRUE);
             }
          }
       }
       p0 = this.b;
       p0.r0(p0.v0()).setValue(Boolean.FALSE);
       return;
    }
}
