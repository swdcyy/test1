package com.yxcorp.gifshow.profile.presenter.profile.hover.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.profile.presenter.profile.hover.e;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.lang.String;
import java.util.List;
import v2c.e;
import v2c.g;

public final class c implements g	// class@001559
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       g.d(KsLogProfileTag.PHOTO_RECORD.appendTag("MyProfileRecordGuidePresenter"), "get plugin error", p0);
    }
}
