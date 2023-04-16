package com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerLayout;
import java.lang.Object;
import java.util.ArrayList;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerLayout$layout$2;
import msd.a;
import qrd.p;
import qrd.s;
import gna.b$b;
import java.util.List;
import gna.b$a;
import java.util.Collection;
import java.lang.String;
import java.lang.Integer;
import android.graphics.drawable.Drawable;
import msd.l;
import gna.b$d;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import gna.b;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerLayout$title$model$1;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerLayout$a;
import qrd.l1;

public final class GrowthCleanerLayout	// class@001353
{
    public final ArrayList a;
    public final p b;

    public void GrowthCleanerLayout(){
       super();
       this.a = new ArrayList();
       this.b = s.c(new GrowthCleanerLayout$layout$2(this));
    }
    public void GrowthCleanerLayout(b$b p0){
       super();
       if (p0 != null) {
          this.a.addAll(p0.z());
       }
       return;
    }
    public static b$d a(GrowthCleanerLayout p0,String p1,String p2,Integer p3,boolean p4,String p5,Integer p6,boolean p7,Drawable p8,boolean p9,l p10,l p11,int p12,Object p13){
       String obj1;
       Object obj2;
       Object obj = p0;
       object oobject = p1;
       int i = p12;
       int i1 = 0;
       boolean b = (i & 0x08)? false: p4;
       object oobject1 = (i & 0x10)? null: p5;
       boolean b1 = (i & 0x40)? false: p7;
       boolean b2 = (i & 0x0100)? false: p9;
       object oobject2 = (i & 0x0200)? null: p10;
       object oobject3 = (i & 0x0400)? null: p11;
       Objects.requireNonNull(p0);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(GrowthCleanerLayout.class)) {
          Object[] objArray = new Object[11];
          objArray[i1] = oobject;
          objArray[1] = null;
          objArray[2] = null;
          objArray[3] = Boolean.valueOf(b);
          objArray[4] = oobject1;
          objArray[5] = null;
          objArray[6] = Boolean.valueOf(b1);
          objArray[7] = null;
          objArray[8] = Boolean.valueOf(b2);
          objArray[9] = oobject2;
          objArray[10] = oobject3;
          obj1 = PatchProxy.apply(objArray, obj, GrowthCleanerLayout.class, "3");
          if (obj1 != patchProxyRe) {
          }else {
             try{
             label_0087 :
                obj1 = "title";
                a.p(oobject, obj1);
                obj2 = PatchProxy.applyOneRefs(oobject, obj, GrowthCleanerLayout.class, "2");
                if (obj2 != patchProxyRe) {
                }else {
                   a.p(oobject, obj1);
                   Iterator iterator = obj.a.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         obj2 = iterator.next();
                         if (!a.g(obj2.i(), oobject)) {
                            continue ;
                         }
                      }else {
                         obj2 = null;
                      }
                      if (!obj2 instanceof b) {
                         obj2 = null;
                      }
                   }
                }
             }catch(java.lang.Exception e0){
             }
             if (obj2 != null) {
                obj1 = obj2;
             }else {
                GrowthCleanerLayout$title$model$1 otitle$model = new GrowthCleanerLayout$title$model$1(p0, p1, null, oobject1, null, oobject2, null, b, null, b1, b2);
                obj1 = obj1.invoke();
             }
             if (oobject3 != null) {
                oobject3.invoke(new GrowthCleanerLayout$a(obj1));
             }
          }
       }else {
          goto label_0087 ;
       }
       return obj1;
    }
}
