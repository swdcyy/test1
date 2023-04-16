package com.kwai.wake.net.MatrixApiService;
import com.android.kwai.foundation.network.IRpcService;
import java.lang.String;
import java.util.Map;
import com.android.kwai.foundation.network.SyncResult;
import asd.c;
import java.lang.Object;

public interface abstract MatrixApiService implements IRpcService	// class@00110f
{

    SyncResult fetchConfig(String p0,String p1,String p2,String p3,String p4,Map p5);
    Object fetchControl(String p0,Map p1,c p2);
}
