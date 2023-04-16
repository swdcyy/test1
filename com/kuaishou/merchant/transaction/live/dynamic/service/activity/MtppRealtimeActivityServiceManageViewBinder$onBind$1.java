package com.kuaishou.merchant.transaction.live.dynamic.service.activity.MtppRealtimeActivityServiceManageViewBinder$onBind$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.MtppRealtimeActivityServiceManageViewBinder;
import java.lang.Object;
import com.google.gson.JsonElement;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import vd4.b;
import com.google.gson.JsonObject;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Throwable;
import nj4.a;
import fg6.a;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeSpikeService;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeWelfareService;
import oj4.a;
import oj4.b;
import androidx.fragment.app.Fragment;
import rk0.b;
import java.lang.Number;
import gd4.d;
import gd4.d$a;
import java.util.Map;
import oj4.c;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class MtppRealtimeActivityServiceManageViewBinder$onBind$1 extends Lambda implements l	// class@0007c4
{
    public final MtppRealtimeActivityServiceManageViewBinder this$0;

    public void MtppRealtimeActivityServiceManageViewBinder$onBind$1(MtppRealtimeActivityServiceManageViewBinder p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JsonElement p0){
       boolean b;
       MtppRealtimeActivityServiceManageViewBinder z;
       String obj4;
       b a;
       int i1;
       c uoc;
       boolean b1;
       JsonElement jsonElement;
       Integer integer;
       Object obj = this;
       a obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, MtppRealtimeActivityServiceManageViewBinder$onBind$1.class, "1")) {
          return;
       }
       MtppRealtimeActivityServiceManageViewBinder$onBind$1 this$0 = obj.this$0;
       Objects.requireNonNull(this$0);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MtppRealtimeActivityServiceManageViewBinder mtppRealtime = MtppRealtimeActivityServiceManageViewBinder.class;
       if (!PatchProxy.applyVoidOneRefs(obj1, this$0, mtppRealtime, "4")) {
          this$0.k9("MtppRealtimeActivityServiceManageViewBinder: updateService="+obj1);
          if (obj1 instanceof JsonObject) {
             Object[] obj2 = obj1;
             obj1 = PatchProxy.applyOneRefs(obj2, this$0, mtppRealtime, "14");
             Object[] objArray = null;
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else {
                jsonElement = obj2.e0("itemId");
                obj4 = (jsonElement != null)? jsonElement.w(): objArray;
                obj4 = (obj4 == null || !obj4.length())? 1: null;
                if (!obj4) {
                   jsonElement = obj2.e0("activityId");
                   obj4 = (jsonElement != null)? jsonElement.w(): objArray;
                   Object[] objArray2 = (obj4 == null || !obj4.length())? 1: 0;
                   if (!objArray2) {
                      b = true;
                   }
                }
                b = false;
             }
             if (b) {
                obj1 = PatchProxy.applyOneRefs(obj2, this$0, mtppRealtime, "15");
                String str = "saleType";
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else {
                   try{
                      jsonElement = obj2.e0(str);
                      integer = (jsonElement != null)? Integer.valueOf(jsonElement.p()): objArray;
                      if (integer != null && (integer.intValue() == 3 || (integer != null && (integer.intValue() == 8 || (integer != null && integer.intValue() == 6))))) {
                         b = true;
                      }
                   }catch(java.lang.Exception e0){
                      this$0.h9("MtppRealtimeActivityServiceManageViewBinder: isSaleTypeValidFailed", e0);
                   }
                label_00d6 :
                   b = false;
                }
                if (b) {
                   obj1 = PatchProxy.applyOneRefs(obj2, this$0, mtppRealtime, "16");
                   if (obj1 != patchProxyRe) {
                   }else {
                      try{
                         jsonElement = obj2.e0(str);
                         integer = (jsonElement != null)? Integer.valueOf(jsonElement.p()): objArray;
                         if (integer != null && (integer.intValue() == 3 || (integer != null && (integer.intValue() == 8 || (integer != null && integer.intValue() == 6))))) {
                            obj1 = a.a.c(obj2, a.class);
                         }
                      }catch(java.lang.Exception e0){
                         this$0.h9("MtppRealtimeActivityServiceManageViewBinder: safelyParseDataFailed", e0);
                      }
                   label_0123 :
                      obj2 = objArray;
                   label_0124 :
                      if (obj2 != null && obj2.a() != null) {
                         a.m(obj2);
                         if (!PatchProxy.applyVoidOneRefs(obj2, this$0, mtppRealtime, "5")) {
                            z = this$0.z;
                            Fragment obj3 = PatchProxy.applyTwoRefs(obj2, z, this$0, mtppRealtime, "17");
                            if (obj3 != patchProxyRe) {
                               b = obj3.booleanValue();
                            }else {
                               Object obj6 = PatchProxy.applyTwoRefs(obj2, z, this$0, mtppRealtime, "19");
                               if (obj6 != patchProxyRe) {
                                  b1 = obj6.booleanValue();
                               }else if(obj2.e() == 3 || (obj2.e() == 8 && z instanceof RealtimeSpikeService)){
                                  b1 = true;
                               }else {
                                  b1 = false;
                               }
                               if (!b1) {
                                  obj6 = PatchProxy.applyTwoRefs(obj2, z, this$0, mtppRealtime, "18");
                                  if (obj6 != patchProxyRe) {
                                     b = obj6.booleanValue();
                                  }else if(obj2.e() == 6 && z instanceof RealtimeWelfareService){
                                     b = true;
                                  }else {
                                     b = false;
                                  }
                                  if (!b) {
                                     b = false;
                                  }
                               }
                               b = true;
                            }
                            if (b) {
                               this$0.k9("MtppRealtimeActivityServiceManageViewBinder: currentServiceValid");
                            }else {
                               obj4 = PatchProxy.applyOneRefs(obj2, this$0, mtppRealtime, "6");
                               if (obj4 != patchProxyRe) {
                               }else {
                                  a = b.a;
                                  obj3 = this$0.R8();
                                  int i = obj2.e();
                                  obj4 = PatchProxy.apply(objArray, this$0, mtppRealtime, "13");
                                  if (obj4 != patchProxyRe) {
                                     b = obj4.intValue();
                                  }else {
                                     try{
                                        obj4 = d.n.a(this$0.R8()).y0().get("queryMode");
                                        if (obj4 != null) {
                                           b = Integer.parseInt(obj4);
                                        }
                                     }catch(java.lang.Exception e0){
                                        this$0.h9("MtppRealtimeActivityServiceManageViewBinder: getQueryModeFailed", e0);
                                     }
                                     b = 0;
                                  }
                                  String str1 = d.n.a(this$0.R8()).y0().get("liveStreamId");
                                  Objects.requireNonNull(a);
                                  if (PatchProxy.isSupport(b.class)) {
                                     i1 = i;
                                     Object obj5 = PatchProxy.applyFourRefs(obj3, Integer.valueOf(i), Integer.valueOf(b), str1, a, b.class, "1");
                                     if (obj5 != patchProxyRe) {
                                        obj4 = obj5;
                                     }
                                  }else {
                                     i1 = i;
                                  }
                                  if (i1 != 3) {
                                     if (i1 != 6) {
                                        if (i1 != 8) {
                                           uoc = new c(obj3, i1, b);
                                        }else {
                                        label_0234 :
                                           uoc = new RealtimeSpikeService(obj3, i1, b, str1);
                                        }
                                     }else {
                                        uoc = new RealtimeWelfareService(obj3, i1, b, str1);
                                     }
                                  }else {
                                     goto label_0234 ;
                                  }
                                  obj4 = uoc;
                               }
                               this$0.z = obj4;
                               obj4.f(new View(this$0.P8()));
                            }
                         }
                         this$0.k9("MtppRealtimeActivityServiceManageViewBinder: serviceBindData");
                         z = this$0.z;
                         a.m(z);
                         Object[] objArray1 = new Object[]{obj2};
                         a.m(obj2);
                         z.i(objArray1);
                         b.m9(this$0, "mtp_activity_state_init", null, 2, null);
                      }
                   }
                   obj2 = obj1;
                   goto label_0124 ;
                }
             }
          }
       label_0264 :
          this$0.k9("MtppRealtimeActivityServiceManageViewBinder: updateService: data invalid");
          this$0.s9();
       }
       return;
    }
}
