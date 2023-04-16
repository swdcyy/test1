package com.kwai.edge.reco.ctr.CTRPredictor$generatorGather$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import sm7.i;
import ml5.a;
import com.kwai.sdk.eve.internal.inference.DataBundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.edge.reco.ctr.CTRPredictor;
import com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig;
import com.google.protobuf.GeneratedMessageLite;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import msd.a;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Map;
import trd.t0;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.sdk.eve.internal.inference.DataBundle$TRANSFER;

public final class CTRPredictor$generatorGather$1 extends Lambda implements p	// class@000d37
{
    public static final CTRPredictor$generatorGather$1 INSTANCE;

    static {
       CTRPredictor$generatorGather$1.INSTANCE = new CTRPredictor$generatorGather$1();
    }
    public void CTRPredictor$generatorGather$1(){
       super(2);
    }
    public final DataBundle invoke(i p0,a p1){
       Integer integer;
       Long longx;
       Float uFloat;
       Map map;
       DataBundle obj = PatchProxy.applyTwoRefs(p0, p1, this, CTRPredictor$generatorGather$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       a.p(p1, "triggerEvent");
       CTRPredictor v = CTRPredictor.v;
       if (v.l().b()) {
          obj = new DataBundle();
          GeneratedMessageLite generatedMes = p1.f();
          a.m(generatedMes);
          obj.a("event", generatedMes);
          List list = Collections.unmodifiableList(CTRPredictor.a(v));
          a.o(list, "Collections.unmodifiableList\(candidatePages\)");
          obj.a("candidatePages", list);
          String str = "b_user_follower_count";
          list = CTRPredictor.h(v).get(str);
          if (list != null) {
             integer = list.invoke();
             if (integer != null) {
             label_0062 :
                obj.a(str, integer);
                str = "b_user_follow_count";
                integer = CTRPredictor.h(v).get(str);
                if (integer != null) {
                   integer = integer.invoke();
                   if (integer != null) {
                   label_007e :
                      obj.a(str, integer);
                      str = "b_first_foreground_timestamp";
                      integer = CTRPredictor.h(v).get(str);
                      if (integer != null) {
                         longx = integer.invoke();
                         if (longx != null) {
                         label_009c :
                            obj.a(str, longx);
                            str = "post_draft_count";
                            longx = CTRPredictor.h(v).get(str);
                            if (longx != null) {
                               integer = longx.invoke();
                               if (integer != null) {
                               label_00b8 :
                                  obj.a(str, integer);
                                  str = "post_last_draft_modified_time";
                                  integer = CTRPredictor.h(v).get(str);
                                  if (integer != null) {
                                     integer = integer.invoke();
                                     if (integer != null) {
                                     label_00d4 :
                                        obj.a(str, integer);
                                        str = "is_current_display_post_bubble";
                                        integer = CTRPredictor.h(v).get(str);
                                        if (integer != null) {
                                           integer = integer.invoke();
                                           if (integer != null) {
                                           label_00f0 :
                                              obj.a(str, integer);
                                              str = "post_last_product_time_from_now_without_kuaishou";
                                              integer = CTRPredictor.h(v).get(str);
                                              if (integer != null) {
                                                 longx = integer.invoke();
                                                 if (longx != null) {
                                                 label_010c :
                                                    obj.a(str, longx);
                                                    str = "post_last_prodution_duration_without_kuaishou";
                                                    longx = CTRPredictor.h(v).get(str);
                                                    if (longx != null) {
                                                       longx = longx.invoke();
                                                       if (longx != null) {
                                                       label_0128 :
                                                          obj.a(str, longx);
                                                          str = "post_prodution_count_lately_without_kuaishou";
                                                          longx = CTRPredictor.h(v).get(str);
                                                          if (longx != null) {
                                                             longx = longx.invoke();
                                                             if (longx != null) {
                                                             label_0144 :
                                                                obj.a(str, longx);
                                                                str = "post_bubble_click_ratio_7d";
                                                                longx = CTRPredictor.h(v).get(str);
                                                                if (longx != null) {
                                                                   uFloat = longx.invoke();
                                                                   if (uFloat != null) {
                                                                   label_0162 :
                                                                      obj.a(str, uFloat);
                                                                      str = "bubble_display_ts";
                                                                      uFloat = CTRPredictor.h(v).get(str);
                                                                      if (uFloat != null) {
                                                                         longx = uFloat.invoke();
                                                                         if (longx != null) {
                                                                         label_017e :
                                                                            obj.a(str, longx);
                                                                            str = "bubble_click_ts";
                                                                            longx = CTRPredictor.h(v).get(str);
                                                                            if (longx != null) {
                                                                               longx = longx.invoke();
                                                                               if (longx != null) {
                                                                               label_019a :
                                                                                  obj.a(str, longx);
                                                                                  longx = CTRPredictor.h(v).get("getHomeShowingReddot");
                                                                                  if (longx != null) {
                                                                                     list = longx.invoke();
                                                                                     if (list != null) {
                                                                                     label_01b6 :
                                                                                        obj.a("reddot_current_display_list", list);
                                                                                        list = CTRPredictor.h(v).get("getHomeReddotDisplayTimes");
                                                                                        if (list != null) {
                                                                                           longx = list.invoke();
                                                                                           if (longx != null) {
                                                                                           label_01d4 :
                                                                                              obj.a("reddot_display_ts", longx);
                                                                                              longx = CTRPredictor.h(v).get("getHomeReddotClickTimes");
                                                                                              if (longx != null) {
                                                                                                 longx = longx.invoke();
                                                                                                 if (longx != null) {
                                                                                                 label_01f2 :
                                                                                                    obj.a("reddot_click_ts", longx);
                                                                                                    longx = CTRPredictor.h(v).get("getHomeReddotClickRatio");
                                                                                                    if (longx != null) {
                                                                                                       map = longx.invoke();
                                                                                                       if (map != null) {
                                                                                                       label_0210 :
                                                                                                          obj.a("reddot_click_ratio_7d", map);
                                                                                                          str = "has_ever_enter_record_page";
                                                                                                          map = CTRPredictor.h(v).get(str);
                                                                                                          if (map != null) {
                                                                                                             integer = map.invoke();
                                                                                                             if (integer != null) {
                                                                                                             label_022e :
                                                                                                                obj.a(str, integer);
                                                                                                                str = "is_first_launch_after_install_or_update";
                                                                                                                integer = CTRPredictor.h(v).get(str);
                                                                                                                if (integer != null) {
                                                                                                                   integer = integer.invoke();
                                                                                                                   if (integer != null) {
                                                                                                                   label_024a :
                                                                                                                      obj.a(str, integer);
                                                                                                                      str = "env_light_brightness";
                                                                                                                      integer = CTRPredictor.h(v).get(str);
                                                                                                                      if (integer != null) {
                                                                                                                         integer = integer.invoke();
                                                                                                                         if (integer != null) {
                                                                                                                         label_0266 :
                                                                                                                            obj.a(str, integer);
                                                                                                                            Iterator iterator = CTRPredictor.c(v).entrySet().iterator();
                                                                                                                            while (iterator.hasNext()) {
                                                                                                                               Map$Entry uEntry = iterator.next();
                                                                                                                               str = uEntry.getKey();
                                                                                                                               obj.a(str, uEntry.getValue().invoke());
                                                                                                                            }
                                                                                                                            obj.b(DataBundle$TRANSFER.VALUE);
                                                                                                                         }
                                                                                                                      }
                                                                                                                      integer = Integer.valueOf(-1);
                                                                                                                      goto label_0266 ;
                                                                                                                   }
                                                                                                                }
                                                                                                                integer = Integer.valueOf(-1);
                                                                                                                goto label_024a ;
                                                                                                             }
                                                                                                          }
                                                                                                          integer = Integer.valueOf(-1);
                                                                                                          goto label_022e ;
                                                                                                       }
                                                                                                    }
                                                                                                    map = t0.z();
                                                                                                    goto label_0210 ;
                                                                                                 }
                                                                                              }
                                                                                              longx = Long.valueOf(-1);
                                                                                              goto label_01f2 ;
                                                                                           }
                                                                                        }
                                                                                        longx = Long.valueOf(-1);
                                                                                        goto label_01d4 ;
                                                                                     }
                                                                                  }
                                                                                  list = CollectionsKt__CollectionsKt.E();
                                                                                  goto label_01b6 ;
                                                                               }
                                                                            }
                                                                            longx = Long.valueOf(-1);
                                                                            goto label_019a ;
                                                                         }
                                                                      }
                                                                      longx = Long.valueOf(-1);
                                                                      goto label_017e ;
                                                                   }
                                                                }
                                                                uFloat = Float.valueOf(0xbf800000);
                                                                goto label_0162 ;
                                                             }
                                                          }
                                                          longx = Long.valueOf(-1);
                                                          goto label_0144 ;
                                                       }
                                                    }
                                                    longx = Long.valueOf(-1);
                                                    goto label_0128 ;
                                                 }
                                              }
                                              longx = Long.valueOf(-1);
                                              goto label_010c ;
                                           }
                                        }
                                        integer = Integer.valueOf(-1);
                                        goto label_00f0 ;
                                     }
                                  }
                                  integer = Integer.valueOf(-1);
                                  goto label_00d4 ;
                               }
                            }
                            integer = Integer.valueOf(-1);
                            goto label_00b8 ;
                         }
                      }
                      longx = Long.valueOf(-1);
                      goto label_009c ;
                   }
                }
                integer = Integer.valueOf(-1);
                goto label_007e ;
             }
          }
          integer = Integer.valueOf(-1);
          goto label_0062 ;
       }else {
          obj = new DataBundle();
       }
       return obj;
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
}
