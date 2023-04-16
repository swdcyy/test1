package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$h;
import erd.g;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import java.lang.Boolean;

public final class LiveMultiPkRenderCellViewModel$h implements g	// class@00168e
{
    public final LiveMultiPkRenderCellViewModel b;

    public void LiveMultiPkRenderCellViewModel$h(LiveMultiPkRenderCellViewModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkRenderCellViewModel$h.class, "1")) {
       }else {
          LiveMultiPkRenderCellViewModel$h tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveMultiPkRenderCellViewModel.class, "10") && (p0 != null && p0.d == null)) {
             n b = p0.b;
             if (b == null || b.equals(tb.getUserId())) {
                tb.r0(tb.g).setValue(Boolean.valueOf(p0.c));
             }
          }
       }
       return;
    }
}
