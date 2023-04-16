package com.kwai.yoda.function.hybrid.GetOfflinePackageDetailFunction$g;
import erd.g;
import com.kwai.yoda.function.hybrid.GetOfflinePackageDetailFunction;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.hybrid.GetOfflinePackageDetailFunction$c;
import gz7.i;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.TimeoutException;
import com.kwai.yoda.function.hybrid.GetOfflinePackageDetailFunction$GetOfflinePackageDetailResultPrams;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.yoda.function.c;

public final class GetOfflinePackageDetailFunction$g implements g	// class@0011d9
{
    public final GetOfflinePackageDetailFunction b;
    public final YodaBaseWebView c;
    public final GetOfflinePackageDetailFunction$c d;
    public final i e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;

    public void GetOfflinePackageDetailFunction$g(GetOfflinePackageDetailFunction p0,YodaBaseWebView p1,GetOfflinePackageDetailFunction$c p2,i p3,boolean p4,String p5,String p6,String p7){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       super();
    }
    public void accept(Object p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, GetOfflinePackageDetailFunction$g.class, "1")) {
       }else if(obj1 instanceof TimeoutException){
          GetOfflinePackageDetailFunction$g b = obj.b;
          b.l(obj.c, b.s(obj.d, obj.e, obj.f), obj.g, obj.h, null, obj.i);
       }else {
          obj.b.o(obj.c, obj.g, obj.h, 0x1e84a, obj1.getMessage(), obj.i);
       }
       return;
    }
}
