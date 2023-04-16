package com.yxcorp.gifshow.detail.plc.helper.d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.detail.plc.helper.ApkStatusHelper;
import java.lang.String;
import com.yxcorp.utility.Log;

public final class d implements g	// class@001676
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void accept(Object p0){
       Log.e("ApkStatusHelper", "onAppInstall error", p0);
    }
}
