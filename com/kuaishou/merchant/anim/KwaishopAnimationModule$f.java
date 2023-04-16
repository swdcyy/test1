package com.kuaishou.merchant.anim.KwaishopAnimationModule$f;
import java.lang.Runnable;
import com.kuaishou.merchant.anim.KwaishopAnimationModule;
import java.util.List;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Double;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Boolean;

public final class KwaishopAnimationModule$f implements Runnable	// class@0014e7
{
    public final KwaishopAnimationModule b;
    public final List c;
    public final double d;
    public final HashMap e;

    public void KwaishopAnimationModule$f(KwaishopAnimationModule p0,List p1,double p2,HashMap p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       Object[] objArray1;
       if (PatchProxy.applyVoid(null, this, KwaishopAnimationModule$f.class, "1")) {
          return;
       }
       KwaishopAnimationModule$f tc = this.c;
       if (tc != null) {
          Iterator iterator = tc.iterator();
          while (iterator.hasNext()) {
             HashMap hashMap = iterator.next();
             Object[] objArray = hashMap.get("nativeID");
             if (!objArray instanceof String) {
                objArray = null;
             }
             String str = "animationKey";
             String str1 = "uri";
             if (objArray != null) {
                KwaishopAnimationModule$f tb = this.b;
                int i = (int)this.d;
                str1 = this.e.get(str1);
                objArray1 = hashMap.get(str);
                if (!objArray1 instanceof String) {
                   objArray1 = null;
                }
                tb.playAnimInner(i, str1, objArray, objArray1);
             }else {
                objArray = hashMap.get("viewTag");
                if (!objArray instanceof Double) {
                   objArray = null;
                }
                if (objArray != null) {
                   KwaishopAnimationModule$f tb1 = this.b;
                   int i1 = (int)this.d;
                   Object obj = this.e.get(str1);
                   Integer integer = Integer.valueOf((int)objArray.doubleValue());
                   objArray = hashMap.get(str);
                   if (!objArray instanceof String) {
                      objArray = null;
                   }
                   Object obj1 = objArray;
                   objArray = hashMap.get("anchorPoint");
                   if (!objArray instanceof HashMap) {
                      objArray = null;
                   }
                   Object obj2 = objArray;
                   objArray1 = hashMap.get("isLoop");
                   if (!objArray1 instanceof Boolean) {
                      objArray1 = null;
                   }
                   tb1.playAnimationInnerV2(i1, obj, integer, obj1, obj2, objArray1);
                }
             }
          }
       }
       return;
    }
}
