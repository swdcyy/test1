package com.kwai.framework.model.decompose.internal.BaseFeedSerializer;
import zk.i;
import java.lang.Object;
import java.lang.reflect.Type;
import zk.h;
import com.google.gson.JsonElement;
import lm8.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.reflect.Field;
import com.google.gson.JsonObject;
import java.lang.reflect.Modifier;
import al.c;
import java.lang.annotation.Annotation;
import java.lang.IllegalAccessException;
import ekd.k0;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.e;
import java.util.Map;
import ga6.b;
import ha6.b;
import ha6.e;

public final class BaseFeedSerializer implements i	// class@001696
{

    public void BaseFeedSerializer(){
       super();
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       Class this;
       boolean b;
       Object obj;
       JsonObject jsonObject = PatchProxy.applyThreeRefs(p0, p1, p2, this, BaseFeedSerializer.class, "1");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          a.p(p0, "src");
          a.p(p1, "typeOfSrc");
          a.p(p2, "context");
          Field[] declaredFiel = p0.getClass().getDeclaredFields();
          jsonObject = new JsonObject();
          int len = declaredFiel.length;
          int i = 0;
          this = null;
          while (i < len) {
             object oobject = declaredFiel[i];
             a.o(oobject, "field");
             int modifiers = oobject.getModifiers();
             if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers)) {
                Class type = oobject.getType();
                a.o(type, "field.type");
                if (!type.isPrimitive() && (oobject.getType().isAssignableFrom(String.class) || (!(oobject.getName()).equals("dataMap") && !(oobject.getName()).equals("metaExtContainer")))) {
                   c annotation = oobject.getAnnotation(c.class);
                   b = true;
                   try{
                      oobject.setAccessible(b);
                      obj = oobject.get(p0);
                   }catch(java.lang.IllegalAccessException e4){
                      e4.printStackTrace();
                      obj = this;
                   }
                   if (annotation == null) {
                      if (obj != null) {
                         JsonElement jsonElement = p2.b(obj, obj.getClass());
                         a.o(jsonElement, "context.serialize\(data, data.javaClass\)");
                         this = jsonElement.r();
                      }
                   }else {
                      super();
                      if (obj != null) {
                         this.G(annotation.value(), p2.b(obj, obj.getClass()));
                      }
                   }
                   if (this != null) {
                      k0.b(jsonObject, this);
                   }
                }
             }
          label_00ca :
             i = i + 1;
          }
          Class uClass = (!p0 instanceof SyncableProviderContainer)? this: p0;
          if (uClass != null) {
             b.a(p0, p0.getDataMap$framework_model_release(), jsonObject, p2);
          }
          if (b.b.a()) {
             if (!p0 instanceof e) {
                p0 = this;
             }
             if (p0 != null) {
                p0.jsonSerializeAllMetaExt(jsonObject, p2);
             }
          }
       }
       return jsonObject;
    }
}
