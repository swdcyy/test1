package com.yxcorp.gifshow.share.screenshot.e0;
import erd.r;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.IllegalArgumentException;
import java.lang.String;

public final class e0 implements r	// class@001c56
{
    public static final e0 b;

    static {
       e0.b = new e0();
    }
    public void e0(){
       super();
    }
    public final boolean test(Object p0){
       if (p0.booleanValue()) {
          return true;
       }
       throw new IllegalArgumentException("ScreenShotShare3No Permission Granted!");
    }
}
