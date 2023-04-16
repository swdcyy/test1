package com.kuaishou.tuna.plc.dynamic_container.util.PlcDynamicKeyboardAdapter$mNeedAdapterOnFocusedView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.tuna.plc.dynamic_container.util.PlcDynamicUtils;

public final class PlcDynamicKeyboardAdapter$mNeedAdapterOnFocusedView$2 extends Lambda implements a	// class@000ff9
{
    public static final PlcDynamicKeyboardAdapter$mNeedAdapterOnFocusedView$2 INSTANCE;

    static {
       PlcDynamicKeyboardAdapter$mNeedAdapterOnFocusedView$2.INSTANCE = new PlcDynamicKeyboardAdapter$mNeedAdapterOnFocusedView$2();
    }
    public void PlcDynamicKeyboardAdapter$mNeedAdapterOnFocusedView$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicKeyboardAdapter$mNeedAdapterOnFocusedView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return PlcDynamicUtils.p(true);
    }
}
