package com.kuaishou.android.security.base.log.KSecuritySdkILog;
import com.kuaishou.android.security.base.log.KSecuritySdkILog$a;
import com.kuaishou.android.security.base.exception.KSException;
import java.lang.String;

public interface abstract KSecuritySdkILog	// class@00069e
{
    public static final KSecuritySdkILog a;

    static {
       KSecuritySdkILog.a = new KSecuritySdkILog$a();
    }
    void onSecuriySuccess();
    void onSeucrityError(KSException p0);
    void report(String p0,String p1);
}
