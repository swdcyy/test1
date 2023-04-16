package com.kuaishou.merchant.home2.basic.model.MerchantHomeTypeAdapterFactory;
import zk.j;
import bl.g;
import zk.c;
import com.google.gson.internal.Excluder;
import java.lang.Object;
import dl.b;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bx3.d;
import com.kwai.sdk.switchconfig.a;
import bl.p;
import com.kuaishou.merchant.home2.basic.model.MerchantHomeTypeAdapterFactory$Adapter;
import java.util.Map;
import java.util.LinkedHashMap;
import java.lang.reflect.Type;
import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import com.google.gson.internal.$Gson$Types;
import java.util.List;
import al.c;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.ArrayList;
import java.lang.Boolean;
import com.kuaishou.merchant.home2.basic.model.MerchantHomeTypeAdapterFactory$a;
import bl.r;
import com.kuaishou.merchant.home2.basic.model.a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class MerchantHomeTypeAdapterFactory implements j	// class@0008f1
{
    public final g b;
    public final c c;
    public final Excluder d;
    public final b e;

    public void MerchantHomeTypeAdapterFactory(g p0,c p1,Excluder p2){
       super();
       this.e = b.a();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public TypeAdapter a(Gson p0,a p1){
       MerchantHomeTypeAdapterFactory$Adapter uAdapter;
       int this;
       int i1;
       int i2;
       Type type1;
       Field[] uFieldArray;
       Class uClass;
       PatchProxyResult patchProxyRe1;
       MerchantHomeTypeAdapterFactory merchantHome2;
       LinkedHashMap linkedHashMa1;
       MerchantHomeTypeAdapterFactory$Adapter uAdapter1;
       ArrayList uArrayList;
       int i3;
       object oobject2;
       a uoa2;
       object oobject3;
       int i4;
       int i5;
       int i6;
       MerchantHomeTypeAdapterFactory merchantHome = this;
       object oobject = p0;
       Field[] obj = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MerchantHomeTypeAdapterFactory merchantHome1 = MerchantHomeTypeAdapterFactory.class;
       LinkedHashMap obj1 = PatchProxy.applyTwoRefs(oobject, obj, merchantHome, merchantHome1, "5");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       Class rawType = p1.getRawType();
       TypeAdapter typeAdapter = null;
       if (!d.class.isAssignableFrom(rawType)) {
          return typeAdapter;
       }
       int b = true;
       if (!a.t().d("merchantHomeEnableGsonTypeAdapterFactory", b)) {
          return typeAdapter;
       }
       p op = merchantHome.b.a(obj);
       obj1 = PatchProxy.applyThreeRefs(p0, p1, rawType, this, MerchantHomeTypeAdapterFactory.class, "7");
       if (obj1 != patchProxyRe) {
       }else {
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          if (rawType.isInterface()) {
             obj1 = linkedHashMa;
          }else {
             Type type = p1.getType();
             a uoa = obj;
             while (true) {
                if (rawType != Object.class) {
                   obj = rawType.getDeclaredFields();
                   this = obj.length;
                   int b1 = false;
                   int i = 0;
                   while (true) {
                      if (i < this) {
                         object oobject1 = obj[i];
                         boolean b2 = merchantHome.b(oobject1, b);
                         boolean b3 = merchantHome.b(oobject1, b1);
                         if (!b2 && !b3) {
                            i1 = i;
                            i2 = this;
                            type1 = type;
                            uFieldArray = obj;
                            uClass = rawType;
                            patchProxyRe1 = patchProxyRe;
                            merchantHome2 = merchantHome1;
                            linkedHashMa1 = linkedHashMa;
                            uAdapter = v8;
                         }else {
                            merchantHome.e.b(oobject1);
                            Type type2 = $Gson$Types.j(uoa.getType(), rawType, oobject1.getGenericType());
                            List list = PatchProxy.applyOneRefs(oobject1, merchantHome, merchantHome1, "4");
                            if (list != patchProxyRe) {
                            }else {
                               c annotation = oobject1.getAnnotation(c.class);
                               if (annotation == null) {
                                  list = Collections.singletonList(merchantHome.c.translateName(oobject1));
                               }else {
                                  String obj3 = annotation.value();
                                  String[] stringArray = annotation.alternate();
                                  i1 = i;
                                  if (!stringArray.length) {
                                     list = Collections.singletonList(obj3);
                                  label_00d6 :
                                     uArrayList = list;
                                     i2 = this;
                                  label_00fa :
                                     this = uArrayList.size();
                                     a uoa1 = null;
                                     b1 = 0;
                                     while (b1 < this) {
                                        Object obj2 = uArrayList;
                                        obj3 = uArrayList.get(b1);
                                        Object obj4 = uoa1;
                                        if (b1) {
                                           b2 = false;
                                        }
                                        uoa1 = a.get(type2);
                                        if (PatchProxy.isSupport(merchantHome1)) {
                                           i3 = b1;
                                           Object[] objArray = new Object[]{oobject,oobject1,obj3,uoa1,Boolean.valueOf(b2),Boolean.valueOf(b3)};
                                           oobject2 = oobject1;
                                           uoa2 = PatchProxy.apply(objArray, merchantHome, merchantHome1, "6");
                                           if (uoa2 != patchProxyRe) {
                                              oobject3 = oobject2;
                                              i4 = this;
                                              type1 = type;
                                              uFieldArray = obj;
                                              uClass = rawType;
                                              patchProxyRe1 = patchProxyRe;
                                              merchantHome2 = merchantHome1;
                                              i5 = obj4;
                                              i6 = i3;
                                              linkedHashMa1 = linkedHashMa;
                                              uAdapter = v8;
                                           label_01a3 :
                                              uoa1 = linkedHashMa1.put(obj3, uoa2);
                                              if (i5) {
                                                 uoa1 = i5;
                                              }
                                              b1 = i6 + 1;
                                              merchantHome = this;
                                              rawType = uClass;
                                              type = type1;
                                              linkedHashMa = linkedHashMa1;
                                              uAdapter1 = uAdapter;
                                              uArrayList = obj2;
                                              this = i4;
                                              merchantHome1 = merchantHome2;
                                              oobject1 = oobject3;
                                              patchProxyRe = patchProxyRe1;
                                              obj = uFieldArray;
                                              oobject = p0;
                                           }
                                        }else {
                                           oobject2 = oobject1;
                                           i3 = b1;
                                           i4 = 0;
                                        }
                                        TypeAdapter typeAdapter1 = oobject.j(uoa1);
                                        oobject3 = oobject2;
                                        i5 = obj4;
                                        i6 = i3;
                                        i4 = this;
                                        type1 = type;
                                        patchProxyRe1 = patchProxyRe;
                                        linkedHashMa1 = linkedHashMa;
                                        uFieldArray = obj;
                                        TypeAdapter typeAdapter2 = typeAdapter1;
                                        uClass = rawType;
                                        TypeAdapter typeAdapter3 = typeAdapter1;
                                        merchantHome2 = merchantHome1;
                                        uAdapter = v8;
                                        uoa2 = new a(this, obj3, b2, b3, oobject3, typeAdapter2, typeAdapter3, r.a(uoa1.getRawType()));
                                        goto label_01a3 ;
                                     }
                                     a uoa3 = uoa1;
                                     type1 = type;
                                     uFieldArray = obj;
                                     uClass = rawType;
                                     patchProxyRe1 = patchProxyRe;
                                     merchantHome2 = merchantHome1;
                                     linkedHashMa1 = linkedHashMa;
                                     uAdapter = v8;
                                     if (uoa3 != null) {
                                        throw new IllegalArgumentException(type1+" declares multiple JSON fields named "+uoa3.a);
                                     }
                                  }else {
                                     i2 = this;
                                     ArrayList uArrayList1 = new ArrayList((stringArray.length + 1));
                                     uArrayList1.add(obj3);
                                     this = stringArray.length;
                                     for (b = 0; b < this; this = this) {
                                        uArrayList1.add(stringArray[b]);
                                        b = b + 1;
                                     }
                                     uArrayList = uArrayList1;
                                     goto label_00fa ;
                                  }
                               }
                            }
                            i1 = i;
                            goto label_00d6 ;
                         }
                         i = i1 + 1;
                         merchantHome = this;
                         rawType = uClass;
                         type = type1;
                         linkedHashMa = linkedHashMa1;
                         uAdapter1 = uAdapter;
                         this = i2;
                         merchantHome1 = merchantHome2;
                         patchProxyRe = patchProxyRe1;
                         obj = uFieldArray;
                         b1 = false;
                         b = true;
                         oobject = p0;
                      }else {
                         uoa = a.get($Gson$Types.j(uoa.getType(), rawType, rawType.getGenericSuperclass()));
                         rawType = uoa.getRawType();
                         merchantHome = this;
                         merchantHome1 = merchantHome1;
                         patchProxyRe = patchProxyRe;
                         b = true;
                         oobject = p0;
                      }
                   }
                   return new MerchantHomeTypeAdapterFactory$Adapter(op, obj1);
                }else {
                   uAdapter = v8;
                   obj1 = linkedHashMa;
                   goto label_023b ;
                }
             }
          }
       }
       uAdapter = v8;
       goto label_023b ;
    }
    public boolean b(Field p0,boolean p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MerchantHomeTypeAdapterFactory merchantHome = MerchantHomeTypeAdapterFactory.class;
       if (PatchProxy.isSupport(merchantHome)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, merchantHome, "2");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       MerchantHomeTypeAdapterFactory td = this.d;
       if (PatchProxy.isSupport(merchantHome)) {
          Object obj1 = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), td, null, MerchantHomeTypeAdapterFactory.class, "3");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(!td.c(p0.getType(), p1) && !td.f(p0, p1)){
             b = true;
          }else {
             b = false;
          }
       }else {
          goto label_003d ;
       }
       return b;
    }
}
