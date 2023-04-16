package com.yxcorp.gifshow.util.ReddotRecordHelper$a;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import com.google.gson.internal.LinkedTreeMap;
import java.lang.reflect.Type;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.Double;
import java.util.Map;
import java.lang.System;
import tra.b;
import java.lang.NumberFormatException;
import q87.c;

public final class ReddotRecordHelper$a implements Runnable	// class@001f24
{
    public final String b;
    public final boolean c;

    public void ReddotRecordHelper$a(String p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       String str = "clickCount";
       String str1 = "showCount";
       int i = 0x5f2ddeb4;
       try{
          LinkedTreeMap linkedTreeMa = b.a(i).g("home_reddot_ts_for_radio", LinkedTreeMap.class);
          if (linkedTreeMa == null) {
             linkedTreeMa = new LinkedTreeMap();
          }
          LinkedTreeMap linkedTreeMa1 = linkedTreeMa;
          linkedTreeMa = linkedTreeMa1.get(this.b);
          if (linkedTreeMa == null) {
             linkedTreeMa = new LinkedTreeMap();
          }
          LinkedTreeMap linkedTreeMa2 = linkedTreeMa.get(DateUtils.m());
          if (linkedTreeMa2 == null) {
             linkedTreeMa2 = new LinkedTreeMap();
          }
          double d = 0x3ff0000000000000;
          if (this.c != null) {
             Double uDouble = linkedTreeMa2.get(str);
             if (uDouble != null) {
                d = d + uDouble.doubleValue();
             }
             linkedTreeMa2.put(str, Double.valueOf(d));
          }else {
             Double uDouble1 = linkedTreeMa2.get(str1);
             if (uDouble1 != null) {
                d = d + uDouble1.doubleValue();
             }
             linkedTreeMa2.put(str1, Double.valueOf(d));
          }
          linkedTreeMa.put(DateUtils.m(), linkedTreeMa2);
          linkedTreeMa1.put(this.b, linkedTreeMa);
          b.a(i).c("home_reddot_ts_for_radio", linkedTreeMa1, LinkedTreeMap.class, (System.currentTimeMillis() + 0x757b12c00));
       }catch(java.lang.NumberFormatException e0){
          Object[] objArray = new Object[0];
          b.C().w("ReddotRecordHelper", e0.getMessage(), objArray);
       }
       return;
    }
}
