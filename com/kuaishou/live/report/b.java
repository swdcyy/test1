package com.kuaishou.live.report.b;
import erd.g;
import java.lang.Object;
import com.kuaishou.live.report.ReportResponse;
import com.kuaishou.live.report.ReportResponse$ReportToastMessage;
import java.lang.CharSequence;
import e17.i;

public final class b implements g	// class@000f59
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       p0 = p0.mReportToastMessage;
       if (p0 != null) {
          i.d(R.style.arg_RES_7f110669, p0.mMsg);
       }
       return;
    }
}
