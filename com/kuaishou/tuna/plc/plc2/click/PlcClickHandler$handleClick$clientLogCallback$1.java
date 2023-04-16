package com.kuaishou.tuna.plc.plc2.click.PlcClickHandler$handleClick$clientLogCallback$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import f4a.b0;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PlcClickHandler$handleClick$clientLogCallback$1 extends Lambda implements a	// class@001051
{
    public final int $actionType;
    public final b0 $plcLogger;
    public final int $viewType;

    public void PlcClickHandler$handleClick$clientLogCallback$1(int p0,b0 p1,int p2){
       this.$viewType = p0;
       this.$plcLogger = p1;
       this.$actionType = p2;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final l1 invoke(){
       Object[] objArray = null;
       PlcClickHandler$handleClick$clientLogCallback$1 obj = PatchProxy.apply(objArray, this, PlcClickHandler$handleClick$clientLogCallback$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.$viewType;
       if (obj != 1) {
          if (obj != 2) {
             if (obj != 3) {
                if (obj != 4) {
                   if (obj == 6) {
                      obj = this.$plcLogger;
                      if (obj != null) {
                         obj.d(this.$actionType);
                      }
                   }
                   objArray = l1.a;
                }else {
                   obj = this.$plcLogger;
                   if (obj != null) {
                      obj.r(this.$actionType);
                      objArray = l1.a;
                   }
                }
             }else {
                obj = this.$plcLogger;
                if (obj != null) {
                   obj.l(this.$actionType);
                   objArray = l1.a;
                }
             }
          }else {
             obj = this.$plcLogger;
             if (obj != null) {
                obj.t(this.$actionType);
                objArray = l1.a;
             }
          }
       }else {
          obj = this.$plcLogger;
          if (obj != null) {
             obj.a(this.$actionType);
             objArray = l1.a;
          }
       }
       return objArray;
    }
}
