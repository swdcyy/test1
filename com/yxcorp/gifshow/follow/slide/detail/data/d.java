package com.yxcorp.gifshow.follow.slide.detail.data.d;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.data.FeedsResponse;
import com.yxcorp.gifshow.follow.slide.detail.data.f;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.lang.String;
import java.util.List;
import yga.b;
import yga.c;

public final class d implements g	// class@001108
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void accept(Object p0){
       c.i(KsLogFollowTag.FOLLOW_NIRVANA.appendTag("NirvanaDetailPageList"), "requestSuccess");
    }
}
