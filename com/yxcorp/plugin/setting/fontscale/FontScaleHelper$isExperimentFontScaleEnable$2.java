package com.yxcorp.plugin.setting.fontscale.FontScaleHelper$isExperimentFontScaleEnable$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.c;

public final class FontScaleHelper$isExperimentFontScaleEnable$2 extends Lambda implements a	// class@0008a3
{
    public static final FontScaleHelper$isExperimentFontScaleEnable$2 INSTANCE;

    static {
       FontScaleHelper$isExperimentFontScaleEnable$2.INSTANCE = new FontScaleHelper$isExperimentFontScaleEnable$2();
    }
    public void FontScaleHelper$isExperimentFontScaleEnable$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, FontScaleHelper$isExperimentFontScaleEnable$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = c.a();
       boolean b = true;
       if (i && i != b) {
          b = false;
       }
       return b;
    }
}
