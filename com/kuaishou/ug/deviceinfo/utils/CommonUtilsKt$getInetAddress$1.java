package com.kuaishou.ug.deviceinfo.utils.CommonUtilsKt$getInetAddress$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.net.InetAddress;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.net.Inet4Address;

public final class CommonUtilsKt$getInetAddress$1 extends Lambda implements l	// class@001186
{
    public static final CommonUtilsKt$getInetAddress$1 INSTANCE;

    static {
       CommonUtilsKt$getInetAddress$1.INSTANCE = new CommonUtilsKt$getInetAddress$1();
    }
    public void CommonUtilsKt$getInetAddress$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(InetAddress p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonUtilsKt$getInetAddress$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       return p0 instanceof Inet4Address;
    }
}
