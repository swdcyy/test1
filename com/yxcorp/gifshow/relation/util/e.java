package com.yxcorp.gifshow.relation.util.e;
import com.yxcorp.gifshow.relation.util.f$b;
import java.lang.Object;
import jga.g;
import e17.i;
import android.app.Application;
import o56.a;
import android.content.Context;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class e implements f$b	// class@001a56
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final void a(boolean p0,g p1){
       if (p0) {
          i.a(R.style.arg_RES_7f11066a, 0x7f10427b);
       }else {
          ExceptionHandler.handleException(a.b(), p1.b);
       }
       return;
    }
}
