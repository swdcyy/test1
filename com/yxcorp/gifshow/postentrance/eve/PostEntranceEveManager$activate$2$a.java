package com.yxcorp.gifshow.postentrance.eve.PostEntranceEveManager$activate$2$a;
import erd.g;
import java.lang.Object;
import sm7.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a0c.g;
import java.lang.StringBuilder;
import q87.c;
import ml5.a;
import java.util.Map;
import java.lang.Double;
import java.lang.Integer;
import vzb.a;
import com.yxcorp.gifshow.util.rx.RxBus;

public final class PostEntranceEveManager$activate$2$a implements g	// class@001047
{
    public static final PostEntranceEveManager$activate$2$a b;

    static {
       PostEntranceEveManager$activate$2$a.b = new PostEntranceEveManager$activate$2$a();
    }
    public void PostEntranceEveManager$activate$2$a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostEntranceEveManager$activate$2$a.class, "1")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          g.C().w("PostEntranceEvePresenter", "result: "+p0, objArray);
          p0 = p0.f();
          Object[] objArray1 = null;
          p0 = (p0 != null)? p0.d(): objArray1;
          Object[] objArray2 = (p0 != null)? p0.get("materialId"): objArray1;
          if (!objArray2 instanceof String) {
             objArray2 = objArray1;
          }
          objArray = (p0 != null)? p0.get("materialType"): objArray1;
          if (!objArray instanceof Double) {
             objArray = objArray1;
          }
          Integer integer = (objArray != null)? Integer.valueOf((int)objArray.doubleValue()): objArray1;
          Object[] objArray3 = (p0 != null)? p0.get("scheme"): objArray1;
          if (!objArray3 instanceof String) {
             objArray3 = objArray1;
          }
          p0 = (p0 != null)? p0.get("iconUrl"): objArray1;
          if (p0 instanceof String) {
             objArray1 = p0;
          }
          int i1 = 1;
          int i2 = (objArray2 == null || !objArray2.length())? 1: 0;
          if (!i2 && integer != null) {
             if (objArray3 != null && objArray3.length()) {
                i1 = 0;
             }
             if (i1 || (objArray1 != null && integer.intValue())) {
                i1 = new a(objArray2, integer.intValue(), objArray3, objArray1);
                Object[] objArray4 = new Object[i];
                g.C().w("PostEntranceEvePresenter", "output bundle success, data is: "+i1, objArray4);
                RxBus.f.b(i1);
             }
          }
       label_00d9 :
          objArray1 = new Object[i];
          g.C().w("PostEntranceEvePresenter", "output bundle, but data is empty", objArray1);
       }
       return;
    }
}
