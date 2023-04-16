package com.tkruntime.v8.V8JSONProxy$ObjectMeta;
import java.lang.Object;
import com.tkruntime.v8.V8JSONProxy;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.util.LruCache;
import com.tkruntime.v8.V8;
import java.util.HashMap;
import java.lang.reflect.Field;
import al.c;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.io.Serializable;
import android.os.Looper;
import java.util.LinkedList;
import java.util.Queue;
import java.lang.RuntimeException;
import java.lang.StringBuilder;

public class V8JSONProxy$ObjectMeta	// class@000fb8
{
    public Class mClz;
    public Map mFields;

    public void V8JSONProxy$ObjectMeta(){
       super();
       this.mClz = null;
       this.mFields = null;
    }
    public static V8JSONProxy$ObjectMeta getMeta(Object p0,V8JSONProxy p1){
       V8JSONProxy$ObjectMeta obj = PatchProxy.applyTwoRefs(p0, p1, null, V8JSONProxy$ObjectMeta.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!V8JSONProxy$ObjectMeta.isSerializableObject(p0)) {
          return null;
       }
       p0 = p0.getClass();
       obj = V8JSONProxy.sMetaCache.get(p0);
       if (obj != null) {
          return obj;
       }
       p1 = p1.mV8;
       int i = 1;
       if (p1 != null) {
          p1.addJsonNotLoadNum(i);
       }
       V8JSONProxy$ObjectMeta objectMeta = new V8JSONProxy$ObjectMeta();
       objectMeta.mClz = p0;
       HashMap hashMap = new HashMap();
       try{
          objectMeta.mFields = hashMap;
          Field[] declaredFiel = p0.getDeclaredFields();
          if (declaredFiel == null) {
             return null;
          }else {
             int i1 = 0;
             int len = declaredFiel.length;
             while (i1 < len) {
                object oobject = declaredFiel[i1];
                oobject.setAccessible(i);
                c annotation = oobject.getAnnotation(c.class);
                if (annotation != null) {
                   objectMeta.mFields.put(annotation.value(), oobject);
                }
                i1 = i1 + 1;
             }
             V8JSONProxy.sMetaCache.put(p0, objectMeta);
             return objectMeta;
          }
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static boolean isSerializableObject(Object p0){
       boolean b = (p0 != null && p0 instanceof Serializable)? true: false;
       return b;
    }
    public static void loadMetaAsync(Class p0){
       String str = String.class;
       if (PatchProxy.applyVoidOneRefs(p0, null, V8JSONProxy$ObjectMeta.class, "2")) {
          return;
       }
       if (p0.isPrimitive() || p0 == str) {
          return;
       }
       if (Looper.myLooper() == Looper.getMainLooper()) {
          throw new RuntimeException("can\'t load meta on main thread");
       }
       if (V8JSONProxy.sMetaCache.get(p0) != null) {
          return;
       }
       LinkedList linkedList = new LinkedList();
       linkedList.offer(p0);
       while (true) {
          if (linkedList.isEmpty()) {
             return;
          }
          p0 = linkedList.poll();
          if (V8JSONProxy.sMetaCache.get(p0) != null) {
             continue ;
          }else {
             V8JSONProxy$ObjectMeta objectMeta = new V8JSONProxy$ObjectMeta();
             objectMeta.mClz = p0;
             HashMap hashMap = new HashMap();
             try{
                objectMeta.mFields = hashMap;
                Field[] declaredFiel = p0.getDeclaredFields();
                if (declaredFiel == null) {
                   break ;
                }else {
                   int i = 0;
                   int len = declaredFiel.length;
                   while (i < len) {
                      object oobject = declaredFiel[i];
                      oobject.setAccessible(true);
                      c annotation = oobject.getAnnotation(c.class);
                      if (annotation != null) {
                         objectMeta.mFields.put(annotation.value(), oobject);
                         if (!oobject.getType().isPrimitive() && oobject.getType() != str) {
                            linkedList.offer(oobject.getType());
                         }
                      }
                      i = i + 1;
                   }
                   V8JSONProxy.sMetaCache.put(p0, objectMeta);
                }
             }catch(java.lang.Exception e0){
                goto label_0035 ;
             }
          }
       }
       return;
    }
    public static V8JSONProxy$ObjectMeta tryGetMeta(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, V8JSONProxy$ObjectMeta.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!V8JSONProxy$ObjectMeta.isSerializableObject(p0)) {
          return null;
       }
       return V8JSONProxy.sMetaCache.get(p0.getClass());
    }
    public Object getValue(String p0,Object p1){
       V8JSONProxy$ObjectMeta obj = PatchProxy.applyTwoRefs(p0, p1, this, V8JSONProxy$ObjectMeta.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mFields;
       Object obj1 = null;
       if (obj == null) {
          return obj1;
       }
       Field uField = obj.get(p0);
       if (uField == null) {
          return obj1;
       }
       if (this.mClz == p1.getClass()) {
          return uField.get(p1);
       }
       throw new RuntimeException("type of ObjectMeta should be "+this.mClz+", current type = "+p1);
    }
}
