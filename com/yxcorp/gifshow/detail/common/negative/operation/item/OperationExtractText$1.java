package com.yxcorp.gifshow.detail.common.negative.operation.item.OperationExtractText$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationExtractText;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;

public final class OperationExtractText$1 extends Lambda implements a	// class@00147e
{
    public final OperationExtractText this$0;

    public void OperationExtractText$1(OperationExtractText p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       OperationExtractText obj = PatchProxy.apply(null, this, OperationExtractText$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.this$0.C;
       a.o(obj, "mPhoto");
       return obj.isAllowPhotoDownload();
    }
}
