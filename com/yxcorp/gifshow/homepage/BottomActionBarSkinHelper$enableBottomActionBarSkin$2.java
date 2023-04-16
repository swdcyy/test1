package com.yxcorp.gifshow.homepage.BottomActionBarSkinHelper$enableBottomActionBarSkin$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import so5.a;
import com.yxcorp.gifshow.homepage.BottomTabResourceHelper;
import wkd.b;
import sb5.c;
import com.yxcorp.utility.Log;
import kotlin.jvm.internal.a;

public final class BottomActionBarSkinHelper$enableBottomActionBarSkin$2 extends Lambda implements a	// class@001695
{
    public static final BottomActionBarSkinHelper$enableBottomActionBarSkin$2 INSTANCE;

    static {
       BottomActionBarSkinHelper$enableBottomActionBarSkin$2.INSTANCE = new BottomActionBarSkinHelper$enableBottomActionBarSkin$2();
    }
    public void BottomActionBarSkinHelper$enableBottomActionBarSkin$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Boolean obj = PatchProxy.apply(null, this, BottomActionBarSkinHelper$enableBottomActionBarSkin$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       BottomTabResourceHelper b = BottomTabResourceHelper.b;
       Log.g("BottomActionBarSkinHelper", "enableBottomActionBarOpt: "+a.a()+", "+"isResourcePrepared "+b.c()+", enableSkinContainDark "+b.a(-1397878105).c());
       obj = a.a();
       a.o(obj, "KCubeExperimentUtils.enableBottomActionBarOpt\(\)");
       boolean b1 = (obj.booleanValue() && (b.c() && b.a(-1397878105).c()))? true: false;
       return b1;
    }
}
