package com.kuaishou.tuna.plc.dynamic_container.router.PlcDynamicContainerRouterHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import xh7.b;
import qh7.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.os.SystemClock;
import android.content.Context;
import xh7.a;
import yh7.a;
import android.app.Activity;
import lnc.a1;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger;
import com.kuaishou.tuna.plc.dynamic_container.util.PlcDynamicUtils;
import android.net.Uri;
import java.util.HashMap;
import ekd.x0;
import java.lang.StringBuilder;
import fg6.a;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerConfig;
import com.google.gson.Gson;
import java.lang.Boolean;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerStyle;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import java.util.Objects;
import kotlin.text.StringsKt__StringsKt;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import tkd.b;
import tkd.d;
import xx5.g;
import zx5.d;
import zx5.e;
import java.util.Map;
import com.kwai.sdk.switchconfig.a;
import my4.e;
import java.lang.reflect.Type;
import el.a;
import java.util.ArrayList;
import ky4.a;
import xf6.l;
import qh7.b;
import qh7.a;
import qy4.b;
import java.io.Serializable;
import android.content.Intent;
import com.yxcorp.gifshow.entity.QPhoto;

public final class PlcDynamicContainerRouterHandler extends AnnotationUriHandler	// class@000ff7
{

    public void PlcDynamicContainerRouterHandler(){
       super();
    }
    public void c(b p0,c p1){
       PlcDynamicContainerConfig plcDynamicCo1;
       boolean b;
       String str6;
       a obj5;
       boolean b1;
       boolean i;
       PlcDynamicTitleConfig obj7;
       Iterator obj8;
       String str8;
       HashMap hashMap;
       CharSequence uCharSequenc;
       PlcDynamicContainerConfig obj = this;
       String obj1 = p0;
       Object obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PlcDynamicContainerRouterHandler plcDynamicCo = PlcDynamicContainerRouterHandler.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, plcDynamicCo, "1")) {
          return;
       }
       a.p(obj1, "request");
       a.p(obj2, "callback");
       long l = SystemClock.elapsedRealtime();
       Context uContext = p0.b();
       String str = "request.context";
       a.o(uContext, str);
       a uoa = new a(200);
       if (uContext instanceof Activity && !a1.i(uContext)) {
          PlcDynamicLogger.g("context will destroy, quit container logic");
          PlcDynamicUtils.s();
          uoa.a = 406;
          obj2.a(uoa);
          return;
       }else {
          Uri uri = p0.g();
          a.o(uri, "request.uri");
          Object obj3 = obj1.d(HashMap.class, "EXTRA_CONTEXT_MAP", null);
          String str1 = obj1.f("PlcDynamicContainerToken", "");
          String str2 = obj1.f("codSourcePage", "");
          String str3 = "containerParams";
          String str4 = x0.b(uri, str3, "");
          obj1 = "router处理 获取容器配置原始json:"+str4;
          try{
             PlcDynamicLogger.c(obj1);
             plcDynamicCo1 = a.a.h(str4, PlcDynamicContainerConfig.class);
          }catch(java.lang.Exception e0){
             plcDynamicCo1 = null;
          }
          if (plcDynamicCo1 != null) {
             String obj4 = PatchProxy.applyTwoRefs(uri, plcDynamicCo1, e0, plcDynamicCo, "2");
             String str5 = str;
             str = "it";
             long l1 = l;
             if (obj4 != patchProxyRe) {
                b = obj4.booleanValue();
                str6 = str1;
             }else {
                obj4 = "";
                PlcDynamicContainerStyle containerSty = plcDynamicCo1.getContainerStyle();
                if (containerSty != null) {
                   containerSty.setDialogAnchorPercent(0x3f400000);
                }
                containerSty = plcDynamicCo1.getContainerStyle();
                int dragStyle = (containerSty != null)? containerSty.getDragStyle(): 0;
                String str9 = 2;
                str6 = str1;
                int i1 = 1;
                if (dragStyle != i1 && dragStyle != str9) {
                   containerSty = plcDynamicCo1.getContainerStyle();
                   if (containerSty != null) {
                      containerSty.setDragStyle(i1);
                   }
                   if (PlcDynamicUtils.k()) {
                      obj4 = obj4+"\x27\x02 \x67\x02\x4f\x02\x5f\x02\x4f\x02\x53\x02\x65\x02dragStyle\xff\x02\x5f\x02\x50\x02\x5f\x02\x7a\x02\x59\x02\x74\x02\n\x00";
                   }
                }
             label_00e9 :
                obj7 = plcDynamicCo1.getTitleConfig();
                str1 = (obj7 != null)? obj7.getNavBarBackgroundColor(): null;
                if (TextUtils.x(str1)) {
                   obj7 = plcDynamicCo1.getTitleConfig();
                   if (obj7 != null) {
                      containerSty = plcDynamicCo1.getContainerStyle();
                      if (containerSty != null) {
                         str8 = containerSty.getContainerBackgroundColor();
                         if (str8 != null) {
                         label_0110 :
                            obj7.setNavBarBackgroundColor(str8);
                         }
                      }
                      str8 = "#FFFFFFFF";
                      goto label_0110 ;
                   }
                }
                obj7 = plcDynamicCo1.getTitleConfig();
                str1 = (obj7 != null)? obj7.getNavBarBackgroundColorDark(): null;
                if (TextUtils.x(str1)) {
                   obj7 = plcDynamicCo1.getTitleConfig();
                   if (obj7 != null) {
                      containerSty = plcDynamicCo1.getContainerStyle();
                      if (containerSty != null) {
                         str8 = containerSty.getContainerBackgroundColorDark();
                         if (str8 != null) {
                         label_013a :
                            obj7.setNavBarBackgroundColorDark(str8);
                         }
                      }
                      str8 = "#FF19191E";
                      goto label_013a ;
                   }
                }
                if (TextUtils.x(plcDynamicCo1.getDowngradeUrl()) && PlcDynamicUtils.k()) {
                   obj4 = obj4+"\x27\x02 \x67\x02\x4f\x02\x90\x02\x96\x02\x7e\x02url\xff\x02\x57\x02\x5b\x02\x56\x02\x53\x02\x75\x02\x96\x02\x7e\x02\x65\x02\xff\x02\x5c\x02\x4e\x02\x53\x02\x75\x02\n\x00";
                }
                if (!plcDynamicCo1.getBizType()) {
                   obj4 = obj4+"\x27\x02 \x4e\x02\x52\x02\x7c\x02\x57\x02\x67\x02\x4f\x02\xff\x02\x5c\x02\x4f\x02\x5b\x02\x81\x02\x65\x02\x6c\x02\x53\x02\x65\x02\n\x00";
                }
                i1 = (plcDynamicCo1.getType() != 1 && (plcDynamicCo1.getType() == str9 || plcDynamicCo1.getType() == 3))? 1: 0;
                if (!i1) {
                   obj4 = obj4+"\x27\x02 \x5b\x02\x56\x02type\x97\x02RN\x62\x02\x80\x02Web\xff\x02\x66\x02\x4e\x02\x65\x02\x63\x02\x6b\x02\x7c\x02\x57\x02\n\x00";
                }
                if (PlcDynamicUtils.k()) {
                   str8 = (obj4.length() > 0)? 1: null;
                   if (str8) {
                      i.e(R.style.arg_RES_7f11066a, obj4, 1);
                   }
                }
                str8 = plcDynamicCo1.getUrl();
                Objects.requireNonNull(str8, "null cannot be cast to non-null type kotlin.CharSequence");
                i1 = (!TextUtils.x(StringsKt__StringsKt.o5(str8).toString()) && i1)? 1: 0;
                if (i1 && !PatchProxy.applyVoidTwoRefs(uri, plcDynamicCo1, e0, plcDynamicCo, "3")) {
                   Set queryParamet = uri.getQueryParameterNames();
                   a.o(queryParamet, str);
                   if (!(queryParamet.isEmpty() ^ 1)) {
                      queryParamet = null;
                   }
                   if (queryParamet != null) {
                      hashMap = new HashMap();
                      obj8 = queryParamet.iterator();
                      str9 = null;
                      while (obj8.hasNext()) {
                         obj4 = obj8.next();
                         if (!TextUtils.n(obj4, str3)) {
                            String queryParamet1 = uri.getQueryParameter(obj4);
                            if (!TextUtils.x(queryParamet1)) {
                               a.o(obj4, "key");
                               a.m(queryParamet1);
                               hashMap.put(obj4, queryParamet1);
                               str9 = 1;
                            }
                         }
                         int i2 = this;
                      }
                   }else {
                      hashMap = null;
                      str9 = null;
                   }
                   if (str9 != null) {
                      g og = d.a(-174493078);
                      d uod = (og != null)? og.PB(d.class): null;
                      if (uod != null) {
                         a.m(plcDynamicCo1);
                         plcDynamicCo1.setUrl(uod.i(plcDynamicCo1.getUrl(), hashMap, true, true));
                      }
                   }
                }
             label_0233 :
                b = i1;
             }
             obj = (b)? plcDynamicCo1: null;
             if (obj != null) {
                PlcDynamicLogger.b(obj, "router处理 序列化容器配置对象");
                obj5 = PatchProxy.applyOneRefs(obj, null, PlcDynamicUtils.class, "6");
                if (obj5 != patchProxyRe) {
                   b1 = obj5.booleanValue();
                   l = 1;
                }else {
                   a.p(obj, "config");
                   obj7 = a.t().getValue("plcCodContainerDowngrade", new e().getType(), new ArrayList());
                   StringBuilder str7 = "";
                   a.o(obj7, str);
                   obj8 = (obj7.isEmpty() ^ 1)? obj7: null;
                   if (obj8 != null) {
                      obj8 = obj8.iterator();
                      while (true) {
                         if (obj8.hasNext()) {
                            a uoa1 = obj8.next();
                            a uoa2 = (uoa1.mDowngradeWay == 1)? 1: null;
                            if (!uoa2) {
                               continue ;
                            }else {
                               uoa2 = uoa1.mBizType;
                               if (uoa2 == -1) {
                                  uoa2 = uoa1.mType;
                                  if (uoa2 == null) {
                                     str7 = str7+"命中降级，所有业务降级";
                                  }else {
                                     if (uoa2 == obj.getType()) {
                                        str7 = str7+"命中降级，所有业务下的此类技术栈："+uoa1.mType;
                                     }
                                  }
                               }else if(uoa2 == obj.getBizType()){
                                  uoa2 = uoa1.mType;
                                  str8 = "命中降级，此类业务\(";
                                  if (uoa2 == null) {
                                     str7 = str7+str8+uoa1.mBizType+"\)所有技术栈降级";
                                  }else if(uoa2 == obj.getType()){
                                     str7 = str7+str8+uoa1.mBizType+"\)的技术栈\("+uoa1.mBizType+"\)降级";
                                  }
                               }
                               b = true;
                            label_0324 :
                               if (b) {
                                  PlcDynamicLogger.b(obj7, "cod container need downgrade: "+b+0xff0c+str7);
                                  if (PlcDynamicUtils.k()) {
                                     i.e(R.style.arg_RES_7f11066a, str7, 1);
                                  label_035a :
                                     i = false;
                                     if (l.c("test_switch_tuna_plc_dynamic_downgrade", i) || b) {
                                        uoa1 = 1;
                                     }
                                     b1 = uoa1;
                                  }
                               }
                               l = 1;
                               goto label_035a ;
                            }
                         }
                      }
                   }
                   b = false;
                   goto label_0324 ;
                }
                if (b1) {
                   PlcDynamicLogger.c("router处理 半屏容器降级 json:"+str4);
                   if (!TextUtils.x(obj.getDowngradeUrl())) {
                      a.b(new b(p0.b(), obj.getDowngradeUrl()), null);
                   }else {
                      uoa.a = 404;
                      PlcDynamicUtils.s();
                   }
                   obj2.a(uoa);
                   return;
                }else {
                   i = -1301622019;
                   obj4 = uri.toString();
                   a.o(obj4, "uri.toString\(\)");
                   Context obj6 = obj3;
                   obj5 = uoa;
                   Intent intent = d.a(i).Wy(uContext, plcDynamicCo1, obj3, str6, str2, l1, SystemClock.elapsedRealtime(), obj4);
                   QPhoto qPhoto = (obj6 != null)? obj6.get("QPhoto"): null;
                   if (intent != null) {
                      if (qPhoto instanceof QPhoto) {
                         d.a(i).o0((obj.getKeepPlayerPause() ^ 0x01));
                      }
                      p0.b().startActivity(intent);
                   }else {
                      obj6 = p0.b();
                      a.o(obj6, str5);
                      if (!qPhoto instanceof QPhoto) {
                         qPhoto = null;
                      }
                      if (!PlcDynamicUtils.g(obj6, obj, qPhoto, "router处理 创建动态化容器intent失败，直接走降级", "router处理 创建动态化容器intent失败，降级跳转失败，提示用户异常")) {
                         obj5.a = 404;
                      }
                   }
                }
             }else {
             label_0418 :
                obj5 = uoa;
                PlcDynamicLogger.g("router处理 config 参数校验异常");
                PlcDynamicUtils.s();
                obj5.a = 404;
             }
          }else {
             goto label_0418 ;
          }
          obj2.a(obj5);
          return;
       }
    }
}
