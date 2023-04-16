package com.kuaishou.gifshow.kuaishan.logic.b0;
import erd.o;
import java.lang.Object;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
import com.kuaishou.gifshow.kuaishan.logic.i0$b;
import h90.a;
import u80.e;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import com.kwai.sdk.switchconfig.a;
import aya.b;
import nsd.u;
import java.lang.reflect.Type;
import android.util.Pair;
import java.lang.Integer;
import com.yxcorp.gifshow.encode.k1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import t45.d;
import brd.z;
import x80.p;
import erd.g;

public final class b0 implements o	// class@001a00
{
    public static final b0 b;

    static {
       b0.b = new b0();
    }
    public void b0(){
       super();
    }
    public final Object apply(Object p0){
       Pair pair;
       t ot;
       LinkedList linkedList = new LinkedList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          linkedList.add(iterator.next().b().a);
       }
       Object[] objArray = new Object[0];
       e.D().w("KSPrepareMediaAPI", "prepareMedias: fetchFrame for "+linkedList, objArray);
       Object obj = null;
       if (a.t().d("disableIllegalInfoDetect", 0)) {
          b uob = new b(0, 0, 3, null);
          b value = a.t().getValue("illegalInfoDetectFetchFrameController", b.class, v11);
          pair = new Pair(Integer.valueOf((int)(value.a() * 0x408f400000000000)), Integer.valueOf(value.b()));
       }else {
          pair = obj;
       }
       if (pair == null) {
          ot = PatchProxy.applyOneRefs(linkedList, obj, k1.class, "1");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = k1.a(linkedList, 0, 0, 0);
          }
       }else {
          ot = k1.a(linkedList, pair.second.intValue(), pair.first.intValue(), 0);
       }
       return ot.observeOn(d.a).doOnNext(new p(p0));
    }
}
