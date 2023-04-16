package com.yxcorp.gifshow.photoad.CommonCardType$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.photoad.CommonCardType;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;

public final class CommonCardType$a	// class@000f58
{

    public void CommonCardType$a(){
       super();
    }
    public void CommonCardType$a(u p0){
       super();
    }
    public final boolean a(CommonCardType p0,QPhoto p1,boolean p2){
       CommonCardType[] obj;
       int this;
       Object obj1;
       if (PatchProxy.isSupport(CommonCardType$a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, CommonCardType$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "targetType");
       a.p(p1, "qPhoto");
       obj = CommonCardType.values();
       ArrayList uArrayList = new ArrayList();
       int len = obj.length;
       boolean b = false;
       this = 0;
       int i = 1;
       while (this < len) {
          object oobject = obj[this];
          if (!p2 || oobject != CommonCardType.NATIVE) {
             i = 0;
          }
          if (!i) {
             uArrayList.add(oobject);
          }
          this++;
       }
       Iterator iterator = uArrayList.iterator();
       while (true) {
          if (iterator.hasNext()) {
             obj1 = iterator.next();
             if (!obj1.valid(p1)) {
                continue ;
             }
          }else {
             obj1 = null;
          }
          if (p0 == obj1) {
             b = true;
             break ;
          }
          break ;
       }
       return b;
    }
}
