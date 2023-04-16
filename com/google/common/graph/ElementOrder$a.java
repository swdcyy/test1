package com.google.common.graph.ElementOrder$a;
import com.google.common.graph.ElementOrder$Type;
import java.lang.Enum;

public class ElementOrder$a	// class@0018d3
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ElementOrder$Type.values().length];
       try{
          ElementOrder$a.a = ointArray;
          ointArray[ElementOrder$Type.UNORDERED.ordinal()] = 1;
          try{
             ElementOrder$a.a[ElementOrder$Type.INSERTION.ordinal()] = 2;
             try{
                ElementOrder$a.a[ElementOrder$Type.SORTED.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
