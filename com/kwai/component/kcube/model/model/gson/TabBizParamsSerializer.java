package com.kwai.component.kcube.model.model.gson.TabBizParamsSerializer;
import zk.i;
import java.lang.Object;
import java.lang.reflect.Type;
import zk.h;
import com.google.gson.JsonElement;
import com.kwai.component.kcube.model.model.TabBizParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Field;
import com.google.gson.JsonObject;
import java.lang.reflect.Modifier;
import al.c;
import java.lang.annotation.Annotation;
import java.lang.IllegalAccessException;
import ekd.k0;

public class TabBizParamsSerializer implements i	// class@000a93
{

    public void TabBizParamsSerializer(){
       super();
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       object this;
       int i1;
       Object this1;
       JsonObject jsonObject2;
       JsonObject jsonObject = PatchProxy.applyThreeRefs(p0, p1, p2, this, TabBizParamsSerializer.class, "2");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          Field[] declaredFiel = p0.getClass().getDeclaredFields();
          JsonObject jsonObject1 = new JsonObject();
          int len = declaredFiel.length;
          int i = 0;
          while (i < len) {
             this = declaredFiel[i];
             int modifiers = this.getModifiers();
             if (Modifier.isStatic(modifiers) || (Modifier.isTransient(modifiers) || (!this.getType().isPrimitive() && !this.getType().isAssignableFrom(String.class)))) {
                c annotation = this.getAnnotation(c.class);
                this.setAccessible(true);
                try{
                   i1 = 0;
                   this1 = this.get(p0);
                }catch(java.lang.IllegalAccessException e3){
                   e3.printStackTrace();
                   this1 = i1;
                }
                if (annotation == null) {
                   if (this1 != null) {
                      jsonObject2 = p2.b(this1, this1.getClass()).r();
                   }
                }else {
                   jsonObject2 = new JsonObject();
                   if (this1 != null) {
                      jsonObject2.G(annotation.value(), p2.b(this1, this1.getClass()));
                   }
                }
                if (jsonObject2 != null) {
                   k0.b(jsonObject1, jsonObject2);
                }
             }
          label_0093 :
             i = i + 1;
          }
          jsonObject = jsonObject1;
       }
       return jsonObject;
    }
}
