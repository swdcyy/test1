package com.yxcorp.gifshow.profile.fragment.h;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.profile.fragment.ProfilePhotoFragment;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import v2c.e;
import java.lang.String;
import java.util.HashMap;
import v2c.g;

public final class h implements g	// class@001325
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void accept(Object p0){
       g.c(KsLogProfileTag.RX_ERROR, "tabSelect error", p0, null);
    }
}
