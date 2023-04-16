package com.yxcorp.gifshow.profile.fragment.f;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.lang.String;
import java.util.List;
import v2c.e;
import java.lang.StringBuilder;
import v2c.g;

public final class f implements g	// class@001323
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final void accept(Object p0){
       g.a(KsLogProfileTag.PHOTO_RECORD.appendTag("MyProfilePhotoFragment"), "get plugin error:"+p0.getMessage());
    }
}
