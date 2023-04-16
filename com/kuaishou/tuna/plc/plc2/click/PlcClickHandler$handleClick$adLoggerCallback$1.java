package com.kuaishou.tuna.plc.plc2.click.PlcClickHandler$handleClick$adLoggerCallback$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.tuna.plc.plc2.click.PlcClickHandler;
import f4a.b0;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper;

public final class PlcClickHandler$handleClick$adLoggerCallback$1 extends Lambda implements l	// class@001050
{
    public final int $actionType;
    public final b0 $plcLogger;
    public final int $viewType;
    public final PlcClickHandler this$0;

    public void PlcClickHandler$handleClick$adLoggerCallback$1(PlcClickHandler p0,int p1,b0 p2,int p3){
       this.this$0 = p0;
       this.$viewType = p1;
       this.$plcLogger = p2;
       this.$actionType = p3;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.intValue());
       return l1.a;
    }
    public final void invoke(int p0){
       PlcClickHandler d;
       b0 uob0;
       if (PatchProxy.isSupport(PlcClickHandler$handleClick$adLoggerCallback$1.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PlcClickHandler$handleClick$adLoggerCallback$1.class, "1")) {
          return;
       }
       PlcClickHandler$handleClick$adLoggerCallback$1 t$viewType = this.$viewType;
       if (t$viewType != 1) {
          if (t$viewType != 2) {
             if (t$viewType != 3) {
                if (t$viewType != 4) {
                   if (t$viewType == 6) {
                      d = this.this$0.d;
                      if (d != null) {
                         uob0 = d.h();
                         if (uob0 != null) {
                            uob0.n(this.$actionType, p0);
                         }
                      }
                   }
                }else {
                   d = this.this$0.d;
                   if (d != null) {
                      uob0 = d.h();
                      if (uob0 != null) {
                         uob0.w(this.$actionType, p0);
                      }
                   }
                }
             }else {
                d = this.this$0.d;
                if (d != null) {
                   uob0 = d.h();
                   if (uob0 != null) {
                      uob0.b(this.$actionType, p0);
                   }
                }
             }
          }else {
             d = this.this$0.d;
             if (d != null) {
                uob0 = d.h();
                if (uob0 != null) {
                   uob0.x(this.$actionType, p0);
                }
             }
          }
       }else {
          t$viewType = this.$plcLogger;
          if (t$viewType != null) {
             t$viewType.o(this.$actionType, p0);
          }
       }
       return;
    }
}
