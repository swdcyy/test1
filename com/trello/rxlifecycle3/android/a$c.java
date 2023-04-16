package com.trello.rxlifecycle3.android.a$c;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Enum;
import com.trello.rxlifecycle3.android.ActivityEvent;

public class a$c	// class@000fe2
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[FragmentEvent.values().length];
       a$c.b = ointArray;
       try{
          int i = 1;
          ointArray[FragmentEvent.ATTACH.ordinal()] = i;
          int i1 = 2;
          try{
             a$c.b[FragmentEvent.CREATE.ordinal()] = i1;
             int i2 = 3;
             try{
                a$c.b[FragmentEvent.CREATE_VIEW.ordinal()] = i2;
                int i3 = 4;
                try{
                   a$c.b[FragmentEvent.START.ordinal()] = i3;
                   int i4 = 5;
                   try{
                      a$c.b[FragmentEvent.RESUME.ordinal()] = i4;
                      int i5 = 6;
                      try{
                         a$c.b[FragmentEvent.PAUSE.ordinal()] = i5;
                         try{
                            a$c.b[FragmentEvent.STOP.ordinal()] = 7;
                            try{
                               a$c.b[FragmentEvent.DESTROY_VIEW.ordinal()] = 8;
                               try{
                                  a$c.b[FragmentEvent.DESTROY.ordinal()] = 9;
                                  try{
                                     a$c.b[FragmentEvent.DETACH.ordinal()] = 10;
                                     int[] ointArray1 = new int[ActivityEvent.values().length];
                                     try{
                                        a$c.a = ointArray1;
                                        ointArray1[ActivityEvent.CREATE.ordinal()] = i;
                                        try{
                                           a$c.a[ActivityEvent.START.ordinal()] = e0;
                                           try{
                                              a$c.a[ActivityEvent.RESUME.ordinal()] = i2;
                                              try{
                                                 a$c.a[ActivityEvent.PAUSE.ordinal()] = i3;
                                                 try{
                                                    a$c.a[ActivityEvent.STOP.ordinal()] = i4;
                                                    try{
                                                       a$c.a[ActivityEvent.DESTROY.ordinal()] = i5;
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
