package com.yxcorp.gifshow.activity.share.presenter.m;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.activity.share.presenter.n;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class m implements g	// class@00140f
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("ShareAtFriendsPresenter", "mEditStatus", p0);
    }
}
