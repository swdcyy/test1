package com.yxcorp.dynamicfeature.video.a;
import com.kwai.video.devicepersonabenchmark.DPBenchmarkTestService$ExternalInitCallback;
import java.lang.Object;
import java.util.Set;
import java.util.Map;
import com.yxcorp.dynamicfeature.video.VideoPluginInitModule;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.String;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import java.util.Objects;
import java.lang.Integer;
import com.kwai.plugin.dva.Dva;
import java.util.List;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import uu8.a$b;
import java.lang.Throwable;
import w46.b;
import java.util.Map$Entry;

public final class a implements DPBenchmarkTestService$ExternalInitCallback	// class@0011d1
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final Map externalInit(Set p0){
       HashMap hashMap = new HashMap();
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       String str = "devicepersonasdkjni";
       Integer integer = 1;
       int i = -1;
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          PluginDownloadExtension.k.a(str1);
          Objects.requireNonNull(str1);
          int i1 = str1.hashCode();
          if (i1 != -1569687231) {
             if (i1 != 0x10461) {
                if (i1 != 0x389fbd || !str1.equals("ykit")) {
                label_005c :
                   str = -1;
                }else {
                   str = 2;
                }
             }else if(!str1.equals("CGE")){
                goto label_005c ;
             }else {
                str = 1;
             }
          }else if(!str1.equals(str)){
             goto label_005c ;
          }else {
             str = null;
          }
          if (str) {
             if (str != integer && str != 2) {
                continue ;
             }
          }else {
             boolean b = Dva.instance().isLoaded("device_persona");
             if (b) {
                i = 0;
             }
             hashMap.put(str1, Integer.valueOf(i));
             if (!b) {
                uArrayList.add("device_persona");
             }
          }
          hashMap.put(str1, Integer.valueOf(0));
       }
       if (!uArrayList.isEmpty()) {
          try{
             PluginDownloadExtension.k.t(uArrayList, 40);
             Dva.instance().getPluginInstallManager().k(uArrayList).c();
          }catch(java.lang.Exception e12){
             a$b.a.e("DevicePersona", "Dve install so", e12);
          }
          iterator = hashMap.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (uEntry.getValue().intValue() == i) {
                String key = uEntry.getKey();
                if (str.equals(key)) {
                   int i2 = (Dva.instance().isLoaded("device_persona"))? 1: -1;
                   hashMap.put(key, Integer.valueOf(i2));
                }
             }
          }
       }
       return hashMap;
    }
}
