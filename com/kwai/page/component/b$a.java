package com.kwai.page.component.b$a;
import com.kwai.page.component.ComponentStateGraph$ComponentState;
import java.lang.Enum;

public class b$a	// class@00103f
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ComponentStateGraph$ComponentState.values().length];
       try{
          b$a.a = ointArray;
          ointArray[ComponentStateGraph$ComponentState.INIT.ordinal()] = 1;
          try{
             b$a.a[ComponentStateGraph$ComponentState.CREATE.ordinal()] = 2;
             try{
                b$a.a[ComponentStateGraph$ComponentState.BIND.ordinal()] = 3;
                try{
                   b$a.a[ComponentStateGraph$ComponentState.UNBIND.ordinal()] = 4;
                   try{
                      b$a.a[ComponentStateGraph$ComponentState.DESTROY.ordinal()] = 5;
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
