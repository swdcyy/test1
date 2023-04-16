package com.kwai.library.rickon.c;
import java.lang.Object;
import java.lang.String;
import ln.b;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.List;
import ln.b$a;
import java.util.concurrent.atomic.AtomicReference;
import ry6.e;
import com.kwai.library.rickon.a;
import io.reactivex.g;
import t45.d;
import brd.z;
import com.kwai.library.rickon.b;
import erd.a;

public final class c	// class@0008e1
{

    public void c(){
       super();
    }
    public static t a(String p0,String p1,b p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p1)) {
          return c.c(p0, p1, p2);
       }
       throw new IllegalArgumentException("wrong arg config is empty");
    }
    public static t b(String p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.c(p0, "", p1);
    }
    public static t c(String p0,String p1,b p2){
       AtomicReference obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.b("RxRickon", "uploadFileNoResume\(\) called with: filePath = ["+p0+"], config = ["+p1+"]");
       if (TextUtils.x(p0)) {
          throw new IllegalArgumentException("wrong arg filePath is empty");
       }
       if (TextUtils.x(p2.a)) {
          throw new IllegalArgumentException("wrong arg mToken is empty");
       }
       if (TextUtils.x(p2.d.get(0).a)) {
          throw new IllegalArgumentException("wrong arg no server");
       }
       obj = new AtomicReference();
       a uoa = new a(obj, p2, p1, new e(p0, p2.a), p0);
       return t.create(v7).subscribeOn(d.c).observeOn(d.a).doFinally(new b(p0, obj));
    }
}
