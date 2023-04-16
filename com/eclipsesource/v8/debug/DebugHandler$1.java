package com.eclipsesource.v8.debug.DebugHandler$1;
import com.eclipsesource.v8.debug.DebugHandler$DebugEvent;
import java.lang.Enum;

public class DebugHandler$1	// class@000ff0
{
    public static final int[] $SwitchMap$com$eclipsesource$v8$debug$DebugHandler$DebugEvent;

    static {
       int[] ointArray = new int[DebugHandler$DebugEvent.values().length];
       try{
          DebugHandler$1.$SwitchMap$com$eclipsesource$v8$debug$DebugHandler$DebugEvent = ointArray;
          ointArray[DebugHandler$DebugEvent.Break.ordinal()] = 1;
          try{
             DebugHandler$1.$SwitchMap$com$eclipsesource$v8$debug$DebugHandler$DebugEvent[DebugHandler$DebugEvent.BeforeCompile.ordinal()] = 2;
             try{
                DebugHandler$1.$SwitchMap$com$eclipsesource$v8$debug$DebugHandler$DebugEvent[DebugHandler$DebugEvent.AfterCompile.ordinal()] = 3;
                try{
                   DebugHandler$1.$SwitchMap$com$eclipsesource$v8$debug$DebugHandler$DebugEvent[DebugHandler$DebugEvent.Exception.ordinal()] = 4;
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
