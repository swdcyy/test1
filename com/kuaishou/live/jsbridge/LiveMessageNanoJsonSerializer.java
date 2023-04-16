package com.kuaishou.live.jsbridge.LiveMessageNanoJsonSerializer;
import zk.i;
import java.lang.Object;
import java.lang.reflect.Type;
import zk.h;
import com.google.gson.JsonElement;
import com.google.protobuf.nano.MessageNano;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.StringBuilder;
import java.lang.Boolean;
import java.lang.Character;

public class LiveMessageNanoJsonSerializer implements i	// class@001d26
{

    public void LiveMessageNanoJsonSerializer(){
       super();
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       JsonObject jsonObject = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveMessageNanoJsonSerializer.class, "1");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          jsonObject = new JsonObject();
          Class class = p0.getClass();
          Field[] fields = class.getFields();
          int len = fields.length;
          int i = 0;
          int i1 = 1;
          while (i < len) {
             object oobject = fields[i];
             int modifiers = oobject.getModifiers();
             String name = oobject.getName();
             if (!("cachedSize").equals(name)) {
                int i2 = modifiers & 0x01;
                if (i2 == i1) {
                   i1 = modifiers & 0x08;
                   if (i1 != 8) {
                      String str = "_";
                      if (!name.startsWith(str) && !name.endsWith(str)) {
                         try{
                            jsonObject.G(name, p2.a(oobject.get(p0)));
                         }catch(java.lang.IllegalAccessException e0){
                         }
                      }
                   }
                }
             }
             i = i + 1;
          }
          Method[] methods = class.getMethods();
          len = methods.length;
          i = 0;
          while (i < len) {
             try{
                String name1 = methods[i].getName();
                if (name1.startsWith("set")) {
                   name1 = name1.substring(3);
                   try{
                      Class[] uClassArray = new Class[0];
                      Method method = class.getMethod("has"+name1, uClassArray);
                      Object[] objArray = new Object[0];
                      if (method.invoke(p0, objArray).booleanValue()) {
                         uClassArray = new Class[0];
                         objArray = new Object[0];
                         jsonObject.G(Character.toLowerCase(name1.charAt(0))+name1.substring(i1), p2.a(class.getMethod("get"+name1, uClassArray).invoke(p0, objArray)));
                      }
                   }catch(java.lang.NoSuchMethodException e0){
                   }
                }
                i = i + 1;
             }catch(java.lang.Exception e0){
             }
          }
       }
       return jsonObject;
    }
}
