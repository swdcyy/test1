package com.android.kwai.foundation.network.core.utils.CallbackTypeGenerator;
import java.lang.Object;
import com.android.kwai.foundation.network.IRpcService$Callback;
import java.lang.Class;
import java.util.ArrayList;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import java.lang.Exception;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.lang.ClassNotFoundException;
import java.lang.String;

public class CallbackTypeGenerator	// class@0003fa
{

    public void CallbackTypeGenerator(){
       super();
    }
    public static Class getCallbackTypeClass(IRpcService$Callback p0){
       IRpcService$Callback uCallback = IRpcService$Callback.class;
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(p0.getClass());
       Class uClass = null;
       Class uClass1 = uClass;
       while (!uArrayList.isEmpty()) {
          int i = 0;
          Class uClass2 = uArrayList.remove(i);
          if (uClass1 != null && uCallback.equals(uClass2)) {
             Type[] genericInter = uClass1.getGenericInterfaces();
             int len = genericInter.length;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   object oobject = genericInter[i1];
                   try{
                      Type rawType = (oobject instanceof ParameterizedType)? oobject.getRawType(): oobject;
                      if (uCallback.equals(rawType) && oobject instanceof ParameterizedType) {
                         Type[] actualTypeAr = oobject.getActualTypeArguments();
                         Type rawType1 = (actualTypeAr[i] instanceof ParameterizedType)? actualTypeAr[i].getRawType(): actualTypeAr[i];
                         uClass = rawType1;
                      }
                   }catch(java.lang.Exception e7){
                      e7.printStackTrace();
                   }
                }
             }
             return uClass;
          }
       label_006a :
          Class[] interfaces = uClass2.getInterfaces();
          if (interfaces.length > 0) {
             uArrayList.addAll(Arrays.asList(interfaces));
          }
          Type genericSuper = uClass2.getGenericSuperclass();
          if (genericSuper instanceof ParameterizedType) {
             genericSuper = genericSuper.getRawType();
          }
          if (genericSuper != null && !Object.class.equals(genericSuper)) {
             uArrayList.add(genericSuper);
          }
          uClass1 = uClass2;
       }
       if (uClass != null) {
          goto label_009a ;
       }else {
          throw new ClassNotFoundException("not found generic of bean, please set a generic of bean");
       }
    }
}
