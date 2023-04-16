package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDownload$a;
import erd.r;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class OperationDownload$a implements r	// class@00147b
{
    public static final OperationDownload$a b;

    static {
       OperationDownload$a.b = new OperationDownload$a();
    }
    public void OperationDownload$a(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, OperationDownload$a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.m(p0);
          b = p0.booleanValue();
       }
       return b;
    }
}
