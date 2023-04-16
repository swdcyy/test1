package com.yxcorp.login.bind.presenter.j;
import w4.j;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import android.util.Log;
import k2b.u1;

public final class j implements j	// class@001a7e
{
    public static final j a;

    static {
       j.a = new j();
    }
    public void j(){
       super();
    }
    public final void onResult(Object p0){
       u1.R("risk_lottie_res_error", Log.getStackTraceString(p0), 9);
    }
}
