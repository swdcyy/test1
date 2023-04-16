package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$m;
import l02.f;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import du1.d;
import androidx.lifecycle.LiveData;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.lifecycle.MutableLiveData;
import yh3.a;

public final class LiveMultiPkRenderCellViewModel$m implements f	// class@001693
{
    public final LiveMultiPkRenderCellViewModel a;

    public void LiveMultiPkRenderCellViewModel$m(LiveMultiPkRenderCellViewModel p0){
       this.a = p0;
       super();
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkRenderCellViewModel$m.class, "1")) {
          return;
       }
       LiveMultiPkRenderCellViewModel$m ta = this.a;
       String str = ta.C.R(ta.getUserId());
       if (!TextUtils.n(str, this.a.D0().getValue())) {
          LiveMultiPkRenderCellViewModel$m ta1 = this.a;
          ta1.r0(ta1.D0()).setValue(str);
       }
       return;
    }
}
