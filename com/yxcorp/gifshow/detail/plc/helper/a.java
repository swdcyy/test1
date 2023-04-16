package com.yxcorp.gifshow.detail.plc.helper.a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.utility.Log;

public final class a implements g	// class@00166f
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       Log.e("ApkDownloadHelper", "onAppInstall error", p0);
    }
}
