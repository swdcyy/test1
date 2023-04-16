package com.kuaishou.krn.model.LoadingStateTrack$a;
import com.facebook.react.modules.diskcache.MetaDiskCache$EventType;
import java.lang.Enum;
import com.facebook.react.bridge.ReactMarkerConstants;

public class LoadingStateTrack$a	// class@000905
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[MetaDiskCache$EventType.values().length];
       LoadingStateTrack$a.b = ointArray;
       try{
          int i = 1;
          ointArray[MetaDiskCache$EventType.EVALUATE_START.ordinal()] = i;
          int i1 = 2;
          try{
             LoadingStateTrack$a.b[MetaDiskCache$EventType.GET_CACHE_MISS.ordinal()] = i1;
             int i2 = 3;
             try{
                LoadingStateTrack$a.b[MetaDiskCache$EventType.GET_INVALID_CRC.ordinal()] = i2;
                int i3 = 4;
                try{
                   LoadingStateTrack$a.b[MetaDiskCache$EventType.GET_INVALID_CACHE_VERSION.ordinal()] = i3;
                   int i4 = 5;
                   try{
                      LoadingStateTrack$a.b[MetaDiskCache$EventType.GET_CACHE_NULL.ordinal()] = i4;
                      int i5 = 6;
                      try{
                         LoadingStateTrack$a.b[MetaDiskCache$EventType.GET_DISK_CACHE_DESTROY.ordinal()] = i5;
                         int i6 = 7;
                         try{
                            LoadingStateTrack$a.b[MetaDiskCache$EventType.GET_CACHE_HIT.ordinal()] = i6;
                            int i7 = 8;
                            try{
                               LoadingStateTrack$a.b[MetaDiskCache$EventType.GET_FINISHED.ordinal()] = i7;
                               int[] ointArray1 = new int[ReactMarkerConstants.values().length];
                               try{
                                  LoadingStateTrack$a.a = ointArray1;
                                  ointArray1[ReactMarkerConstants.PROCESS_PACKAGES_START.ordinal()] = i;
                                  try{
                                     LoadingStateTrack$a.a[ReactMarkerConstants.PROCESS_PACKAGES_END.ordinal()] = e0;
                                     try{
                                        LoadingStateTrack$a.a[ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_START.ordinal()] = i2;
                                        try{
                                           LoadingStateTrack$a.a[ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_END.ordinal()] = i3;
                                           try{
                                              LoadingStateTrack$a.a[ReactMarkerConstants.CREATE_MODULE_START.ordinal()] = i4;
                                              try{
                                                 LoadingStateTrack$a.a[ReactMarkerConstants.CREATE_MODULE_END.ordinal()] = i5;
                                                 try{
                                                    LoadingStateTrack$a.a[ReactMarkerConstants.INITIALIZE_MODULE_END.ordinal()] = i6;
                                                    try{
                                                       LoadingStateTrack$a.a[ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START.ordinal()] = i7;
                                                       try{
                                                          LoadingStateTrack$a.a[ReactMarkerConstants.GET_CONSTANTS_START.ordinal()] = 9;
                                                          try{
                                                             LoadingStateTrack$a.a[ReactMarkerConstants.GET_CONSTANTS_END.ordinal()] = 10;
                                                             try{
                                                                LoadingStateTrack$a.a[ReactMarkerConstants.RUN_APPLICATION_START.ordinal()] = 11;
                                                                try{
                                                                   LoadingStateTrack$a.a[ReactMarkerConstants.RUN_APPLICATION_END.ordinal()] = 12;
                                                                   try{
                                                                      LoadingStateTrack$a.a[ReactMarkerConstants.CREATE_VIEW_END.ordinal()] = 13;
                                                                      try{
                                                                         LoadingStateTrack$a.a[ReactMarkerConstants.UPDATE_VIEW_END.ordinal()] = 14;
                                                                         try{
                                                                            LoadingStateTrack$a.a[ReactMarkerConstants.SET_CHILDREN_END.ordinal()] = 15;
                                                                            try{
                                                                               LoadingStateTrack$a.a[ReactMarkerConstants.MANAGE_CHILDREN_END.ordinal()] = 16;
                                                                               try{
                                                                                  LoadingStateTrack$a.a[ReactMarkerConstants.BATCH_COMPLETE_END.ordinal()] = 17;
                                                                                  try{
                                                                                     LoadingStateTrack$a.a[ReactMarkerConstants.LOAD_JS_BUNDLE_SIZE.ordinal()] = 18;
                                                                                     try{
                                                                                        LoadingStateTrack$a.a[ReactMarkerConstants.RUN_JS_BUNDLE_START.ordinal()] = 19;
                                                                                        try{
                                                                                           LoadingStateTrack$a.a[ReactMarkerConstants.RUN_JS_BUNDLE_END.ordinal()] = 20;
                                                                                           try{
                                                                                              LoadingStateTrack$a.a[ReactMarkerConstants.CONTENT_APPEARED.ordinal()] = 21;
                                                                                              try{
                                                                                                 LoadingStateTrack$a.a[ReactMarkerConstants.FMP_ON_DRAW.ordinal()] = 22;
                                                                                                 try{
                                                                                                    LoadingStateTrack$a.a[ReactMarkerConstants.LCP_ON_DRAW.ordinal()] = 23;
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
