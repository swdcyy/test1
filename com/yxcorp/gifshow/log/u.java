package com.yxcorp.gifshow.log.u;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import android.util.Log;
import k2b.u1;
import h8c.a;
import q87.c;

public final class u implements g	// class@001b4d
{
    public static final u b;

    static {
       u.b = new u();
    }
    public void u(){
       super();
    }
    public final void accept(Object p0){
       if (a.t().d("periodLogErrorReport", false)) {
          u1.R("PeriodLogUploadError", Log.getStackTraceString(p0), 5);
       }
       a.C().e("PeriodLog", "PeriodLogUploadError", p0);
       return;
    }
}
