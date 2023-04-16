package com.kwai.yoda.function.hybrid.GetOfflinePackageDetailFunction$f;
import erd.g;
import com.kwai.yoda.function.hybrid.GetOfflinePackageDetailFunction;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.hybrid.GetOfflinePackageDetailFunction$c;
import gz7.i;
import java.lang.String;
import java.lang.Object;
import gz7.n0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.function.hybrid.GetOfflinePackageDetailFunction$GetOfflinePackageDetailResultPrams;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.yoda.function.c;

public final class GetOfflinePackageDetailFunction$f implements g	// class@0011d8
{
    public final GetOfflinePackageDetailFunction b;
    public final YodaBaseWebView c;
    public final GetOfflinePackageDetailFunction$c d;
    public final i e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;

    public void GetOfflinePackageDetailFunction$f(GetOfflinePackageDetailFunction p0,YodaBaseWebView p1,GetOfflinePackageDetailFunction$c p2,i p3,boolean p4,String p5,String p6,String p7){
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
       if (PatchProxy.applyVoidOneRefs(p0, this, GetOfflinePackageDetailFunction$f.class, "1")) {
       }else {
          GetOfflinePackageDetailFunction$f tb = this.b;
          tb.l(this.c, tb.s(this.d, this.e, this.f), this.g, this.h, null, this.i);
       }
       return;
    }
}
