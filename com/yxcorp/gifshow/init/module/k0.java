package com.yxcorp.gifshow.init.module.k0;
import ua.anatolii.graphics.ninepatch.a$a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.init.module.NinePatchInitModule;
import k2b.u1;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class k0 implements a$a	// class@0019c8
{
    public static final k0 a;

    static {
       k0.a = new k0();
    }
    public void k0(){
       super();
    }
    public final void a(Throwable p0,String p1){
       u1.R("nine_patch_bitmap_create_error", p1, 5);
       ExceptionHandler.handleCaughtException(p0);
    }
}
