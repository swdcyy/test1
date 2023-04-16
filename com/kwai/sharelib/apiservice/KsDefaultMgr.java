package com.kwai.sharelib.apiservice.KsDefaultMgr;
import com.kwai.sharelib.apiservice.KsDefaultMgr$Companion;
import nsd.u;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

public final class KsDefaultMgr	// class@0016b9
{
    public static final HashSet a;
    public static final AtomicBoolean b;
    public static final KsDefaultMgr$Companion c;

    static {
       KsDefaultMgr.c = new KsDefaultMgr$Companion(null);
       KsDefaultMgr.a = new HashSet();
       KsDefaultMgr.b = new AtomicBoolean(false);
    }
}
