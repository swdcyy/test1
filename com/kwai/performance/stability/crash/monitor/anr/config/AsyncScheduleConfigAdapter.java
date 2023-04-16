package com.kwai.performance.stability.crash.monitor.anr.config.AsyncScheduleConfigAdapter;
import com.kwai.performance.stability.crash.monitor.anr.config.BaseGsonAdapter;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.anr.config.AsyncScheduleConfig;
import com.google.gson.JsonObject;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.String;
import java.util.Objects;
import java.util.List;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.ArrayList;
import zk.h;
import com.google.gson.JsonArray;
import java.lang.Number;

public class AsyncScheduleConfigAdapter extends BaseGsonAdapter	// class@0011bf
{

    public void AsyncScheduleConfigAdapter(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       AsyncScheduleConfig uAsyncSchedu = new AsyncScheduleConfig();
       Iterator iterator = p0.r().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          JsonElement value = uEntry.getValue();
          Objects.requireNonNull(key);
          int i = -1;
          int i1 = 0;
          switch (key.hashCode()){
              case 0x86d83aab:
                if (key.equals("forceSchedReceiverCmp")) {
                   i = 0;
                }
                break;
              case 0x909d752a:
                if (key.equals("enableHeadMsgCheck")) {
                   i = 1;
                }
                break;
              case 0x94cb9562:
                if (key.equals("enableBgLockResMgrSchedule")) {
                   i = 2;
                }
                break;
              case 0x96c2f5a5:
                if (key.equals("excludedException")) {
                   i = 3;
                }
                break;
              case 0x97d4b469:
                if (key.equals("enableServiceSchedule")) {
                   i = 4;
                }
                break;
              case 0xa1229919:
                if (key.equals("tempReceiverErrorToMain")) {
                   i = 5;
                }
                break;
              case 0xa2f8f4d3:
                if (key.equals("whatReceiver")) {
                   i = 6;
                }
                break;
              case 0xa53d2d8e:
                if (key.equals("enableConfChangeSchedule")) {
                   i = 7;
                }
                break;
              case 0xace1a5d8:
                if (key.equals("whatConfChange")) {
                   i = 8;
                }
                break;
              case 0xb2a50db5:
                if (key.equals("whatCreateService")) {
                   i = 9;
                }
                break;
              case 0xb569c152:
                if (key.equals("tempReportForDebug")) {
                   i = 10;
                }
                break;
              case 0xbc9b7357:
                if (key.equals("serviceWhatList")) {
                   i = 11;
                }
                break;
              case 0xbec32c05:
                if (key.equals("tempEnableDumpSchedQueue")) {
                   i = 12;
                }
                break;
              case 0xbeeb265d:
                if (key.equals("enableTrimMemorySchedule")) {
                   i = 13;
                }
                break;
              case 0xc1eaa738:
                if (key.equals("receiverWhiteList")) {
                   i = 14;
                }
                break;
              case 0xed516a3d:
                if (key.equals("enableDoubleQueue")) {
                   i = 15;
                }
                break;
              case 0xee538549:
                if (key.equals("enableReceiverSchedule")) {
                   i = 16;
                }
                break;
              case 0xf0560aef:
                if (key.equals("whatStopService")) {
                   i = 17;
                }
                break;
              case 0xf28d9fe9:
                if (key.equals("enableLowMemorySchedule")) {
                   i = 18;
                }
                break;
              case 0xe00eb1:
                if (key.equals("forceSchedReceiverAction")) {
                   i = 19;
                }
                break;
              case 0xd9eab6e:
                if (key.equals("tempEnableWhat114Wait")) {
                   i = 20;
                }
                break;
              case 0x108b2ceb:
                if (key.equals("tempEnableLooperHook")) {
                   i = 21;
                }
                break;
              case 0x1d4217ac:
                if (key.equals("forceSchedForReceiver")) {
                   i = 22;
                }
                break;
              case 0x1e60dda7:
                if (key.equals("whatTrimMemory")) {
                   i = 23;
                }
                break;
              case 0x1f8db678:
                if (key.equals("tempEnableDelayMapCheck")) {
                   i = 24;
                }
                break;
              case 0x251ceaf3:
                if (key.equals("tempEnable113Schedule")) {
                   i = 25;
                }
                break;
              case 0x315fb208:
                if (key.equals("serviceBlackList")) {
                   i = 26;
                }
                break;
              case 0x4a22cf11:
                if (key.equals("whatLowMemory")) {
                   i = 27;
                }
                break;
              case 0x53ad03ce:
                if (key.equals("whatServiceArgs")) {
                   i = 28;
                }
                break;
              case 0x563537bc:
                if (key.equals("tempCheckDelayTime")) {
                   i = 29;
                }
                break;
              case 0x5aa08bc0:
                if (key.equals("tempCatchRegistryRecycleException")) {
                   i = 30;
                }
                break;
              case 0x647ec605:
                if (key.equals("tempTryScheduleOnFound")) {
                   i = 31;
                }
                break;
              case 0x6a118553:
                if (key.equals("recentSchedCount")) {
                   i = 32;
                }
                break;
              case 0x73f2900e:
                if (key.equals("receiverBlackList")) {
                   i = 33;
                }
                break;
              case 0x754c6274:
                if (key.equals("receiverClassBlackList")) {
                   i = 34;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                uAsyncSchedu.forceSchedReceiverCmp = this.h(value, uAsyncSchedu.forceSchedReceiverCmp);
                break;
              case 1:
                uAsyncSchedu.enableHeadMsgCheck = this.e(value, Boolean.valueOf(uAsyncSchedu.enableHeadMsgCheck)).booleanValue();
                break;
              case 2:
                uAsyncSchedu.enableBgLockResMgrSchedule = this.e(value, Boolean.valueOf(uAsyncSchedu.enableBgLockResMgrSchedule)).booleanValue();
                break;
              case 3:
                uAsyncSchedu.excludedException = this.h(value, uAsyncSchedu.excludedException);
                break;
              case 4:
                uAsyncSchedu.enableServiceSchedule = this.e(value, Boolean.valueOf(uAsyncSchedu.enableServiceSchedule)).booleanValue();
                break;
              case 5:
                uAsyncSchedu.tempReceiverErrorToMain = this.e(value, Boolean.valueOf(uAsyncSchedu.tempReceiverErrorToMain)).booleanValue();
                break;
              case 6:
                uAsyncSchedu.whatReceiver = this.e(value, Integer.valueOf(uAsyncSchedu.whatReceiver)).intValue();
                break;
              case 7:
                uAsyncSchedu.enableConfChangeSchedule = this.e(value, Boolean.valueOf(uAsyncSchedu.enableConfChangeSchedule)).booleanValue();
                break;
              case 8:
                uAsyncSchedu.whatConfChange = this.e(value, Integer.valueOf(uAsyncSchedu.whatConfChange)).intValue();
                break;
              case 9:
                uAsyncSchedu.whatCreateService = this.e(value, Integer.valueOf(uAsyncSchedu.whatCreateService)).intValue();
                break;
              case 10:
                uAsyncSchedu.tempReportForDebug = this.e(value, Boolean.valueOf(uAsyncSchedu.tempReportForDebug)).booleanValue();
                break;
              case 11:
                AsyncScheduleConfig serviceWhatL = uAsyncSchedu.serviceWhatList;
                int[] ointArray = this.f(value, null);
                if (ointArray != null) {
                   serviceWhatL = new ArrayList();
                   i = ointArray.length;
                   for (; i1 < i; i1 = i1 + 1) {
                      serviceWhatL.add(Integer.valueOf(ointArray[i1]));
                   }
                }
                uAsyncSchedu.serviceWhatList = serviceWhatL;
                break;
              case 12:
                uAsyncSchedu.tempEnableDumpSchedQueue = this.e(value, Boolean.valueOf(uAsyncSchedu.tempEnableDumpSchedQueue)).booleanValue();
                break;
              case 13:
                uAsyncSchedu.enableTrimMemorySchedule = this.e(value, Boolean.valueOf(uAsyncSchedu.enableTrimMemorySchedule)).booleanValue();
                break;
              case 14:
                uAsyncSchedu.receiverWhiteList = this.h(value, uAsyncSchedu.receiverWhiteList);
                break;
              case 15:
                uAsyncSchedu.enableDoubleQueue = this.e(value, Boolean.valueOf(uAsyncSchedu.enableDoubleQueue)).booleanValue();
                break;
              case 16:
                uAsyncSchedu.enableReceiverSchedule = this.e(value, Boolean.valueOf(uAsyncSchedu.enableReceiverSchedule)).booleanValue();
                break;
              case 17:
                uAsyncSchedu.whatStopService = this.e(value, Integer.valueOf(uAsyncSchedu.whatStopService)).intValue();
                break;
              case 18:
                uAsyncSchedu.enableLowMemorySchedule = this.e(value, Boolean.valueOf(uAsyncSchedu.enableLowMemorySchedule)).booleanValue();
                break;
              case 19:
                uAsyncSchedu.forceSchedReceiverAction = this.h(value, uAsyncSchedu.forceSchedReceiverAction);
                break;
              case 20:
                uAsyncSchedu.tempEnableWhat114Wait = this.e(value, Boolean.valueOf(uAsyncSchedu.tempEnableWhat114Wait)).booleanValue();
                break;
              case 21:
                uAsyncSchedu.tempEnableLooperHook = this.e(value, Boolean.valueOf(uAsyncSchedu.tempEnableLooperHook)).booleanValue();
                break;
              case 22:
                uAsyncSchedu.forceSchedForReceiver = this.e(value, Boolean.valueOf(uAsyncSchedu.forceSchedForReceiver)).booleanValue();
                break;
              case 23:
                uAsyncSchedu.whatTrimMemory = this.e(value, Integer.valueOf(uAsyncSchedu.whatTrimMemory)).intValue();
                break;
              case 24:
                uAsyncSchedu.tempEnableDelayMapCheck = this.e(value, Boolean.valueOf(uAsyncSchedu.tempEnableDelayMapCheck)).booleanValue();
                break;
              case 25:
                uAsyncSchedu.tempEnable113Schedule = this.e(value, Boolean.valueOf(uAsyncSchedu.tempEnable113Schedule)).booleanValue();
                break;
              case 26:
                uAsyncSchedu.serviceBlackList = this.h(value, uAsyncSchedu.serviceBlackList);
                break;
              case 27:
                uAsyncSchedu.whatLowMemory = this.e(value, Integer.valueOf(uAsyncSchedu.whatLowMemory)).intValue();
                break;
              case 28:
                uAsyncSchedu.whatServiceArgs = this.e(value, Integer.valueOf(uAsyncSchedu.whatServiceArgs)).intValue();
                break;
              case 29:
                uAsyncSchedu.tempCheckDelayTime = this.e(value, Integer.valueOf(uAsyncSchedu.tempCheckDelayTime)).intValue();
                break;
              case 30:
                uAsyncSchedu.tempCatchRegistryRecycleException = this.e(value, Boolean.valueOf(uAsyncSchedu.tempCatchRegistryRecycleException)).booleanValue();
                break;
              case 31:
                uAsyncSchedu.tempTryScheduleOnFound = this.e(value, Boolean.valueOf(uAsyncSchedu.tempTryScheduleOnFound)).booleanValue();
                break;
              case 32:
                uAsyncSchedu.recentSchedCount = this.e(value, Integer.valueOf(uAsyncSchedu.recentSchedCount)).intValue();
                break;
              case '!':
                uAsyncSchedu.receiverBlackList = this.h(value, uAsyncSchedu.receiverBlackList);
                break;
              case '"':
                uAsyncSchedu.receiverClassBlackList = this.h(value, uAsyncSchedu.receiverClassBlackList);
                break;
              default:
          }
       }
       return uAsyncSchedu;
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       JsonElement jsonElement;
       JsonObject jsonObject = new JsonObject();
       jsonObject.H("enableServiceSchedule", Boolean.valueOf(p0.enableServiceSchedule));
       jsonObject.H("enableReceiverSchedule", Boolean.valueOf(p0.enableReceiverSchedule));
       jsonObject.H("enableDoubleQueue", Boolean.valueOf(p0.enableDoubleQueue));
       jsonObject.H("enableHeadMsgCheck", Boolean.valueOf(p0.enableHeadMsgCheck));
       jsonObject.H("enableTrimMemorySchedule", Boolean.valueOf(p0.enableTrimMemorySchedule));
       jsonObject.H("enableLowMemorySchedule", Boolean.valueOf(p0.enableLowMemorySchedule));
       jsonObject.H("enableConfChangeSchedule", Boolean.valueOf(p0.enableConfChangeSchedule));
       jsonObject.H("enableBgLockResMgrSchedule", Boolean.valueOf(p0.enableBgLockResMgrSchedule));
       jsonObject.G("receiverBlackList", this.b(p0.receiverBlackList));
       jsonObject.G("receiverClassBlackList", this.b(p0.receiverClassBlackList));
       jsonObject.G("receiverWhiteList", this.b(p0.receiverWhiteList));
       jsonObject.G("serviceBlackList", this.b(p0.serviceBlackList));
       jsonObject.G("excludedException", this.b(p0.excludedException));
       jsonObject.a0("recentSchedCount", Integer.valueOf(p0.recentSchedCount));
       AsyncScheduleConfig serviceWhatL = p0.serviceWhatList;
       if (serviceWhatL == null) {
          jsonElement = null;
       }else {
          JsonArray jsonArray = new JsonArray();
          Iterator iterator = serviceWhatL.iterator();
          while (iterator.hasNext()) {
             jsonArray.N(Integer.valueOf(iterator.next().intValue()));
          }
          jsonElement = jsonArray;
       }
       jsonObject.G("serviceWhatList", jsonElement);
       jsonObject.a0("whatReceiver", Integer.valueOf(p0.whatReceiver));
       jsonObject.a0("whatCreateService", Integer.valueOf(p0.whatCreateService));
       jsonObject.a0("whatServiceArgs", Integer.valueOf(p0.whatServiceArgs));
       jsonObject.a0("whatStopService", Integer.valueOf(p0.whatStopService));
       jsonObject.a0("whatTrimMemory", Integer.valueOf(p0.whatTrimMemory));
       jsonObject.a0("whatLowMemory", Integer.valueOf(p0.whatLowMemory));
       jsonObject.a0("whatConfChange", Integer.valueOf(p0.whatConfChange));
       jsonObject.H("tempCatchRegistryRecycleException", Boolean.valueOf(p0.tempCatchRegistryRecycleException));
       jsonObject.H("tempReceiverErrorToMain", Boolean.valueOf(p0.tempReceiverErrorToMain));
       jsonObject.H("tempEnable113Schedule", Boolean.valueOf(p0.tempEnable113Schedule));
       jsonObject.H("tempEnableWhat114Wait", Boolean.valueOf(p0.tempEnableWhat114Wait));
       jsonObject.H("tempEnableDelayMapCheck", Boolean.valueOf(p0.tempEnableDelayMapCheck));
       jsonObject.H("tempTryScheduleOnFound", Boolean.valueOf(p0.tempTryScheduleOnFound));
       jsonObject.H("tempEnableLooperHook", Boolean.valueOf(p0.tempEnableLooperHook));
       jsonObject.H("tempEnableDumpSchedQueue", Boolean.valueOf(p0.tempEnableDumpSchedQueue));
       jsonObject.H("tempReportForDebug", Boolean.valueOf(p0.tempReportForDebug));
       jsonObject.a0("tempCheckDelayTime", Integer.valueOf(p0.tempCheckDelayTime));
       jsonObject.H("forceSchedForReceiver", Boolean.valueOf(p0.forceSchedForReceiver));
       jsonObject.G("forceSchedReceiverAction", this.b(p0.forceSchedReceiverAction));
       jsonObject.G("forceSchedReceiverCmp", this.b(p0.forceSchedReceiverCmp));
       return jsonObject;
    }
}
