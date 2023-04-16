package com.yxcorp.gifshow.follow.common.data.a;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.data.FeedsLiveResponse;
import com.yxcorp.gifshow.follow.common.data.b;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.lang.String;
import java.util.List;
import yga.b;
import yga.c;

public final class a implements g	// class@00102f
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       c.i(KsLogFollowTag.FOLLOW_NIRVANA.appendTag("FollowLivePageList"), "requestSuccess");
    }
}
