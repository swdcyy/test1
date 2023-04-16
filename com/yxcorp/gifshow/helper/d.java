package com.yxcorp.gifshow.helper.d;
import java.lang.Object;
import com.yxcorp.gifshow.bean.ContactInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.helper.e;
import brd.t;
import t45.d;
import brd.z;
import crd.b;
import com.yxcorp.gifshow.helper.a;
import io.reactivex.g;
import wkd.b;
import rn9.d;
import java.util.Objects;
import k2b.l;
import java.lang.StringBuilder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ny5.a;
import rn9.b;
import java.lang.Runnable;
import t45.c;
import qra.a;

public final class d	// class@001630
{

    public void d(){
       super();
    }
    public static ContactInfo a(){
       ContactInfo obj = PatchProxy.apply(null, null, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.c();
       d.b(obj).subscribeOn(d.c).subscribe();
       if (obj == null) {
          obj = ContactInfo.EMPTY;
       }
       return obj;
    }
    public static t b(ContactInfo p0){
       d obj = PatchProxy.applyOneRefs(p0, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return t.create(a.b);
       }
       obj = b.a(0x1b02d1b8);
       ContactInfo mPoneNameMap = p0.mPoneNameMap;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(mPoneNameMap, obj, d.class, "6")) {
          if (mPoneNameMap == null) {
             l.b("updateContactMap , map is null , ignore this update");
          }else {
             l.b("updateContactMap , size = "+mPoneNameMap.size()+" , thread is "+d.c());
             obj.a.clear();
             obj.a.putAll(mPoneNameMap);
             obj.b = true;
             a.c(true);
             d.e(obj.a);
             c.a(new b(obj));
          }
       }
       return t.create(new a(p0));
    }
}
