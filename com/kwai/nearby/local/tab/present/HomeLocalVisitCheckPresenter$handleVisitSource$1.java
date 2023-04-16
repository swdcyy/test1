package com.kwai.nearby.local.tab.present.HomeLocalVisitCheckPresenter$handleVisitSource$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import dsb.d;

public final class HomeLocalVisitCheckPresenter$handleVisitSource$1 extends Lambda implements l	// class@000fee
{
    public static final HomeLocalVisitCheckPresenter$handleVisitSource$1 INSTANCE;

    static {
       HomeLocalVisitCheckPresenter$handleVisitSource$1.INSTANCE = new HomeLocalVisitCheckPresenter$handleVisitSource$1();
    }
    public void HomeLocalVisitCheckPresenter$handleVisitSource$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.intValue());
       return l1.a;
    }
    public final void invoke(int p0){
       if (PatchProxy.isSupport(HomeLocalVisitCheckPresenter$handleVisitSource$1.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HomeLocalVisitCheckPresenter$handleVisitSource$1.class, "1")) {
          return;
       }
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 == 3) {
                d.b(32);
             }
          }else {
             d.b(64);
          }
       }else {
          d.b(128);
       }
       return;
    }
}
