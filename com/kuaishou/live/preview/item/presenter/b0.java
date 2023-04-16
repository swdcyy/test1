package com.kuaishou.live.preview.item.presenter.b0;
import erd.g;
import com.kuaishou.live.preview.item.presenter.c0;
import java.lang.Object;
import vs5.h;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import dl3.x0;
import java.lang.Runnable;
import ekd.k1;

public final class b0 implements g	// class@000e13
{
    public final c0 b;

    public void b0(c0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, c0.class, "4")) {
       }else if(p0 != null && TextUtils.n(p0.a, tb.q.getUserId())){
          k1.r(new x0(tb), 0);
       }
       return;
    }
}
