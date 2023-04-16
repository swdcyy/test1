package com.kuaishou.bowl.core.trigger.a;
import cv.n;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import crd.b;
import java.util.Map;
import cv.c;
import su.o;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import gv.h;
import com.kuaishou.bowl.data.center.data.model.BowlData;
import com.kuaishou.bowl.data.center.data.model.marketing.MarketingRule;
import fv.b;
import com.kuaishou.bowl.data.center.data.model.marketing.RuleEventModel;
import com.kuaishou.bowl.data.center.data.model.marketing.RuleEventModel$Condition;
import com.kuaishou.bowl.data.center.data.model.marketing.EventCondition;
import com.kuaishou.bowl.data.center.data.model.marketing.EventCondition$SubCondition;
import cv.m;
import fv.e;
import java.util.concurrent.TimeUnit;
import brd.t;
import com.kuaishou.bowl.core.trigger.a$a;
import com.kuaishou.bowl.core.trigger.a$b;
import erd.g;

public class a extends n	// class@0011b2
{
    public final List a;

    public void a(){
       super();
       this.a = new ArrayList();
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (uob != null && !uob.isDisposed()) {
             uob.dispose();
          }
       }
       this.a.clear();
       return;
    }
    public String d(){
       return "marketing_trigger";
    }
    public void e(String p0,Map p1,List p2,c p3,String p4){
       h a;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       o oo = o.c();
       Objects.requireNonNull(oo);
       Object[] objArray1 = null;
       Object[] objArray2 = PatchProxy.apply(objArray1, oo, o.class, "31");
       if (objArray2 != PatchProxyResult.class) {
       }else {
          a = oo.c.a;
          if (a != null) {
             BowlData marketingRul1 = a.marketingRuleDatas;
             if (marketingRul1 != null) {
                objArray1 = marketingRul1;
             }
          }
          objArray2 = objArray1;
       }
       if (objArray2 == null || !objArray2.size()) {
          p3.onFailed();
          return;
       }else {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = objArray2.iterator();
          while (iterator.hasNext()) {
             MarketingRule marketingRul = iterator.next();
             if ((b.c).equals(marketingRul.ruleSource)) {
                Iterator iterator1 = marketingRul.ruleEventInfo.conditionList.iterator();
                while (iterator1.hasNext()) {
                   RuleEventModel$Condition uCondition = iterator1.next();
                   if ((b.h).equals(uCondition.eventType)) {
                      uCondition = uCondition.eventParam;
                      if (uCondition != null) {
                         EventCondition conditionLis = uCondition.conditionList;
                         if (conditionLis != null) {
                            EventCondition$SubCondition subCondition = conditionLis.get(0);
                            if (subCondition != null && (subCondition.tagName).equals(b.i)) {
                               m om = new m();
                               om.a = b.g;
                               om.b = 0;
                               om.c = marketingRul;
                               om.e = true;
                               om.h = "marketing_trigger";
                               om.l = p0;
                               om.m = marketingRul.ruleId;
                               int i = e.a(subCondition.values[0].toString(), 0);
                               if (i) {
                                  this.a.add(t.timer((long)i, TimeUnit.SECONDS).subscribe(new a$a(this, om, p3), new a$b(this)));
                               }else {
                                  uArrayList.add(om);
                                  continue ;
                               }
                            }else {
                               continue ;
                            }
                         }else {
                            continue ;
                         }
                      }else {
                         continue ;
                      }
                   }else {
                      continue ;
                   }
                }
             }
          }
          p3.b(uArrayList);
          return;
       }
    }
}
