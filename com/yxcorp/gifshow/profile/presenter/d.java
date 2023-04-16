package com.yxcorp.gifshow.profile.presenter.d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.lang.String;
import java.util.List;
import v2c.e;
import v2c.g;

public final class d implements g	// class@001443
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void accept(Object p0){
       g.d(KsLogProfileTag.DRAFT.appendTag("MyProfileDraftsClickPresenter"), "get plugin error: ", p0);
    }
}
