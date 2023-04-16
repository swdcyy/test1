package n2b.d;
import zk.d;
import com.google.gson.Gson;
import java.lang.Object;
import com.kuaishou.android.vader.Channel;
import com.kuaishou.client.log.packages.nano.ClientLog$ReportEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import k2b.x1;
import com.yxcorp.gifshow.log.n;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$EventPackage;
import com.yxcorp.gifshow.log.channel.a;
import java.lang.Exception;
import k2b.z1;
import n2b.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import com.yxcorp.gifshow.log.channel.LogChannelRule;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExceptionEvent$Type;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExceptionEvent;
import f3b.o;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$SearchEvent$Source;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$SearchEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$CustomEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CustomStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AudienceStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CustomProtoEvent;
import com.yxcorp.utility.Log;
import com.google.gson.JsonArray;
import java.util.HashMap;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashSet;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.a;
import n2b.d$a;
import java.lang.reflect.Type;
import el.a;

public class d	// class@001f03
{
    public static boolean a;
    public static Context b;
    public static boolean c;
    public static boolean d;
    public static Map e;
    public static Gson f;

    static {
       d uod = new d();
       uod.c();
       d.f = uod.b();
    }
    public void d(){
       super();
    }
    public static Channel a(int p0){
       if (!p0) {
          return Channel.REAL_TIME;
       }
       if (p0 == 1) {
          return Channel.HIGH_FREQ;
       }
       if (p0 != 2) {
          return null;
       }
       return Channel.NORMAL;
    }
    public static Channel b(ClientLog$ReportEvent p0,boolean p1){
       ClientLog$ReportEvent obj1;
       d uod = d.class;
       Channel obj = null;
       if (PatchProxy.isSupport(uod)) {
          obj1 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), obj, uod, "7");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       Channel hIGH_FREQ = (p1)? Channel.HIGH_FREQ: Channel.NORMAL;
       if (p0 == null) {
          return hIGH_FREQ;
       }else {
          obj1 = p0.statPackage;
          if (obj1 != null) {
             if (obj1.livePlayBizStatEvent != null && n.A1().M()) {
                return Channel.REAL_TIME;
             }else {
                obj1 = p0.statPackage;
                if (obj1.heartBeatEvent != null || obj1.deviceMappingEvent != null) {
                   return Channel.HIGH_FREQ;
                }
             }
          }
          obj1 = p0.eventPackage;
          if (obj1 != null && obj1.launchEvent != null) {
             return Channel.HIGH_FREQ;
          }else if(d.d || d.c){
             if (!d.a) {
                return hIGH_FREQ;
             }else {
                try{
                   obj = d.c(p0);
                }catch(java.lang.Exception e4){
                   z1.e("V2_LOG_CHANNEL_CONFIG_PARSE_FAILED", e4.getMessage());
                }
                if (obj != null) {
                   hIGH_FREQ = obj;
                }
                return hIGH_FREQ;
             }
          }else {
             boolean b = false;
             try{
                b = a.d(p0);
             }catch(java.lang.Exception e4){
                z1.e("V2_RECO_PARSE_FAILED", e4.getMessage());
             }
             if (b) {
                hIGH_FREQ = Channel.REAL_TIME;
             }
             return hIGH_FREQ;
          }
       }
    }
    public static Channel c(ClientLog$ReportEvent p0){
       String str7;
       Map map;
       int i;
       ClientStat$StatPackage customProtoE;
       Set set;
       Iterator iterator;
       LogChannelRule logChannelRu;
       Channel uChannel;
       ClientEvent$UrlPackage page2;
       ClientLog$ReportEvent reportEvent;
       Set set1;
       Iterator iterator1;
       LogChannelRule logChannelRu1;
       LogChannelRule mBizList;
       Set set2;
       Iterator iterator2;
       LogChannelRule logChannelRu2;
       ClientEvent$EventPackage searchEvent;
       String str8;
       ClientLog$ReportEvent obj = p0;
       e uoe = e.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ClientLog$ReportEvent obj1 = PatchProxy.applyOneRefs(obj, null, d.class, "8");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (d.a) {
          obj1 = obj.eventPackage;
          String str = "exception";
          String str1 = "search";
          String str2 = "audienceStat";
          String str3 = "anchorVoipQosSliceStat";
          PatchProxyResult patchProxyRe1 = patchProxyRe;
          String str4 = "share";
          e uoe1 = uoe;
          String str5 = "audienceQosSliceStat";
          String str6 = "customProto";
          if (obj1 != null) {
             ClientEvent$EventPackage showEvent = obj1.showEvent;
             if (showEvent != null) {
                ClientEvent$ShowEvent action = showEvent.action;
                if (action != 1 && action != 2) {
                   if (action != 3) {
                      str7 = "elementShow";
                   }
                }else {
                   map = 3;
                }
                str7 = "pageShow";
             }else if(obj1.clickEvent != null){
                str7 = "click";
             }else if(obj1.taskEvent != null){
                str7 = "task";
             }else if(obj1.customEvent != null){
                str7 = "custom";
             }else if(obj1.searchEvent != null){
                str7 = str1;
             }else if(obj1.shareEvent != null){
                str7 = str4;
             }else if(obj1.exceptionEvent != null){
                str7 = str;
             }else {
             label_00a3 :
                str7 = "";
             }
          }else {
             obj1 = obj.statPackage;
             if (obj1 != null) {
                if (obj1.customStatEvent != null) {
                   str7 = "customStat";
                }else if(obj1.customProtoEvent != null){
                   str7 = str6;
                }else if(obj1.videoStatEvent != null){
                   str7 = "videoStat";
                }else if(obj1.audienceStatEvent != null){
                   str7 = str2;
                }else if(obj1.audienceQosSliceStatEvent != null){
                   str7 = str5;
                }else if(obj1.anchorVoipQosSliceStatEvent != null){
                   str7 = str3;
                }else {
                   goto label_00a3 ;
                }
             }else {
                goto label_00a3 ;
             }
          }
          map = d.e.get(str7);
          if (map == null) {
             return null;
          }else {
             obj = -1;
             switch (str7.hashCode()){
                 case 0x9538ccf7:
                   if (!str7.equals(str6)) {
                   label_014e :
                      i = -1;
                   }else {
                      i = 0;
                   }
                   break;
                 case 0x9901c278:
                   if (!str7.equals(str2)) {
                      goto label_014e ;
                   }else {
                      i = 1;
                   }
                   break;
                 case 0xa1b8e565:
                   if (!str7.equals("customStat")) {
                      goto label_014e ;
                   }else {
                      i = 2;
                   }
                   break;
                 case 0xaf968b71:
                   if (!str7.equals("custom")) {
                      goto label_014e ;
                   }else {
                      i = 3;
                   }
                   break;
                 case 0xb0c46895:
                   if (!str7.equals(str5)) {
                      goto label_014e ;
                   }else {
                      i = 4;
                   }
                   break;
                 case 0xc9fa65a8:
                   if (!str7.equals(str1)) {
                      goto label_014e ;
                   }else {
                      i = 5;
                   }
                   break;
                 case 0x363585:
                   if (!str7.equals("task")) {
                      goto label_014e ;
                   }else {
                      i = 6;
                   }
                   break;
                 case 0x5a5c588:
                   if (!str7.equals("click")) {
                      goto label_014e ;
                   }else {
                      i = 7;
                   }
                   break;
                 case 0x6854fdf:
                   if (!str7.equals(str4)) {
                      goto label_014e ;
                   }else {
                      i = 8;
                   }
                   break;
                 case 0x282a9019:
                   if (!str7.equals("elementShow")) {
                      goto label_014e ;
                   }else {
                      i = 9;
                   }
                   break;
                 case 0x3339d22c:
                   if (!str7.equals("pageShow")) {
                      goto label_014e ;
                   }else {
                      i = 10;
                   }
                   break;
                 case 0x4f72d96f:
                   if (!str7.equals("videoStat")) {
                      goto label_014e ;
                   }else {
                      i = 11;
                   }
                   break;
                 case 0x584fd04f:
                   if (!str7.equals(str)) {
                      goto label_014e ;
                   }else {
                      i = 12;
                   }
                   break;
                 case 0x66274306:
                   if (!str7.equals(str3)) {
                      goto label_014e ;
                   }else {
                      i = 13;
                   }
                   break;
                 default:
                   goto label_014e ;
             }
             switch (i){
                 case 0:
                   customProtoE = p0.statPackage.customProtoEvent;
                   ClientStat$CustomProtoEvent type = (customProtoE != null)? customProtoE.type: null;
                   set = map.get(type);
                   if (set != null) {
                      iterator = set.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            logChannelRu = iterator.next();
                            if (logChannelRu != null && (logChannelRu.mType).equals(type)) {
                               uChannel = d.a(logChannelRu.mChannel);
                               break ;
                            }
                         }else {
                         label_0407 :
                            uChannel = null;
                            break ;
                         }
                      }
                   }else {
                      goto label_0407 ;
                   }
                   break;
                 case 1:
                 case 11:
                   obj = p0.statPackage;
                   ClientStat$StatPackage videoStatEve = obj.videoStatEvent;
                   if (videoStatEve != null) {
                      ClientStat$VideoStatEvent urlPackage = videoStatEve.urlPackage;
                      if (urlPackage != null) {
                         page2 = urlPackage.page2;
                      }else {
                      label_039b :
                         customProtoE = obj.audienceStatEvent;
                         if (customProtoE != null) {
                            ClientStat$AudienceStatEvent urlPackage1 = customProtoE.urlPackage;
                            if (urlPackage1 != null) {
                               page2 = urlPackage1.page2;
                            }
                         }
                         page2 = null;
                      }
                   }else {
                      goto label_039b ;
                   }
                   set = map.get(page2);
                   if (set != null) {
                      iterator = set.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            logChannelRu = iterator.next();
                            if (logChannelRu != null && (logChannelRu.mPage2).equals(page2)) {
                               return d.a(logChannelRu.mChannel);
                            }
                            continue ;
                         }else {
                            goto label_0407 ;
                         }
                      }
                   }else {
                      goto label_0407 ;
                   }
                   break;
                 case 2:
                   reportEvent = p0;
                   ClientStat$StatPackage customStatEv = reportEvent.statPackage.customStatEvent;
                   ClientStat$CustomStatEvent key = (customStatEv != null)? customStatEv.key: null;
                   set1 = map.get(key);
                   if (set1 != null) {
                      iterator1 = set1.iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            logChannelRu1 = iterator1.next();
                            if (logChannelRu1 == null) {
                               continue ;
                            }else {
                               ClientStat$StatPackage customStatEv1 = reportEvent.statPackage.customStatEvent;
                               ClientStat$CustomStatEvent biz = (customStatEv1 != null)? customStatEv1.biz: -1;
                               if (biz != obj) {
                                  mBizList = logChannelRu1.mBizList;
                                  if (mBizList != null && (!mBizList.length || d.d(mBizList, biz))) {
                                     return d.a(logChannelRu1.mChannel);
                                  }
                                  continue ;
                               }
                            }
                         }else {
                            goto label_0407 ;
                         }
                      }
                   }else {
                      goto label_0407 ;
                   }
                   break;
                 case 3:
                   reportEvent = p0;
                   ClientEvent$EventPackage customEvent = reportEvent.eventPackage.customEvent;
                   ClientEvent$CustomEvent key1 = (customEvent != null)? customEvent.key: null;
                   set1 = map.get(key1);
                   if (set1 != null) {
                      iterator1 = set1.iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            logChannelRu1 = iterator1.next();
                            if (logChannelRu1 == null) {
                               continue ;
                            }else {
                               ClientEvent$CustomEvent biz1 = reportEvent.eventPackage.customEvent.biz;
                               if (biz1 == obj) {
                                  biz1 = -1;
                               }
                               if (biz1 != obj) {
                                  mBizList = logChannelRu1.mBizList;
                                  if (mBizList != null && (!mBizList.length || d.d(mBizList, biz1))) {
                                     return d.a(logChannelRu1.mChannel);
                                  }
                                  continue ;
                               }
                            }
                         }else {
                            goto label_0407 ;
                         }
                      }
                   }else {
                      goto label_0407 ;
                   }
                   break;
                 case 4:
                   set2 = map.get(str5);
                   if (set2 != null) {
                      iterator2 = set2.iterator();
                      while (true) {
                         if (iterator2.hasNext()) {
                            logChannelRu2 = iterator2.next();
                            if (logChannelRu2 != null) {
                            label_02f7 :
                               return d.a(logChannelRu2.mChannel);
                            }
                            continue ;
                         }else {
                            goto label_0407 ;
                         }
                      }
                   }else {
                      goto label_0407 ;
                   }
                   break;
                 case 5:
                   obj = p0.eventPackage;
                   str5 = PatchProxy.applyOneRefs(obj, null, uoe1, "6");
                   if (str5 != patchProxyRe1) {
                   }else {
                      searchEvent = obj.searchEvent;
                      str8 = (searchEvent != null)? o.g(ClientEvent$SearchEvent$Source.class, searchEvent.source): null;
                      str5 = str8;
                   }
                   set2 = map.get(str5);
                   if (set2 != null) {
                      iterator2 = set2.iterator();
                      while (true) {
                         if (iterator2.hasNext()) {
                            logChannelRu = iterator2.next();
                            if (logChannelRu != null && (logChannelRu.mSource).equals(str5)) {
                               return d.a(logChannelRu.mChannel);
                            }
                            continue ;
                         }else {
                            goto label_0407 ;
                         }
                      }
                   }else {
                      goto label_0407 ;
                   }
                   break;
                 case 6:
                 case 9:
                 case 7:
                   reportEvent = p0;
                   set2 = map.get(e.b(reportEvent.eventPackage));
                   if (set2 != null) {
                      iterator2 = set2.iterator();
                      do {
                         if (iterator2.hasNext()) {
                            logChannelRu = iterator2.next();
                            if (logChannelRu == null || TextUtils.isEmpty(logChannelRu.mPage2)) {
                               continue ;
                            }else {
                               str7 = e.c(p0);
                               if (("all_page").equalsIgnoreCase(logChannelRu.mPage2) || (logChannelRu.mPage2).equals(str7)) {
                                  logChannelRu1 = logChannelRu.mPhotoTypeList;
                                  if (logChannelRu1 != null && logChannelRu1.length) {
                                     int i1 = e.d(reportEvent.eventPackage);
                                     if (i1) {
                                        int len = logChannelRu1.length;
                                        int i2 = 0;
                                        while (true) {
                                           if (i2 < len) {
                                              if (i1 == logChannelRu1[i2]) {
                                                 logChannelRu1 = 1;
                                              }else {
                                                 i2 = i2 + 1;
                                              }
                                           }
                                        }
                                     }
                                     logChannelRu1 = null;
                                  }
                                  break ;
                               }
                            }
                         }else {
                            goto label_0407 ;
                         }
                      } while (logChannelRu1);
                      return d.a(logChannelRu.mChannel);
                   }else {
                      goto label_0407 ;
                   }
                   break;
                 case 8:
                   set2 = map.get(str4);
                   if (set2 != null) {
                      iterator2 = set2.iterator();
                      while (true) {
                         if (iterator2.hasNext()) {
                            logChannelRu2 = iterator2.next();
                            if (logChannelRu2 != null) {
                            label_0220 :
                               return d.a(logChannelRu2.mChannel);
                            }
                            continue ;
                         }else {
                            goto label_0407 ;
                         }
                      }
                   }else {
                      goto label_0407 ;
                   }
                   break;
                 case 10:
                   set2 = map.get(o.j(p0.eventPackage.showEvent.action));
                   if (set2 != null) {
                      str5 = e.c(p0);
                      iterator2 = set2.iterator();
                      while (true) {
                         if (iterator2.hasNext()) {
                            logChannelRu = iterator2.next();
                            if (logChannelRu == null || (!TextUtils.isEmpty(logChannelRu.mPage2) && (logChannelRu.mPage2).equals(str5))) {
                               return d.a(logChannelRu.mChannel);
                            }
                            continue ;
                         }else {
                            goto label_0407 ;
                         }
                      }
                   }else {
                      goto label_0407 ;
                   }
                   break;
                 case 12:
                   obj = p0.eventPackage;
                   str5 = PatchProxy.applyOneRefs(obj, null, uoe1, "7");
                   if (str5 != patchProxyRe1) {
                   }else {
                      searchEvent = obj.exceptionEvent;
                      str8 = (searchEvent != null)? o.g(ClientEvent$ExceptionEvent$Type.class, searchEvent.type): null;
                      str5 = str8;
                   }
                   set2 = map.get(str5);
                   if (set2 != null) {
                      iterator2 = set2.iterator();
                      while (true) {
                         if (iterator2.hasNext()) {
                            logChannelRu = iterator2.next();
                            if (logChannelRu != null && (logChannelRu.mExceptionType).equals(str5)) {
                               return d.a(logChannelRu.mChannel);
                            }
                            continue ;
                         }else {
                            goto label_0407 ;
                         }
                      }
                   }else {
                      goto label_0407 ;
                   }
                   break;
                 case 13:
                   set2 = map.get(str3);
                   if (set2 != null) {
                      iterator2 = set2.iterator();
                      while (true) {
                         if (iterator2.hasNext()) {
                            logChannelRu2 = iterator2.next();
                            if (logChannelRu2 != null) {
                            label_016f :
                               return d.a(logChannelRu2.mChannel);
                            }
                            continue ;
                         }else {
                            goto label_0407 ;
                         }
                      }
                   }else {
                      goto label_0407 ;
                   }
                   break;
                 default:
                   goto label_0407 ;
             }
             return uChannel;
          }
       }else {
          Log.d("LogChannelSwitcher", "chswitcher no init");
          return null;
       }
    }
    public static boolean d(int[] p0,int p1){
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (p0[i] == p1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public static boolean e(JsonArray p0){
       Map map;
       Set set;
       HashMap hashMap;
       LogChannelRule mKey;
       HashSet hashSet;
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null || !p0.size()) {
          return b;
       }
       d.e = new HashMap();
       while (b < p0.size()) {
          try{
             JsonElement jsonElement = p0.e0(b);
             if (jsonElement != null && jsonElement.E()) {
                LogChannelRule logChannelRu = new LogChannelRule(jsonElement.r());
                if (!TextUtils.isEmpty(logChannelRu.mEventType) && (!TextUtils.isEmpty(logChannelRu.mElementAction2) && !TextUtils.isEmpty(logChannelRu.mPage2))) {
                   map = d.e.get(logChannelRu.mEventType);
                   if (map == null) {
                      map = new HashMap();
                   }
                   set = map.get(logChannelRu.mElementAction2);
                   if (set == null) {
                      set = new HashSet();
                   }
                   set.add(logChannelRu);
                   map.put(logChannelRu.mElementAction2, set);
                   d.e.put(logChannelRu.mEventType, map);
                }else if(d.d && (!TextUtils.isEmpty(logChannelRu.mEventType) && (TextUtils.isEmpty(logChannelRu.mType) && (TextUtils.isEmpty(logChannelRu.mKey) && (TextUtils.isEmpty(logChannelRu.mSource) && (!TextUtils.isEmpty(logChannelRu.mPage2) || !TextUtils.isEmpty(logChannelRu.mExceptionType))))))){
                   map = d.e.get(logChannelRu.mEventType);
                   if (map == null) {
                      hashMap = new HashMap();
                   }
                   if ((logChannelRu.mEventType).equals("custom") || (logChannelRu.mEventType).equals("customStat")) {
                      set = hashMap.get(logChannelRu.mKey);
                      mKey = logChannelRu.mKey;
                   }else if((logChannelRu.mEventType).equals("customProto")){
                      hashSet = hashMap.get(logChannelRu.mType);
                      mKey = logChannelRu.mType;
                   }else if((logChannelRu.mEventType).equals("videoStat") || (logChannelRu.mEventType).equals("audienceStat")){
                      hashSet = hashMap.get(logChannelRu.mPage2);
                      mKey = logChannelRu.mPage2;
                   }else if((logChannelRu.mEventType).equals("search")){
                      hashSet = hashMap.get(logChannelRu.mSource);
                      mKey = logChannelRu.mSource;
                   }else if((logChannelRu.mEventType).equals("exception")){
                      hashSet = hashMap.get(logChannelRu.mExceptionType);
                      mKey = logChannelRu.mExceptionType;
                   }else {
                      hashSet = null;
                      mKey = hashSet;
                   }
                   if (set == null) {
                      hashSet = new HashSet();
                   }
                   hashSet.add(logChannelRu);
                   hashMap.put(mKey, hashSet);
                   d.e.put(logChannelRu.mEventType, hashMap);
                }else if(d.d && !TextUtils.isEmpty(logChannelRu.mEventType)){
                   map = d.e.get(logChannelRu.mEventType);
                   if (map == null) {
                      hashMap = new HashMap();
                   }
                   set = hashMap.get(logChannelRu.mEventType);
                   if (set == null) {
                      hashSet = new HashSet();
                   }
                   hashSet.add(logChannelRu);
                   hashMap.put(logChannelRu.mEventType, hashSet);
                   d.e.put(logChannelRu.mEventType, hashMap);
                }
             }
          }catch(java.lang.Exception e2){
             e2.printStackTrace();
          }
          b = b + 1;
       }
       return true;
    }
    public static JsonArray f(Context p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uod, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       try{
          String str = a.a(p0, "log_channel_config.json");
          if (!TextUtils.isEmpty(str)) {
             Gson gson = PatchProxy.apply(null, null, uod, "4");
             if (gson != patchProxyRe) {
             }else if(d.f == null){
                d uod1 = new d();
                uod1.c();
                d.f = uod1.b();
             }
             gson = d.f;
             return gson.i(str, new d$a().getType());
          }
       }catch(java.lang.Exception e4){
          z1.e("V2_LOG_CHANNEL_CONFIG_READ_FAILED", e4.getMessage());
          e4.printStackTrace();
       }
       return null;
    }
}
