package com.yxcorp.gifshow.ad.neo.NeoAppAdvanceReportUtil$requestNeoReport$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.response.magnetic.ProvideNeoInfo;
import java.lang.Boolean;

public final class NeoAppAdvanceReportUtil$requestNeoReport$1 extends Lambda implements l	// class@00178d
{
    public static final NeoAppAdvanceReportUtil$requestNeoReport$1 INSTANCE;

    static {
       NeoAppAdvanceReportUtil$requestNeoReport$1.INSTANCE = new NeoAppAdvanceReportUtil$requestNeoReport$1();
    }
    public void NeoAppAdvanceReportUtil$requestNeoReport$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(ProvideNeoInfo p0){
       boolean b = (p0.mData != null)? true: false;
       return b;
    }
}
