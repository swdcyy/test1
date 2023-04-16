package com.kwai.kxb.update.remote.api.ApiResponseCache$removeInvalidBundleSync$removeAllResult$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.util.List;
import java.lang.Object;
import mu6.a;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import iu6.a;
import java.lang.Integer;
import ru6.o;
import com.kwai.kxb.service.BaseServiceProviderKt;
import java.lang.StringBuilder;
import java.lang.Throwable;
import ru6.o$b;

public final class ApiResponseCache$removeInvalidBundleSync$removeAllResult$1 extends Lambda implements l	// class@00080c
{
    public final List $invalidBundles;

    public void ApiResponseCache$removeInvalidBundleSync$removeAllResult$1(List p0){
       this.$invalidBundles = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(a p0){
       StringBuilder str;
       ApiResponseCache$removeInvalidBundleSync$removeAllResult$1 obj = PatchProxy.applyOneRefs(p0, this, ApiResponseCache$removeInvalidBundleSync$removeAllResult$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "bundleInfo");
       obj = this.$invalidBundles;
       boolean b = true;
       if (!obj instanceof Collection || !obj.isEmpty()) {
          Iterator iterator = obj.iterator();
          do {
             if (iterator.hasNext()) {
                a uoa = iterator.next();
                if (a.g(uoa.a(), p0.a())) {
                   int i = uoa.h();
                   Integer integer = p0.d();
                   if (integer != null && i == integer.intValue()) {
                      str = 1;
                   }
                }
                str = null;
             }
          } while (str);
          if (b) {
             o$b.d(BaseServiceProviderKt.a(), p0+" was removed from response cache.", null, 2, null);
          }
          return b;
       }
       b = false;
       goto label_005c ;
    }
}
