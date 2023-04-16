package com.yxcorp.gifshow.errorlog.FeedErrorCaseReportConfig;
import java.io.Serializable;
import com.yxcorp.gifshow.errorlog.FeedErrorCaseReportConfig$a;
import nsd.u;
import java.lang.Object;
import java.util.List;

public final class FeedErrorCaseReportConfig implements Serializable	// class@000e7e
{
    public List mErrorCaseReportSampleRuleList;
    public static final FeedErrorCaseReportConfig$a Companion;
    public static final long serialVersionUID;

    static {
       FeedErrorCaseReportConfig.Companion = new FeedErrorCaseReportConfig$a(null);
    }
    public void FeedErrorCaseReportConfig(){
       super();
    }
    public final List getMErrorCaseReportSampleRuleList(){
       return this.mErrorCaseReportSampleRuleList;
    }
    public final void setMErrorCaseReportSampleRuleList(List p0){
       this.mErrorCaseReportSampleRuleList = p0;
    }
}
