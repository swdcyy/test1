package com.yxcorp.gifshow.albumwrapper.imagecrop.f;
import erd.o;
import com.yxcorp.gifshow.albumwrapper.imagecrop.g;
import com.yxcorp.gifshow.albumwrapper.imagecrop.RxImageSupplierFragment$Type;
import java.lang.Object;
import zq8.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import com.yxcorp.gifshow.albumwrapper.imagecrop.k;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.albumwrapper.imagecrop.RxImageSupplierFragment;
import z79.h;
import brd.t;

public class f implements o	// class@001b68
{
    public final RxImageSupplierFragment$Type b;
    public final g c;

    public void f(g p0,RxImageSupplierFragment$Type p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object apply(Object p0){
       RxImageSupplierFragment rxImageSuppl = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (rxImageSuppl != PatchProxyResult.class) {
       }else if(p0.b != null){
          p0.b = PublishSubject.g();
          p0 = this.c;
          p0.c.b.b(p0.b, this.b);
          rxImageSuppl = this.c.c.b.b;
       }else {
          rxImageSuppl = t.empty();
       }
       return rxImageSuppl;
    }
}
