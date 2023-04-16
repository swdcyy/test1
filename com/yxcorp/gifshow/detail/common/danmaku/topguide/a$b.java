package com.yxcorp.gifshow.detail.common.danmaku.topguide.a$b;
import erd.g;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.BaseOpenCloseGuideElement;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.DanmakuCloseGuideElement$onBecomesAttached$1$1;
import k2b.e0;
import msd.l;
import sx9.t;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import e17.i;

public final class a$b implements g	// class@0013fa
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          t.c(this.b.p0(), this.b.q0(), "DAMAKU_OPEN_GUIDE_TOAST", DanmakuCloseGuideElement$onBecomesAttached$1$1.INSTANCE);
          DanmakuSwitchUtils.h.a(false);
          i.a(R.style.arg_RES_7f11066a, 0x7f104846);
       }
       return;
    }
}
