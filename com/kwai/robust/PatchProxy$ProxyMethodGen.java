package com.kwai.robust.PatchProxy$ProxyMethodGen;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.System;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Boolean;

public class PatchProxy$ProxyMethodGen	// class@0013f7
{
    public static final int MAX_REF_ARGS_SIZE = 4;
    public static Class[] defaultArgs;
    public static String[] refArgs;

    static {
       Class[] uClassArray = new Class[]{Object.class,Class.class,String.class};
       PatchProxy$ProxyMethodGen.defaultArgs = uClassArray;
       String[] stringArray = new String[]{"OneRefs","TwoRefs","ThreeRefs","FourRefs"};
       PatchProxy$ProxyMethodGen.refArgs = stringArray;
    }
    public void PatchProxy$ProxyMethodGen(){
       super();
    }
    public static Class[] getArgsType(int p0){
       Class[] uClassArray;
       if (p0 < 0) {
          throw new IllegalArgumentException("refArgsSize "+p0+" must be > 0");
       }
       if (!p0 || p0 > 4) {
          Class[] defaultArgs = PatchProxy$ProxyMethodGen.defaultArgs;
          uClassArray = new Class[(defaultArgs.length + 1)];
          uClassArray[0] = Object[].class;
          System.arraycopy(defaultArgs, 0, uClassArray, 1, defaultArgs.length);
          return uClassArray;
       }else {
          uClassArray = new Class[(PatchProxy$ProxyMethodGen.defaultArgs.length + p0)];
          for (int i = 0; i < p0; i = i + 1) {
             uClassArray[i] = Object.class;
          }
          Class[] defaultArgs1 = PatchProxy$ProxyMethodGen.defaultArgs;
          System.arraycopy(defaultArgs1, 0, uClassArray, p0, defaultArgs1.length);
          return uClassArray;
       }
    }
    public static String getName(int p0,boolean p1,boolean p2){
       StringBuilder str = "apply";
       if (p0 < 0) {
          throw new IllegalArgumentException("refArgsSize "+p0+" must be > 0");
       }
       if (!p1) {
          str = str+"Void";
       }
       if (p0 > 0 && p0 <= 4) {
          p0--;
          str = str+PatchProxy$ProxyMethodGen.refArgs[p0];
       }
       if (p2) {
          str = str+"WithListener";
       }
       return str;
    }
    public static Class getRetValueType(boolean p0){
       Class uClass = (p0)? Object.class: Boolean.TYPE;
       return uClass;
    }
}
