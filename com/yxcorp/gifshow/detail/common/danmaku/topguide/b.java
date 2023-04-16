package com.yxcorp.gifshow.detail.common.danmaku.topguide.b;
import erd.g;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.d;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.BaseOpenCloseGuideElement;
import tx9.e;
import k2b.e0;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import msd.l;
import sx9.t;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;

public final class b implements g	// class@0013ff
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       e uoe = new e(tb);
       t.c(tb.A, tb.B, "DAMAKU_OPEN_GUIDE_TOAST", uoe);
       DanmakuSwitchUtils.h.a(true);
    }
}
