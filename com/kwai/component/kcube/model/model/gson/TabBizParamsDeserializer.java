package com.kwai.component.kcube.model.model.gson.TabBizParamsDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.kwai.component.kcube.model.model.TabBizParams;
import java.lang.Iterable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.lang.reflect.Modifier;
import com.kwai.component.kcube.model.model.gson.TabBizParamsDeserializer$a;
import al.c;
import java.lang.annotation.Annotation;
import ekd.j;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.k0;
import java.lang.IllegalAccessException;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import k2b.u1;

public class TabBizParamsDeserializer implements b	// class@000a92
{

    public void TabBizParamsDeserializer(){
       super();
    }
    public final Iterable a(TabBizParams p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, TabBizParamsDeserializer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Field[] declaredFiel = p0.getClass().getDeclaredFields();
       obj = new ArrayList(declaredFiel.length);
       int len = declaredFiel.length;
       int i = 0;
       while (i < len) {
          object oobject = declaredFiel[i];
          int modifiers = oobject.getModifiers();
          if (Modifier.isStatic(modifiers) || (Modifier.isTransient(modifiers) || (!oobject.getType().isPrimitive() && !oobject.getType().isAssignableFrom(String.class)))) {
             TabBizParamsDeserializer$a uoa = PatchProxy.applyOneRefs(oobject, null, TabBizParamsDeserializer$a.class, "1");
             if (uoa != PatchProxyResult.class) {
             }else {
                uoa = new TabBizParamsDeserializer$a();
                oobject.setAccessible(true);
                uoa.a = oobject.getName();
                uoa.b = oobject.getType();
                c annotation = oobject.getAnnotation(c.class);
                if (annotation != null) {
                   uoa.c = annotation.value();
                   uoa.d = j.d(annotation.alternate(), "");
                }
                uoa.e = oobject;
             }
             obj.add(uoa);
          }
       label_008e :
          i = i + 1;
       }
       return obj;
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       Object obj;
       TabBizParams tabBizParams = PatchProxy.applyThreeRefs(p0, p1, p2, this, TabBizParamsDeserializer.class, "3");
       if (tabBizParams != PatchProxyResult.class) {
       }else {
          tabBizParams = new TabBizParams();
          JsonObject jsonObject = p0;
          Iterator iterator = this.a(tabBizParams).iterator();
          while (iterator.hasNext()) {
             TabBizParamsDeserializer$a uoa = iterator.next();
             TabBizParamsDeserializer$a c = uoa.c;
             if (TextUtils.x(c)) {
                obj = p2.c(p0, uoa.b);
             }else if(k0.a(jsonObject, c)){
                obj = p2.c(k0.e(jsonObject, c), uoa.b);
             }else if(uoa.d != null){
                obj = p2.c(p0, uoa.b);
             }else {
                obj = null;
             }
             if (obj == null || PatchProxy.applyVoidTwoRefs(tabBizParams, obj, uoa, TabBizParamsDeserializer$a.class, "8")) {
                continue ;
             }else {
                TabBizParamsDeserializer$a e = uoa.e;
                boolean b = true;
                try{
                   e.setAccessible(b);
                   uoa.e.set(tabBizParams, obj);
                }catch(java.lang.IllegalAccessException e4){
                   e4.printStackTrace();
                   goto label_0025 ;
                }
             }
          }
       }
       return tabBizParams;
    }
}
