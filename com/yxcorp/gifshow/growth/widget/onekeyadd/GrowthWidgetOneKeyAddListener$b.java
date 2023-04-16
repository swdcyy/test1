package com.yxcorp.gifshow.growth.widget.onekeyadd.GrowthWidgetOneKeyAddListener$b;
import hka.a;
import com.yxcorp.gifshow.growth.widget.onekeyadd.GrowthWidgetOneKeyAddListener;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.System;
import kotlin.jvm.internal.a;
import ira.e;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.growth.widget.onekeyadd.GrowthWidgetOneKeyAddListener$b$a;
import java.lang.Runnable;
import com.kwai.framework.init.c;

public final class GrowthWidgetOneKeyAddListener$b implements a	// class@0015e7
{
    public final GrowthWidgetOneKeyAddListener b;

    public void GrowthWidgetOneKeyAddListener$b(GrowthWidgetOneKeyAddListener p0){
       this.b = p0;
       super();
    }
    public boolean onBackPressed(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       GrowthWidgetOneKeyAddListener$b obj = PatchProxy.apply(objArray, this, GrowthWidgetOneKeyAddListener$b.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       GrowthWidgetOneKeyAddListener obj1 = PatchProxy.apply(objArray, obj, GrowthWidgetOneKeyAddListener.class, "6");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          long l = System.currentTimeMillis();
          b = true;
          if ((l - obj.g) - 800 > 0 && obj.d()) {
             obj1 = obj.d;
             if (obj1 == null) {
                a.S("mOneKeyAddPolicy");
             }
             if (obj1.g()) {
                String str = (obj.f > null)? 1: null;
                if (!str) {
                label_0059 :
                   b = false;
                }
             }
          }else {
             goto label_0059 ;
          }
          obj.g = l;
       }
       if (b) {
          objArray = new Object[0];
          w.C().w("GrowthWidgetOneKeyAddListener", "Policy: "+GrowthWidgetOneKeyAddListener.b(this.b).getClass().getSimpleName(), objArray);
          if (GrowthWidgetOneKeyAddListener.b(this.b).e()) {
             c.c(new GrowthWidgetOneKeyAddListener$b$a(this));
          }else {
             this.b.onInterceptBackPressEvent();
          }
       }
       return 0;
    }
}
