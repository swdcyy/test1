package com.kuaishou.live.common.multiinteract.stage.MultiInteractPrefDowngradeLayoutConfigInterceptor$b;
import java.util.Comparator;
import java.lang.Object;
import fe3.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import fe3.g;
import fe3.f;

public final class MultiInteractPrefDowngradeLayoutConfigInterceptor$b implements Comparator	// class@001802
{
    public static final MultiInteractPrefDowngradeLayoutConfigInterceptor$b b;

    static {
       MultiInteractPrefDowngradeLayoutConfigInterceptor$b.b = new MultiInteractPrefDowngradeLayoutConfigInterceptor$b();
    }
    public void MultiInteractPrefDowngradeLayoutConfigInterceptor$b(){
       super();
    }
    public int compare(Object p0,Object p1){
       int i;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MultiInteractPrefDowngradeLayoutConfigInterceptor$b.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          int i1 = p0.e().b() * p0.e().a();
          int i2 = p1.e().b() * p1.e().a();
          i = (i1 == i2)? p0.d().a() - p1.d().a(): i2 - i1;
       }
       return i;
    }
}
