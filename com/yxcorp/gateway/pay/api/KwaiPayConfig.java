package com.yxcorp.gateway.pay.api.KwaiPayConfig;
import java.util.List;
import java.lang.String;
import com.yxcorp.gateway.pay.api.SingleMonitorConfig;

public interface abstract KwaiPayConfig	// class@001215
{

    boolean enableAggregateLog();
    boolean enableNative2_0();
    boolean enableNativePayAfterUse();
    boolean enableRefreshTokenAfter401();
    boolean enableReportPaySuccessLog();
    List getAggregateSourceList();
    float getBridgeSamplingRate(String p0,String p1);
    SingleMonitorConfig getSingleMonitorSwitch();
    void refreshToken();
    boolean useKuaishouApiSid();
}
