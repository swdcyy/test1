package com.kuaishou.ug.deviceinfo.utils.TelephonyUitlsKt$getIccidList$2;
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

public final class TelephonyUitlsKt$getIccidList$2 extends Lambda implements a	// class@00118a
{
    public final List $iccidList;

    public void TelephonyUitlsKt$getIccidList$2(List p0){
       this.$iccidList = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, TelephonyUitlsKt$getIccidList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.$iccidList.isEmpty() ^ 0x01);
    }
}
