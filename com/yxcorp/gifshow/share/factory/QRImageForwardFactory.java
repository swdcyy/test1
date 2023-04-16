package com.yxcorp.gifshow.share.factory.QRImageForwardFactory;
import com.yxcorp.gifshow.share.OperationFactoryAdapter;
import msd.l;
import nsd.u;
import com.yxcorp.gifshow.share.OperationModel;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import mhc.p1;
import ajc.i;
import com.yxcorp.gifshow.share.factory.QRImageForwardFactory$buildOperations$1;
import mhc.x;
import msd.p;
import com.yxcorp.gifshow.share.factory.QRImageForwardFactory$buildOperations$2;
import tic.e;
import com.yxcorp.gifshow.share.factory.QRImageForwardFactory$buildOperations$3;
import com.yxcorp.gifshow.share.factory.QRImageForwardFactory$buildOperations$4;
import cjc.a;
import com.yxcorp.gifshow.share.factory.QRImageForwardFactory$buildOperations$5;
import oic.c;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class QRImageForwardFactory extends OperationFactoryAdapter	// class@001b88
{
    public final boolean e;

    public void QRImageForwardFactory(boolean p0){
       super(null, 1, null);
       this.e = p0;
    }
    public List b(OperationModel p0){
       object oobject;
       Object obj = PatchProxy.applyOneRefs(p0, this, QRImageForwardFactory.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       p1[] op1Array = new p1[6];
       i oi = new i(false, null, 0, QRImageForwardFactory$buildOperations$1.INSTANCE, 6, null);
       op1Array[0] = v8;
       oi = new i(true, null, 0, QRImageForwardFactory$buildOperations$2.INSTANCE, 6, null);
       op1Array[1] = v8;
       e uoe = new e(true, null, 0, QRImageForwardFactory$buildOperations$3.INSTANCE, 6, null);
       op1Array[2] = v8;
       uoe = new e(false, null, 0, QRImageForwardFactory$buildOperations$4.INSTANCE, 6, null);
       op1Array[3] = v8;
       a uoa = new a(null, 0, QRImageForwardFactory$buildOperations$5.INSTANCE, 3, null);
       op1Array[4] = v7;
       if (this.e != null) {
          oobject = null;
       }else {
          c uoc = new c(0, 0, null, 7, null);
       }
       op1Array[5] = oobject;
       return CollectionsKt__CollectionsKt.L(op1Array);
    }
}
