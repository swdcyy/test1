package com.kwai.statechart.RootStateChart;
import com.kwai.statechart.StateChart;
import java.util.Map;
import java.util.List;
import ut7.k;
import msd.a;
import ut7.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.statechart.RootStateChart$1;
import nsd.u;
import ut7.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.statechart.RootStateChart$start$3;
import java.util.LinkedList;
import java.lang.IllegalStateException;

public final class RootStateChart extends StateChart	// class@0018e9
{
    public final a k;
    public final a l;

    public void RootStateChart(Map p0,List p1,k p2,a p3,a p4,a p5,a p6,a p7){
       int i = this;
       Object obj = p5;
       Object obj1 = p6;
       Object obj2 = p7;
       a.p(p0, "transitions");
       a.p(p1, "states");
       a.p(p2, "initialState");
       a.p(p3, "nameFetcher");
       a.p(p4, "loggerFetcher");
       a.p(obj, "actionQueue");
       a.p(obj1, "contextFactory");
       a.p(obj2, "initialParamFactory");
       RootStateChart$1 u1 = new RootStateChart$1(obj);
       RootStateChart$1 u11 = u1;
       super(p0, p1, p2, p3, p4, u11, 0);
       i.k = obj1;
       i.l = obj2;
    }
    public void m(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RootStateChart.class, "4")) {
          return;
       }
       a.p(p0, "event");
       this.l(p0);
       return;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, RootStateChart.class, "1")) {
          return;
       }
       int i = 1;
       StateChart stateChart = (this.h() == null)? 1: null;
       if (stateChart) {
          if (this.j ^ i) {
             RootStateChart$start$3 ostart$3 = new RootStateChart$start$3(this);
             a uoa = this.f();
             if (!uoa.b()) {
                uoa.a = i;
                ostart$3.invoke();
                uoa.a = false;
                uoa.a();
             }else {
                uoa.b.add(ostart$3);
             }
             return;
          }else {
             throw new IllegalStateException("bug! Can\'t restart StateChart after stopped".toString());
          }
       }else {
          throw new IllegalStateException("bug! StateChart already started".toString());
       }
    }
}
