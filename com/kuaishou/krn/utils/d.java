package com.kuaishou.krn.utils.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Exception;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Math;
import java.lang.Integer;

public class d	// class@000926
{

    public void d(){
       super();
    }
    public static int a(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          return d.b(p0, p1);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          return 0;
       }
    }
    public static int b(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.equals(p0, p1)) {
          return 0;
       }
       int i = 1;
       if (!TextUtils.isEmpty(p0) && TextUtils.isEmpty(p1)) {
          return i;
       }
       if (!TextUtils.isEmpty(p1) && TextUtils.isEmpty(p0)) {
          return -1;
       }
       String[] stringArray = p0.split("\\.");
       String[] stringArray1 = p1.split("\\.");
       int i1 = Math.min(stringArray.length, stringArray1.length);
       int i2 = 0;
       object oobject = null;
       while (i2 < i1) {
          oobject = Integer.parseInt(stringArray[i2]) - Integer.parseInt(stringArray1[i2]);
          if (!oobject) {
             i2 = i2 + 1;
          }else if(!oobject){
             i1 = i2;
             while (true) {
                if (i1 < stringArray.length) {
                   if (Integer.parseInt(stringArray[i1]) > 0) {
                      break ;
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   while (true) {
                      if (i2 >= stringArray1.length) {
                         return 0;
                      }
                      if (Integer.parseInt(stringArray1[i2]) > 0) {
                      }else {
                         i2 = i2 + 1;
                      }
                   }
                   return -1;
                }
             }
             return i;
          }else if(oobject > 0){
             i = -1;
          }
          return i;
       }
    }
}
