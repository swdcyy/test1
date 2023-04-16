package com.yxcorp.gifshow.profile.presenter.profile.page.a;
import erd.r;
import java.lang.Object;
import com.yxcorp.gifshow.profile.state.ProfileRefreshStatus;

public final class a implements r	// class@001569
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 == ProfileRefreshStatus.ALL || p0 == ProfileRefreshStatus.PROFILE)? true: false;
       return b;
    }
}
