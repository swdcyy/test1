package kuaishou.perf.util.reflect.RefClass;
import kuaishou.perf.util.reflect.RefConstructors;
import kuaishou.perf.util.reflect.RefConstructor;
import kuaishou.perf.util.reflect.RefStaticMethod;
import kuaishou.perf.util.reflect.RefStaticInt;
import kuaishou.perf.util.reflect.RefStaticObject;
import kuaishou.perf.util.reflect.RefBoolean;
import kuaishou.perf.util.reflect.RefDouble;
import kuaishou.perf.util.reflect.RefFloat;
import kuaishou.perf.util.reflect.RefLong;
import kuaishou.perf.util.reflect.RefInt;
import kuaishou.perf.util.reflect.RefMethod;
import kuaishou.perf.util.reflect.RefObject;
import java.util.HashMap;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.Object;
import java.lang.Exception;
import java.lang.reflect.Modifier;
import java.lang.String;

public final class RefClass	// class@001d08
{
    public static final HashMap REF_TYPES;

    static {
       RefConstructors refConstruct = RefConstructors.class;
       RefConstructor refConstruct1 = RefConstructor.class;
       RefStaticMethod refStaticMet = RefStaticMethod.class;
       RefStaticInt refStaticInt = RefStaticInt.class;
       RefStaticObject refStaticObj = RefStaticObject.class;
       RefBoolean refBoolean = RefBoolean.class;
       RefDouble refDouble = RefDouble.class;
       RefFloat refFloat = RefFloat.class;
       RefLong refLong = RefLong.class;
       RefInt refInt = RefInt.class;
       RefMethod refMethod = RefMethod.class;
       RefObject refObject = RefObject.class;
       HashMap hashMap = new HashMap();
       RefClass.REF_TYPES = hashMap;
       try{
          int i = 2;
          Class[] uClassArray = new Class[i];
          uClassArray[0] = Class.class;
          uClassArray[1] = Field.class;
          hashMap.put(refObject, refObject.getConstructor(uClassArray));
          Class[] uClassArray1 = new Class[i];
          uClassArray1[0] = Class.class;
          uClassArray1[1] = Field.class;
          hashMap.put(refMethod, refMethod.getConstructor(uClassArray1));
          Class[] uClassArray2 = new Class[i];
          uClassArray2[0] = Class.class;
          uClassArray2[1] = Field.class;
          hashMap.put(refInt, refInt.getConstructor(uClassArray2));
          Class[] uClassArray3 = new Class[i];
          uClassArray3[0] = Class.class;
          uClassArray3[1] = Field.class;
          hashMap.put(refLong, refLong.getConstructor(uClassArray3));
          Class[] uClassArray4 = new Class[i];
          uClassArray4[0] = Class.class;
          uClassArray4[1] = Field.class;
          hashMap.put(refFloat, refFloat.getConstructor(uClassArray4));
          Class[] uClassArray5 = new Class[i];
          uClassArray5[0] = Class.class;
          uClassArray5[1] = Field.class;
          hashMap.put(refDouble, refDouble.getConstructor(uClassArray5));
          Class[] uClassArray6 = new Class[i];
          uClassArray6[0] = Class.class;
          uClassArray6[1] = Field.class;
          hashMap.put(refBoolean, refBoolean.getConstructor(uClassArray6));
          Class[] uClassArray7 = new Class[i];
          uClassArray7[0] = Class.class;
          uClassArray7[1] = Field.class;
          hashMap.put(refStaticObj, refStaticObj.getConstructor(uClassArray7));
          Class[] uClassArray8 = new Class[i];
          uClassArray8[0] = Class.class;
          uClassArray8[1] = Field.class;
          hashMap.put(refStaticInt, refStaticInt.getConstructor(uClassArray8));
          Class[] uClassArray9 = new Class[i];
          uClassArray9[0] = Class.class;
          uClassArray9[1] = Field.class;
          hashMap.put(refStaticMet, refStaticMet.getConstructor(uClassArray9));
          Class[] uClassArray10 = new Class[i];
          uClassArray10[0] = Class.class;
          uClassArray10[1] = Field.class;
          hashMap.put(refConstruct1, refConstruct1.getConstructor(uClassArray10));
          Class[] uClassArray11 = new Class[i];
          uClassArray11[0] = Class.class;
          uClassArray11[1] = Field.class;
          hashMap.put(refConstruct, refConstruct.getConstructor(uClassArray11));
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
    }
    public void RefClass(){
       super();
    }
    public static Class load(Class p0,Class p1){
       Field[] declaredFiel = p0.getDeclaredFields();
       int len = declaredFiel.length;
       int i = 0;
       while (i < len) {
          object oobject = declaredFiel[i];
          try{
             if (Modifier.isStatic(oobject.getModifiers())) {
                Constructor uConstructor = RefClass.REF_TYPES.get(oobject.getType());
                if (uConstructor != null) {
                   Object[] objArray = new Object[]{p1,oobject};
                   oobject.set(null, uConstructor.newInstance(objArray));
                }
             }
          }catch(java.lang.Exception e3){
             e3.printStackTrace();
          }
          i = i + 1;
       }
       return p1;
    }
    public static Class load(Class p0,String p1){
       try{
          return RefClass.load(p0, Class.forName(p1));
       }catch(java.lang.Exception e0){
          return null;
       }
    }
}
