package com.yxcorp.gifshow.ad.report.ReportSampleRule;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.report.ReportSampleRule$a;
import nsd.u;
import java.lang.Object;
import java.lang.Boolean;

public class ReportSampleRule implements Serializable	// class@0017ad
{
    public Boolean b;
    public String mMinAppVersion;
    public float sampleRatio;
    public static final ReportSampleRule$a Companion;
    public static final long serialVersionUID;

    static {
       ReportSampleRule.Companion = new ReportSampleRule$a(null);
    }
    public void ReportSampleRule(){
       super();
       this.mMinAppVersion = "";
    }
    public final Boolean getMCanReportByMinAppVersion(){
       return this.b;
    }
    public final void setMCanReportByMinAppVersion(Boolean p0){
       this.b = p0;
    }
}
