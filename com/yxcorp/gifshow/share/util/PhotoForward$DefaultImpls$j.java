package com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls$j;
import erd.o;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class PhotoForward$DefaultImpls$j implements o	// class@001c8c
{
    public final OperationModel b;

    public void PhotoForward$DefaultImpls$j(OperationModel p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       PhotoForward$DefaultImpls$j uDefaultImpl = PatchProxy.applyOneRefs(p0, this, PhotoForward$DefaultImpls$j.class, "1");
       if (uDefaultImpl != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uDefaultImpl = this.b;
          uDefaultImpl.A(p0);
       }
       return uDefaultImpl;
    }
}
