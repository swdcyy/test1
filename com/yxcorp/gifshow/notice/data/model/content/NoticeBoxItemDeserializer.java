package com.yxcorp.gifshow.notice.data.model.content.NoticeBoxItemDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import com.yxcorp.gifshow.notice.data.model.content.NoticeBoxItemDeserializer$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ptb.a;
import com.google.gson.JsonObject;
import ekd.k0;
import com.yxcorp.gifshow.notice.data.model.content.ReminderContentElementType;
import java.lang.Iterable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.lang.reflect.Modifier;
import al.c;
import java.lang.annotation.Annotation;
import ekd.j;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.IllegalAccessException;
import mkd.a;

public class NoticeBoxItemDeserializer implements b	// class@001262
{

    public void NoticeBoxItemDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       NoticeBoxItemDeserializer$a c;
       ArrayList obj2;
       JsonElement jsonElement = p0;
       a uoa = p2;
       NoticeBoxItemDeserializer noticeBoxIte = NoticeBoxItemDeserializer.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, NoticeBoxItemDeserializer.class, "4");
       Iterator obj1 = null;
       if (obj != patchProxyRe) {
          obj1 = obj;
       }else if(jsonElement instanceof JsonObject){
          obj = jsonElement;
       }else {
          obj = obj1;
       }
       if (obj != null) {
          a uoa1 = PatchProxy.applyOneRefs(obj, obj1, noticeBoxIte, "2");
          if (uoa1 != patchProxyRe) {
          }else {
             uoa1 = ReminderContentElementType.fromContentType(k0.h(obj, "type", obj1)).createItem();
          }
          if (uoa1 != null) {
             ArrayList uArrayList = PatchProxy.applyOneRefs(uoa1, this, noticeBoxIte, "3");
             if (uArrayList != patchProxyRe) {
             }else {
                Field[] declaredFiel = uoa1.getClass().getDeclaredFields();
                obj2 = new ArrayList(declaredFiel.length);
                int len = declaredFiel.length;
                int i1 = 0;
                while (i1 < len) {
                   object oobject = declaredFiel[i1];
                   int modifiers = oobject.getModifiers();
                   if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers)) {
                      NoticeBoxItemDeserializer$a uoa3 = PatchProxy.applyOneRefs(oobject, obj1, NoticeBoxItemDeserializer$a.class, "1");
                      if (uoa3 != patchProxyRe) {
                      }else {
                         uoa3 = new NoticeBoxItemDeserializer$a();
                         oobject.setAccessible(true);
                         uoa3.a = oobject.getName();
                         uoa3.b = oobject.getType();
                         c annotation = oobject.getAnnotation(c.class);
                         if (annotation != null) {
                            uoa3.c = annotation.value();
                            uoa3.d = j.d(annotation.alternate(), "");
                         }
                         uoa3.e = oobject;
                      }
                      obj2.add(uoa3);
                   }
                   i1 = i1 + 1;
                   obj1 = null;
                }
                uArrayList = obj2;
             }
             obj1 = uArrayList.iterator();
             while (obj1.hasNext()) {
                NoticeBoxItemDeserializer$a uoa2 = obj1.next();
                try{
                   c = uoa2.c;
                   if (TextUtils.x(c)) {
                      obj2 = uoa.c(jsonElement, uoa2.b);
                   }else if(k0.a(obj, c)){
                      obj2 = uoa.c(obj.e0(c), uoa2.b);
                   }else if(uoa2.d != null){
                      obj2 = uoa.c(jsonElement, uoa2.b);
                   }else {
                      obj2 = null;
                   }
                   if (obj2 == null || PatchProxy.applyVoidTwoRefs(uoa1, obj2, uoa2, NoticeBoxItemDeserializer$a.class, "8")) {
                      continue ;
                   }else {
                      NoticeBoxItemDeserializer$a e = uoa2.e;
                      try{
                         e.setAccessible(true);
                         uoa2.e.set(uoa1, obj2);
                      }catch(java.lang.IllegalAccessException e0){
                         e0.printStackTrace();
                         goto label_00c8 ;
                      }
                   }
                }catch(java.lang.Exception e0){
                   goto label_00c8 ;
                }
             }
             if (uoa1 instanceof a) {
                uoa1.afterDeserialize();
             }
             obj1 = uoa1;
          label_0128 :
             return obj1;
          }
       }
       int i = this;
       goto label_0128 ;
    }
}
