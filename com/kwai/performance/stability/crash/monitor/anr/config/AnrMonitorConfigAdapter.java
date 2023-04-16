package com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdapter;
import com.kwai.performance.stability.crash.monitor.anr.config.BaseGsonAdapter;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import com.google.gson.JsonObject;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.String;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Float;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdv;
import zk.h;
import java.lang.Number;
import com.google.gson.JsonArray;

public class AnrMonitorConfigAdapter extends BaseGsonAdapter	// class@000e05
{

    public void AnrMonitorConfigAdapter(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       AnrMonitorConfig uAnrMonitorC = new AnrMonitorConfig();
       Iterator iterator = p0.r().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          JsonElement value = uEntry.getValue();
          Objects.requireNonNull(key);
          int i = -1;
          switch (key.hashCode()){
              case 0x8440d0aa:
                if (key.equals("idleTimeThreshold")) {
                   i = 0;
                }
                break;
              case 0x8a0ed23e:
                if (key.equals("dispatchSamplingStepTimesInterval")) {
                   i = 1;
                }
                break;
              case 0x8edaf8ce:
                if (key.equals("enableChildProcessFunction")) {
                   i = 2;
                }
                break;
              case 0x9053639f:
                if (key.equals("inputEventCostMinWall")) {
                   i = 3;
                }
                break;
              case 0x905aa113:
                if (key.equals("isRemoveInvalidSyncBarrier")) {
                   i = 4;
                }
                break;
              case 0x913b3028:
                if (key.equals("maxIdleHandlerMonitor")) {
                   i = 5;
                }
                break;
              case 0x92436bda:
                if (key.equals("checkTimeInterval")) {
                   i = 6;
                }
                break;
              case 0x944d150d:
                if (key.equals("enableIdleSamplingThreshold")) {
                   i = 7;
                }
                break;
              case 0xa4a77aa4:
                if (key.equals("reportRemoveSyncBarrier")) {
                   i = 8;
                }
                break;
              case 0xa4d47b07:
                if (key.equals("enableSyncBarrierPauseAndResume")) {
                   i = 9;
                }
                break;
              case 0xad553fc8:
                if (key.equals("isEnableIdleSampling")) {
                   i = 10;
                }
                break;
              case 0xb24c54dd:
                if (key.equals("enableChildProcessSampling")) {
                   i = 11;
                }
                break;
              case 0xb354ff96:
                if (key.equals("inputEventLogMaxLength")) {
                   i = 12;
                }
                break;
              case 0xbdb139e7:
                if (key.equals("disableSamplingWhenBlockEnable")) {
                   i = 13;
                }
                break;
              case 0xc093b444:
                if (key.equals("syncBarrierDetectInterval")) {
                   i = 14;
                }
                break;
              case 0xc23d7fee:
                if (key.equals("isEnableDispatchSampling")) {
                   i = 15;
                }
                break;
              case 0xd7e12d12:
                if (key.equals("syncBarrierWhenMiniDiff")) {
                   i = 16;
                }
                break;
              case 0xdceb38b8:
                if (key.equals("enableSamplingPauseAndResume")) {
                   i = 17;
                }
                break;
              case 0xdf688fb4:
                if (key.equals("queuePackWall")) {
                   i = 18;
                }
                break;
              case 0xe64a146b:
                if (key.equals("syncBarrierCheckSleep")) {
                   i = 19;
                }
                break;
              case 0xe656ecda:
                if (key.equals("syncBarrierCheckTimes")) {
                   i = 20;
                }
                break;
              case 0xeb0ccaa7:
                if (key.equals("enableDispatchSamplingThreshold")) {
                   i = 21;
                }
                break;
              case 0xed0fb0ed:
                if (key.equals("dispatchSamplingStep")) {
                   i = 22;
                }
                break;
              case 0xfb1c41cc:
                if (key.equals("samplingInterval")) {
                   i = 23;
                }
                break;
              case 0x261842d:
                if (key.equals("enableActivityThreadMsgSingle")) {
                   i = 24;
                }
                break;
              case 0x119e7024:
                if (key.equals("idleSamplingStepTimesInterval")) {
                   i = 25;
                }
                break;
              case 0x13377547:
                if (key.equals("idleSamplingStep")) {
                   i = 26;
                }
                break;
              case 0x175e9fe8:
                if (key.equals("mAdvConfig")) {
                   i = 27;
                }
                break;
              case 0x248d1dd7:
                if (key.equals("withExtraCost")) {
                   i = 28;
                }
                break;
              case 0x2ab38a0a:
                if (key.equals("dispatchSamplingExploreMinWall")) {
                   i = 29;
                }
                break;
              case 0x3585a761:
                if (key.equals("withEventCost")) {
                   i = 30;
                }
                break;
              case 0x379136d9:
                if (key.equals("syncBarrierTokenMiniDiff")) {
                   i = 31;
                }
                break;
              case 0x427fd44d:
                if (key.equals("withLogPage")) {
                   i = 32;
                }
                break;
              case 0x437bc7ae:
                if (key.equals("maxQueueSize")) {
                   i = 33;
                }
                break;
              case 0x4c86d1e0:
                if (key.equals("enableCheckTimePauseAndResume")) {
                   i = 34;
                }
                break;
              case 0x52cfa207:
                if (key.equals("syncBarrierFoundDepthMax")) {
                   i = 35;
                }
                break;
              case 0x55d1d0c1:
                if (key.equals("enableHuiduThreshold")) {
                   i = 36;
                }
                break;
              case 0x62c58660:
                if (key.equals("tempDisableSyncBarrierCheck")) {
                   i = 37;
                }
                break;
              case 0x639e22e8:
                if (key.equals("disable")) {
                   i = 38;
                }
                break;
              case 0x66f81ced:
                if (key.equals("enableAllThreshold")) {
                   i = 39;
                }
                break;
              case 0x75cfdfff:
                if (key.equals("syncBarrierCheckThreshold")) {
                   i = 40;
                }
                break;
              case 0x77662c1a:
                if (key.equals("stackDiffListMaxSize")) {
                   i = 41;
                }
                break;
              case 0x776a97bc:
                if (key.equals("syncBarrierMiniSetTime")) {
                   i = 42;
                }
                break;
              case 0x7ad8ff83:
                if (key.equals("isHuidu")) {
                   i = 43;
                }
                break;
              case 0x7bde34e4:
                if (key.equals("syncBarrierMiniRemoveTime")) {
                   i = 44;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                uAnrMonitorC.idleTimeThreshold = this.e(value, Integer.valueOf(uAnrMonitorC.idleTimeThreshold)).intValue();
                break;
              case 1:
                uAnrMonitorC.dispatchSamplingStepTimesInterval = this.e(value, Integer.valueOf(uAnrMonitorC.dispatchSamplingStepTimesInterval)).intValue();
                break;
              case 2:
                uAnrMonitorC.enableChildProcessFunction = this.e(value, Boolean.valueOf(uAnrMonitorC.enableChildProcessFunction)).booleanValue();
                break;
              case 3:
                uAnrMonitorC.inputEventCostMinWall = this.e(value, Integer.valueOf(uAnrMonitorC.inputEventCostMinWall)).intValue();
                break;
              case 4:
                uAnrMonitorC.isRemoveInvalidSyncBarrier = this.e(value, Boolean.valueOf(uAnrMonitorC.isRemoveInvalidSyncBarrier)).booleanValue();
                break;
              case 5:
                uAnrMonitorC.maxIdleHandlerMonitor = this.e(value, Integer.valueOf(uAnrMonitorC.maxIdleHandlerMonitor)).intValue();
                break;
              case 6:
                uAnrMonitorC.checkTimeInterval = this.e(value, Integer.valueOf(uAnrMonitorC.checkTimeInterval)).intValue();
                break;
              case 7:
                uAnrMonitorC.enableIdleSamplingThreshold = this.e(value, Float.valueOf(uAnrMonitorC.enableIdleSamplingThreshold)).floatValue();
                break;
              case 8:
                uAnrMonitorC.reportRemoveSyncBarrier = this.e(value, Integer.valueOf(uAnrMonitorC.reportRemoveSyncBarrier)).intValue();
                break;
              case 9:
                uAnrMonitorC.enableSyncBarrierPauseAndResume = this.e(value, Boolean.valueOf(uAnrMonitorC.enableSyncBarrierPauseAndResume)).booleanValue();
                break;
              case 10:
                uAnrMonitorC.isEnableIdleSampling = this.e(value, Boolean.valueOf(uAnrMonitorC.isEnableIdleSampling)).booleanValue();
                break;
              case 11:
                uAnrMonitorC.enableChildProcessSampling = this.e(value, Boolean.valueOf(uAnrMonitorC.enableChildProcessSampling)).booleanValue();
                break;
              case 12:
                uAnrMonitorC.inputEventLogMaxLength = this.e(value, Integer.valueOf(uAnrMonitorC.inputEventLogMaxLength)).intValue();
                break;
              case 13:
                uAnrMonitorC.disableSamplingWhenBlockEnable = this.e(value, Boolean.valueOf(uAnrMonitorC.disableSamplingWhenBlockEnable)).booleanValue();
                break;
              case 14:
                uAnrMonitorC.syncBarrierDetectInterval = this.e(value, Integer.valueOf(uAnrMonitorC.syncBarrierDetectInterval)).intValue();
                break;
              case 15:
                uAnrMonitorC.isEnableDispatchSampling = this.e(value, Boolean.valueOf(uAnrMonitorC.isEnableDispatchSampling)).booleanValue();
                break;
              case 16:
                uAnrMonitorC.syncBarrierWhenMiniDiff = this.e(value, Integer.valueOf(uAnrMonitorC.syncBarrierWhenMiniDiff)).intValue();
                break;
              case 17:
                uAnrMonitorC.enableSamplingPauseAndResume = this.e(value, Boolean.valueOf(uAnrMonitorC.enableSamplingPauseAndResume)).booleanValue();
                break;
              case 18:
                uAnrMonitorC.queuePackWall = this.e(value, Integer.valueOf(uAnrMonitorC.queuePackWall)).intValue();
                break;
              case 19:
                uAnrMonitorC.syncBarrierCheckSleep = this.e(value, Integer.valueOf(uAnrMonitorC.syncBarrierCheckSleep)).intValue();
                break;
              case 20:
                uAnrMonitorC.syncBarrierCheckTimes = this.e(value, Integer.valueOf(uAnrMonitorC.syncBarrierCheckTimes)).intValue();
                break;
              case 21:
                uAnrMonitorC.enableDispatchSamplingThreshold = this.e(value, Float.valueOf(uAnrMonitorC.enableDispatchSamplingThreshold)).floatValue();
                break;
              case 22:
                uAnrMonitorC.dispatchSamplingStep = this.f(value, uAnrMonitorC.dispatchSamplingStep);
                break;
              case 23:
                uAnrMonitorC.samplingInterval = this.e(value, Integer.valueOf(uAnrMonitorC.samplingInterval)).intValue();
                break;
              case 24:
                uAnrMonitorC.enableActivityThreadMsgSingle = this.e(value, Boolean.valueOf(uAnrMonitorC.enableActivityThreadMsgSingle)).booleanValue();
                break;
              case 25:
                uAnrMonitorC.idleSamplingStepTimesInterval = this.e(value, Integer.valueOf(uAnrMonitorC.idleSamplingStepTimesInterval)).intValue();
                break;
              case 26:
                uAnrMonitorC.idleSamplingStep = this.f(value, uAnrMonitorC.idleSamplingStep);
                break;
              case 27:
                if (value != null) {
                   uAnrMonitorC.mAdvConfig = p2.c(value, AnrMonitorConfigAdv.class);
                }
                break;
              case 28:
                uAnrMonitorC.withExtraCost = this.e(value, Boolean.valueOf(uAnrMonitorC.withExtraCost)).booleanValue();
                break;
              case 29:
                uAnrMonitorC.dispatchSamplingExploreMinWall = this.e(value, Integer.valueOf(uAnrMonitorC.dispatchSamplingExploreMinWall)).intValue();
                break;
              case 30:
                uAnrMonitorC.withEventCost = this.e(value, Boolean.valueOf(uAnrMonitorC.withEventCost)).booleanValue();
                break;
              case 31:
                uAnrMonitorC.syncBarrierTokenMiniDiff = this.e(value, Integer.valueOf(uAnrMonitorC.syncBarrierTokenMiniDiff)).intValue();
                break;
              case 32:
                uAnrMonitorC.withLogPage = this.e(value, Boolean.valueOf(uAnrMonitorC.withLogPage)).booleanValue();
                break;
              case '!':
                uAnrMonitorC.maxQueueSize = this.e(value, Integer.valueOf(uAnrMonitorC.maxQueueSize)).intValue();
                break;
              case '"':
                uAnrMonitorC.enableCheckTimePauseAndResume = this.e(value, Boolean.valueOf(uAnrMonitorC.enableCheckTimePauseAndResume)).booleanValue();
                break;
              case '#':
                uAnrMonitorC.syncBarrierFoundDepthMax = this.e(value, Integer.valueOf(uAnrMonitorC.syncBarrierFoundDepthMax)).intValue();
                break;
              case '$':
                uAnrMonitorC.enableHuiduThreshold = this.e(value, Float.valueOf(uAnrMonitorC.enableHuiduThreshold)).floatValue();
                break;
              case '%':
                uAnrMonitorC.tempDisableSyncBarrierCheck = this.e(value, Boolean.valueOf(uAnrMonitorC.tempDisableSyncBarrierCheck)).booleanValue();
                break;
              case '&':
                uAnrMonitorC.disable = this.e(value, Boolean.valueOf(uAnrMonitorC.disable)).booleanValue();
                break;
              case 39:
                uAnrMonitorC.enableAllThreshold = this.e(value, Float.valueOf(uAnrMonitorC.enableAllThreshold)).floatValue();
                break;
              case '(':
                uAnrMonitorC.syncBarrierCheckThreshold = this.e(value, Integer.valueOf(uAnrMonitorC.syncBarrierCheckThreshold)).intValue();
                break;
              case ')':
                uAnrMonitorC.stackDiffListMaxSize = this.e(value, Integer.valueOf(uAnrMonitorC.stackDiffListMaxSize)).intValue();
                break;
              case '*':
                uAnrMonitorC.syncBarrierMiniSetTime = this.e(value, Integer.valueOf(uAnrMonitorC.syncBarrierMiniSetTime)).intValue();
                break;
              case '+':
                uAnrMonitorC.isHuidu = this.e(value, Boolean.valueOf(uAnrMonitorC.isHuidu)).booleanValue();
                break;
              case ',':
                uAnrMonitorC.syncBarrierMiniRemoveTime = this.e(value, Integer.valueOf(uAnrMonitorC.syncBarrierMiniRemoveTime)).intValue();
                break;
              default:
          }
       }
       return uAnrMonitorC;
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       JsonObject jsonObject = new JsonObject();
       jsonObject.H("disable", Boolean.valueOf(p0.disable));
       jsonObject.a0("maxQueueSize", Integer.valueOf(p0.maxQueueSize));
       jsonObject.a0("queuePackWall", Integer.valueOf(p0.queuePackWall));
       jsonObject.a0("idleTimeThreshold", Integer.valueOf(p0.idleTimeThreshold));
       jsonObject.a0("checkTimeInterval", Integer.valueOf(p0.checkTimeInterval));
       jsonObject.a0("samplingInterval", Integer.valueOf(p0.samplingInterval));
       jsonObject.a0("syncBarrierMiniSetTime", Integer.valueOf(p0.syncBarrierMiniSetTime));
       jsonObject.a0("syncBarrierCheckThreshold", Integer.valueOf(p0.syncBarrierCheckThreshold));
       jsonObject.a0("syncBarrierCheckTimes", Integer.valueOf(p0.syncBarrierCheckTimes));
       jsonObject.a0("syncBarrierCheckSleep", Integer.valueOf(p0.syncBarrierCheckSleep));
       jsonObject.H("isEnableDispatchSampling", Boolean.valueOf(p0.isEnableDispatchSampling));
       jsonObject.G("dispatchSamplingStep", this.a(p0.dispatchSamplingStep));
       jsonObject.a0("dispatchSamplingExploreMinWall", Integer.valueOf(p0.dispatchSamplingExploreMinWall));
       jsonObject.a0("dispatchSamplingStepTimesInterval", Integer.valueOf(p0.dispatchSamplingStepTimesInterval));
       jsonObject.H("isEnableIdleSampling", Boolean.valueOf(p0.isEnableIdleSampling));
       jsonObject.G("idleSamplingStep", this.a(p0.idleSamplingStep));
       jsonObject.a0("idleSamplingStepTimesInterval", Integer.valueOf(p0.idleSamplingStepTimesInterval));
       jsonObject.H("enableActivityThreadMsgSingle", Boolean.valueOf(p0.enableActivityThreadMsgSingle));
       jsonObject.a0("inputEventCostMinWall", Integer.valueOf(p0.inputEventCostMinWall));
       jsonObject.a0("inputEventLogMaxLength", Integer.valueOf(p0.inputEventLogMaxLength));
       jsonObject.a0("maxIdleHandlerMonitor", Integer.valueOf(p0.maxIdleHandlerMonitor));
       jsonObject.a0("stackDiffListMaxSize", Integer.valueOf(p0.stackDiffListMaxSize));
       jsonObject.H("enableSamplingPauseAndResume", Boolean.valueOf(p0.enableSamplingPauseAndResume));
       jsonObject.H("enableCheckTimePauseAndResume", Boolean.valueOf(p0.enableCheckTimePauseAndResume));
       jsonObject.H("enableSyncBarrierPauseAndResume", Boolean.valueOf(p0.enableSyncBarrierPauseAndResume));
       jsonObject.H("enableChildProcessFunction", Boolean.valueOf(p0.enableChildProcessFunction));
       jsonObject.H("enableChildProcessSampling", Boolean.valueOf(p0.enableChildProcessSampling));
       jsonObject.H("disableSamplingWhenBlockEnable", Boolean.valueOf(p0.disableSamplingWhenBlockEnable));
       jsonObject.a0("enableAllThreshold", Float.valueOf(p0.enableAllThreshold));
       jsonObject.a0("enableDispatchSamplingThreshold", Float.valueOf(p0.enableDispatchSamplingThreshold));
       jsonObject.a0("enableIdleSamplingThreshold", Float.valueOf(p0.enableIdleSamplingThreshold));
       jsonObject.H("isRemoveInvalidSyncBarrier", Boolean.valueOf(p0.isRemoveInvalidSyncBarrier));
       jsonObject.a0("syncBarrierDetectInterval", Integer.valueOf(p0.syncBarrierDetectInterval));
       jsonObject.a0("syncBarrierMiniRemoveTime", Integer.valueOf(p0.syncBarrierMiniRemoveTime));
       jsonObject.a0("syncBarrierTokenMiniDiff", Integer.valueOf(p0.syncBarrierTokenMiniDiff));
       jsonObject.a0("syncBarrierWhenMiniDiff", Integer.valueOf(p0.syncBarrierWhenMiniDiff));
       jsonObject.a0("syncBarrierFoundDepthMax", Integer.valueOf(p0.syncBarrierFoundDepthMax));
       jsonObject.a0("reportRemoveSyncBarrier", Integer.valueOf(p0.reportRemoveSyncBarrier));
       jsonObject.H("tempDisableSyncBarrierCheck", Boolean.valueOf(p0.tempDisableSyncBarrierCheck));
       jsonObject.H("isHuidu", Boolean.valueOf(p0.isHuidu));
       jsonObject.a0("enableHuiduThreshold", Float.valueOf(p0.enableHuiduThreshold));
       jsonObject.H("withExtraCost", Boolean.valueOf(p0.withExtraCost));
       jsonObject.H("withLogPage", Boolean.valueOf(p0.withLogPage));
       jsonObject.H("withEventCost", Boolean.valueOf(p0.withEventCost));
       jsonObject.G("mAdvConfig", p2.a(p0.mAdvConfig));
       return jsonObject;
    }
}
