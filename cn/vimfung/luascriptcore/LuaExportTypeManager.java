package cn.vimfung.luascriptcore.LuaExportTypeManager;
import java.util.HashMap;
import java.lang.Object;
import cn.vimfung.luascriptcore.LuaContext;
import java.lang.Class;
import java.lang.String;
import cn.vimfung.luascriptcore.LuaValue;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.lang.Exception;
import java.lang.reflect.Constructor;
import cn.vimfung.luascriptcore.LuaExportTypeConfig;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.StringBuilder;
import java.util.Set;
import cn.vimfung.luascriptcore.LuaNativeUtil;
import java.lang.annotation.Annotation;
import cn.vimfung.luascriptcore.LuaValueType;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import java.lang.Double;
import java.lang.Boolean;
import cn.vimfung.luascriptcore.LuaExportType;
import java.lang.Short;
import java.util.List;
import java.util.Map;
import java.lang.Character;
import cn.vimfung.luascriptcore.LuaExclude;

public class LuaExportTypeManager	// class@000d3b
{
    public static LuaExportTypeManager _manager;
    public static HashMap _regClassMethods;
    public static HashMap _regFieldMethods;
    public static HashMap _regInstanceMethods;

    static {
       LuaExportTypeManager._manager = new LuaExportTypeManager();
       LuaExportTypeManager._regClassMethods = new HashMap();
       LuaExportTypeManager._regInstanceMethods = new HashMap();
       LuaExportTypeManager._regFieldMethods = new HashMap();
    }
    public void LuaExportTypeManager(){
       super();
    }
    public static LuaExportTypeManager getDefaultManager(){
       return LuaExportTypeManager._manager;
    }
    public LuaValue classMethodRoute(LuaContext p0,Class p1,String p2,LuaValue[] p3){
       try{
          if (LuaExportTypeManager._regClassMethods.containsKey(p1) && LuaExportTypeManager._regClassMethods.get(p1).containsKey(p2)) {
             ArrayList uArrayList = new ArrayList();
             Method method = LuaExportTypeManager._regClassMethods.get(p1).get(p2);
             if (method == null) {
                return new LuaValue();
             }else {
                Class[] parameterTyp = method.getParameterTypes();
                for (int i = 0; i < parameterTyp.length; i = i + 1) {
                   object oobject = (p3.length > i)? p3[i]: new LuaValue();
                   uArrayList.add(this.getArgValue(parameterTyp[i], oobject));
                }
                return new LuaValue(method.invoke(p1, uArrayList.toArray()));
             }
          }
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
       }
       return new LuaValue();
    }
    public LuaValue constructorMethodRoute(LuaContext p0,Class p1,LuaValue[] p2){
       Constructor constructor = this.getConstructor(p1, p1, p2);
       if (constructor != null) {
          ArrayList uArrayList = new ArrayList();
          Class[] parameterTyp = constructor.getParameterTypes();
          for (int i = 0; i < parameterTyp.length; i = i + 1) {
             uArrayList.add(this.getArgValue(parameterTyp[i], p2[i]));
          }
          try{
             Object[] objArray = new Object[0];
             return new LuaValue(constructor.newInstance(uArrayList.toArray(objArray)));
          }catch(java.lang.Exception e6){
             e6.printStackTrace();
          }
          return new LuaValue();
       }else {
          goto label_0036 ;
       }
    }
    public void exportType(LuaContext p0,Class p1,Class p2){
       object oobject;
       Field[] uFieldArray;
       int i1;
       int len1;
       int i2;
       Object[] objArray;
       String str2;
       Method[] methodArray;
       HashMap hashMap3;
       int len2;
       String str3;
       int i6;
       Object[] objArray1;
       LuaExportTypeConfig luaExportTyp2;
       int i7;
       Object obj;
       LuaExportTypeManager luaExportTyp = this;
       String simpleName = p1.getSimpleName();
       String name = p1.getName();
       LuaExportTypeConfig luaExportTyp1 = luaExportTyp.findExportTypeConfig(p1);
       String name1 = (p2 != null)? p2.getName(): null;
       HashSet hashSet = new HashSet();
       HashMap hashMap = new HashMap();
       HashMap hashMap1 = new HashMap();
       HashMap hashMap2 = new HashMap();
       Field[] fields = p1.getFields();
       int len = fields.length;
       int i = 0;
       String str = "_";
       while (i < len) {
          oobject = fields[i];
          int modifiers = oobject.getModifiers();
          if (Modifier.isStatic(modifiers) || (!Modifier.isPublic(modifiers) || Modifier.isAbstract(modifiers))) {
          label_0042 :
             uFieldArray = fields;
             i1 = len;
          }else {
             String name2 = oobject.getName();
             if (name2.startsWith(str) || luaExportTyp.isExcludeField(oobject)) {
                goto label_0042 ;
             }else if(luaExportTyp1 != null && luaExportTyp1.excludeExportFieldNames().length > 0){
                String[] stringArray = luaExportTyp1.excludeExportFieldNames();
                uFieldArray = fields;
                len1 = stringArray.length;
                i1 = len;
                len = 0;
                while (true) {
                   if (len < len1) {
                      i2 = len1;
                      if ((stringArray[len]).equals(name2)) {
                         fields = 1;
                      label_008f :
                         if (!fields) {
                         }
                      }else {
                         len = len + 1;
                         len1 = i2;
                      }
                   }else {
                      fields = null;
                      goto label_008f ;
                   }
                }
             }else {
                uFieldArray = fields;
                i1 = len;
             }
          }
          i = i + 1;
          fields = uFieldArray;
          len = i1;
       }
       Method[] methods = p1.getMethods();
       len = methods.length;
       int i3 = 0;
       String str1 = "access$super";
       while (i3 < len) {
          i1 = len;
          object oobject1 = methods[i3];
          i2 = oobject1.getModifiers();
          if (Modifier.isStatic(i2) || (!Modifier.isPublic(i2) || Modifier.isAbstract(i2))) {
             str2 = name1;
             methodArray = methods;
          label_00cd :
             hashMap3 = hashMap;
          }else {
             methodArray = methods;
             String name3 = oobject1.getName();
             if (name3.startsWith(str) || (name3.equals(str1) || luaExportTyp.isExcludeMethod(oobject1))) {
                str2 = name1;
                goto label_00cd ;
             }else if(luaExportTyp1 != null && luaExportTyp1.excludeExportInstanceMethodsNames().length > 0){
                String[] stringArray1 = luaExportTyp1.excludeExportInstanceMethodsNames();
                hashMap3 = hashMap;
                len2 = stringArray1.length;
                int i4 = 0;
                while (true) {
                   if (i4 < len2) {
                      int i5 = len2;
                      if ((stringArray1[i4]).equals(name3)) {
                         str3 = 1;
                      label_0121 :
                         if (str3) {
                            str2 = name1;
                         }
                      }else {
                         i4 = i4 + 1;
                         len2 = i5;
                      }
                   }else {
                      str3 = null;
                      goto label_0121 ;
                   }
                }
             }else {
                hashMap3 = hashMap;
             }
             str3 = "";
             Class[] parameterTyp = oobject1.getParameterTypes();
             i = parameterTyp.length;
             str2 = name1;
             for (i6 = 0; i6 < i; i = i) {
                str3 = str3+luaExportTyp.getTypeSignature(parameterTyp[i6]);
                i6 = i6 + 1;
             }
             objArray1 = new Object[]{name3,str3};
             hashMap2.put(String.format("%s_%s", objArray1), oobject1);
          }
          i3 = i3 + 1;
          len = i1;
          methods = methodArray;
          hashMap = hashMap3;
          name1 = str2;
       }
       str2 = name1;
       hashMap3 = hashMap;
       Method[] methods1 = p1.getMethods();
       len1 = methods1.length;
       for (len = 0; len < len1; len1 = i7) {
          oobject = methods1[len];
          str3 = oobject.getName();
          if (!str3.startsWith(str)) {
             len2 = oobject.getModifiers();
             if (Modifier.isStatic(len2) && (Modifier.isPublic(len2) && (!Modifier.isAbstract(len2) && (!str3.equals(str1) && !luaExportTyp.isExcludeMethod(oobject))))) {
                if (luaExportTyp1 != null && luaExportTyp1.excludeExportClassMethodNames().length > 0) {
                   String[] stringArray2 = luaExportTyp1.excludeExportClassMethodNames();
                   luaExportTyp2 = luaExportTyp1;
                   int len3 = stringArray2.length;
                   methodArray = methods1;
                   i6 = 0;
                   while (true) {
                      if (i6 < len3) {
                         i7 = len3;
                         if ((stringArray2[i6]).equals(str3)) {
                            luaExportTyp1 = 1;
                         label_01cc :
                            if (luaExportTyp1) {
                            label_020b :
                               i7 = len1;
                               str3 = 1;
                            label_020f :
                               len = len + 1;
                               luaExportTyp1 = luaExportTyp2;
                               methods1 = methodArray;
                            }
                         }else {
                            i6 = i6 + 1;
                            len3 = i7;
                         }
                      }else {
                         luaExportTyp1 = null;
                         goto label_01cc ;
                      }
                   }
                }else {
                   luaExportTyp2 = luaExportTyp1;
                   methodArray = methods1;
                }
                StringBuilder str4 = "";
                Class[] parameterTyp1 = oobject.getParameterTypes();
                len2 = parameterTyp1.length;
                i7 = len1;
                for (len1 = 0; len1 < len2; len2 = len2) {
                   str4 = str4+luaExportTyp.getTypeSignature(parameterTyp1[len1]);
                   len1 = len1 + 1;
                }
                objArray1 = new Object[]{str3,str4};
                hashMap1.put(String.format("%s_%s", objArray1), oobject);
                goto label_020f ;
             }
          }
       label_0207 :
          luaExportTyp2 = luaExportTyp1;
          methodArray = methods1;
          goto label_020b ;
       }
       String[] stringArray3 = new String[0];
       stringArray3 = new String[0];
       String[] stringArray4 = new String[0];
       if (LuaNativeUtil.registerType(p0, simpleName, name, str2, p1, hashSet.toArray(stringArray4), hashMap2.keySet().toArray(stringArray3), hashMap1.keySet().toArray(stringArray3))) {
          if (hashMap1.size() > 0) {
             obj = p1;
             LuaExportTypeManager._regClassMethods.put(obj, hashMap1);
          }else {
             obj = p1;
          }
          if (hashMap2.size() > 0) {
             LuaExportTypeManager._regInstanceMethods.put(obj, hashMap2);
          }
          if (hashMap3.size() > 0) {
             LuaExportTypeManager._regFieldMethods.put(obj, hashMap3);
          }
       }
       return;
    }
    public final LuaExportTypeConfig findExportTypeConfig(Class p0){
       object oobject;
       Annotation[] declaredAnno = p0.getDeclaredAnnotations();
       int len = declaredAnno.length;
       int i = 0;
       while (true) {
          if (i < len) {
             oobject = declaredAnno[i];
             if (oobject.annotationType().equals(LuaExportTypeConfig.class)) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             oobject = null;
             break ;
          }
       }
       return oobject;
    }
    public final Object getArgValue(Class p0,LuaValue p1){
       ArrayList uArrayList;
       if (p1 == null || p1.valueType() == LuaValueType.Nil) {
          return null;
       }
       if (Integer.TYPE.isAssignableFrom(p0) || Integer.class.isAssignableFrom(p0)) {
          return Integer.valueOf((int)p1.toInteger());
       }
       if (Long.TYPE.isAssignableFrom(p0) || Long.class.isAssignableFrom(p0)) {
          return Long.valueOf(p1.toInteger());
       }
       if (Float.TYPE.isAssignableFrom(p0) || Float.class.isAssignableFrom(p0)) {
          return Float.valueOf((float)p1.toDouble());
       }
       if (Double.TYPE.isAssignableFrom(p0) || Double.class.isAssignableFrom(p0)) {
          return Double.valueOf(p1.toDouble());
       }
       if (Boolean.TYPE.isAssignableFrom(p0) || Boolean.class.isAssignableFrom(p0)) {
          return Boolean.valueOf(p1.toBoolean());
       }
       if (String.class.isAssignableFrom(p0)) {
          return p1.toString();
       }
       if (byte[].class.isAssignableFrom(p0)) {
          return p1.toByteArray();
       }
       if (ArrayList.class.isAssignableFrom(p0)) {
          return p1.toArrayList();
       }
       if (HashMap.class.isAssignableFrom(p0)) {
          return p1.toHashMap();
       }
       if (!p0.isArray()) {
          return p1.toObject();
       }
       int i = 0;
       if (int[].class.isAssignableFrom(p0)) {
          uArrayList = p1.toArrayList();
          int[] ointArray = new int[uArrayList.size()];
          for (; i < uArrayList.size(); i = i + 1) {
             ointArray[i] = uArrayList.get(i).intValue();
          }
          return ointArray;
       }else if(Integer[].class.isAssignableFrom(p0)){
          uArrayList = p1.toArrayList();
          Integer[] integerArray = new Integer[uArrayList.size()];
          for (; i < uArrayList.size(); i = i + 1) {
             integerArray[i] = Integer.valueOf(uArrayList.get(i).intValue());
          }
          return integerArray;
       }else if(Double[].class.isAssignableFrom(p0)){
          Double[] uDoubleArray = new Double[i];
          return p1.toArrayList().toArray(uDoubleArray);
       }else if(double[].class.isAssignableFrom(p0)){
          uArrayList = p1.toArrayList();
          double[] uodoubleArra = new double[uArrayList.size()];
          for (; i < uArrayList.size(); i = i + 1) {
             uodoubleArra[i] = uArrayList.get(i).doubleValue();
          }
          return uodoubleArra;
       }else if(Boolean[].class.isAssignableFrom(p0)){
          Boolean[] uBooleanArra = new Boolean[i];
          return p1.toArrayList().toArray(uBooleanArra);
       }else if(boolean[].class.isAssignableFrom(p0)){
          uArrayList = p1.toArrayList();
          boolean[] uobooleanArr = new boolean[uArrayList.size()];
          for (; i < uArrayList.size(); i = i + 1) {
             uobooleanArr[i] = uArrayList.get(i).booleanValue();
          }
          return uobooleanArr;
       }else {
          return p1.toArrayList().toArray();
       }
    }
    public final Constructor getConstructor(Class p0,Class p1,LuaValue[] p2){
       Constructor[] uConstructor1;
       LuaExportTypeManager luaExportTyp = this;
       Class uClass = p0;
       Class uClass1 = p1;
       LuaValue[] luaValueArra = p2;
       Constructor uConstructor = null;
       if (LuaExportType.class.isAssignableFrom(uClass1)) {
          Constructor[] constructors = p1.getConstructors();
          int len = constructors.length;
          int i = uConstructor;
          int i1 = 0;
          int i2 = 0;
          while (i1 < len) {
             object oobject = constructors[i1];
             if (luaExportTyp.isExcludeConstructor(oobject)) {
             label_0023 :
                uConstructor1 = constructors;
             }else {
                Class[] parameterTyp = oobject.getParameterTypes();
                if (!parameterTyp.length) {
                   i = oobject;
                }
                if (parameterTyp.length != luaValueArra.length) {
                   goto label_0023 ;
                }else {
                   int len1 = parameterTyp.length;
                   int i3 = 1;
                   int i4 = 0;
                   int i5 = 0;
                   int i6 = 0;
                   while (true) {
                      if (i4 < len1) {
                         object oobject1 = parameterTyp[i4];
                         object oobject2 = luaValueArra[i5];
                         uConstructor1 = constructors;
                         if (!Integer.TYPE.isAssignableFrom(oobject1) && (!Long.TYPE.isAssignableFrom(oobject1) && (!Short.TYPE.isAssignableFrom(oobject1) && (!Integer.class.isAssignableFrom(oobject1) && (Short.class.isAssignableFrom(oobject1) || Long.class.isAssignableFrom(oobject1)))))) {
                            if (oobject2.valueType() != LuaValueType.Integer && oobject2.valueType() != LuaValueType.Number) {
                            label_0132 :
                               if (!i3) {
                               label_013f :
                                  int i7 = i6;
                                  if (i3 && i7 > i2) {
                                     i2 = i7;
                                     uConstructor = oobject;
                                  }
                               }else {
                                  i5 = i5 + 1;
                                  i4 = i4 + 1;
                                  constructors = uConstructor1;
                               }
                            }
                         }else if(!Float.TYPE.isAssignableFrom(oobject1) && (!Double.TYPE.isAssignableFrom(oobject1) && (Float.class.isAssignableFrom(oobject1) || Double.class.isAssignableFrom(oobject1)))){
                            if (oobject2.valueType() != LuaValueType.Number) {
                            }
                         }else if(Boolean.TYPE.isAssignableFrom(oobject1) || Boolean.class.isAssignableFrom(oobject1)){
                            if (oobject2.valueType() != LuaValueType.Boolean) {
                            }
                         }else if(String.class.isAssignableFrom(oobject1)){
                            if (oobject2.valueType() != LuaValueType.String) {
                            }
                         }else if(byte[].class.isAssignableFrom(oobject1)){
                            if (oobject2.valueType() != LuaValueType.Data && oobject2.valueType() != LuaValueType.String) {
                            }
                         }else if(oobject1.isArray() || List.class.isAssignableFrom(oobject1)){
                            if (oobject2.valueType() != LuaValueType.Array) {
                            }
                         }else if(Map.class.isAssignableFrom(oobject1)){
                            if (oobject2.valueType() != LuaValueType.Map) {
                            }
                         }else if(oobject2.toObject().getClass().isAssignableFrom(oobject1)){
                         }
                      label_0130 :
                         i6 = i6 + 1;
                         goto label_0132 ;
                      }else {
                         uConstructor1 = constructors;
                         goto label_013f ;
                      }
                   }
                }
             }
             i1 = i1 + 1;
             constructors = uConstructor1;
          }
          if (uConstructor == null) {
             uConstructor = luaExportTyp.getConstructor(uClass, p1.getSuperclass(), luaValueArra);
          }
          if (uConstructor == null && uClass == uClass1) {
             uConstructor = i;
          }
       }
    label_015d :
       return uConstructor;
    }
    public final String getTypeSignature(Class p0){
       if (Integer.TYPE.isAssignableFrom(p0)) {
          return "i";
       }
       if (Short.TYPE.isAssignableFrom(p0)) {
          return "s";
       }
       if (Character.TYPE.isAssignableFrom(p0)) {
          return "c";
       }
       if (Long.TYPE.isAssignableFrom(p0)) {
          return "q";
       }
       if (Boolean.TYPE.isAssignableFrom(p0)) {
          return "B";
       }
       if (Float.TYPE.isAssignableFrom(p0)) {
          return "f";
       }
       if (Double.TYPE.isAssignableFrom(p0)) {
          return "d";
       }
       return "@";
    }
    public LuaValue getterMethodRoute(LuaContext p0,Object p1,String p2){
       try{
          Class class = p1.getClass();
          if (LuaExportTypeManager._regFieldMethods.containsKey(class) && LuaExportTypeManager._regFieldMethods.get(class).containsKey(p2)) {
             Field uField = LuaExportTypeManager._regFieldMethods.get(class).get(p2);
             if (uField == null) {
                return new LuaValue();
             }else {
                return new LuaValue(uField.get(p1));
             }
          }
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return new LuaValue();
    }
    public LuaValue instanceMethodRoute(LuaContext p0,Object p1,String p2,LuaValue[] p3){
       try{
          Class class = p1.getClass();
          if (LuaExportTypeManager._regInstanceMethods.containsKey(class) && LuaExportTypeManager._regInstanceMethods.get(class).containsKey(p2)) {
             ArrayList uArrayList = new ArrayList();
             Method method = LuaExportTypeManager._regInstanceMethods.get(class).get(p2);
             if (method == null) {
                return new LuaValue();
             }else {
                Class[] parameterTyp = method.getParameterTypes();
                for (int i = 0; i < parameterTyp.length; i = i + 1) {
                   object oobject = (p3.length > i)? p3[i]: new LuaValue();
                   uArrayList.add(this.getArgValue(parameterTyp[i], oobject));
                }
                return new LuaValue(method.invoke(p1, uArrayList.toArray()));
             }
          }
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
       }
       return new LuaValue();
    }
    public final boolean isExcludeConstructor(Constructor p0){
       Annotation[] annotations = p0.getAnnotations();
       int len = annotations.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (annotations[i].annotationType().equals(LuaExclude.class)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public final boolean isExcludeField(Field p0){
       Annotation[] annotations = p0.getAnnotations();
       int len = annotations.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (annotations[i].annotationType().equals(LuaExclude.class)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public final boolean isExcludeMethod(Method p0){
       Annotation[] annotations = p0.getAnnotations();
       int len = annotations.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (annotations[i].annotationType().equals(LuaExclude.class)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public void setterMethodRoute(LuaContext p0,Object p1,String p2,LuaValue p3){
       try{
          Class class = p1.getClass();
          if (LuaExportTypeManager._regFieldMethods.containsKey(class) && LuaExportTypeManager._regFieldMethods.get(class).containsKey(p2)) {
             Field uField = LuaExportTypeManager._regFieldMethods.get(class).get(p2);
             if (uField == null) {
                return;
             }else {
                uField.set(p1, this.getArgValue(uField.getType(), p3));
             }
          }
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return;
    }
}
