package com.yxcorp.gifshow.profile.presenter.profile.s;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.lang.String;
import java.util.List;
import v2c.e;
import java.lang.StringBuilder;
import v2c.g;

public final class s implements g	// class@00158b
{
    public static final s b;

    static {
       s.b = new s();
    }
    public void s(){
       super();
    }
    public final void accept(Object p0){
       g.a(KsLogProfileTag.DRAFT.appendTag("MyProfileDraftsInfoPresenter"), "get plugin error:"+p0.getMessage());
    }
}
