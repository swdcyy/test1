package com.kuaishou.live.core.show.conditionredpacket.logger.FirstReportType;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.live.core.show.conditionredpacket.logger.FirstReportType$a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;

public final class FirstReportType extends Enum	// class@000aab
{
    public final int type;
    public static final FirstReportType[] $VALUES;
    public static final FirstReportType$a Companion;
    public static final FirstReportType DEFAULT;
    public static final FirstReportType FIRST;
    public static final FirstReportType NOT_FIRST;

    static {
       FirstReportType uFirstReport1;
       FirstReportType[] uFirstReport = new FirstReportType[]{uFirstReport1,uFirstReport1,uFirstReport1};
       uFirstReport1 = new FirstReportType("DEFAULT", 0, -1);
       FirstReportType.DEFAULT = uFirstReport1;
       uFirstReport1 = new FirstReportType("FIRST", 1, 1);
       FirstReportType.FIRST = uFirstReport1;
       uFirstReport1 = new FirstReportType("NOT_FIRST", 2, 0);
       FirstReportType.NOT_FIRST = uFirstReport1;
       FirstReportType.$VALUES = uFirstReport;
       FirstReportType.Companion = new FirstReportType$a(null);
    }
    public void FirstReportType(String p0,int p1,int p2){
       super(p0, p1);
       this.type = p2;
    }
    public static final FirstReportType fromShowTimes(int p0){
       FirstReportType uFirstReport = FirstReportType.class;
       if (PatchProxy.isSupport(uFirstReport)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uFirstReport, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return FirstReportType.Companion.a(p0);
    }
    public static FirstReportType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FirstReportType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FirstReportType.class, p0);
    }
    public static FirstReportType[] values(){
       Object obj = PatchProxy.apply(null, null, FirstReportType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FirstReportType.$VALUES.clone();
    }
    public final int getType(){
       return this.type;
    }
}
