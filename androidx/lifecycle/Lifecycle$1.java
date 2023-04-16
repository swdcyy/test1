package androidx.lifecycle.Lifecycle$1;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Enum;
import androidx.lifecycle.Lifecycle$State;

public class Lifecycle$1	// class@0007c7
{
    public static final int[] $SwitchMap$androidx$lifecycle$Lifecycle$Event;
    public static final int[] $SwitchMap$androidx$lifecycle$Lifecycle$State;

    static {
       int[] ointArray = new int[Lifecycle$Event.values().length];
       Lifecycle$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event = ointArray;
       try{
          int i = 1;
          ointArray[Lifecycle$Event.ON_CREATE.ordinal()] = i;
          int i1 = 2;
          try{
             Lifecycle$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Lifecycle$Event.ON_STOP.ordinal()] = i1;
             int i2 = 3;
             try{
                Lifecycle$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Lifecycle$Event.ON_START.ordinal()] = i2;
                int i3 = 4;
                try{
                   Lifecycle$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Lifecycle$Event.ON_PAUSE.ordinal()] = i3;
                   int i4 = 5;
                   try{
                      Lifecycle$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Lifecycle$Event.ON_RESUME.ordinal()] = i4;
                      try{
                         Lifecycle$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Lifecycle$Event.ON_DESTROY.ordinal()] = 6;
                         try{
                            Lifecycle$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Lifecycle$Event.ON_ANY.ordinal()] = 7;
                            int[] ointArray1 = new int[Lifecycle$State.values().length];
                            try{
                               Lifecycle$1.$SwitchMap$androidx$lifecycle$Lifecycle$State = ointArray1;
                               ointArray1[Lifecycle$State.CREATED.ordinal()] = i;
                               try{
                                  Lifecycle$1.$SwitchMap$androidx$lifecycle$Lifecycle$State[Lifecycle$State.STARTED.ordinal()] = e0;
                                  try{
                                     Lifecycle$1.$SwitchMap$androidx$lifecycle$Lifecycle$State[Lifecycle$State.RESUMED.ordinal()] = i2;
                                     try{
                                        Lifecycle$1.$SwitchMap$androidx$lifecycle$Lifecycle$State[Lifecycle$State.DESTROYED.ordinal()] = i3;
                                        try{
                                           Lifecycle$1.$SwitchMap$androidx$lifecycle$Lifecycle$State[Lifecycle$State.INITIALIZED.ordinal()] = i4;
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
