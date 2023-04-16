package com.kwai.framework.network.b;
import erd.g;
import java.lang.Object;
import com.google.common.collect.ImmutableSet$a;
import java.lang.Integer;
import com.google.common.collect.ImmutableSet;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import njd.a;
import ta6.b;
import java.util.Map;
import ia0.h;
import com.google.common.collect.ImmutableCollection;
import okhttp3.Response;
import okhttp3.Request;
import ujd.d;
import com.kwai.framework.model.router.RouteType;
import com.yxcorp.retrofit.idc.models.Host;
import okhttp3.HttpUrl;
import fjd.b;
import jb6.d;
import ta6.c;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.retrofit.model.KwaiException;

public class b implements g	// class@00179e
{
    public final ImmutableSet b;

    public void b(){
       super();
       ImmutableSet$a uoa = new ImmutableSet$a();
       Integer[] integerArray = new Integer[]{Integer.valueOf(11),Integer.valueOf(15),Integer.valueOf(16)};
       uoa.i(integerArray);
       this.b = uoa.k();
    }
    public void accept(Object p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "1")) {
          return;
       }
       if (!p0 instanceof a) {
          return;
       }
       int i = p0.b();
       if (i == 1) {
          return;
       }
       String str = p0.c();
       String str1 = p0.d();
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i), str, str1, this, b.class, "2")) {
          h oh = b.f.get(Integer.valueOf(i));
          if (oh != null) {
             oh.a(i, str, str1);
          }
       }
       if (this.b.contains(Integer.valueOf(i))) {
          Request request = p0.n().request();
          RouteType routeType = d.a(request, "route-type");
          if (routeType != null) {
             d.a().f(routeType.mName, new Host(request.url().host(), request.url().isHttps()));
          }else {
             Object[] objArray = new Object[0];
             c.C().A("KwaiExceptionConsumer", "RouteType is null. request: "+request, objArray);
          }
       }
       throw new KwaiException(p0);
    }
}
