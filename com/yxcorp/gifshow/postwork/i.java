package com.yxcorp.gifshow.postwork.i;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class i implements g	// class@0010cc
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final void accept(Object p0){
       PostUtils.D("PostWorkInfoCacheHelper", "deleteInvalidDraft delete error", p0);
    }
}
