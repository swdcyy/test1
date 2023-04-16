package com.kwai.framework.debuglog.i$a;
import com.kwai.framework.debuglog.RetrieveType;
import java.lang.Enum;

public class i$a	// class@001515
{
    public static final int[] a;

    static {
       int[] ointArray = new int[RetrieveType.values().length];
       try{
          i$a.a = ointArray;
          ointArray[RetrieveType.OAT.ordinal()] = 1;
          try{
             i$a.a[RetrieveType.LIB.ordinal()] = 2;
             try{
                i$a.a[RetrieveType.BASE.ordinal()] = 3;
                try{
                   i$a.a[RetrieveType.TREE.ordinal()] = 4;
                   try{
                      i$a.a[RetrieveType.FILE.ordinal()] = 5;
                   }catch(java.lang.NoSuchFieldError e0){
                   }
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
