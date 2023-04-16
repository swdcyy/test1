package com.tencent.open.a$b;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.tencent.open.a$a;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import java.lang.Void;
import java.lang.Throwable;

public class a$b	// class@000f3a
{

    public void a$b(){
       super();
    }
    public void call(String p0,List p1,a$a p2){
       object oobject;
       Object[] objArray;
       Method[] declaredMeth = this.getClass().getDeclaredMethods();
       int len = declaredMeth.length;
       int i = 0;
       int i1 = 0;
       while (true) {
          String str = null;
          if (i1 < len) {
             oobject = declaredMeth[i1];
             if ((oobject.getName()).equals(p0) && oobject.getParameterTypes().length == p1.size()) {
             label_002c :
                if (oobject != null) {
                   try{
                      int i2 = p1.size();
                      if (i2) {
                         int i3 = 1;
                         if (i2 != i3) {
                            len = 2;
                            if (i2 != len) {
                               i1 = 3;
                               if (i2 != i1) {
                                  int i4 = 4;
                                  if (i2 != i4) {
                                     int i5 = 5;
                                     if (i2 != i5) {
                                        objArray = new Object[]{p1.get(i),p1.get(i3),p1.get(len),p1.get(i1),p1.get(i4),p1.get(i5)};
                                        objArray = oobject.invoke(this, objArray);
                                     }else {
                                        objArray = new Object[i5];
                                        objArray[i] = p1.get(i);
                                        objArray[i3] = p1.get(i3);
                                        objArray[len] = p1.get(len);
                                        objArray[i1] = p1.get(i1);
                                        objArray[i4] = p1.get(i4);
                                        objArray = oobject.invoke(this, objArray);
                                     }
                                  }else {
                                     objArray = new Object[i4];
                                     objArray[i] = p1.get(i);
                                     objArray[i3] = p1.get(i3);
                                     objArray[len] = p1.get(len);
                                     objArray[i1] = p1.get(i1);
                                     objArray = oobject.invoke(this, objArray);
                                  }
                               }else {
                                  objArray = new Object[i1];
                                  objArray[i] = p1.get(i);
                                  objArray[i3] = p1.get(i3);
                                  objArray[len] = p1.get(len);
                                  objArray = oobject.invoke(this, objArray);
                               }
                            }else {
                               objArray = new Object[len];
                               objArray[i] = p1.get(i);
                               objArray[i3] = p1.get(i3);
                               objArray = oobject.invoke(this, objArray);
                            }
                         }else {
                            objArray = new Object[i3];
                            objArray[i] = p1.get(i);
                            objArray = oobject.invoke(this, objArray);
                         }
                      }else {
                         objArray = new Object[i];
                         objArray = oobject.invoke(this, objArray);
                      }
                      Class returnType = oobject.getReturnType();
                      SLog.d("openSDK_LOG.JsBridge", "-->call, result: "+objArray+" | ReturnType: "+returnType.getName());
                      if (("void").equals(returnType.getName()) || returnType == Void.class) {
                         if (p2 != null) {
                            p2.a(str);
                            break ;
                         }
                      }else if(p2 != null && this.customCallback()){
                         if (objArray != null) {
                            str = objArray.toString();
                         }
                         p2.a(str);
                         break ;
                      }
                      break ;
                   }catch(java.lang.Exception e11){
                      SLog.e("openSDK_LOG.JsBridge", "-->handler call mehtod ex. targetMethod: "+oobject, e11);
                      if (p2) {
                         p2.a();
                      }
                      return;
                   }
                }else if(p2 != null){
                   p2.a();
                }
                return;
             }else {
                i1 = i1 + 1;
             }
          }else {
             oobject = str;
             goto label_002c ;
          }
       }
       return;
    }
    public boolean customCallback(){
       return false;
    }
}
