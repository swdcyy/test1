package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel$b;
import z0.a;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ut1.l;
import du1.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import com.kwai.framework.model.user.UserInfo;
import b61.b;

public final class LiveMultiPkRenderCellViewModel$b implements a	// class@001688
{
    public final LiveMultiPkRenderCellViewModel a;

    public void LiveMultiPkRenderCellViewModel$b(LiveMultiPkRenderCellViewModel p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       UserInfo obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkRenderCellViewModel$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.n(this.a.getUserId(), this.a.C.d()) && !this.a.C.e()) {
          p0 = a1.p(R.string.arg_RES_7f104f11);
       }else {
          obj = new UserInfo();
          obj.mId = p0.c().mId;
          obj.mName = p0.c().mName;
          p0 = b.c(obj);
       }
       return p0;
    }
}
