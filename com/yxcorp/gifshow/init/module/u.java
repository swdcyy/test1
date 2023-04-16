package com.yxcorp.gifshow.init.module.u;
import z1.k;
import java.lang.Object;
import com.yxcorp.gifshow.init.module.EmotionPluginInitModule;
import com.kwai.emotion.adapter.startup.EmotionStartupConfig$KsEmotionSDKConfig;
import w3d.a;
import java.lang.StringBuilder;
import java.lang.String;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.util.Collection;
import ekd.q;
import pxa.e;
import q87.c;
import bk5.h;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Iterator;
import com.kwai.emotion.adapter.startup.EmotionStartupConfig$KsEmotionRealTimeUpdateConfig;
import com.kwai.emotionsdk.bean.EmotionRealTimeUpdateConfig;

public final class u implements k	// class@0019dd
{
    public static final u b;

    static {
       u.b = new u();
    }
    public void u(){
       super();
    }
    public final Object get(){
       Object[] objArray;
       h oh;
       EmotionStartupConfig$KsEmotionSDKConfig ksEmotionSDK = EmotionStartupConfig$KsEmotionSDKConfig.class;
       SharedPreferences a = a.a;
       String str = "user";
       String str1 = a.getString(b.d(str)+"emotion_sdk_config", "null");
       EmotionStartupConfig$KsEmotionSDKConfig ksEmotionSDK1 = null;
       ksEmotionSDK = (str1 == null || str1 == "")? ksEmotionSDK1: b.a(str1, ksEmotionSDK);
       int i = 0;
       int intx = a.getInt(b.d(str)+"im_emotion_latest_version", i);
       if (ksEmotionSDK != null) {
          ksEmotionSDK1 = ksEmotionSDK.mEmotionRealTimeUpdateConfigs;
       }
       str1 = "EmotionPluginInitModule";
       if (q.f(ksEmotionSDK1)) {
          objArray = new Object[i];
          e.C().w(str1, "updateConfigs is empty", objArray);
          oh = new h(intx, Collections.emptyList());
       }else {
          objArray = new Object[i];
          e.C().w(str1, "updateConfigs size = "+ksEmotionSDK1.size(), objArray);
          ArrayList uArrayList = Lists.b();
          Iterator iterator = ksEmotionSDK1.iterator();
          while (iterator.hasNext()) {
             EmotionStartupConfig$KsEmotionRealTimeUpdateConfig ksEmotionRea = iterator.next();
             uArrayList.add(new EmotionRealTimeUpdateConfig(ksEmotionRea.mEmotionPackageType, ksEmotionRea.mEmotionPackageId));
          }
          oh = new h(intx, uArrayList);
       }
       return oh;
    }
}
