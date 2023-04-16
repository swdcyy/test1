package com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$d;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import java.util.List;
import zqa.b$e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import zqa.b$j;
import zqa.b;
import java.util.Objects;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;

public final class GrowthTestLayout$Companion$d extends GrowthTestLayout$Companion$SubTitleScope	// class@00155c
{

    public void GrowthTestLayout$Companion$d(List p0,b$e p1){
       a.p(p0, "models");
       super(p0, p1);
    }
    public final void n(String p0,boolean p1,l p2){
       b uob;
       b uob1;
       if (PatchProxy.isSupport(GrowthTestLayout$Companion$d.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, GrowthTestLayout$Companion$d.class, "1")) {
          return;
       }
       a.p(p0, "title");
       a.p(p2, "subTitleScope");
       b$j oj = new b$j(p0);
       oj.k(p1);
       if (this.i() == null) {
          if (!this.h().contains(oj)) {
             this.h().add(oj);
          }
          uob = this.h().get(this.h().indexOf(oj));
          if (uob instanceof b$j) {
             p2.invoke(new GrowthTestLayout$Companion$SubTitleScope(this.h(), uob));
          }
       }else if(!this.i().g().contains(oj)){
          this.i().d(oj);
       }
       b$e uoe = this.i();
       int i = this.i().g().indexOf(oj);
       Objects.requireNonNull(uoe);
       b$e uoe1 = b$e.class;
       if (PatchProxy.isSupport(uoe1)) {
          uob1 = PatchProxy.applyOneRefs(Integer.valueOf(i), uoe, uoe1, "11");
          if (uob1 != PatchProxyResult.class) {
          label_00bf :
             if (uob1 instanceof b$j) {
                p2.invoke(new GrowthTestLayout$Companion$SubTitleScope(this.h(), uob1));
             }
          }
       }
       int i1 = uoe.h();
       uob = (i >= 0 && i1 > i)? uoe.g().get(i): 0;
       uob1 = uoe;
       goto label_00bf ;
       return;
    }
}
