package com.kuaishou.commercial.loggersdk.AdReceivedSuccessManager$ReportAdTypeInfo;
import java.io.Serializable;
import com.kuaishou.commercial.loggersdk.AdReceivedSuccessManager$ReportAdTypeInfo$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;

public final class AdReceivedSuccessManager$ReportAdTypeInfo implements Serializable	// class@001506
{
    public final float mRatio;
    public final List mReportList;
    public static final AdReceivedSuccessManager$ReportAdTypeInfo$a Companion;
    public static final long serialVersionUID;

    static {
       AdReceivedSuccessManager$ReportAdTypeInfo.Companion = new AdReceivedSuccessManager$ReportAdTypeInfo$a(null);
    }
    public void AdReceivedSuccessManager$ReportAdTypeInfo(){
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
