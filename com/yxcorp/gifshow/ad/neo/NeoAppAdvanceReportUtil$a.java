package com.yxcorp.gifshow.ad.neo.NeoAppAdvanceReportUtil$a;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.response.magnetic.ProvideNeoInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.commercial.response.magnetic.ProvideNeoInfo$Data;
import kotlin.jvm.internal.a;

public final class NeoAppAdvanceReportUtil$a implements o	// class@001789
{
    public static final NeoAppAdvanceReportUtil$a b;

    static {
       NeoAppAdvanceReportUtil$a.b = new NeoAppAdvanceReportUtil$a();
    }
    public void NeoAppAdvanceReportUtil$a(){
       super();
    }
    public Object apply(Object p0){
       ProvideNeoInfo provideNeoIn = PatchProxy.applyOneRefs(p0, this, NeoAppAdvanceReportUtil$a.class, "1");
       if (provideNeoIn != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          provideNeoIn = p0.mData;
       }
       return provideNeoIn;
    }
}
