package com.yxcorp.gifshow.tuna_post.business2.a;
import erd.g;
import com.yxcorp.gifshow.tuna_post.business2.ShareBusinessLinkFragmentWrapper;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.kuaishou.tuna_logger.KsLogTunaPlcTag;
import java.lang.String;
import java.util.List;
import tmc.e;
import msd.a;
import c15.b;

public final class a implements g	// class@001e2e
{
    public final ShareBusinessLinkFragmentWrapper b;

    public void a(ShareBusinessLinkFragmentWrapper p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       b.e(KsLogTunaPlcTag.PLC_POST.appendTag("onViewCreated"), new e(tb), p0);
       tb.eh(false);
       tb.dh(true);
    }
}
