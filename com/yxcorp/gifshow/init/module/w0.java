package com.yxcorp.gifshow.init.module.w0;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.android.dispatcher.KwaiPush;

public final class w0 implements Runnable	// class@0019e0
{
    public static final w0 b;

    static {
       w0.b = new w0();
    }
    public void w0(){
       super();
    }
    public final void run(){
       KwaiPush.refreshToken();
    }
}
