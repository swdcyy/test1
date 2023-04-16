package com.kuaishou.godzilla.idc.KwaiSpeedTestRequestGenerator;
import java.lang.String;
import com.kuaishou.godzilla.idc.KwaiSpeedTestRequest;

public interface abstract KwaiSpeedTestRequestGenerator	// class@00089e
{

    KwaiSpeedTestRequest createTestRequest(String p0,long p1);
    String getRequestPath();
}
