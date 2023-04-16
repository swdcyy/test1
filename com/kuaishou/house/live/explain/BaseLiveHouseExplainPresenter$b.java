package com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter$b;
import aq5.b;
import com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter;
import java.lang.Object;
import aq5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import aq5.d;
import fq5.b;

public final class BaseLiveHouseExplainPresenter$b implements b	// class@00077c
{
    public final BaseLiveHouseExplainPresenter b;

    public void BaseLiveHouseExplainPresenter$b(BaseLiveHouseExplainPresenter p0){
       this.b = p0;
       super();
    }
    public final void e6(a p0,boolean p1){
       boolean b;
       BaseLiveHouseExplainPresenter$b uob = BaseLiveHouseExplainPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       BaseLiveHouseExplainPresenter$b tb = this.b;
       Objects.requireNonNull(tb);
       BaseLiveHouseExplainPresenter$b obj = PatchProxy.apply(null, tb, BaseLiveHouseExplainPresenter.class, "18");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          BaseLiveHouseExplainPresenter v = tb.v;
          a.m(v);
          d uod = v.A0();
          a.o(uod, "mLiveContext!!.bizRelationManager");
          BaseLiveHouseExplainPresenter f = tb.F;
          int len = f.length;
          boolean b1 = false;
          int i = 0;
          while (i < len) {
             object oobject = f[i];
             b1 = (b1 || uod.r2(oobject))? true: false;
             i = i + 1;
          }
          b = b1;
       }
       obj = this.b;
       if (obj.E == b) {
          return;
       }else {
          obj.E = b;
          if (obj.Q != null && obj.J != null) {
             obj.j9(b);
          }
          return;
       }
    }
}
