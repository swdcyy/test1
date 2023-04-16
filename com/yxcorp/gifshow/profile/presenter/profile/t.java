package com.yxcorp.gifshow.profile.presenter.profile.t;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.lang.String;
import java.util.List;
import v2c.e;
import java.lang.StringBuilder;
import v2c.g;

public final class t implements g	// class@00158c
{
    public static final t b;

    static {
       t.b = new t();
    }
    public void t(){
       super();
    }
    public final void accept(Object p0){
       g.a(KsLogProfileTag.DRAFT.appendTag("MyProfileDraftsInfoPresenter"), "get plugin error:"+p0.getMessage());
    }
}
