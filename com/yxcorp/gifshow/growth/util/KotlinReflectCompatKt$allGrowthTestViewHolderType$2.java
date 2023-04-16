package com.yxcorp.gifshow.growth.util.KotlinReflectCompatKt$allGrowthTestViewHolderType$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolderEnum;
import vsd.d;

public final class KotlinReflectCompatKt$allGrowthTestViewHolderType$2 extends Lambda implements a	// class@00159c
{
    public static final KotlinReflectCompatKt$allGrowthTestViewHolderType$2 INSTANCE;

    static {
       KotlinReflectCompatKt$allGrowthTestViewHolderType$2.INSTANCE = new KotlinReflectCompatKt$allGrowthTestViewHolderType$2();
    }
    public void KotlinReflectCompatKt$allGrowthTestViewHolderType$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       ArrayList obj = PatchProxy.apply(null, this, KotlinReflectCompatKt$allGrowthTestViewHolderType$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       GrowthTestViewHolderEnum[] growthTestVi = GrowthTestViewHolderEnum.values();
       int len = growthTestVi.length;
       for (int i = 0; i < len; i = i + 1) {
          obj.add(growthTestVi[i].getClazz());
       }
       return obj;
    }
}
