package com.kuaishou.commercial.loggersdk.AdReceivedSuccessManager$ReportInfo;
import java.io.Serializable;
import com.kuaishou.commercial.loggersdk.AdReceivedSuccessManager$ReportInfo$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;

public final class AdReceivedSuccessManager$ReportInfo implements Serializable	// class@001508
{
    public final float mRatio;
    public final List mReportList;
    public static final AdReceivedSuccessManager$ReportInfo$a Companion;
    public static final long serialVersionUID;

    static {
       AdReceivedSuccessManager$ReportInfo.Companion = new AdReceivedSuccessManager$ReportInfo$a(null);
    }
    public void AdReceivedSuccessManager$ReportInfo(){
       super();
       this.mReportList = new ArrayList();
    }
    public final float getMRatio(){
       return this.mRatio;
    }
    public final List getMReportList(){
       return this.mReportList;
    }
}
