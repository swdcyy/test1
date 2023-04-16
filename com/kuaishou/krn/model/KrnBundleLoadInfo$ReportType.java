package com.kuaishou.krn.model.KrnBundleLoadInfo$ReportType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KrnBundleLoadInfo$ReportType extends Enum	// class@0008fe
{
    public static final KrnBundleLoadInfo$ReportType[] $VALUES;
    public static final KrnBundleLoadInfo$ReportType REPORT_ON_BACKEND;
    public static final KrnBundleLoadInfo$ReportType REPORT_ON_CONTENTAPPEAR_DELAY_3MIN;
    public static final KrnBundleLoadInfo$ReportType REPORT_ON_FMP;
    public static final KrnBundleLoadInfo$ReportType REPORT_ON_PAGE_EXIT;

    static {
       KrnBundleLoadInfo$ReportType reportType = new KrnBundleLoadInfo$ReportType("REPORT_ON_PAGE_EXIT", 0);
       KrnBundleLoadInfo$ReportType.REPORT_ON_PAGE_EXIT = reportType;
       KrnBundleLoadInfo$ReportType reportType1 = new KrnBundleLoadInfo$ReportType("REPORT_ON_BACKEND", 1);
       KrnBundleLoadInfo$ReportType.REPORT_ON_BACKEND = reportType1;
       KrnBundleLoadInfo$ReportType reportType2 = new KrnBundleLoadInfo$ReportType("REPORT_ON_FMP", 2);
       KrnBundleLoadInfo$ReportType.REPORT_ON_FMP = reportType2;
       KrnBundleLoadInfo$ReportType reportType3 = new KrnBundleLoadInfo$ReportType("REPORT_ON_CONTENTAPPEAR_DELAY_3MIN", 3);
       KrnBundleLoadInfo$ReportType.REPORT_ON_CONTENTAPPEAR_DELAY_3MIN = reportType3;
       KrnBundleLoadInfo$ReportType[] reportTypeAr = new KrnBundleLoadInfo$ReportType[]{reportType,reportType1,reportType2,reportType3};
       KrnBundleLoadInfo$ReportType.$VALUES = reportTypeAr;
    }
    public void KrnBundleLoadInfo$ReportType(String p0,int p1){
       super(p0, p1);
    }
    public static KrnBundleLoadInfo$ReportType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KrnBundleLoadInfo$ReportType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KrnBundleLoadInfo$ReportType.class, p0);
    }
    public static KrnBundleLoadInfo$ReportType[] values(){
       Object obj = PatchProxy.apply(null, null, KrnBundleLoadInfo$ReportType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KrnBundleLoadInfo$ReportType.$VALUES.clone();
    }
}
