package androidx.lifecycle.LifecycleRegistry$1;
import androidx.lifecycle.Lifecycle$State;
import java.lang.Enum;
import androidx.lifecycle.Lifecycle$Event;

public class LifecycleRegistry$1	// class@0007d0
{
    public static final int[] $SwitchMap$androidx$lifecycle$Lifecycle$Event;
    public static final int[] $SwitchMap$androidx$lifecycle$Lifecycle$State;

    static {
       int[] ointArray = new int[Lifecycle$State.values().length];
       LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$State = ointArray;
       try{
          int i = 1;
          ointArray[Lifecycle$State.INITIALIZED.ordinal()] = i;
          int i1 = 2;
          try{
             LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$State[Lifecycle$State.CREATED.ordinal()] = i1;
             int i2 = 3;
             try{
                LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$State[Lifecycle$State.STARTED.ordinal()] = i2;
                int i3 = 4;
                try{
                   LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$State[Lifecycle$State.RESUMED.ordinal()] = i3;
                   int i4 = 5;
                   try{
                      LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$State[Lifecycle$State.DESTROYED.ordinal()] = i4;
                      int[] ointArray1 = new int[Lifecycle$Event.values().length];
                      try{
                         LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event = ointArray1;
                         ointArray1[Lifecycle$Event.ON_CREATE.ordinal()] = i;
                         try{
                            LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Lifecycle$Event.ON_STOP.ordinal()] = e0;
                            try{
                               LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Lifecycle$Event.ON_START.ordinal()] = i2;
                               try{
                                  LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Lifecycle$Event.ON_PAUSE.ordinal()] = i3;
                                  try{
                                     LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Lifecycle$Event.ON_RESUME.ordinal()] = i4;
                                     try{
                                        LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Lifecycle$Event.ON_DESTROY.ordinal()] = 6;
                                        try{
                                           LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Lifecycle$Event.ON_ANY.ordinal()] = 7;
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
