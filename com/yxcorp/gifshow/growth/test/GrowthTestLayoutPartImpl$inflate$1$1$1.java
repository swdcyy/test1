package com.yxcorp.gifshow.growth.test.GrowthTestLayoutPartImpl$inflate$1$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.test.GrowthTestLayoutPartImpl$inflate$1$1$1$1;
import msd.a;
import java.lang.Comparable;
import zqa.c;
import com.yxcorp.gifshow.growth.test.GrowthTestLayoutPartImpl$inflate$1$1$1$2;

public final class GrowthTestLayoutPartImpl$inflate$1$1$1 extends Lambda implements l	// class@0014fc
{
    public static final GrowthTestLayoutPartImpl$inflate$1$1$1 INSTANCE;

    static {
       GrowthTestLayoutPartImpl$inflate$1$1$1.INSTANCE = new GrowthTestLayoutPartImpl$inflate$1$1$1();
    }
    public void GrowthTestLayoutPartImpl$inflate$1$1$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$SubTitleScope p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestLayoutPartImpl$inflate$1$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.k();
       p0.a("【红包挽留弹窗】", GrowthTestLayoutPartImpl$inflate$1$1$1$1.INSTANCE);
       GrowthTestLayout$Companion$SubTitleScope uCompanion$S = p0;
       GrowthTestLayout$Companion$SubTitleScope.m(uCompanion$S, "收集数据使用测试配置", "KEY_KGI_RED_PACK_TEST", null, 4, null);
       GrowthTestLayout$Companion$SubTitleScope.f(uCompanion$S, "收集数据Mock测试配置", "", null, "KEY_KGI_RED_PACK_MOCK", 4, null);
       p0.k();
       GrowthTestLayout$Companion$SubTitleScope.m(uCompanion$S, "云端模型使用测试配置", "KEY_KGI_CLOUD_RP_TEST", null, 4, null);
       GrowthTestLayout$Companion$SubTitleScope.m(uCompanion$S, "云端模型使用客户端时间", "KEY_KGI_CLOUD_RP_TIME", null, 4, null);
       GrowthTestLayout$Companion$SubTitleScope.f(uCompanion$S, "云端模型Mock测试配置", "", null, "KEY_KGI_CLOUD_RP_MOCK", 4, null);
       p0.a("云端模型清除弹窗记录", GrowthTestLayoutPartImpl$inflate$1$1$1$2.INSTANCE);
       p0.k();
       p0.k();
       return;
    }
}
