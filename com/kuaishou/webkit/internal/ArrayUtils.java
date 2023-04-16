package com.kuaishou.webkit.internal.ArrayUtils;
import java.lang.Object;
import java.lang.Class;
import java.lang.reflect.Array;
import java.lang.System;
import java.util.Objects;

public class ArrayUtils	// class@00130e
{

    public void ArrayUtils(){
       super();
    }
    public static Object[] appendElement(Class p0,Object[] p1,Object p2){
       Object[] objArray;
       int i = 0;
       if (p1 != null) {
          int len = p1.length;
          objArray = Array.newInstance(p0, (len + 1));
          System.arraycopy(p1, i, objArray, i, len);
          i = len;
       }else {
          objArray = Array.newInstance(p0, 1);
       }
       objArray[i] = p2;
       return objArray;
    }
    public static boolean contains(Object[] p0,Object p1){
       if (p0 == null) {
          return false;
       }
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (ArrayUtils.equals(p0[i], p1)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public static boolean equals(Object p0,Object p1){
       return Objects.equals(p0, p1);
    }
    public static Object[] removeElement(Class p0,Object[] p1,Object p2){
       if (p1 != null) {
          if (!ArrayUtils.contains(p1, p2)) {
             return p1;
          }else {
             int len = p1.length;
             int i = 0;
             int i1 = 0;
             while (i1 < len) {
                if (ArrayUtils.equals(p1[i1], p2)) {
                   if (len == 1) {
                      return null;
                   }else {
                      Object[] objArray = Array.newInstance(p0, (len - 1));
                      System.arraycopy(p1, i, objArray, i, i1);
                      System.arraycopy(p1, (i1 + 1), objArray, i1, ((len - i1) - 1));
                      return objArray;
                   }
                }
                i1 = i1 + 1;
             }
          }
       }
       return p1;
    }
}
