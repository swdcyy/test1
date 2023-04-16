package com.kuaishou.bowl.core.component.a$c;
import com.kuaishou.bowl.core.util.ComponentStateMachine$ComponentState;
import java.lang.Enum;

public class a$c	// class@001199
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ComponentStateMachine$ComponentState.values().length];
       try{
          a$c.a = ointArray;
          ointArray[ComponentStateMachine$ComponentState.CREATE.ordinal()] = 1;
          try{
             a$c.a[ComponentStateMachine$ComponentState.BIND.ordinal()] = 2;
             try{
                a$c.a[ComponentStateMachine$ComponentState.UNBIND.ordinal()] = 3;
                try{
                   a$c.a[ComponentStateMachine$ComponentState.DESTROY.ordinal()] = 4;
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
