package ard.e;
import java.lang.String;
import java.lang.Object;
import ard.a;
import java.lang.Throwable;
import java.lang.StringBuffer;
import java.util.HashMap;
import java.util.Map;
import java.lang.Class;
import java.lang.System;
import java.lang.StringBuilder;
import java.io.PrintStream;

public final class e	// class@00022a
{

    public static a a(String p0,Object[] p1){
       Throwable throwable;
       int i3;
       int i4;
       a uoa = -1;
       if (p1 != null && p1.length) {
          throwable = p1[(p1.length + uoa)];
          if (throwable instanceof Throwable) {
          label_0014 :
             if (p0 == null) {
                return new a(null, p1, throwable);
             }else if(p1 == null){
                return new a(p0);
             }else {
                StringBuffer str = new StringBuffer((p0.length() + 50));
                int i = 0;
                int i1 = 0;
                while (true) {
                   if (i < p1.length) {
                      int i2 = p0.indexOf("{}", i1);
                      if (i2 == uoa) {
                         if (!i1) {
                            break ;
                         }else {
                            return new a(str+p0.substring(i1, p0.length()), p1, throwable);
                         }
                      }else {
                         HashMap hashMap = 92;
                         if (i2) {
                            i3 = i2 - 1;
                            if (p0.charAt(i3) == hashMap) {
                               i3 = 1;
                            label_006b :
                               if (i3) {
                                  if (i2 >= 2) {
                                     i3 = i2 - 2;
                                     if (p0.charAt(i3) == hashMap) {
                                        i4 = 1;
                                     label_007b :
                                        if (!i4) {
                                           i = i - 1;
                                           i4 = i2 - 1;
                                           str = str+p0.substring(i1, i4)+'{';
                                           i2 = i2 + 1;
                                        label_00b7 :
                                           i1 = i2;
                                           i = i + 1;
                                        }else {
                                           i4 = i2 - 1;
                                           str = str+p0.substring(i1, i4);
                                           e.b(str, p1[i], new HashMap());
                                        }
                                     }
                                  }
                                  i4 = 0;
                                  goto label_007b ;
                               }else {
                                  str = str+p0.substring(i1, i2);
                                  e.b(str, p1[i], new HashMap());
                               }
                               i2 = i2 + 2;
                               goto label_00b7 ;
                            }
                         }
                         i3 = 0;
                         goto label_006b ;
                      }
                   }else {
                      str = str+p0.substring(i1, p0.length());
                      if (i < (p1.length - 1)) {
                         return new a(str, p1, throwable);
                      }else {
                         return new a(str, p1, null);
                      }
                   }
                }
                return new a(p0, p1, throwable);
             }
          }
       }
       throwable = null;
       goto label_0014 ;
    }
    public static void b(StringBuffer p0,Object p1,Map p2){
       int len;
       int i1;
       if (p1 == null) {
          p0+"null";
          return;
       }else if(!p1.getClass().isArray()){
          p0+p1.toString();
       }else {
          int i = 0;
          char c = '[';
          if (p1 instanceof boolean[]) {
             p0 = p0+c;
             len = p1.length;
             while (i < len) {
                p0 = p0+p1[i];
                i1 = len - 1;
                if (i != i1) {
                   p0 = p0+", ";
                }
                i = i + 1;
             }
             p0+']';
          }else if(p1 instanceof byte[]){
             p0 = p0+c;
             len = p1.length;
             while (i < len) {
                p0 = p0+p1[i];
                i1 = len - 1;
                if (i != i1) {
                   p0 = p0+", ";
                }
                i = i + 1;
             }
             p0+']';
          }else if(p1 instanceof char[]){
             p0 = p0+c;
             len = p1.length;
             while (i < len) {
                p0 = p0+p1[i];
                i1 = len - 1;
                if (i != i1) {
                   p0 = p0+", ";
                }
                i = i + 1;
             }
             p0+']';
          }else if(p1 instanceof short[]){
             p0 = p0+c;
             len = p1.length;
             while (i < len) {
                p0 = p0+p1[i];
                i1 = len - 1;
                if (i != i1) {
                   p0 = p0+", ";
                }
                i = i + 1;
             }
             p0+']';
          }else if(p1 instanceof int[]){
             p0 = p0+c;
             len = p1.length;
             while (i < len) {
                p0 = p0+p1[i];
                i1 = len - 1;
                if (i != i1) {
                   p0 = p0+", ";
                }
                i = i + 1;
             }
             p0+']';
          }else if(p1 instanceof long[]){
             p0 = p0+c;
             len = p1.length;
             while (i < len) {
                p0 = p0+p1[i];
                i1 = len - 1;
                if (i != i1) {
                   p0 = p0+", ";
                }
                i = i + 1;
             }
             p0+']';
          }else if(p1 instanceof float[]){
             p0 = p0+c;
             len = p1.length;
             while (i < len) {
                p0 = p0+p1[i];
                i1 = len - 1;
                if (i != i1) {
                   p0 = p0+", ";
                }
                i = i + 1;
             }
             p0+']';
          }else if(p1 instanceof double[]){
             p0 = p0+c;
             len = p1.length;
             while (i < len) {
                p0 = p0+p1[i];
                i1 = len - 1;
                if (i != i1) {
                   p0 = p0+", ";
                }
                i = i + 1;
             }
             p0+']';
          }else {
             p0 = p0+c;
             if (!p2.containsKey(p1)) {
                p2.put(p1, null);
                i1 = p1.length;
                while (i < i1) {
                   e.b(p0, p1[i], p2);
                   int i2 = i1 - 1;
                   if (i != i2) {
                      p0 = p0+", ";
                   }
                   i = i + 1;
                }
                p2.remove(p1);
             }else {
                p0 = p0+"...";
             }
             p0+']';
          }
       }
       return;
    }
    public static a c(String p0,Object p1){
       Object[] objArray = new Object[]{p1};
       return e.a(p0, objArray);
    }
    public static a d(String p0,Object p1,Object p2){
       Object[] objArray = new Object[]{p1,p2};
       return e.a(p0, objArray);
    }
}
