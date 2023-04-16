package com.kuaishou.gifshow.kuaishan.logic.o;
import erd.o;
import java.lang.Object;
import java.util.List;
import com.yxcorp.gifshow.encode.RxExportApi;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import pr3.e;
import java.lang.Iterable;
import com.yxcorp.gifshow.encode.a1;
import pca.f2;

public final class o implements o	// class@001a66
{
    public final boolean b;

    public void o(boolean p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       t ot;
       o tb = this.b;
       RxExportApi rxExportApi = RxExportApi.class;
       if (PatchProxy.isSupport(rxExportApi)) {
          ot = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(tb), null, rxExportApi, "5");
          if (ot != PatchProxyResult.class) {
          }else if(p0.isEmpty()){
             ot = t.error(new IllegalArgumentException("tasks is empty"));
          }else {
             ot = t.fromIterable(p0).concatMap(new a1(tb)).map(new f2(new e(p0.size())));
          }
       }else {
          goto label_001e ;
       }
       return ot;
    }
}
