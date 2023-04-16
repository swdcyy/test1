package com.kwai.page.component.a$a;
import com.kwai.page.component.ComponentStateGraph$ComponentState;
import java.lang.Enum;

public class a$a	// class@00103c
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ComponentStateGraph$ComponentState.values().length];
       try{
          a$a.a = ointArray;
          ointArray[ComponentStateGraph$ComponentState.INIT.ordinal()] = 1;
          try{
             a$a.a[ComponentStateGraph$ComponentState.CREATE.ordinal()] = 2;
             try{
                a$a.a[ComponentStateGraph$ComponentState.BIND.ordinal()] = 3;
                try{
                   a$a.a[ComponentStateGraph$ComponentState.UNBIND.ordinal()] = 4;
                   try{
                      a$a.a[ComponentStateGraph$ComponentState.DESTROY.ordinal()] = 5;
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
