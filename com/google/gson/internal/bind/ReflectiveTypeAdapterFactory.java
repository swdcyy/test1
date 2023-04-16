package com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import zk.j;
import bl.g;
import zk.c;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import java.lang.Object;
import dl.b;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import bl.p;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter;
import java.util.LinkedHashMap;
import java.lang.reflect.Type;
import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import com.google.gson.internal.$Gson$Types;
import al.c;
import java.lang.annotation.Annotation;
import java.lang.String;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import bl.r;
import al.b;
import com.google.gson.internal.bind.c;
import java.util.Map;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class ReflectiveTypeAdapterFactory implements j	// class@000581
{
    public final g b;
    public final c c;
    public final Excluder d;
    public final JsonAdapterAnnotationTypeAdapterFactory e;
    public final b f;

    public void ReflectiveTypeAdapterFactory(g p0,c p1,Excluder p2,JsonAdapterAnnotationTypeAdapterFactory p3){
       super();
       this.f = b.a();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public TypeAdapter a(Gson p0,a p1){
       LinkedHashMap linkedHashMa1;
       ReflectiveTypeAdapterFactory$Adapter uAdapter;
       p op1;
       int i1;
       int i2;
       Field[] uFieldArray;
       Class uClass1;
       Type type1;
       Object obj1;
       ReflectiveTypeAdapterFactory$Adapter uAdapter1;
       List list;
       boolean b3;
       int i4;
       object oobject1;
       int i7;
       TypeAdapter typeAdapter1;
       ReflectiveTypeAdapterFactory reflectiveTy = this;
       Gson gson = p0;
       ReflectiveTypeAdapterFactory$a obj = Object.class;
       Class rawType = p1.getRawType();
       TypeAdapter typeAdapter = null;
       if (!obj.isAssignableFrom(rawType)) {
          return typeAdapter;
       }
       a uoa = p1;
       p op = reflectiveTy.b.a(uoa);
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       if (!rawType.isInterface()) {
          Type type = p1.getType();
          Class uClass = rawType;
          a uoa1 = uoa;
          while (true) {
             if (uClass != obj) {
                Field[] declaredFiel = uClass.getDeclaredFields();
                int len = declaredFiel.length;
                boolean b = false;
                int i = 0;
                while (true) {
                   if (i < len) {
                      object oobject = declaredFiel[i];
                      boolean b1 = reflectiveTy.b(oobject, true);
                      boolean b2 = reflectiveTy.b(oobject, b);
                      if (!b1 && !b2) {
                         i1 = i;
                         i2 = len;
                         uFieldArray = declaredFiel;
                         uClass1 = uClass;
                         type1 = type;
                         linkedHashMa1 = linkedHashMa;
                         uAdapter = v10;
                         obj1 = obj;
                         op1 = op;
                         int i3 = 0;
                      }else {
                         reflectiveTy.f.b(oobject);
                         Type type2 = $Gson$Types.j(uoa1.getType(), uClass, oobject.getGenericType());
                         c annotation = oobject.getAnnotation(c.class);
                         if (annotation == null) {
                            list = Collections.singletonList(reflectiveTy.c.translateName(oobject));
                            b3 = b1;
                         }else {
                            String str = annotation.value();
                            String[] stringArray = annotation.alternate();
                            b3 = b1;
                            if (!stringArray.length) {
                               list = Collections.singletonList(str);
                            }else {
                               i1 = i;
                               ArrayList uArrayList = new ArrayList((stringArray.length + 1));
                               uArrayList.add(str);
                               int i5 = stringArray.length;
                               for (i = 0; i < i5; i5 = i5) {
                                  uArrayList.add(stringArray[i]);
                                  i = i + 1;
                               }
                               list = uArrayList;
                            label_00c1 :
                               i = list.size();
                               b1 = b3;
                               i5 = 0;
                               obj1 = obj;
                               obj = null;
                               while (i5 < i) {
                                  op1 = op;
                                  Object obj2 = list.get(i5);
                                  boolean b4 = (i5)? false: b1;
                                  a uoa2 = a.get(type2);
                                  boolean b5 = r.a(uoa2.getRawType());
                                  int i6 = i5;
                                  b annotation1 = oobject.getAnnotation(b.class);
                                  if (annotation1 != null) {
                                     oobject1 = oobject;
                                     i7 = i;
                                     typeAdapter1 = reflectiveTy.e.b(reflectiveTy.b, gson, uoa2, annotation1);
                                  }else {
                                     oobject1 = oobject;
                                     i7 = i;
                                     typeAdapter1 = null;
                                  }
                                  Type type3 = (typeAdapter1 != null)? 1: null;
                                  if (typeAdapter1 == null) {
                                     typeAdapter1 = gson.j(uoa2);
                                  }
                                  c uoc = i;
                                  i4 = i6;
                                  c uoc1 = i;
                                  List list1 = list;
                                  i2 = len;
                                  uFieldArray = declaredFiel;
                                  uClass1 = uClass;
                                  type1 = type;
                                  type3 = type2;
                                  linkedHashMa1 = linkedHashMa;
                                  uAdapter = v10;
                                  uoc = new c(this, obj2, b4, b2, oobject1, type3, typeAdapter1, p0, uoa2, b5);
                                  ReflectiveTypeAdapterFactory$a uoa3 = linkedHashMa1.put(obj2, uoc1);
                                  if (obj == null) {
                                     obj = uoa3;
                                  }
                                  i5 = i4 + 1;
                                  reflectiveTy = this;
                                  uClass = uClass1;
                                  type = type1;
                                  linkedHashMa = linkedHashMa1;
                                  b1 = b4;
                                  op = op1;
                                  oobject = oobject1;
                                  i = i7;
                                  type2 = type3;
                                  list = list1;
                                  len = i2;
                                  declaredFiel = uFieldArray;
                                  uAdapter1 = uAdapter;
                                  gson = p0;
                               }
                               i2 = len;
                               uFieldArray = declaredFiel;
                               uClass1 = uClass;
                               type1 = type;
                               linkedHashMa1 = linkedHashMa;
                               uAdapter = v10;
                               op1 = op;
                               if (obj != null) {
                               }
                            }
                         }
                         i1 = i;
                         i4 = 1;
                         goto label_00c1 ;
                      }
                      i = i1 + 1;
                      reflectiveTy = this;
                      uClass = uClass1;
                      type = type1;
                      linkedHashMa = linkedHashMa1;
                      obj = obj1;
                      op = op1;
                      len = i2;
                      declaredFiel = uFieldArray;
                      uAdapter1 = uAdapter;
                      b = false;
                      gson = p0;
                   }else {
                      uClass1 = uClass;
                      uoa1 = a.get($Gson$Types.j(uoa1.getType(), uClass1, uClass1.getGenericSuperclass()));
                      uClass = uoa1.getRawType();
                      reflectiveTy = this;
                      gson = p0;
                   }
                }
                return new ReflectiveTypeAdapterFactory$Adapter(op1, linkedHashMa1);
             }
          }
          throw new IllegalArgumentException(type1+" declares multiple JSON fields named "+obj.a);
       }
       linkedHashMa1 = linkedHashMa;
       uAdapter = v10;
       op1 = op;
       goto label_01db ;
    }
    public boolean b(Field p0,boolean p1){
       ReflectiveTypeAdapterFactory td = this.d;
       boolean b = (!td.c(p0.getType(), p1) && !td.f(p0, p1))? true: false;
       return b;
    }
}
