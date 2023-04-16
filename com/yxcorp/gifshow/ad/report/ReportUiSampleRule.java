package com.yxcorp.gifshow.ad.report.ReportUiSampleRule;
import com.yxcorp.gifshow.ad.report.ReportSampleRule;
import com.yxcorp.gifshow.ad.report.ReportUiSampleRule$a;
import nsd.u;
import java.util.ArrayList;
import com.yxcorp.gifshow.ad.report.ReportUiSampleRule$CheckRule;

public final class ReportUiSampleRule extends ReportSampleRule	// class@0017b1
{
    public final ReportUiSampleRule$CheckRule checkRule;
    public final long delayMs;
    public final String desc;
    public final boolean popDialog;
    public final boolean screenshot;
    public final String screenshotId;
    public final List targetList;
    public static final ReportUiSampleRule$a Companion;
    public static final long serialVersionUID;

    static {
       ReportUiSampleRule.Companion = new ReportUiSampleRule$a(null);
    }
    public void ReportUiSampleRule(){
       super();
       this.desc = "";
       this.targetList = new ArrayList();
       this.checkRule = new ReportUiSampleRule$CheckRule();
       this.screenshotId = "";
       this.screenshot = true;
       this.popDialog = true;
    }
}
