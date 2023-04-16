package com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls$g;
import erd.o;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class PhotoForward$DefaultImpls$g implements o	// class@001c89
{
    public final OperationModel b;

    public void PhotoForward$DefaultImpls$g(OperationModel p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       PhotoForward$DefaultImpls$g uDefaultImpl = PatchProxy.applyOneRefs(p0, this, PhotoForward$DefaultImpls$g.class, "1");
       if (uDefaultImpl != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uDefaultImpl = this.b;
          uDefaultImpl.A(p0);
          uDefaultImpl.y(p0);
       }
       return uDefaultImpl;
    }
}
