package com.kuaishou.live.common.ability.LiveStorageAbilityImpl;
import com.kuaishou.live.basic.ability.LiveStorageAbility;
import com.kuaishou.live.common.ability.LiveStorageAbilityImpl$a;
import nsd.u;
import java.util.concurrent.ConcurrentHashMap;
import lp3.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.ability.LiveStorageAbilityImpl$diskCache$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import d61.l0;
import com.kuaishou.live.basic.ability.LiveBaseAbility;
import i41.a;
import com.kuaishou.live.basic.ability.LiveStorageAbility$GetStorageParams;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.kuaishou.live.basic.ability.LiveStorageAbility$Result;
import java.util.Map;
import java.util.HashMap;
import java.lang.StringBuilder;
import com.kuaishou.live.basic.ability.LiveStorageAbility$SetStorageParams;

public final class LiveStorageAbilityImpl implements LiveStorageAbility	// class@000e56
{
    public final Map a;
    public final l0 b;
    public final e c;
    public static final Map d;
    public static final LiveStorageAbilityImpl$a e;

    static {
       LiveStorageAbilityImpl.e = new LiveStorageAbilityImpl$a(null);
       LiveStorageAbilityImpl.d = new ConcurrentHashMap();
    }
    public void LiveStorageAbilityImpl(e p0){
       a.p(p0, "serviceManager");
       super();
       this.c = p0;
       this.a = new ConcurrentHashMap();
       this.b = l0.g("StorageAbility", new LiveStorageAbilityImpl$diskCache$1().getType());
    }
    public void create(e p0){
       a.a(this, p0);
    }
    public void destroy(){
       a.b(this);
    }
    public e getServiceManager(){
       return this.c;
    }
    public Object getStorage(LiveStorageAbility$GetStorageParams p0,c p1){
       LiveStorageAbility$Result result;
       LiveStorageAbility$Result result1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveStorageAbilityImpl liveStorageA = LiveStorageAbilityImpl.class;
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, liveStorageA, "2");
       if (p1 != patchProxyRe) {
          return p1;
       }
       String level = p0.getLevel();
       String key = p0.getKey();
       int i = 0;
       int i1 = (level == null || !level.length())? 1: 0;
       String str = "[getStorage]";
       if (!i1) {
          if (key == null || !key.length()) {
             i = 1;
          }
          if (!i) {
             if (level == null) {
             label_00cd :
                result = new LiveStorageAbility$Result(2, str+p0, null, 4, null);
             label_00e6 :
                result1 = level;
             }else {
                i = level.hashCode();
                if (i != -1077756671) {
                   if (i != 0x2f0d9d) {
                      if (i == 0x32b0ec && level.equals("live")) {
                         result1 = PatchProxy.applyOneRefs(key, this, liveStorageA, "4");
                         if (result1 != patchProxyRe) {
                         }else {
                            result = new LiveStorageAbility$Result(1, 0, this.a.get(key), 2, null);
                         }
                      }else {
                         goto label_00cd ;
                      }
                   }else if(level.equals("disk")){
                      result1 = PatchProxy.applyOneRefs(key, this, liveStorageA, "8");
                      if (result1 != patchProxyRe) {
                      }else {
                         result1 = this.b.b(new HashMap());
                         a.o(result1, "diskCache.get\(HashMap\(\)\)");
                         LiveStorageAbility$Result result2 = new LiveStorageAbility$Result(1, null, result1.get(key), 2, null);
                         goto label_00e6 ;
                      }
                   }else {
                      goto label_00cd ;
                   }
                }else if(level.equals("memory")){
                   result1 = PatchProxy.applyOneRefs(key, this, liveStorageA, "6");
                   if (result1 != patchProxyRe) {
                   }else {
                      result = new LiveStorageAbility$Result(1, 0, LiveStorageAbilityImpl.d.get(key), 2, null);
                   }
                }else {
                   goto label_00cd ;
                }
             }
             return result1;
          }
       }
       result = new LiveStorageAbility$Result(2, str+p0, null, 4, null);
       return level;
    }
    public Object setStorage(LiveStorageAbility$SetStorageParams p0,c p1){
       LiveStorageAbility$Result result;
       LiveStorageAbility$Result result1;
       LiveStorageAbility$Result result2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveStorageAbilityImpl liveStorageA = LiveStorageAbilityImpl.class;
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, liveStorageA, "1");
       if (p1 != patchProxyRe) {
          return p1;
       }
       String level = p0.getLevel();
       String key = p0.getKey();
       LiveStorageAbility$Result value = p0.getValue();
       int i = 0;
       int i1 = (level == null || !level.length())? 1: 0;
       String str = "[setStorage]";
       if (!i1) {
          if (key == null || !key.length()) {
             i = 1;
          }
          if (!i) {
             if (level == null) {
             label_0102 :
                result = new LiveStorageAbility$Result(2, str+p0, null, 4, null);
                result1 = level;
             }else {
                i = level.hashCode();
                if (i != -1077756671) {
                   if (i != 0x2f0d9d) {
                      if (i == 0x32b0ec && level.equals("live")) {
                         result1 = PatchProxy.applyTwoRefs(key, value, this, liveStorageA, "3");
                         if (result1 != patchProxyRe) {
                         }else if(value == null){
                            this.a.remove(key);
                            value = new LiveStorageAbility$Result(1, null, null, 6, null);
                         }else {
                            this.a.put(key, value);
                            result2 = new LiveStorageAbility$Result(1, null, null, 6, null);
                         }
                      }else {
                         goto label_0102 ;
                      }
                   }else if(level.equals("disk")){
                      result1 = PatchProxy.applyTwoRefs(key, value, this, liveStorageA, "7");
                      if (result1 != patchProxyRe) {
                      }else {
                         result1 = this.b.b(new HashMap());
                         a.o(result1, "diskCache.get\(HashMap\(\)\)");
                         if (value == null) {
                            result1.remove(key);
                         }else {
                            result1.put(key, value);
                         }
                         this.b.i(result1);
                         result = new LiveStorageAbility$Result(1, null, null, 6, null);
                      }
                   }else {
                      goto label_0102 ;
                   }
                }else if(level.equals("memory")){
                   result1 = PatchProxy.applyTwoRefs(key, value, this, liveStorageA, "5");
                   if (result1 != patchProxyRe) {
                   }else if(value == null){
                      LiveStorageAbilityImpl.d.remove(key);
                      value = new LiveStorageAbility$Result(1, null, null, 6, null);
                   }else {
                      LiveStorageAbilityImpl.d.put(key, value);
                      result2 = new LiveStorageAbility$Result(1, null, null, 6, null);
                   }
                }else {
                   goto label_0102 ;
                }
             }
             return result1;
          }
       }
       result = new LiveStorageAbility$Result(2, str+p0, null, 4, null);
       return level;
    }
}
