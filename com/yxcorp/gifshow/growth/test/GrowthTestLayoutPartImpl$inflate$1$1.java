package com.yxcorp.gifshow.growth.test.GrowthTestLayoutPartImpl$inflate$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.test.GrowthTestLayoutPartImpl$inflate$1;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$d;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.test.GrowthTestLayoutPartImpl$inflate$1$1$1;
import com.yxcorp.gifshow.growth.test.GrowthTestLayoutPartImpl$inflate$1$1$2;
import com.yxcorp.gifshow.growth.test.GrowthTestLayoutPartImpl$inflate$1$1$3;
import kotlin.Pair;
import qrd.r0;
import java.lang.Integer;
import java.util.Map;
import trd.t0;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;

public final class GrowthTestLayoutPartImpl$inflate$1$1 extends Lambda implements l	// class@0014ff
{
    public final GrowthTestLayoutPartImpl$inflate$1 this$0;

    public void GrowthTestLayoutPartImpl$inflate$1$1(GrowthTestLayoutPartImpl$inflate$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestLayoutPartImpl$inflate$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.n("端智能Kgi", false, GrowthTestLayoutPartImpl$inflate$1$1$1.INSTANCE);
       p0.n("常驻通知栏", false, new GrowthTestLayoutPartImpl$inflate$1$1$2(this));
       p0.n("隐私协议新用户文案", false, GrowthTestLayoutPartImpl$inflate$1$1$3.INSTANCE);
       Pair[] pairArray = new Pair[]{r0.a("线上策略", null),r0.a("Base 保持原有逻辑", Integer.valueOf(false)),r0.a("Exp1 返回底导首页顶导初始Tab并刷新", Integer.valueOf(1)),r0.a("Exp2 返回关注Tab若其有小红点，否则返回底导首页顶导初始Tab并刷新", Integer.valueOf(2)),r0.a("Exp3 返回精选页（包含顶导和底导精选）并刷新", Integer.valueOf(3))};
       p0.j("Back 刷新策略", "KEY_NASA_BACK_REFRESH_TYPE", t0.W(pairArray));
       return;
    }
}
