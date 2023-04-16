package com.kuaishou.tuna.plc.dynamic_container.view.DynamicAutoTranslator$mMinSlop$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import com.kuaishou.tuna.plc.dynamic_container.util.PlcDynamicUtils;
import lnc.a1;
import java.lang.Float;

public final class DynamicAutoTranslator$mMinSlop$2 extends Lambda implements a	// class@001003
{
    public static final DynamicAutoTranslator$mMinSlop$2 INSTANCE;

    static {
       DynamicAutoTranslator$mMinSlop$2.INSTANCE = new DynamicAutoTranslator$mMinSlop$2();
    }
    public void DynamicAutoTranslator$mMinSlop$2(){
       super(0);
    }
    public final float invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, DynamicAutoTranslator$mMinSlop$2.class, "1");
       if (obj != patchProxyRe) {
          return obj.floatValue();
       }
       obj = PatchProxy.apply(null, null, PlcDynamicUtils.class, "2");
       float f = (obj != patchProxyRe)? obj.floatValue(): (float)a1.d(0x7f070c7f);
       return f;
    }
    public Object invoke(){
       return Float.valueOf(this.invoke());
    }
}
