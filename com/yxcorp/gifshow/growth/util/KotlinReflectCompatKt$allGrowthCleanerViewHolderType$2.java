package com.yxcorp.gifshow.growth.util.KotlinReflectCompatKt$allGrowthCleanerViewHolderType$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerViewHolderEnum;
import vsd.d;

public final class KotlinReflectCompatKt$allGrowthCleanerViewHolderType$2 extends Lambda implements a	// class@00159a
{
    public static final KotlinReflectCompatKt$allGrowthCleanerViewHolderType$2 INSTANCE;

    static {
       KotlinReflectCompatKt$allGrowthCleanerViewHolderType$2.INSTANCE = new KotlinReflectCompatKt$allGrowthCleanerViewHolderType$2();
    }
    public void KotlinReflectCompatKt$allGrowthCleanerViewHolderType$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       ArrayList obj = PatchProxy.apply(null, this, KotlinReflectCompatKt$allGrowthCleanerViewHolderType$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       GrowthCleanerViewHolderEnum[] growthCleane = GrowthCleanerViewHolderEnum.values();
       int len = growthCleane.length;
       for (int i = 0; i < len; i = i + 1) {
          obj.add(growthCleane[i].getClazz());
       }
       return obj;
    }
}
