package com.yxcorp.gifshow.listcomponent.module.b$a;
import com.yxcorp.gifshow.listcomponent.module.KsModuleStateMachine$State;
import java.lang.Enum;

public class b$a	// class@001a88
{
    public static final int[] a;

    static {
       int[] ointArray = new int[KsModuleStateMachine$State.values().length];
       try{
          b$a.a = ointArray;
          ointArray[KsModuleStateMachine$State.INIT.ordinal()] = 1;
          try{
             b$a.a[KsModuleStateMachine$State.CREATE.ordinal()] = 2;
             try{
                b$a.a[KsModuleStateMachine$State.BIND.ordinal()] = 3;
                try{
                   b$a.a[KsModuleStateMachine$State.UNBIND.ordinal()] = 4;
                   try{
                      b$a.a[KsModuleStateMachine$State.DESTROY.ordinal()] = 5;
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
