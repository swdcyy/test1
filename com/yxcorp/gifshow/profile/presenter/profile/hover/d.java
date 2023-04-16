package com.yxcorp.gifshow.profile.presenter.profile.hover.d;
import erd.o;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.profile.presenter.profile.hover.e;
import com.kwai.framework.model.user.UserOwnerCount;
import java.lang.Integer;

public final class d implements o	// class@00155a
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object apply(Object p0){
       return Integer.valueOf(p0.mOwnerCount.mPublicPhoto);
    }
}
