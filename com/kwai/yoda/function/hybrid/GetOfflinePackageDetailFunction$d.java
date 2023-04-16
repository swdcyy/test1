package com.kwai.yoda.function.hybrid.GetOfflinePackageDetailFunction$d;
import java.util.concurrent.Callable;
import gz7.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class GetOfflinePackageDetailFunction$d implements Callable	// class@0011d6
{
    public final i b;

    public void GetOfflinePackageDetailFunction$d(i p0){
       this.b = p0;
       super();
    }
    public Object call(){
       Object obj = PatchProxy.apply(null, this, GetOfflinePackageDetailFunction$d.class, "1");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): this.b.p();
       return Boolean.valueOf(b);
    }
}
