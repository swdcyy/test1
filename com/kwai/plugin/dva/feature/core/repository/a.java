package com.kwai.plugin.dva.feature.core.repository.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.iqiyi.android.qigsaw.core.extension.ComponentInfo;
import java.lang.StringBuilder;
import java.lang.reflect.Field;
import java.lang.ClassNotFoundException;

public final class a	// class@000e85
{
    public static Class a;

    public void a(){
       super();
    }
    public static Class a(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.a == null) {
          a.a = ComponentInfo.class;
       }
       return a.a;
    }
    public static String[] b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0+"_ACTIVITIES";
       try{
          Field field = a.a().getField(p0);
          field.setAccessible(true);
          field = field.get(null);
          if (field != null) {
             return field.split(",");
          }
       }catch(java.lang.NoSuchFieldException e0){
       }catch(java.lang.IllegalAccessException e0){
       }catch(java.lang.ClassNotFoundException e3){
          e3.printStackTrace();
       }
       return null;
    }
    public static String c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0+"_APPLICATION";
       try{
          Field field = a.a().getField(p0);
          field.setAccessible(true);
          return field.get(null);
       }catch(java.lang.NoSuchFieldException e0){
       label_0038 :
          return v1;
       }catch(java.lang.IllegalAccessException e0){
       }catch(java.lang.ClassNotFoundException e3){
          e3.printStackTrace();
          goto label_0038 ;
       }
    }
    public static String[] d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0+"_SERVICES";
       try{
          Field field = a.a().getField(p0);
          field.setAccessible(true);
          field = field.get(null);
          if (field != null) {
             return field.split(",");
          }
       }catch(java.lang.NoSuchFieldException e0){
       }catch(java.lang.IllegalAccessException e0){
       }catch(java.lang.ClassNotFoundException e3){
          e3.printStackTrace();
       }
       return null;
    }
}
