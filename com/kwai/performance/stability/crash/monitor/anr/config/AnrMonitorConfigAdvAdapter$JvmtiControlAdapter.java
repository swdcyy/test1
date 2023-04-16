package com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdvAdapter$JvmtiControlAdapter;
import com.kwai.performance.stability.crash.monitor.anr.config.BaseGsonAdapter;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdv$JvmtiControl;
import com.google.gson.JsonObject;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.String;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Class;
import zk.h;
import java.lang.Number;

public class AnrMonitorConfigAdvAdapter$JvmtiControlAdapter extends BaseGsonAdapter	// class@0011bc
{

    public void AnrMonitorConfigAdvAdapter$JvmtiControlAdapter(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       AnrMonitorConfigAdv$JvmtiControl jvmtiControl = new AnrMonitorConfigAdv$JvmtiControl();
       Iterator iterator = p0.r().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          JsonElement value = uEntry.getValue();
          Objects.requireNonNull(key);
          int i = -1;
          switch (key.hashCode()){
              case 0x9537cb26:
                if (key.equals("gcQueueLimit")) {
                   i = 0;
                }
                break;
              case 0xe2a7e296:
                if (key.equals("backupJvmtiConfig")) {
                   i = 1;
                }
                break;
              case 0x28ec2bb:
                if (key.equals("filterMainThread")) {
                   i = 2;
                }
                break;
              case 0x1cb5736e:
                if (key.equals("classLenThreshold")) {
                   i = 3;
                }
                break;
              case 0x2d7e0248:
                if (key.equals("classLoadQueueLimit")) {
                   i = 4;
                }
                break;
              case 0x43d99269:
                if (key.equals("enableOtherBizSupport")) {
                   i = 5;
                }
                break;
              case 0x711e8b76:
                if (key.equals("perfDebugFlag")) {
                   i = 6;
                }
                break;
              case 0x7bbeaeef:
                if (key.equals("gcThreshold")) {
                   i = 7;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                jvmtiControl.gcQueueLimit = this.e(value, Integer.valueOf(jvmtiControl.gcQueueLimit)).intValue();
                break;
              case 1:
                AnrMonitorConfigAdv$JvmtiControl backupJvmtiC = jvmtiControl.backupJvmtiConfig;
                if (backupJvmtiC == null) {
                   jvmtiControl.backupJvmtiConfig = this.d(value, String.class);
                }else {
                   jvmtiControl.backupJvmtiConfig = this.e(value, backupJvmtiC);
                }
                break;
              case 2:
                jvmtiControl.filterMainThread = this.e(value, Boolean.valueOf(jvmtiControl.filterMainThread)).booleanValue();
                break;
              case 3:
                jvmtiControl.classLenThreshold = this.e(value, Integer.valueOf(jvmtiControl.classLenThreshold)).intValue();
                break;
              case 4:
                jvmtiControl.classLoadQueueLimit = this.e(value, Integer.valueOf(jvmtiControl.classLoadQueueLimit)).intValue();
                break;
              case 5:
                jvmtiControl.enableOtherBizSupport = this.e(value, Boolean.valueOf(jvmtiControl.enableOtherBizSupport)).booleanValue();
                break;
              case 6:
                jvmtiControl.perfDebugFlag = this.e(value, Integer.valueOf(jvmtiControl.perfDebugFlag)).intValue();
                break;
              case 7:
                jvmtiControl.gcThreshold = this.e(value, Integer.valueOf(jvmtiControl.gcThreshold)).intValue();
                break;
              default:
          }
       }
       return jvmtiControl;
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("gcThreshold", Integer.valueOf(p0.gcThreshold));
       jsonObject.a0("classLenThreshold", Integer.valueOf(p0.classLenThreshold));
       jsonObject.H("enableOtherBizSupport", Boolean.valueOf(p0.enableOtherBizSupport));
       jsonObject.a0("gcQueueLimit", Integer.valueOf(p0.gcQueueLimit));
       jsonObject.a0("classLoadQueueLimit", Integer.valueOf(p0.classLoadQueueLimit));
       jsonObject.H("filterMainThread", Boolean.valueOf(p0.filterMainThread));
       jsonObject.c0("backupJvmtiConfig", p0.backupJvmtiConfig);
       jsonObject.a0("perfDebugFlag", Integer.valueOf(p0.perfDebugFlag));
       return jsonObject;
    }
}
