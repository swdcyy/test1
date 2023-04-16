package com.yxcorp.gifshow.growth.util.KotlinReflectCompatKt$allGrowthLocalABTest$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.growth.abtest.GrowthLocalABTestEnum;
import wma.b;

public final class KotlinReflectCompatKt$allGrowthLocalABTest$2 extends Lambda implements a	// class@00159b
{
    public static final KotlinReflectCompatKt$allGrowthLocalABTest$2 INSTANCE;

    static {
       KotlinReflectCompatKt$allGrowthLocalABTest$2.INSTANCE = new KotlinReflectCompatKt$allGrowthLocalABTest$2();
    }
    public void KotlinReflectCompatKt$allGrowthLocalABTest$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       ArrayList obj = PatchProxy.apply(null, this, KotlinReflectCompatKt$allGrowthLocalABTest$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       GrowthLocalABTestEnum[] growthLocalA = GrowthLocalABTestEnum.values();
       int len = growthLocalA.length;
       for (int i = 0; i < len; i = i + 1) {
          obj.add(growthLocalA[i].getInstance());
       }
       return obj;
    }
}
