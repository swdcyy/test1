package com.yxcorp.gifshow.follow.stagger.presenter.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.follow.stagger.presenter.g;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.lang.String;
import java.util.List;
import yga.b;
import java.util.HashMap;
import yga.c;

public final class c implements g	// class@00120c
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       c.g(KsLogFollowTag.FOLLOW_STAGGER.appendTag("FollowLinkLogCollectPresenter"), "collectLog", p0, null);
    }
}
