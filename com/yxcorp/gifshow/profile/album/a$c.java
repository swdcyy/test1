package com.yxcorp.gifshow.profile.album.a$c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileEditTag;
import java.util.List;
import v2c.e;
import v2c.g;

public final class a$c implements g	// class@001213
{
    public static final a$c b;

    static {
       a$c.b = new a$c();
    }
    public void a$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          g.d(KsLogProfileEditTag.EDIT_IMAGE_SELECT.appendTag("ProfileImageSelectSupplier"), "get plugin error: ", p0);
       }
       return;
    }
}
