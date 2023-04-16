package com.yxcorp.gifshow.reminder.data.model.ReminderMomentSerializer;
import zk.i;
import com.smile.gifmaker.mvps.utils.model.decouple.FastDeserializer;
import com.yxcorp.gifshow.reminder.data.model.a;
import com.yxcorp.gifshow.reminder.data.model.b;
import ok.h;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.reminder.data.model.ReminderMoment;
import com.smile.gifmaker.mvps.utils.model.decouple.BaseDecoupledDeserializer;
import zk.h;
import java.lang.reflect.Field;
import com.google.gson.JsonObject;
import java.lang.reflect.Modifier;
import al.c;
import java.lang.annotation.Annotation;
import mcc.b;
import java.lang.Throwable;
import q87.c;
import ekd.k0;

public class ReminderMomentSerializer extends FastDeserializer implements i	// class@001314
{

    public void ReminderMomentSerializer(){
       super(a.b, b.b);
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ReminderMomentSerializer.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = this.b(p0, p1, p2);
       }
       return obj;
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       int this;
       int i;
       Object obj;
       JsonObject jsonObject2;
       JsonObject jsonObject = PatchProxy.applyThreeRefs(p0, p1, p2, this, ReminderMomentSerializer.class, "2");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          Field[] declaredFiel = p0.getClass().getDeclaredFields();
          JsonObject jsonObject1 = new JsonObject();
          int len = declaredFiel.length;
          this = 0;
          while (this < len) {
             object oobject = declaredFiel[this];
             int modifiers = oobject.getModifiers();
             if (Modifier.isStatic(modifiers) || (Modifier.isTransient(modifiers) || (!oobject.getType().isPrimitive() && !oobject.getType().isAssignableFrom(String.class)))) {
                c annotation = oobject.getAnnotation(c.class);
                oobject.setAccessible(true);
                try{
                   i = 0;
                   obj = oobject.get(p0);
                }catch(java.lang.IllegalAccessException e4){
                   Object[] objArray = new Object[0];
                   b.C().u("ReminderMomentSerializer", e4, objArray);
                   obj = i;
                }
                if (annotation == null) {
                   if (obj != null) {
                      jsonObject2 = p2.b(obj, obj.getClass()).r();
                   }
                }else {
                   jsonObject2 = new JsonObject();
                   if (obj != null) {
                      jsonObject2.G(annotation.value(), p2.b(obj, obj.getClass()));
                   }
                }
                if (jsonObject2 != null) {
                   k0.b(jsonObject1, jsonObject2);
                }
             }
          label_009c :
             this++;
          }
          jsonObject = jsonObject1;
       }
       return jsonObject;
    }
}
