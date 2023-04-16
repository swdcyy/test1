package com.facebook.react.bridge.ReactContext$3;
import com.facebook.react.common.LifecycleState;
import java.lang.Enum;

public class ReactContext$3	// class@00121e
{
    public static final int[] $SwitchMap$com$facebook$react$common$LifecycleState;

    static {
       int[] ointArray = new int[LifecycleState.values().length];
       try{
          ReactContext$3.$SwitchMap$com$facebook$react$common$LifecycleState = ointArray;
          ointArray[LifecycleState.BEFORE_CREATE.ordinal()] = 1;
          try{
             ReactContext$3.$SwitchMap$com$facebook$react$common$LifecycleState[LifecycleState.BEFORE_RESUME.ordinal()] = 2;
             try{
                ReactContext$3.$SwitchMap$com$facebook$react$common$LifecycleState[LifecycleState.RESUMED.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
