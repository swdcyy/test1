package com.kuaishou.ug.deviceinfo.utils.TelephonyUitlsKt$getCarrierNameList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.util.List;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;

public final class TelephonyUitlsKt$getCarrierNameList$2 extends Lambda implements a	// class@001188
{
    public final List $carrierNameList;

    public void TelephonyUitlsKt$getCarrierNameList$2(List p0){
       this.$carrierNameList = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, TelephonyUitlsKt$getCarrierNameList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.$carrierNameList.isEmpty() ^ 0x01);
    }
}
