package com.kuaishou.krn.delegate.k$a;
import com.kuaishou.krn.delegate.BundleLoadMode;
import java.lang.Enum;

public class k$a	// class@000865
{
    public static final int[] a;

    static {
       int[] ointArray = new int[BundleLoadMode.values().length];
       try{
          k$a.a = ointArray;
          ointArray[BundleLoadMode.LOCAL_ONLY.ordinal()] = 1;
          try{
             k$a.a[BundleLoadMode.LOCAL_FIRST.ordinal()] = 2;
             try{
                k$a.a[BundleLoadMode.REMOTE_FIRST.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
