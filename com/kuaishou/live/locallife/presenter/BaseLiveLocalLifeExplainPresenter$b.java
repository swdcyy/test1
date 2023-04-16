package com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter$b;
import aq5.b;
import com.kuaishou.live.locallife.presenter.BaseLiveLocalLifeExplainPresenter;
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

public final class BaseLiveLocalLifeExplainPresenter$b implements b	// class@000c40
{
    public final BaseLiveLocalLifeExplainPresenter b;

    public void BaseLiveLocalLifeExplainPresenter$b(BaseLiveLocalLifeExplainPresenter p0){
       this.b = p0;
       super();
    }
    public final void e6(a p0,boolean p1){
       boolean b;
       BaseLiveLocalLifeExplainPresenter$b uob = BaseLiveLocalLifeExplainPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       BaseLiveLocalLifeExplainPresenter$b tb = this.b;
       Objects.requireNonNull(tb);
       BaseLiveLocalLifeExplainPresenter$b obj = PatchProxy.apply(null, tb, BaseLiveLocalLifeExplainPresenter.class, "17");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          BaseLiveLocalLifeExplainPresenter v = tb.v;
          a.m(v);
          d uod = v.A0();
          a.o(uod, "mLiveContext!!.bizRelationManager");
          BaseLiveLocalLifeExplainPresenter f = tb.F;
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
       if (obj.D == b) {
          return;
       }else {
          obj.D = b;
          if (obj.P != null && obj.J != null) {
             obj.o9(b);
          }
          return;
       }
    }
}
