package com.kwai.edge.reco.xtab.XTabPredictor$generatorGather$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import sm7.i;
import ml5.a;
import com.kwai.sdk.eve.internal.inference.DataBundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.google.protobuf.GeneratedMessageLite;
import wj5.c;
import java.util.concurrent.ConcurrentHashMap;
import msd.a;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Long;
import com.kwai.sdk.eve.internal.inference.DataBundle$TRANSFER;

public final class XTabPredictor$generatorGather$1 extends Lambda implements p	// class@000d5f
{
    public static final XTabPredictor$generatorGather$1 INSTANCE;

    static {
       XTabPredictor$generatorGather$1.INSTANCE = new XTabPredictor$generatorGather$1();
    }
    public void XTabPredictor$generatorGather$1(){
       super(2);
    }
    public final DataBundle invoke(i p0,a p1){
       String str1;
       Integer integer;
       Boolean uBoolean;
       Boolean uBoolean1;
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, XTabPredictor$generatorGather$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       a.p(p1, "triggerEvent");
       DataBundle uDataBundle = new DataBundle();
       GeneratedMessageLite generatedMes = p1.f();
       a.m(generatedMes);
       uDataBundle.a("event", generatedMes);
       c o = c.o;
       String str = "default_xtab_channel_name";
       obj = c.c(o).get(str);
       if (obj != null) {
          str1 = obj.invoke();
          if (str1 != null) {
          label_0043 :
             uDataBundle.a(str, str1);
             str = "last_xtab_enter_timestamp";
             obj = c.c(o).get(str);
             if (obj != null) {
                integer = obj.invoke();
                if (integer != null) {
                label_0060 :
                   uDataBundle.a(str, integer);
                   obj = c.c(o).get("has_enter_xtab");
                   if (obj != null) {
                      uBoolean = obj.invoke();
                      if (uBoolean != null) {
                      label_007a :
                         uDataBundle.a("has_enter_xtab", uBoolean);
                         str1 = "has_enter_xtab_second_map";
                         o = c.c(o).get(str1);
                         if (o != null) {
                            uBoolean1 = o.invoke();
                            if (uBoolean1 != null) {
                            label_0094 :
                               uDataBundle.a(str1, uBoolean1);
                               uDataBundle.a("app_foreground_time_diff", Long.valueOf(c.i));
                               uDataBundle.a("battery_level", Long.valueOf(c.f));
                               uDataBundle.a("on_background_timestamp", Long.valueOf(c.g));
                               uDataBundle.a("network_score", Integer.valueOf(c.h));
                               uDataBundle.b(DataBundle$TRANSFER.VALUE);
                               return uDataBundle;
                            }
                         }
                         uBoolean1 = Boolean.FALSE;
                         goto label_0094 ;
                      }
                   }
                   uBoolean = Boolean.FALSE;
                   goto label_007a ;
                }
             }
             integer = Integer.valueOf(-1);
             goto label_0060 ;
          }
       }
       str1 = "";
       goto label_0043 ;
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
