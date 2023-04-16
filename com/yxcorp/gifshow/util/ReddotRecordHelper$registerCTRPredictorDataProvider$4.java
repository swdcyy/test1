package com.yxcorp.gifshow.util.ReddotRecordHelper$registerCTRPredictorDataProvider$4;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.util.ReddotRecordHelper;
import java.util.Objects;
import java.util.HashMap;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import com.google.gson.internal.LinkedTreeMap;
import java.lang.String;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.Long;
import java.lang.Double;
import java.lang.Float;

public final class ReddotRecordHelper$registerCTRPredictorDataProvider$4 extends Lambda implements a	// class@001f29
{
    public static final ReddotRecordHelper$registerCTRPredictorDataProvider$4 INSTANCE;

    static {
       ReddotRecordHelper$registerCTRPredictorDataProvider$4.INSTANCE = new ReddotRecordHelper$registerCTRPredictorDataProvider$4();
    }
    public void ReddotRecordHelper$registerCTRPredictorDataProvider$4(){
       super(0);
    }
    public final Object invoke(){
       Object key;
       Double uDouble;
       Double uDouble1;
       Objects.requireNonNull(ReddotRecordHelper.e);
       HashMap hashMap = new HashMap();
       LinkedTreeMap linkedTreeMa = b.a(0x5f2ddeb4).g("home_reddot_ts_for_radio", LinkedTreeMap.class);
       if (linkedTreeMa != null) {
          Iterator iterator = linkedTreeMa.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             Iterator value = uEntry.getValue();
             a.o(value, "entry.value");
             value = value.entrySet().iterator();
             double d = 0;
             double d1 = d;
             while (true) {
                if (value.hasNext()) {
                   Map$Entry uEntry1 = value.next();
                   ReddotRecordHelper e = ReddotRecordHelper.e;
                   String str = DateUtils.m();
                   a.o(str, "DateUtils.getCurrentYearMonthDay\(\)");
                   str = e.f(str);
                   key = uEntry1.getKey();
                   a.o(key, "date.key");
                   String str1 = e.f(key);
                   long l = 1;
                   int i = (str == null || !str.length())? 1: 0;
                   if (!i) {
                      if (str1 != null && str1.length()) {
                         l = null;
                      }
                      if (l) {
                      }else if(DateUtils.r(Long.parseLong(str1), Long.parseLong(str)) > 7){
                         value.remove();
                      }else {
                         LinkedTreeMap linkedTreeMa1 = uEntry.getValue().get(uEntry1.getKey());
                         if (linkedTreeMa1 != null) {
                            uDouble = linkedTreeMa1.get("clickCount");
                            if (uDouble != null) {
                            label_00c5 :
                               a.o(uDouble, "entry.value[date.key]?.get\(CLICK_COUNT\) ?: 0.0");
                               d1 = d1 + uDouble.doubleValue();
                               LinkedTreeMap linkedTreeMa2 = uEntry.getValue().get(uEntry1.getKey());
                               if (linkedTreeMa2 != null) {
                                  uDouble1 = linkedTreeMa2.get("showCount");
                                  if (uDouble1 != null) {
                                  label_00f0 :
                                     a.o(uDouble1, "entry.value[date.key]?.get\(SHOW_COUNT\) ?: 0.0");
                                     d = d + uDouble1.doubleValue();
                                  }
                               }
                               uDouble1 = Double.valueOf(0);
                               goto label_00f0 ;
                            }
                         }
                         uDouble = Double.valueOf(0);
                         goto label_00c5 ;
                      }
                   }else {
                      continue ;
                   }
                }else if(d){
                   Object key1 = uEntry.getKey();
                   a.o(key1, "entry.key");
                   d1 = d1 / d;
                   hashMap.put(key1, Float.valueOf((float)d1));
                   continue ;
                }else {
                   continue ;
                }
             }
          }
       }
       return hashMap;
    }
}
