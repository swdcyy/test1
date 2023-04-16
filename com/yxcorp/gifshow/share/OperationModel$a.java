package com.yxcorp.gifshow.share.OperationModel$a;
import erd.g;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.SharePlatformDataResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import trd.u;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import java.util.Iterator;
import com.yxcorp.gifshow.model.SharePlatformData;
import java.util.Map;
import com.yxcorp.utility.Log;

public final class OperationModel$a implements g	// class@001b59
{
    public final OperationModel b;

    public void OperationModel$a(OperationModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       SharePlatformDataResponse obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, OperationModel$a.class, "1")) {
       }else {
          SharePlatformDataResponse mSharePlatfo = p0.mSharePlatformList;
          a.o(mSharePlatfo, "it.mSharePlatformList");
          LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(u.Y(mSharePlatfo, 10)), 16));
          Iterator iterator = mSharePlatfo.iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             linkedHashMa.put(obj.mSharePlatform, obj);
          }
          OperationModel$a tb = this.b;
          obj = p0.mShareId;
          if (obj == null) {
             String str = "";
          }
          tb.B(obj);
          this.b.h.clear();
          this.b.h.putAll(linkedHashMa);
          Log.d("ShareDebugLog", p0.toJson());
       }
       return;
    }
}
