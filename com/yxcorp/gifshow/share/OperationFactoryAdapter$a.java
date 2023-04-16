package com.yxcorp.gifshow.share.OperationFactoryAdapter$a;
import com.yxcorp.gifshow.share.OperationFactoryAdapter;
import msd.l;
import com.yxcorp.gifshow.share.OperationModel;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class OperationFactoryAdapter$a extends OperationFactoryAdapter	// class@001b54
{

    public void OperationFactoryAdapter$a(l p0){
       super(p0);
    }
    public List b(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OperationFactoryAdapter$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return CollectionsKt__CollectionsKt.E();
    }
}
