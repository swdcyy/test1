package androidx.lifecycle.FullLifecycleObserverAdapter$1;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Enum;

public class FullLifecycleObserverAdapter$1	// class@0007c2
{
    public static final int[] $SwitchMap$androidx$lifecycle$Lifecycle$Event;

    static {
       int[] ointArray = new int[Lifecycle$Event.values().length];
       try{
          FullLifecycleObserverAdapter$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event = ointArray;
          ointArray[Lifecycle$Event.ON_CREATE.ordinal()] = 1;
          try{
             FullLifecycleObserverAdapter$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Lifecycle$Event.ON_START.ordinal()] = 2;
             try{
                FullLifecycleObserverAdapter$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Lifecycle$Event.ON_RESUME.ordinal()] = 3;
                try{
                   FullLifecycleObserverAdapter$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Lifecycle$Event.ON_PAUSE.ordinal()] = 4;
                   try{
                      FullLifecycleObserverAdapter$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Lifecycle$Event.ON_STOP.ordinal()] = 5;
                      try{
                         FullLifecycleObserverAdapter$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Lifecycle$Event.ON_DESTROY.ordinal()] = 6;
                         try{
                            FullLifecycleObserverAdapter$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Lifecycle$Event.ON_ANY.ordinal()] = 7;
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
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
