package com.yxcorp.gifshow.log.utils.b;
import java.lang.Throwable;
import android.view.View;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExceptionEvent;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.b$a;

public interface abstract b	// class@001b54
{

    void a();
    boolean b(Throwable p0,View p1);
    boolean c(Throwable p0,ClientEvent$ExceptionEvent p1);
    boolean d(Context p0,Throwable p1,b$a p2);
    boolean e(Context p0,Throwable p1);
}
