package com.yxcorp.gifshow.profile.presenter.profile.h;
import erd.o;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserOwnerCount;
import java.lang.Integer;

public final class h implements o	// class@001494
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final Object apply(Object p0){
       return Integer.valueOf(p0.mOwnerCount.mLike);
    }
}
