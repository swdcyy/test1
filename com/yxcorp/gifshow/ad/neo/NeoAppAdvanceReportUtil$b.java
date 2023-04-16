package com.yxcorp.gifshow.ad.neo.NeoAppAdvanceReportUtil$b;
import erd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NeoReportInfo;
import java.lang.Object;

public final class NeoAppAdvanceReportUtil$b implements a	// class@00178a
{
    public final PhotoAdvertisement$NeoReportInfo b;

    public void NeoAppAdvanceReportUtil$b(PhotoAdvertisement$NeoReportInfo p0){
       this.b = p0;
       super();
    }
    public final void run(){
       NeoAppAdvanceReportUtil$b tb = this.b;
       if (tb != null) {
          tb.mIsReportRequesting = false;
       }
       return;
    }
}
