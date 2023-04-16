package com.kwaishou.merchant.troubleshooting.core.TroubleShooting$isWorkInSubThread$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Object;

public final class TroubleShooting$isWorkInSubThread$2 extends Lambda implements a	// class@00134a
{
    public static final TroubleShooting$isWorkInSubThread$2 INSTANCE;

    static {
       TroubleShooting$isWorkInSubThread$2.INSTANCE = new TroubleShooting$isWorkInSubThread$2();
    }
    public void TroubleShooting$isWorkInSubThread$2(){
       super(0);
    }
    public final Boolean invoke(){
       return Boolean.valueOf(a.t().d("TroubleShootingLogNewThreadSwitch", false));
    }
    public Object invoke(){
       return this.invoke();
    }
}
